package logico;

import java.util.ArrayList;
import java.util.Date;

public class Obrero extends Persona {
               private String AreaLaboral;
	public Obrero(String cedula, String nombre, String apellido, String telefono, String email,
			 char genero, String campodetrabajo, boolean profesional, int salariobase,String AreaLaboral,
			String estadoCivil,int edad,String direccion) {
		super(cedula, nombre, apellido, telefono, email, genero, campodetrabajo, profesional,
				salariobase, estadoCivil, edad, direccion);
		this.AreaLaboral = AreaLaboral;
		
	}
	public String getAreaLaboral() {
		return AreaLaboral;
	}
	public void setAreaLaboral(String areaLaboral) {
		AreaLaboral = areaLaboral;
	}

}
