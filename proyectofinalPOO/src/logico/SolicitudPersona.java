package logico;

import java.io.Serializable;

public class SolicitudPersona implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codSolicitud;
	private Persona PersonaSolicitud;
	private boolean EstaContratada;
	public SolicitudPersona(String codSolicitud,Persona PersonaSolicitud) {
		super();
		this.setCodSolicitud(codSolicitud);
		this.setPersonaSolicitud(PersonaSolicitud);
		EstaContratada = false;
	}
	public Persona getPersonaSolicitud() {
		return PersonaSolicitud;
	}
	public void setPersonaSolicitud(Persona personaSolicitud) {
		PersonaSolicitud = personaSolicitud;
	}
	public String getCodSolicitud() {
		return codSolicitud;
	}
	public void setCodSolicitud(String codSolicitud) {
		this.codSolicitud = codSolicitud;
	}
	public boolean isEstaContratada() {
		return EstaContratada;
	}
	public void setEstaContratada(boolean estaContratada) {
		EstaContratada = estaContratada;
	}
	

}
