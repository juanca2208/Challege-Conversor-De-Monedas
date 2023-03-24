
public class Conversion {
	
	double valor = 0.0;
	String resultadoAmostrar = "";
	
	public String relizarConversion(double v, String a) {
		switch (a) {
			case "De Pesos a Euros":{
					valor = v * 350;
					String v1 = String.valueOf(valor);
					resultadoAmostrar = "Tienes $"+v1+ " En Euros";
					break;
			}
			case "De Pesos a Dolar":{
				valor = v / 389;
				String v2 = String.valueOf(valor);
				resultadoAmostrar = "Tienes $"+v2+ " En Dolares";
				break;
			}
			case "De Pesos a Libras":{
				valor = v * 0.0040;
				String v3 = String.valueOf(valor);
				resultadoAmostrar = "Tienes $"+v3+ " En Libras";
				break;
			}
			case "De Pesos a Real":{
				valor = v * 0.026;
				String v4 = String.valueOf(valor);
				resultadoAmostrar = "Tienes $"+v4+ " En Reales";
				break;
			}
			case "De Pesos a Yen":{
				valor = v * 0.64;
				String v5 = String.valueOf(valor);
				resultadoAmostrar = "Tienes $"+v5+ " En Yen";
				break;
			}
			case "De Pesos a Won Coreano":{
				valor = v * 6.30;
				String v6 = String.valueOf(valor);
				resultadoAmostrar = "Tienes $"+v6+ " En Won Coreano";
				break;
			}
			// Euro a pesos, de dolar a Pesos, de real a peso,etc.
			case "De Euros a Pesos":{
				valor = v * 221.34;
				String v6 = String.valueOf(valor);
				resultadoAmostrar = "Tienes $"+v6+ " En Pesos";
				break;
			}
			case "De Dolar a Pesos":{
				valor = v * 389;
				String v6 = String.valueOf(valor);
				resultadoAmostrar = "Tienes $"+v6+ " En Pesos";
				break;
			}
			case "De Real a Pesos":{
				valor = v * 39.13;
				String v6 = String.valueOf(valor);
				resultadoAmostrar = "Tienes $"+v6+ " En Pesos";
				break;	
			}
			case "De Libras a Pesos":{
				valor = v * 251.46;
				String v6 = String.valueOf(valor);
				resultadoAmostrar = "Tienes $"+v6+ " En Pesos";
				break;
			}
			case "De Yen a Pesos":{
				valor = v * 1.57;
				String v6 = String.valueOf(valor);
				resultadoAmostrar = "Tienes $"+v6+ " En Pesos";
				break;
			}
			case "De Won Coreano a Pesos":{
				valor = v * 0.16;
				String v6 = String.valueOf(valor);
				resultadoAmostrar = "Tienes $"+v6+ " En Pesos";
				break;
			}
			// CONVERSOR DE TEMPERATURA
			case "De Celsius a Fahrenheit":{
				valor = (v * 9/5) + 32;
				String v6 = String.valueOf(valor);
				resultadoAmostrar = "Temperatura "+ v6 + "°F Grados Fahrenheit";
				break;
			}
			case "De Celsius a Kelvin":{
				valor = v + 273.15;
				String v6 = String.valueOf(valor);
				resultadoAmostrar = "Temperatura "+ v6 + "°K Grados Kelvin";
				break;
			}
			case "De Fahrenheit a Celsius":{
				valor = (v - 32) * 5/9;
				String v6 = String.valueOf(valor);
				resultadoAmostrar = "Temperatura "+ v6 + "°C Grados Celsius";
				break;
			}
			default:
				break;
			}
			return resultadoAmostrar;
	}
		
	 
			
			

}
