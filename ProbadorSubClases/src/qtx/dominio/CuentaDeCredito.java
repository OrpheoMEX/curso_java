package qtx.dominio;

public class CuentaDeCredito extends CuentaBancaria {
	private int limiteCredito;
	private double tasaInteresAnual;

	public int getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(int limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	public double getTasaInteresAnual() {
		return tasaInteresAnual;
	}
	public void setTasaInteresAnual(double tasaInteresAnual) {
		this.tasaInteresAnual = tasaInteresAnual;
	}
	@Override
	public String toString() {
		return "CuentaDeCredito [limiteCredito=" + limiteCredito
				+ ", tasaInteresAnual=" + tasaInteresAnual + "]";
	}

}
