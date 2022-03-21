package test;

public class Asiento {

	String color;
	int precio;
	int registro;
	
	void cambiarColor(String color) {
		
		boolean colorEsValido = false;
		String[] coloresValidos = new String[]{"rojo", "verde", "amarillo", "negro", "blanco"};
		
		for (int i = 0; i < coloresValidos.length; i++){
		    if (color == coloresValidos[i])
		    	colorEsValido = true;
		}
		
		if ( colorEsValido )
			this.color = color;
	
	}

}
