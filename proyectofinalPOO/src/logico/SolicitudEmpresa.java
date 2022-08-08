package logico;

import java.io.Serializable;
import java.util.ArrayList;

public class SolicitudEmpresa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Numsoliciutd;
	private  String  Tipotrabajo;
	private int cantempleador;
	private  String Localizacion;
	private Float salariomin;
	private Empresa empresa;
	private Persona contratada;
	public SolicitudEmpresa(String numsoliciutd,String tipotrabajo,
			 int cantempleador, String localizacion,
			float salariomin,Empresa empresa,Persona contratada) {
		super();
		Numsoliciutd = numsoliciutd;
		Tipotrabajo = tipotrabajo;
		this.cantempleador = cantempleador;
		Localizacion = localizacion;
		this.salariomin = salariomin;
		this.empresa = empresa;
		this.setContratada(contratada);
	}
	public String getNumsoliciutd() {
		return Numsoliciutd;
	}
	public void setNumsoliciutd(String numsoliciutd) {
		Numsoliciutd = numsoliciutd;
	}
	
	public String getTipotrabajo() {
		return Tipotrabajo;
	}
	public void setTipotrabajo(String tipotrabajo) {
		Tipotrabajo = tipotrabajo;
	}
	public int getCantempleador() {
		return cantempleador;
	}
	public void setCantempleador(int cantempleador) {
		this.cantempleador = cantempleador;
	}
	public String getLocalizacion() {
		return Localizacion;
	}
	public void setLocalizacion(String localizacion) {
		Localizacion = localizacion;
	}
	
	public Float getSalariomin() {
		return salariomin;
	}
	public void setSalariomin(Float salariomin) {
		this.salariomin = salariomin;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	public Persona getContratada() {
		return contratada;
	}
	public void setContratada(Persona contratada) {
		this.contratada = contratada;
	}




}
