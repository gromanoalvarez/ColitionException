package ar.edu.unlam.pb2;

public class Tren extends MedioTransporte {

	private Integer cantidadDeVagones, cantidadDePasajerosPorVagon;

	public Tren(Integer cantidadDeVagones, Integer cantidadDePasajerosPorVagon, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.cantidadDeVagones=cantidadDeVagones;
		this.cantidadDePasajerosPorVagon=cantidadDePasajerosPorVagon;
		super.velocidadMaxima=velocidadMaxima;
	}

	public Integer getCantidadDeVagones() {
		return cantidadDeVagones;
	}

	public Integer getCantidadDePasajerosPorVagon() {
		return cantidadDePasajerosPorVagon;
	}

}
