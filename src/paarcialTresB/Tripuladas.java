package paarcialTresB;


public class Tripuladas  extends Nave {
	public Tripuladas (String nombre,String combustible,String peso, String velocidad, String potencia) {
		super (nombre, combustible, peso, velocidad, potencia);

	}

	@Override
	public String toString() {
		return "tipo Tripuladas[nombre=" + nombre + ", combustible=" + combustible + ", peso=" + peso + ", velocidad="
				+ velocidad + ", potencia=" + potencia + "]";
	}}