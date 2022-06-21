package ar.edu.unlam.pb2;

public class Auto extends MedioTransporte {

	public Auto(String patente, Integer cantidadMaximaDePasajeros, Integer velocidadMaxima,Double latitud, Double longitud) {
		super(latitud,longitud);
		super.patente=patente;
		super.cantidadMaximaDePasajeros=cantidadMaximaDePasajeros;
		super.velocidadMaxima=velocidadMaxima;
	}


}
