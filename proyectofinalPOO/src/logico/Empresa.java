package logico;

import java.io.Serializable;
import java.util.ArrayList;

public class Empresa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Id;
	private String nombre;
	private String direccion;
	private String Telefono;
	private String  RNC;
	private String descripcion;
	private int presupuestoAnual;
	public Empresa(String id, String nombre, String direccion, String telefono, String RNC, String descripcion,
			int presupuestoAnual) {
		super();
		Id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		Telefono = telefono;
		this.RNC = RNC;
		this.descripcion = descripcion;
		this.presupuestoAnual = presupuestoAnual;
		
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getRNC() {
		return RNC;
	}
	public void setRNC(String RNC) {
		this.RNC = RNC;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPresupuestoAnual() {
		return presupuestoAnual;
	}
	public void setPresupuestoAnual(int presupuestoAnual) {
		this.presupuestoAnual = presupuestoAnual;
	}
	
	

}
