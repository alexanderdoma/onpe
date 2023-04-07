package onpe.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import onpe.entidad.GrupoVotacion;

@Repository
public interface IGrupoVotacionRepositorio extends JpaRepository<GrupoVotacion, Integer>{
	
	@Procedure(name = "usp_getGrupoVotacion")
	GrupoVotacion usp_getGrupoVotacion(@Param("idGrupoVotacion") String idGrupoVotacion);
}
	