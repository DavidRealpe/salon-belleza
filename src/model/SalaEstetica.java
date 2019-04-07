package model;

import java.util.ArrayList;

public class SalaEstetica{


	private Empleado empleado1;
	private Empleado empleado2;
	private Servicio registro;

	public SalaEstetica(Empleado empleado1, Empleado empleado2){
		this.empleado1 = empleado1;
		this.empleado2 = empleado2;
		this.registro = registro;
	}

	public Empleado getEmpleado1(){
		return empleado1;
	}	

	public Empleado getEmpleado2(){
		return empleado2;
	}

	public double promedioIngresos(){

		double ingreso1 = empleado1.getGanancia();
		double ingreso2 = empleado2.getGanancia();

		double promIng = (ingreso1 + ingreso2)/2;

		return promIng; 
	}

	public void hacerRegistro(){

		int vecesR = registro.getVecesRealizado();
		String msg = "";


		if(vecesR==0){
			msg = "Se ha registrado por primera vez este servicio";
		}else{
			vecesR++;
		}

	}

	public String reporteEmpleado1(){

		int vecesPrestado = empleado1.getServicio().getVecesRealizado();

		String mensajeReporte = "";

		if(vecesPrestado<10){

			mensajeReporte = "El empleado "+empleado1.getNombre()+" tiene "+empleado1.getImpuestoAcumulado()+" pesos de impuestos acumulados por concepto de pedicure.";
		}
		else if(vecesPrestado>9 && vecesPrestado<21){
		
			mensajeReporte = "El empleado "+empleado1.getNombre()+" con el Servicio"+empleado1.getServicio().getNombre()+" tiene "+empleado1.getGanancia()+" pesos de ingreso acumulados.";
		}
		else if(vecesPrestado<20 && vecesPrestado%10==0 ){
		
			mensajeReporte = "Felicitaciones a "+empleado1.getNombre()+"!!! "+"La sala cubrirea el valor de su impuesto.";
		}
		else if(empleado1.getServicio().getTipoServicio()!='p'){

			mensajeReporte = "El empleado "+empleado1.getNombre()+" no presenta el servicio pedicure.";
		}

	return mensajeReporte;
	}

	public String reporteEmpleado2(){

		int vecesPrestado = empleado2.getServicio().getVecesRealizado();

		String mensajeReporte = "";

		if(vecesPrestado<10){

			mensajeReporte = "El empleado "+empleado2.getNombre()+" tiene "+empleado2.getImpuestoAcumulado()+" pesos de impuestos acumulados por concepto de pedicure.";
		}
		else if(vecesPrestado>9 && vecesPrestado<21){
		
			mensajeReporte = "El empleado "+empleado2.getNombre()+" con el Servicio"+empleado2.getServicio().getNombre()+" tiene "+empleado2.getGanancia()+" pesos de ingreso acumulados.";
		}
		else if(vecesPrestado<20 && vecesPrestado%10==0){
		
			mensajeReporte = "Felicitaciones a "+empleado2.getNombre()+"!!! "+"La sala cubrirea el valor de su impuesto.";
		}
		else if(empleado2.getServicio().getTipoServicio()!='p'){
			
			mensajeReporte = "El empleado "+empleado2.getNombre()+" no presenta el servicio pedicure.";
		}

	return mensajeReporte;
	}
}