package logico;

import java.util.Date;

public class Universatario extends Persona {
	private String Carrera;

	public Universatario(String cedula, String nombre, String apellido, String telefono, String email,
			  char genero, String campodetrabajo, boolean profesional,
			int salariobase, String estadoCivil,String carrera,int edad,String direccion) {
		super(cedula, nombre, apellido, telefono, email, genero, campodetrabajo, profesional,
				salariobase, estadoCivil, edad,direccion);
		this.Carrera = carrera;
	}

	public String getCarrera() {
		return Carrera;
	}

	public void setCarrera(String carrera) {
		Carrera = carrera;
	}

}
