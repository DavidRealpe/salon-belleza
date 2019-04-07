package model;

public class Empleado{

	public final static int MAX = 3;

	private String nombre;
	private String cedula;
	private String cargo;
	private int anioIngreso;
	private double ganancia;
	private double impuestoAcumulado;	

	private Servicio servicio;
	private Servicio servicio2;
	private Servicio servicio3;


	public Empleado(String nombre, String cedula, String cargo, int anioIngreso, Servicio servico){
		this.nombre = nombre;
		this.cedula = cedula;
		this.cargo = cargo;
		this.anioIngreso = anioIngreso;
		this.ganancia = ganancia;
		this.servicio = servicio;
		this.servicio2 = null;
		this.servicio3 = null;
		this.impuestoAcumulado = impuestoAcumulado;
	}

	public String getNombre(){
		return nombre;
	}

	public String getCedula(){
		return cedula;
	}

	public Servicio getServicio(){
		return servicio;
	}

	public double getGanancia(){

		char tipoServ = getServicio().getTipoServicio();

		if(tipoServ == 'c'){
			ganancia = getServicio().getIngreso()*2.0;
		}
		else if(tipoServ == 'm'){
			ganancia = getServicio().getIngreso()*3.5;
		}
		else if(tipoServ == 'p'){
			ganancia = getServicio().getIngreso()*2.5;
		}

		return ganancia;
	}

	public double getImpuestoAcumulado(){

		/*char corte = getServicio().CORTE_CABELLO;
		char manicure = getServicio().MANICURE;
		char pedicure = getServicio().PEDICURE;*/

		char tipoServ = getServicio().getTipoServicio();

		if(tipoServ == 'c'){
			impuestoAcumulado = getServicio().getIngreso()*0.5;
		}
		else if(tipoServ == 'm'){
			impuestoAcumulado = getServicio().getIngreso()*0.5;
		}
		else if(tipoServ == 'p'){
			impuestoAcumulado = getServicio().getIngreso()*0.5;
		}

		return impuestoAcumulado;
	}

	

}