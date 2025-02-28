package ui;

import java.util.Scanner;

public class RecuSeguimiento1 {

	private Scanner escaner;

    // Declaracion de constantes 
final String SALUDO = "Hola"; // ejrcicio 2
final String DESPEDIDA = "Adios"; // ejercicio 2


	private RecuSeguimiento1() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run() // Aqui en el metodo run hacemos lo de nuestro metodo main. Solo entrada de datos, mensajes al usuario y mostrar salidas
	{ 
    // Ejercicio 1
        // Declaracion de info a pedir del usuario 
        int num1, num2, num3;
         // Pedir info al usuario 
        System.out.println("Ejercicio 1 -  Ingrese tres numeros enteros y se mostrara la cantidad de numeros que son iguales");
        System.out.println("Ingrese el primero numero entero: ");
        num1 = escaner.nextInt();
        escaner.nextLine();
        System.out.println("Ingrese el segundo numero entero: ");
        num2 = escaner.nextInt();
        escaner.nextLine(); 
        System.out.println("Ingrese el tercer numero entero: ");
        num3 = escaner.nextInt();
        escaner.nextLine(); 
        // Declaracion de salidas calculadas 
            int Iguales = CantIguales(num1, num2, num3);
        // Calculo de salidas mediante metodos 


        // Mostramos las salidas al usuario
            System.out.println(" Respuesta ejercicio 1 - La cantidad de numeros iguales es: " + Iguales);


    // Ejercicio 2 
        // Declaracion de info a pedir del usuario 
        String nombre;
        int numero; 
        // Pedir info al usuario 
        System.out.println("Ejercicio 2 -  Ingrese su nombre y elije el numero 1 o 0");
        System.out.println("Ingrese su nombre: ");
        nombre = escaner.nextLine(); 
        System.out.println("Ingrese el numero 1 o 0: ");
        numero = escaner.nextInt();
        escaner.nextLine(); 
        // Declaracion de salidas calculadas 
        String Mensaje = SaludarODespedir(nombre, numero, SALUDO, DESPEDIDA);
        // Calculo de salidas mediante metodos 

        // Mostramos las salidas al usuario
        System.out.println("Respuesta ejercicio 2 - Mensaje: " + Mensaje);
 
    // Ejercicio 3 
        // Declaracion de info a pedir del usuario 
        String palabra1, palabra2,palabra3;
        // Pedir info al usuario 
        System.out.println("Ejercicio 3 -  Ingrese 3 palabras para saber cuantas de esas tienen 4 o mas parametros");
        System.out.println("Ingrese la primera palabra: ");
        palabra1 = escaner.nextLine(); 
        System.out.println("Ingrese la segunda palabra: ");
        palabra2 = escaner.nextLine();
        System.out.println("Ingrese la tercera palabra: ");
        palabra3 = escaner.nextLine();
        // Declaracion de salidas calculadas 
        int CantParametros = CalcuCantParametros(palabra1, palabra2, palabra3);
        // Calculo de salidas mediante metodos 

        // Mostramos las salidas al usuario
        System.out.println("Respuesta ejercicio 3 - La cantidad de palabras con parametros >= a 4 son: " + CantParametros);

    // Ejercicio 4
        // Declaracion de info a pedir del usuario
        String pala1, pala2; 
        // Pedir info al usuario
        System.out.println("Ejercicio 4 - Ingrese dos palabras para evaluar si los valores de la posición 2 de cada String son iguales");
        System.out.println("Ingrese la primera palabra: ");
        pala1 = escaner.nextLine();
        System.out.println("Ingrese la segunda palabra: ");
        pala2 = escaner.nextLine();
        // Declaracion de salidas calculadas
        boolean sonIguales = CompararPocision(pala1, pala2);
        // Calculo de salidas mediante metodos
       
        // Mostramos las salidas al usuario
        System.out.println("Respuesta ejercicio 4 - Las palabras tienen la misma letra en la posición 2: " + sonIguales);

    // Ejercicio 5
        // Declaracion de info a pedir del usuario
        double a, b, c; 
        // Pedir info al usuario
        System.out.println("Ejercicio 5 - Ingrese 3 valores numericos para calcular las raices de los resultado al resolver su ecuacion cuadratica");
        System.out.println("Ingrese el coeficiente a: ");
        a = escaner.nextInt();
        escaner.nextLine();
        System.out.println("Ingrese el coeficiente b: ");
        b = escaner.nextInt();
        escaner.nextLine();
        System.out.println("Ingrese el coeficiente c: ");
        c = escaner.nextInt();
        escaner.nextLine();
        // Declaracion de salidas calculadas
       CalcularRaices(a, b, c);
        // Calculo de salidas mediante metodos
       
        // Mostramos las salidas al usuario

	} 

    // Metodos de los ejercicios
	public static void main(String[] args) {
		RecuSeguimiento1 mainApp = new RecuSeguimiento1();
		mainApp.run();
	}
    //metodo ejercicio 1 
    /**
	 * Descripción: El método CantIguales permite calcular cuantos numeros de los ingresados son iguales
	 * @param num1,num2,num3 son los numeros a comparar
	 * @return Int de la cantidad de numeros iguales
	 */
    public static int CantIguales(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3) {
            return 3; 
        } else if (num1 == num2 || num1 == num3 || num2 == num3) {
            return 2; 
        } else {
            return 0;
        }
    }
    
    /**
	 * Descripción: El método SaludarODespedir permite mostrar un mensaje de saludo o despedida segun el numero seleccionado(1 o 0)
	 * @param nombre, numero, (nombre y numero sellecionado ingresado por el usuario) SALUDO, DESPEDIDA son los parametros donde se define que mensaje mostrar segun la opcion
	 * @return string del tipo de mensaje segun la opcion seleccionada, si no es 1 o 0 se muestra un mensaje de error
	 */
    //  metodo ejercicio 2
        public static String SaludarODespedir(String nombre, int numero, String SALUDO, String DESPEDIDA) {
        if (numero == 1) {
            return SALUDO + " " + nombre;
        } else if (numero == 0) {
            return DESPEDIDA + " " + nombre;
        } else {
            return "Error, entradas inválidas"; // Mensaje de error para entradas no válidas
        }
    }

    /**
	 * Descripción: El método CalcuCantParametros permite verificar cuantas palabras tienen 4 o mas parametros
	 * @param palabra1, palabra2, palabra3 son las palabras a comparar
	 * @return Int de la cantidad de palabras que tienen 4 o mas parametros
	 */
    //metodo ejercicio 3
        public static int CalcuCantParametros(String palabra1, String palabra2, String palabra3) {
        int parametros = 0;
        if(palabra1.length() >= 4) {
            parametros++;
        }
        if(palabra2.length() >= 4) {
            parametros++;
        }
        if(palabra3.length() >= 4) {
            parametros++;
        }
        return parametros;
    }

    /**
	 * Descripción: El método CompararPocision permite evaluar si los valores de la posición 2 de cada palabra ingresada son iguales (verdadero o falso)
	 * @param string pala1, pala2 son las palabras a comparar 
	 * @return verdadero o falso(boolean) depedendiendo si las palabras tienen la misma letra en la posición 2, si una de las palabras no tienen al menos 3 caracteres se muestra un mensaje de error
	 */
    // metodo ejercicio 4
    public static boolean CompararPocision(String pala1, String pala2) {
        if (pala1.length() < 3 || pala2.length() < 3) {
            System.out.println("Error, ambos strings deben tener al menos 3 caracteres");
            return false;
        } else {
            return pala1.charAt(2) == pala2.charAt(2);
        }
    }

    /**
	 * Descripción: El método CalcularRaciones permite calcular las raíces (valores resultantes) de cualquier ecuación cuadrática de la forma: ax^2 + bx + c
	 * @param double a, b y c son los coeficientes de la ecuación
	 * @return las raices de la ecuación cuadrática (si existen) o un mensaje de error si no hay soluciones reales 
	 */
    //metodo ejercicio 5
    public static void CalcularRaices (double a,double b,double c) {
     double discriminante = Math.pow(b,2) - 4 * a * c;
        if (discriminante > 0) {
            // Dos soluciones reales distintas
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raíces de la ecuación cuadrática son: " + x1 + " y " + x2);
        } else if (discriminante == 0) {
            // Una única solución real
            double x = -b / (2 * a);
            System.out.println("La ecuación tiene una única raíz real: " + x);
        } else {
            // Caso donde no hay soluciones reales
            System.out.println("No hay soluciones reales (el discriminante es negativo)");
        }
    }
}



