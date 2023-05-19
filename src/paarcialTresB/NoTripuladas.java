package paarcialTresB;

public class NoTripuladas extends Nave {
	public NoTripuladas(String nombre,String combustible,String peso, String velocidad, String potencia) {
		super (nombre, combustible, peso, velocidad, potencia);

	}

	@Override
	public String toString() {
		return "tipo NoTripuladas[nombre=" + nombre + ", combustible=" + combustible + ", peso=" + peso + ", velocidad="
				+ velocidad + ", potencia=" + potencia + "]";
	}
		

		}

