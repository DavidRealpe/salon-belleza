package model;

public class Servicio{

	public final static double IVA = 0.19;
	public final static char CORTE_CABELLO = 'c';
	public final static char MANICURE = 'm';
	public final static char PEDICURE = 'p';

	private String nombre;
	private int vecesRealizado;
	private char tipoServicio;
	private double costo;

	public Servicio(String nombre, int vecesRealizado, char tipoServicio, double costo){
		this.nombre = nombre;
		this.vecesRealizado = vecesRealizado;
		this.tipoServicio = tipoServicio;
		this.costo = costo;
	}
}