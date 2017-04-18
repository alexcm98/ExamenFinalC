package Main;

import java.util.Scanner;

import Models.Animal;
import Models.Lista;





public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion = -1;
		String aux = "";
		boolean error = true;
		int indice = 0;
		
		Lista l = new Lista();
		Animal a = new Animal(23,"gato");
		Animal b = new Animal(24,"leon");
		Animal aa = new Animal(25,"perro");
		Animal ab = new Animal(26,"pajaro");
		
		do{
		System.out.println("1. Añadir elemento");
		System.out.println("2. Eliminar elemento especifico");
		System.out.println("3. Devolver el siguiente elemento");
		System.out.println("4. Devolver el anterior elemento");
		System.out.println("5. Devolver elemento actual");
		System.out.println("6. Establecer indice");
		System.out.println("7. Salir del programa");
	
		
		do{
		System.out.println("¿Que opcion desea realizar?");
		aux = sc.nextLine();
		
		try{
			opcion = Integer.parseInt(aux);
			error = false;
		}catch(Exception e){
			error = true;
		}
		if(opcion < 1 || opcion > 7){
			System.out.println("ERROR: opcion no valida");
		}
		}while(error || opcion < 1 || opcion > 7);
		
		
		switch(opcion){
		
		case 1:
		l.add(a);
		l.add(aa);
		l.add(b);
		l.add(ab);
			break;
			
        case 2:
			l.remove(a);
			break;
			
        case 3:
	l.getNext(indice);
	        break;
	
        case 4:
	l.getPrev(indice);
	        break;
	
        case 5:
	l.getCurrent(indice);
	        break;
	
        case 6:
        
        
        	do{
        System.out.println("¿En que posicion quiere establecer el indice?");
        aux = sc.nextLine();
        try{
			indice = Integer.parseInt(aux);
			error = false;
		}catch(NumberFormatException e){
			System.out.println("ERROR: al intentar introducir la opcion");
			error = true;
		}
        	}while(error);
        	
        	l.setIndex(indice);
        	
	        break;
	        
        case 7:
        	System.out.println("Saliste del programa");
        	break;
		}
		}while(opcion != 7);
	}

}
