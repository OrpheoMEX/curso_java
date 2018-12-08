package qtx.casosDeUso;

import qtx.dominio.CuentaTarjetaCreditoOro;
public class GestorCuentas {
	public static void main(String[] args){
		CuentaTarjetaCreditoOro unaCuenta;
		unaCuenta=new CuentaTarjetaCreditoOro();
		// invocando m�todos de CuentaBancaria
		unaCuenta.setNumCuenta("CR0001"); 
		unaCuenta.setSaldo(1500.00f);     
		// invocando m�todos de CuentaDeCredito
		unaCuenta.setTasaInteresAnual(17.23f); 
		unaCuenta.setLimiteCredito(90000);
		// invocando m�todos de CuentaTarjetaCreditoOro
		unaCuenta.setTasaInteresMensual(17.23f/12.0f); 
		unaCuenta.setTasaComisionRetiro(3.0f);
		System.out.println(unaCuenta);
	}

}
