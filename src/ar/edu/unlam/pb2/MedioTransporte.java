package ar.edu.unlam.pb2;

public class MedioTransporte {

	protected Double latitud, longitud;
	protected String patente;
	protected Integer cantidadMaximaDePasajeros, velocidadMaxima;
	
	public MedioTransporte(Double latitud, Double longitud) {
		this.latitud=latitud;
		this.longitud=longitud;
		patente="";
		cantidadMaximaDePasajeros=0;
		velocidadMaxima=0;
	}

	public  Double getLatitud() {
		return latitud;
	}
	public  Double getLongitud() {
		return longitud;
	}
	
	public String getPatente() {
		return patente;
	}

	public Integer getCantidadMaximaDePasajeros() {
		return cantidadMaximaDePasajeros;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void actualizarCoordenadas(Double latitud, Double longitud) {
		this.latitud=latitud;
		this.longitud=longitud;
	}

	//la patente es identificador e irrepetible pero como es String no hace falta sobreescribir equals 
	
}
