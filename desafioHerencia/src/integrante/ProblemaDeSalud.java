package integrante;

public class ProblemaDeSalud {

	private int nDeOrden;
	private int ideDeFamilia;
	private boolean hta;
	private boolean dbt;
	
	public ProblemaDeSalud() {}

	public ProblemaDeSalud(int nDeOrden, int ideDeFamilia, boolean hta, boolean dbt) {
		this.nDeOrden = nDeOrden;
		this.ideDeFamilia = ideDeFamilia;
		this.hta = hta;
		this.dbt = dbt;
	}

	
	public int getnDeOrden() {
		return nDeOrden;
	}
	

	public void setnDeOrden(int nDeOrden) {
		this.nDeOrden = nDeOrden;
	}
	

	public int getIdeDeFamilia() {
		return ideDeFamilia;
	}
	

	public void setIdeDeFamilia(int ideDeFamilia) {
		this.ideDeFamilia = ideDeFamilia;
	}
	

	public boolean isHta() {
		return hta;
	}
	

	public void setHta(boolean hta) {
		this.hta = hta;
	}
	

	public boolean isDbt() {
		return dbt;
	}
	

	public void setDbt(boolean dbt) {
		this.dbt = dbt;
	}

}
