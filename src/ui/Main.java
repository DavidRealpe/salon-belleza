package ui;

import model.*;

import java.util.Scanner;

public class Main{

	public static final int SALIR = 3;

	private SalaEstetica se;

	public static void main(String[] args){



		Servicio s1 = new Servicio("Arreglado de puntas", 15, 'c', false);
		Servicio s2 = new Servicio("Cuidado de uñas", 30, 'm', true);
		Empleado em1 = new Empleado("Jose", "122.342.2", "Alisador", 2015, s1);
		Empleado em2 = new Empleado("Camilo", "123.343.4", "Manicuro", 2017, s2);
		SalaEstetica se = new SalaEstetica(em1, em2);


		Scanner reader = new Scanner(System.in);

		int option;

		do{

		System.out.println("Bienvenido al software de la Sala Estetica\n");

		System.out.println("Seleccione una opcion que desee.");
		System.out.println("1. Ver empleados.");
		System.out.println("2. Salir.");
		
		option = reader.nextInt();

			switch(option){

				case 1:
					System.out.println("Actualmente se encuentran en servicio los empleados Jose y Camilo.");
					System.out.println("Cual de los dos desea ver?");
					System.out.println("1. Ver ganancias de los empelados.");
					System.out.println("2. Ver reporte generado de los empelados.");
					System.out.println("3. Volver al menu principal.");

					int option2 = reader.nextInt();



					while(option2!=3){

					double e = se.getEmpleado1().getGanancia();
						switch(option2){
						case 1:					
							System.out.println("La ganancia de Jose es: "+e+"$");
							System.out.println("La ganancia de Camilo es: "+e+"$");
						break;						
						case 2:
							System.out.println("Ver reporte de:");
							System.out.println("1. Jose.");
							System.out.println("2. Camilo.");

							int option3 = reader.nextInt();

							String rep1 = se.reporteEmpelado1();
							String rep2 = se.reporteEmpleado2();

							switch(option3){
								case 1:
									System.out.println(rep1);
								break;
								case 2:
									System.out.println(rep2);
								break;
							}
						break;
						}
					}
				case 2:
					System.out.println("Gracias por utilizar el programa, vuelva pronto.");
				break;
			}
		}while(option!=2);
	}
}
