package model;

public class Servicio{

	public final static double IVA = 0.19;
	public final static char CORTE_CABELLO = 'c';
	public final static char MANICURE = 'm';
	public final static char PEDICURE = 'p';

	private String nombre;
	private int vecesRealizado;
	private char tipoServicio;
	private double ingreso;
	private boolean publicidad;

	public Servicio(String nombre, int vecesRealizado, char tipoServicio, boolean publicidad){
		this.nombre = nombre;
		this.vecesRealizado = vecesRealizado;
		this.tipoServicio = tipoServicio;
		this.ingreso = ingreso;
		this.publicidad = publicidad;
	}

	public String getNombre(){
		return nombre;
	}

	public int getVecesRealizado(){
		return vecesRealizado;
	}

	public void setVecesRealizado(int vecesRealizado){
		this.vecesRealizado = vecesRealizado;
	}

	public char getTipoServicio(){
		return tipoServicio;
	}

	public void setTipoServicio(char tipoServicio){
		this.tipoServicio = tipoServicio;
	}

	public double getIngreso(){

		if(tipoServicio=='c'){

			ingreso = 8000 + (8000*0.19);

				if(publicidad==true)
					ingreso = ingreso + ingreso*0.13; 
		}
		else if(tipoServicio=='m'){

			ingreso = 7000 + (7000*0.19);

				if(publicidad==true)
					ingreso = ingreso + ingreso*0.13; 
		}
		else if(tipoServicio=='p'){

			ingreso = 9000 + (9000*0.19);

				if(publicidad==true)
					ingreso = ingreso + ingreso*0.13;
		}
	return ingreso;
	}

	public boolean getPublicidad(){
		return publicidad;
	}








}