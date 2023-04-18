package onpe.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import onpe.entidad.GrupoVotacion;
import onpe.entidad.ResumenGeneral;
import onpe.repositorio.IGrupoVotacionRepositorio;

@Service
public class GrupoVotacionServicio implements IGrupoVotacionServicio{

	@Autowired
	private IGrupoVotacionRepositorio repositorio;
	
	
	@Override
	@Transactional
	public GrupoVotacion buscarGrupoVotacionPorNumero(String idGrupoVotacion) {
		return repositorio.usp_getGrupoVotacion(idGrupoVotacion);
	}
	
	@Override
	public ResumenGeneral obtenerResumenGeneral(){
		return repositorio.getResumenDomaJimenez();
	}
}
