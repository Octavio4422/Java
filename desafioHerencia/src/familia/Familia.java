package familia;

import java.util.ArrayList;

import integrante.Integrante;

public abstract class Familia {

	protected String direccion;
	protected int ide;
	protected int nDeLote;
	protected String barrio;
	protected String localidad;
	private InformacionVivienda info;
	private ArrayList<Integrante> integrantes = new ArrayList<>();
		
	public Familia() {}

	public Familia(String direccion, int ide, int nDeLote, String barrio, String localidad, InformacionVivienda info) {
		super();
		this.direccion = direccion;
		this.ide = ide;
		this.nDeLote = nDeLote;
		this.barrio = barrio;
		this.localidad = localidad;
		this.info = info;
	}
		
	public Familia(String direccion, int ide, int nDeLote, String barrio, String localidad, InformacionVivienda info,
			ArrayList<Integrante> integrantes) {
		super();
		this.direccion = direccion;
		this.ide = ide;
		this.nDeLote = nDeLote;
		this.barrio = barrio;
		this.localidad = localidad;
		this.info = info;
		this.integrantes = integrantes;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getIde() {
		return ide;
	}

	public void setIde(int ide) {
		this.ide = ide;
	}

	public int getnDeLote() {
		return nDeLote;
	}

	public void setnDeLote(int nDeLote) {
		this.nDeLote = nDeLote;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public InformacionVivienda getInfo() {
		return info;
	}

	public void setInfo(InformacionVivienda info) {
		this.info = info;
	}
		
	public ArrayList<Integrante> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(Integrante i) {
		this.integrantes.add(i);
	}

	@Override
	public String toString() {
		return "Familia [direccion=" + direccion + ", ide=" + ide + ", nDeLote=" + nDeLote + ", barrio=" + barrio
				+ ", localidad=" + localidad + ", info=" + info + "]";
	}
			
}
