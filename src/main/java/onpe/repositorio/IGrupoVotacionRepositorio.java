package onpe.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import onpe.entidad.GrupoVotacion;
import onpe.entidad.ResumenGeneral;

@Repository
public interface IGrupoVotacionRepositorio extends JpaRepository<GrupoVotacion, Integer>{
	
	@Procedure(name = "usp_getGrupoVotacion")
	GrupoVotacion usp_getGrupoVotacion(@Param("idGrupoVotacion") String idGrupoVotacion);
	
	@Query(nativeQuery = true, value = "EXEC sp_getResumen_DomaJimenez")
	Object[][] sp_getResumen_DomaJimenez();
	
	public default ResumenGeneral getResumenDomaJimenez() {
	    Object[][] result = sp_getResumen_DomaJimenez();
	    if (result != null) {
	        ResumenGeneral resumen = new ResumenGeneral();
	        resumen.setP1(result[0][0].toString());
	        resumen.setP2(result[0][1].toString());
	        resumen.setValidoP1(result[0][2].toString());
	        resumen.setValidoP2(result[0][3].toString());
	        resumen.setTotalActas(result[0][4].toString());
	        resumen.setTotalProcesados(result[0][5].toString());
	        resumen.setContabilizadas(result[0][6].toString());
	        resumen.setElectoresHabiles(result[0][7].toString());
	        resumen.setTotalVotantes(result[0][8].toString());
	        resumen.setParticipacion(result[0][9].toString());
	        resumen.setAusentismo(result[0][10].toString());
	        return resumen;
	    }
	    return null;
	}
}
	