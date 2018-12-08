package qtx.dominio;

public class CuentaTarjetaCreditoOro extends CuentaDeCredito {
	private float tasaInteresMensual;
	private float tasaComisionRetiro;

	public float getTasaInteresMensual() {
		return tasaInteresMensual;
	}
	public void setTasaInteresMensual(float tasaInteresMensual) {
		this.tasaInteresMensual = tasaInteresMensual;
	}
	public float getTasaComisionRetiro() {
		return tasaComisionRetiro;
	}
	public void setTasaComisionRetiro(float tasaComisionRetiro) {
		this.tasaComisionRetiro = tasaComisionRetiro;
	}
	@Override
	public String toString() {
		return "CuentaTarjetaCreditoOro [tasaInteresMensual="
				+ tasaInteresMensual + ", tasaComisionRetiro="
				+ tasaComisionRetiro + "]";
	}

}
