package model;

public class Empleado{

	public final static int MAX = 3;

	private String nombre;
	private String cedula;
	private String cargo;
	private int anioIngreso;
	private double ganancia;

	private Servicio[] servicio;

	public Empleado(String nombre, String cedula, String cargo, int anioIngreso, double ganancia){
		this.nombre = nombre;
		this.cedula = cedula;
		this.cargo = cargo;
		this.anioIngreso = anioIngreso;
		this.ganancia = ganancia;
		servicio = new Servicio[MAX];
	}

	public String getCedula(){
		return cedula;
	}

}