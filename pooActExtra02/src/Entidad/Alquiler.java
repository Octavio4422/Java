package Entidad;
import java.time.LocalDate;

public class Alquiler {
    private String peliculaAlquilada;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int precio;
    private String[] peliculasAlquiladas = new String[3];

    public Alquiler() {
    }

    public Alquiler(String peliculaAlquilada, LocalDate fechaInicio, LocalDate fechaFin, int precio) {
        this.peliculaAlquilada = peliculaAlquilada;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

	public String getPeliculaAlquilada() {
		return peliculaAlquilada;
	}

	public void setPeliculaAlquilada(String peliculaAlquilada) {
		this.peliculaAlquilada = peliculaAlquilada;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String[] getPeliculasAlquiladas() {
		return peliculasAlquiladas;
	}

	public void setPeliculasAlquiladas(String[] peliculasAlquiladas) {
		this.peliculasAlquiladas = peliculasAlquiladas;
	}
}
