package ar.edu.unlam.pb2;

public class Moto extends MedioTransporte {
	
	private  final Integer CANTIDAD_DE_PASAJEROS_MAXIMA;

	public Moto(String patente, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud,longitud);
		CANTIDAD_DE_PASAJEROS_MAXIMA=2;
		super.patente=patente;
		super.velocidadMaxima=velocidadMaxima;
	}

	public Integer getCAPACIDA_MAXIMA_DE_PASAJEROS() {
		return CANTIDAD_DE_PASAJEROS_MAXIMA;
	}

}
