import java.util.Scanner;

public class Ejerci5 {

	public static void main(String[] args) { //se agrega esta parte
				

			    Scanner s = new Scanner(System.in); //se agrega el system.in
			    System.out.println("Introduzca un número: ");//se cambian las comillas 
			    
			    int ni = s.nextInt();
			    int c =  ni; //se cambia de string a int
			    
			    int afo = 0;
			    int noAfo = 0;
			    
			    while (ni > 0) {
		            int digito = ni % 10; // se quita el int porque ya lo habiamos convertido
		            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
		                afo++;
		            } else {
		                noAfo++;
		            }
		            ni /= 10; //se pasa abajo para cerrar el while
		        }

		        // Verificar si el número es afortunado
		        if (afo > noAfo) {
		            System.out.println("El " + c + " es un número afortunado."); //se elimina el no
		        } else {
		            System.out.println("El " + c + " no es un número afortunado.");
		        }
			    s.close(); //se cierra el escaner
			    
			    		
			    	}

	}


