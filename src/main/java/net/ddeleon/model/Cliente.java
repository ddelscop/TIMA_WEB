package net.ddeleon.model;

public class Cliente {

	private Integer idCli;
	private String contacto;
	private String rut;
	private String nroCli;
	private String tel;
	private String direccion;
	private String depto; // despues va a ser una FK a la tabla departamentos con nombre llave idDepto
	private String nomCli;
	private int hsCargables;
	private int honorarios;
	private String moneda; // desíes va a ser moneda de tipo int, FK a la tabla monedas con nombre de llave
							// moneda
	private int tipoPersona;

	public Integer getIdCli() {
		return idCli;
	}

	public void setIdCli(Integer idCli) {
		this.idCli = idCli;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNroCli() {
		return nroCli;
	}

	public void setNroCli(String nroCli) {
		this.nroCli = nroCli;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

	public String getNomCli() {
		return nomCli;
	}

	public void setNomCli(String nomCli) {
		this.nomCli = nomCli;
	}

	public int getHsCargables() {
		return hsCargables;
	}

	public void setHsCargables(int hsCargables) {
		this.hsCargables = hsCargables;
	}

	public int getHonorarios() {
		return honorarios;
	}

	public void setHonorarios(int honorarios) {
		this.honorarios = honorarios;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public int getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(int tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	@Override
	public String toString() {
		return "Cliente [idCli=" + idCli + ", contacto=" + contacto + ", rut=" + rut + ", nroCli=" + nroCli + ", tel="
				+ tel + ", direccion=" + direccion + ", depto=" + depto + ", nomCli=" + nomCli + ", hsCargables="
				+ hsCargables + ", honorarios=" + honorarios + ", moneda=" + moneda + ", tipoPersona=" + tipoPersona
				+ "]";
	}

}
