package test;

public class Auto {
	
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		
		int cantidad = 0;
		
		for (int i = 0; i < asientos.length; i++) {
		    if (asientos[i] != null)
		    	cantidad++;
		}
		
		return cantidad;
	}
	
	String verificarIntegridad() {
		
		boolean integro = true;
		
		if (motor.registro != registro)
			integro = false;
		
		if (asientos.length > 0) {
			
			for (int i = 0; i < asientos.length; i++) {
				if (asientos[i] != null) {
				    if (registro != asientos[i].registro)
				    	integro = false;
				}
			}
		
		}
		
		/**if ( motor.registro == registro ) {
			
			if (asientos.length > 0) {
				for (int i = 0; i < asientos.length; i++) {
				    if (registro != asientos[i].registro)
				    	integro = false;
				}
			}
		
		} else
			integro = false;**/
		
		if (integro)
			return "Auto original";
		else
			return "Las piezas no son originales";
		
	}
	
	
}
