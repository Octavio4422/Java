package familia;

import utilities.Paredes;
import utilities.Piso;

public class InformacionVivienda {

	private int nDeDormitorios;
	private Paredes tipoDeParedes;
	private Piso tipoDePiso;
	private boolean iluminacion;
	
	public InformacionVivienda() {}
	
	public InformacionVivienda(int nDeDormitorios, Paredes tipoDeParedes, Piso tipoDePiso, boolean iluminacion) {
		super();
		this.nDeDormitorios = nDeDormitorios;
		this.tipoDeParedes = tipoDeParedes;
		this.tipoDePiso = tipoDePiso;
		this.iluminacion = iluminacion;
	}

	public int getnDeDormitorios() {
		return nDeDormitorios;
	}

	public void setnDeDormitorios(int nDeDormitorios) {
		this.nDeDormitorios = nDeDormitorios;
	}

	public Paredes getTipoDeParedes() {
		return tipoDeParedes;
	}

	public void setTipoDeParedes(Paredes tipoDeParedes) {
		this.tipoDeParedes = tipoDeParedes;
	}

	public Piso getTipoDePiso() {
		return tipoDePiso;
	}

	public void setTipoDePiso(Piso tipoDePiso) {
		this.tipoDePiso = tipoDePiso;
	}

	public boolean isIluminacion() {
		return iluminacion;
	}

	public void setIluminacion(boolean iluminacion) {
		this.iluminacion = iluminacion;
	}

}
