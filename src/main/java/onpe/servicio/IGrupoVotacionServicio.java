package onpe.servicio;

import onpe.entidad.GrupoVotacion;
import onpe.entidad.ResumenGeneral;

public interface IGrupoVotacionServicio {
	
	public GrupoVotacion buscarGrupoVotacionPorNumero(String parametro1);
	
	public ResumenGeneral obtenerResumenGeneral();
}
