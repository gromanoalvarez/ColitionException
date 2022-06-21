package ar.edu.unlam.pb2;

import java.util.HashSet;

public class Mapa {

	private String nombre;
	private HashSet<MedioTransporte> vehiculosCirculando;

	public Mapa(String nombre) {
		this.nombre=nombre;
		vehiculosCirculando= new HashSet<MedioTransporte>();
	}

	public void agregarVehiculo(MedioTransporte vehiculo) {
		vehiculosCirculando.add(vehiculo);
	}

	public Integer getCantidadDeVehiculos() {
		return vehiculosCirculando.size();
	}

	public boolean hayCoalición() throws ColitionException {
		// hacer un for de vehiculosCirculando comparando con otro for anindado del mismo para consultar coordenadas 
		for(MedioTransporte vc1 : vehiculosCirculando) {
			for(MedioTransporte vc2: vehiculosCirculando) {
				if(!vc1.getPatente().equals(vc2.getPatente()) && vc1.getLatitud().equals(vc2.getLatitud()) && vc1.getLongitud().equals(vc2.getLongitud())) {
					throw new ColitionException("Hay coalición en latitud: "+vc1.getLatitud()+ " y longitud: "+vc1.getLongitud());
				}
			}
		}
		return false;
	}

}
