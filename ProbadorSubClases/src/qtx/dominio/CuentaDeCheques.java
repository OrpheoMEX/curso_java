package qtx.dominio;

public class CuentaDeCheques extends CuentaBancaria {
	private int numChequesSinComision;

	public int getNumChequesSinComision() {
		return numChequesSinComision;
	}
	public void setNumChequesSinComision(int numChequesSinComision) {
		this.numChequesSinComision = numChequesSinComision;
	}
}
