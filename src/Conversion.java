
public class Conversion {
	
	double valor = 0.0;
	
	public double relizarConversion(double v, String a) {
		switch (a) {
			case "De Pesos a Euros":{
					valor = v * 350;
					break;
			}
			case "De Pesos a Dolar":{
				valor = v / 389;
				break;
			}
			case "De Pesos a Libras":{
				valor = v / 389;
				break;
			}
			case "De Pesos a Real":{
				valor = v / 389;
				break;
			}
			case "De Pesos a Yen":{
				valor = v / 389;
				break;
			}
			case "De Pesos a Won Coreano":{
				valor = v / 389;
				break;
			}
				
			default:
				break;
			}
			return valor;
	}
	/*
	 * combo.addItem();
			combo.addItem();
			combo.addItem();
			combo.addItem();
			combo.addItem();
			combo.addItem();
			combo.addItem("De Dolar a Pesos");
			combo.addItem("De Euros a Pesos");
			combo.addItem("De Libras a Pesos");
			combo.addItem("De Real a Pesos");
			combo.addItem("De Won Coreano a Pesos");*
	 */

}
