package onpe.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "GrupoVotacion", catalog = "Onpe", schema = "")
public class GrupoVotacion {
	
	@Id
	@Column
	private Integer idGrupoVotacion;
	
	@Column
	private int idLocalVotacion;
	
	@Column
	private String nCopia;
	
	@Column
	private int idEstadoActa;
	
	@Column
	private int ElectoresHabiles;
	
	@Column
	private int TotalVotantes;
	
	@Column
	private int P1;
	
	@Column 
	private int P2;
	
	@Column
	private int VotosBlancos;
	
	@Column
	private int VotosNulos;
	
	@Column
	private int VotosImpugnados;

	private String Departamento;
	private String Provincia;
	private String Distrito;
	private String RazonSocial;
	private String Direccion;
	
	
	
	public Integer getIdGrupoVotacion() {
		return idGrupoVotacion;
	}

	public void setIdGrupoVotacion(Integer idGrupoVotacion) {
		this.idGrupoVotacion = idGrupoVotacion;
	}

	public int getIdLocalVotacion() {
		return idLocalVotacion;
	}

	public void setIdLocalVotacion(int idLocalVotacion) {
		this.idLocalVotacion = idLocalVotacion;
	}

	public String getnCopia() {
		return nCopia;
	}

	public void setnCopia(String nCopia) {
		this.nCopia = nCopia;
	}

	public int getIdEstadoActa() {
		return idEstadoActa;
	}

	public void setIdEstado(int idEstado) {
		this.idEstadoActa = idEstado;
	}

	public int getElectoresHabiles() {
		return ElectoresHabiles;
	}

	public void setElectoresHabiles(int electoresHabiles) {
		ElectoresHabiles = electoresHabiles;
	}

	public int getTotalVotantes() {
		return TotalVotantes;
	}

	public void setTotalVotantes(int totalVotantes) {
		TotalVotantes = totalVotantes;
	}

	public int getP1() {
		return P1;
	}

	public void setP1(int p1) {
		P1 = p1;
	}

	public int getP2() {
		return P2;
	}

	public void setP2(int p2) {
		P2 = p2;
	}

	public int getVotosBlancos() {
		return VotosBlancos;
	}

	public void setVotosBlancos(int votosBlancos) {
		VotosBlancos = votosBlancos;
	}

	public int getVotosNulos() {
		return VotosNulos;
	}

	public void setVotosNulos(int votosNulos) {
		VotosNulos = votosNulos;
	}

	public int getVotosImpugnados() {
		return VotosImpugnados;
	}

	public void setVotosImpugnados(int votosImpugnados) {
		VotosImpugnados = votosImpugnados;
	}

	public String getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}

	public String getProvincia() {
		return Provincia;
	}

	public void setProvincia(String provincia) {
		Provincia = provincia;
	}

	public String getDistrito() {
		return Distrito;
	}

	public void setDistrito(String distrito) {
		Distrito = distrito;
	}

	public String getRazonSocial() {
		return RazonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public GrupoVotacion() {
		
	}

	public GrupoVotacion(Integer idGrupoVotacion, int idLocalVotacion, String nCopia, int idEstadoActa, int electoresHabiles, int totalVotantes, int p1, int p2, int votosBlancos, int votosNulos, int votosImpugnados) {
		this.idGrupoVotacion = idGrupoVotacion;
		this.idLocalVotacion = idLocalVotacion;
		this.nCopia = nCopia;
		this.idEstadoActa = idEstadoActa;
		ElectoresHabiles = electoresHabiles;
		TotalVotantes = totalVotantes;
		P1 = p1;
		P2 = p2;
		VotosBlancos = votosBlancos;
		VotosNulos = votosNulos;
		VotosImpugnados = votosImpugnados;
	}	
}
