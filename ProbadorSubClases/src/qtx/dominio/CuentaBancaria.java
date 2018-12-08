package qtx.dominio;

public class CuentaBancaria {
	private String numCuenta;
	private float saldo;

	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "CuentaBancaria [numCuenta=" + numCuenta + ", saldo=" + saldo
				+ "]";
	}
	
}
