package paarcialTresB;

public class Lanzadera extends Nave {
	//tipo de nave 

	
		public Lanzadera(String nombre,String combustible,String peso, String velocidad, String potencia) {
			super (nombre, combustible, peso, velocidad, potencia);

			
			//datos importantes sobre la nave
		}
// para poder mostrar los datos usando toString
		public String toString() {
			return "tipo Lanzadera[nombre=" + nombre + ", combustible=" + combustible + ", peso=" + peso + ", velocidad="
					+ velocidad + ", potencia=" + potencia + "]";
		}
}
		

