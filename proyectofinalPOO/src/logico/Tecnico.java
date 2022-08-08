package logico;

import java.util.Date;

public class Tecnico extends Persona {
	
       private String  tipoTecnico;
       private int cantTecnico;
       private String nombreInstitucion;
       
	public Tecnico(String cedula, String nombre, String apellido, String telefono, String email,
			 char genero, String campodetrabajo, boolean profesional, int salariobase,
			String estadoCivil,String tipoTecnico,String nombreInstitucion,int edad,String direccion) {
		super(cedula, nombre, apellido, telefono, email, genero, campodetrabajo, profesional,
				salariobase, estadoCivil, edad,direccion);
		this.tipoTecnico = tipoTecnico;
		this.cantTecnico = 0;
		this.nombreInstitucion = nombreInstitucion;
	}

	public String getTipoTecnico() {
		return tipoTecnico;
	}

	public void setTipoTecnico(String tipoTecnico) {
		this.tipoTecnico = tipoTecnico;
	}

	public int getCantTecnico() {
		return cantTecnico;
	}

	public void setCantTecnico(int cantTecnico) {
		this.cantTecnico = cantTecnico;
	}

	public String getNombreInstitucion() {
		return nombreInstitucion;
	}

	public void setNombreInstitucion(String nombreInstitucion) {
		this.nombreInstitucion = nombreInstitucion;
	}

}
