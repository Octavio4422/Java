package Entidades;

public class Ahorcado {
	private String[] palabra;
	private String[] juego;
	private int intentos;
	private int encontradas;
	private int unicas;
	
	public int getUnicas() {
		return unicas;
	}

	public void setUnicas(int unicas) {
		this.unicas = unicas;
	}

	public Ahorcado() {}

	public Ahorcado(String[] palabra, int intentos, int encontradas) {
		this.palabra = palabra;
		this.intentos = intentos;
		this.encontradas = encontradas;
	}

	public String[] getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra, int tamaño) {
		this.palabra = new String[tamaño];
		this.juego = new String[tamaño];
		
		for (int i = 0; i < tamaño; i++) {
			if(palabra.substring(i,i+1).equalsIgnoreCase(" ")) {
				this.palabra[i] = ".";
				this.juego[i] = ".";
			} else {
				this.palabra[i] = palabra.substring(i, i+1);
			}
		}
	}
	
	public String[] getJuego() {
		return juego;
	}

	public int getIntentos() {
		return intentos;
	}

	public void setIntentos(int intentos) {
		this.intentos -= intentos;
	}

	public int getEncontradas() {
		return encontradas;
	}

	public void setEncontradas(int encontradas) {
		this.encontradas += encontradas;
	}
	
//	Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//	buscar como se usa el vector.length.
	
	public int longitud() {
		int longi = 0;
		for (int i = 0; i < this.palabra.length; i++) {
			if(this.palabra[i].equals(".")) continue;
			else longi += 1;
		}
		return longi;
	}

//	Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
//	letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
	public boolean buscar(String letra) {
		boolean encontrada = false;
		
		for (int i = 0; i < this.palabra.length; i++) {
			if(this.palabra[i].equalsIgnoreCase(letra)) {
				encontrada = true;
				this.juego[i] = this.palabra[i];
				setEncontradas(1);
			}
		}

		return encontrada;
	}
	
//	Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//	cuantas letras han sido encontradas y cuantas le faltan.
// Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//	busque una letra que no esté, se le restará uno a sus oportunidades.
	
	public void encontradas(String letra) {
		if(buscar(letra)) {
			System.out.println("La letra se entuentra en la frase");
			System.out.println("Encontraste: " + getEncontradas());
			System.out.println("Restan encontrar: Ahora lo hago xd");
			System.out.println("Restan: " + getIntentos() + " intentos");
		} else {
			System.out.println("La letra NO se entuentra en la frase");
			System.out.println("Encontraste: " + getEncontradas());
			setIntentos(1);
			System.out.println("Restan: " + getIntentos() + " intentos");
		}
	}
	
//	Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
	public int intentos() {
		return getIntentos();
	}
	
	public void juego() {
		
	}
	
}
