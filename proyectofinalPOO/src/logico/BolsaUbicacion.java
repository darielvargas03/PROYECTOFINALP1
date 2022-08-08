package logico;

import java.io.Serializable;
import java.util.ArrayList;

public class BolsaUbicacion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Empresa>miempresa;
	private ArrayList<Persona>mipersona;
	private int cantEmpresas;
	private int cantPersonas;
	private ArrayList<SolicitudPersona>solipersona;
	private ArrayList<SolicitudEmpresa>soliempresa;
	public static BolsaUbicacion bolsa;
	public static BolsaUbicacion getBolsa() {
		return bolsa;
	}
	public static void setBolsa(BolsaUbicacion bolsa) {
		BolsaUbicacion.bolsa = bolsa;
	}
	private int cantSolicitudesPersona;
	private int cantSolicitudesEmpresa;
	public BolsaUbicacion() {
		super();
		miempresa =  new ArrayList<Empresa>(1000);
		mipersona = new ArrayList<Persona>(1000);
		soliempresa = new ArrayList<SolicitudEmpresa>(1000);
		solipersona = new ArrayList<SolicitudPersona>(1000);
		cantEmpresas = 0;
		cantPersonas = 0;
		setCantSolicitudesEmpresa(0);
		setCantSolicitudesPersona(0);
	}
	 public static BolsaUbicacion getInstance() {
	    	if(bolsa == null) {
	    		bolsa = new BolsaUbicacion();
	    	}
	    	return bolsa;
	    }
	public ArrayList<Empresa> getMiempresa() {
		return miempresa;
	}
	public void setMiempresa(ArrayList<Empresa> miempresa) {
		this.miempresa = miempresa;
	}
	public ArrayList<Persona> getMipersona() {
		return mipersona;
	}
	public void setMipersona(ArrayList<Persona> mipersona) {
		this.mipersona = mipersona;
	}
	public ArrayList<SolicitudPersona> getSolipersona() {
		return solipersona;
	}
	public void setSolipersona(ArrayList<SolicitudPersona> solipersona) {
		this.solipersona = solipersona;
	}
	public ArrayList<SolicitudEmpresa> getSoliempresa() {
		return soliempresa;
	}
	public void setSoliempresa(ArrayList<SolicitudEmpresa> soliempresa) {
		this.soliempresa = soliempresa;
	}
	public int getCantEmpresas() {
		return cantEmpresas;
	}
	public void setCantEmpresas(int cantEmpresas) {
		this.cantEmpresas = cantEmpresas;
	}
	public int getCantPersonas() {
		return cantPersonas;
	}
	public void setCantPersonas(int cantPersonas) {
		this.cantPersonas = cantPersonas;
	}
	public void AddPersona(Persona aux) {
		mipersona.add(aux);
		cantPersonas++;
	}
	public void AddEmpresa(Empresa aux) {
		miempresa.add(aux);
		cantEmpresas++;
	}
	public Persona BuscarPersonaByCedula(String cedula) {
		Persona aux = null;
		for(int i = 0; i < cantPersonas;i++) {
			if(mipersona.get(i).getCedula().equalsIgnoreCase(cedula))
			{
				aux = mipersona.get(i);
			}
		}
		
		return aux;
	}
	public void SolicitarPersonal(SolicitudPersona aux) {
		solipersona.add(aux);
		cantSolicitudesPersona++;
		
		
	}
	public int getCantSolicitudesPersona() {
		return cantSolicitudesPersona;
	}
	public void setCantSolicitudesPersona(int cantSolicitudesPersona) {
		this.cantSolicitudesPersona = cantSolicitudesPersona;
	}
	public int getCantSolicitudesEmpresa() {
		return cantSolicitudesEmpresa;
	}
	public void setCantSolicitudesEmpresa(int cantSolicitudesEmpresa) {
		this.cantSolicitudesEmpresa = cantSolicitudesEmpresa;
	}
	public Empresa BuscarEmpresaByCodigo(String codigo) {
		// TODO Auto-generated method stub
		Empresa aux = null;
		for(int i = 0; i < cantEmpresas;i++) {
			if(miempresa.get(i).getId().equalsIgnoreCase(codigo))
				aux = miempresa.get(i);
		}
		return aux;
		
	}
	public SolicitudPersona BuscarSolicitudByPersona(Persona aux2) {
		// TODO Auto-generated method stub
		SolicitudPersona aux1 = null;
		for(int i = 0; i < cantSolicitudesPersona;i++) {
			if(solipersona.get(i).getPersonaSolicitud() == aux2)
				aux1 = solipersona.get(i);
		}
		return aux1;
	}
	public void HacersolicitudEmpresa(SolicitudEmpresa aux3, SolicitudPersona aux6) {
		cantSolicitudesEmpresa++;
		soliempresa.add(aux3);
		aux6.setEstaContratada(true);		
	}


}
