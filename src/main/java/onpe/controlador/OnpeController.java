package onpe.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import onpe.servicio.IGrupoVotacionServicio;

@Controller
public class OnpeController {

	@Autowired
	private IGrupoVotacionServicio servicio;
	
	@GetMapping("/")
	public String mostrarIncio(Model modelo) {
		return "index";
	}
	
	@GetMapping({"/actas_numero"})
	public String mostrarActas(Model modelo){
		return "actas_numero";
	}
	
	@GetMapping({"/actas_numero/{idGrupoVotacion}"})
	public String mostrarActasPorNumero(@PathVariable String idGrupoVotacion, Model modelo) {
		modelo.addAttribute("GrupoVotacionServicio", servicio.buscarGrupoVotacionPorNumero(idGrupoVotacion));
		return "actas_numero";
	}
}
