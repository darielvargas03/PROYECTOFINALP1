package logico;

import java.io.Serializable;
import java.util.Date;

public class Persona implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String Cedula;
	protected String nombre;
	protected String apellido;
	protected String Telefono;
	protected String email;
	protected String Institucion;
	protected char genero;
	protected String Campodetrabajo;
	protected boolean Profesional;
	protected int Salariobase;
	protected int edad;
	protected String direccion;
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Persona(String cedula, String nombre, String apellido, String telefono, String email, char genero, String campodetrabajo, boolean profesional, int salariobase,
			String institucion,int edad,String direccion) {
		super();
		Cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		Telefono = telefono;
		this.email = email;
		Institucion = institucion;
		this.genero = genero;
		Campodetrabajo = campodetrabajo;
		Profesional = profesional;
		this.Salariobase = salariobase;
		this.edad = edad;
		this.direccion = direccion;
	}
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getInstitucion() {
		return Institucion;
	}
	public void setInstitucion(String institucion) {
		Institucion = institucion;
	}

	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String getCampodetrabajo() {
		return Campodetrabajo;
	}
	public void setCampodetrabajo(String campodetrabajo) {
		Campodetrabajo = campodetrabajo;
	}
	public boolean isProfesional() {
		return Profesional;
	}
	public void setProfesional(boolean profesional) {
		Profesional = profesional;
	}
	public int getSalariobase() {
		return Salariobase;
	}
	public void setSalariobase(int salariobase) {
		Salariobase = salariobase;
	}
	
}
