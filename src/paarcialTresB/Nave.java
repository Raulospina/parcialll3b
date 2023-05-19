package paarcialTresB;

public abstract class Nave {

	protected String nombre;
	protected String combustible;
	protected String peso;
    protected String velocidad;
    protected String potencia;
			

	 //Constructors
	 //getter y setter

			
			public Nave(String nombre, String combustible, String peso, String velocidad, String potencia) {
				super();
				this.nombre = nombre;
				this.combustible = combustible;
				this.peso = peso;
				this.velocidad = velocidad;
				this.potencia = potencia;
			}
			public String getnombre() {
				return nombre;
			}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public String getcombustible() {
				return combustible;
			}
			public void setcombustible(String combustible) {
				this.combustible = combustible;
			}
			public String getPeso() {
				return peso;
			}

			public void setPeso(String peso) {
				this.peso = peso;
			}
			
			public String getvelocidad() {
				return velocidad;
			}

			public void setVelocidad(String velocidad) {
				this.velocidad = velocidad;
			}

			public String getpotencia() {
				return potencia;
			}

			public void setPotencia(String potencia) {
				this.potencia = potencia;
			}

		}
