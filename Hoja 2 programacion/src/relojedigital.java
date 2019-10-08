import java.util.Scanner;

public class relojedigital {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int hora,segundos,minutos;
		hora = leeEntero("Introduzca la hora");
		minutos= leeEntero("Introduce los minutos");
		segundos= leeEntero("Introduzca los minutos");
		

		
		//comprobar lo que el usuario esta tecleando
		while(hora>24) {
			hora = leeEntero("Introduzca la hora correcta");
		}
		
		while(minutos>=60) {
			minutos= leeEntero("Introduce los minutos correctos");
		}
		
		while(segundos>=60) {
			segundos = leeEntero("Introduzca los segundos correctos");
			
		}
		
			//Mostrar el reloj
		
		while(true) { 
			if(hora<10) {
				System.out.print("0");
			}

			System.out.print(hora + ":");
			if(minutos<10) {
				System.out.print("0");
			}
			
		
			System.out.print(minutos + ":");
			if(segundos<10) { // solamente para añadir un 0 antes
				System.out.print("0");
			}
			
			System.out.println(segundos);
		
		
		
		//Aumentar el tiempo
		segundos++;
		
		//comprobar
		if(segundos == 60) {
			
			segundos = 0; // segundos se reinciara
			
			minutos ++; // despues de 60 segundos aumentaran los segundos
			
			if (minutos == 60) { // cuando los minutos seran 60
				
			minutos = 0; //los minutos se renciaran
			
			hora ++; // las horas se incrementaran
		}
		}
		if(hora == 24) { // si la hora es mayor que 24 se pondra en 01
			hora = 0;
		}

		Thread.sleep(1000); // para que el reloj vaye con poca velocidad
		}
	}
	
	
	public static int leeEntero(String texto) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(texto);
		int valor = teclado.nextInt();
		return valor;
	}
	public static float leeReal(String texto) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(texto);
		float valor = teclado.nextFloat();
		return valor;
	}
	public static String leeCadena(String texto) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(texto);
		String valor = teclado.nextLine();
		return valor;
	}

}
