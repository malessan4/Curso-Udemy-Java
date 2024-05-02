
import java.util.Scanner;


public class HolaMundo {

    public static void main(String args[]) {

        //Definimos la variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);

        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);

        //var - inferencia de tipos en Java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Nueva Cadena";
        System.out.println(miVariableCadena2);

        //Valores permitidos en el nombre de variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;

        //var áVariable = 10; No se recomienda utilizar
        //var #miVariable = 2; no se permite utilizar caracteres especiales
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var numero1 = 3;
        var numero2 = 4;

        System.out.println(numero1 + numero2); //se realiza la suma correspondiente
        System.out.println(numero1 + numero2 + " " + usuario); // toma el primer valor y de así se sigue comportando
        System.out.println(usuario + " " + numero1 + numero2); //contexto de cadena, lo toma todo comosi fuese cadena
        System.out.println(usuario + " " + (numero1 + numero2));// primero suma y despues concatena la cadena
        
        var nombre = "Karla";

        System.out.println("Nueva linea: \n" + nombre); //Caracter salto de linea
        System.out.println("Tabulador: \t" + nombre); // Deja un espacio al comienzo
        System.out.println("Retroceso: \b" + nombre); // Borra una posicion en la salida del programa
        System.out.println("Comilla simple: \'" + nombre + "\'"); // se puede o no usar la barra invertida
        System.out.println("Comilla doble: \"" + nombre + "\"");
        
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var cliente = consola.nextLine();
        System.out.println("cliente = " + cliente);
        
        System.out.println("Escribe el titulo");
        var titulo2 = consola.nextLine();
        System.out.println("Resultado = " + titulo2 + " " + cliente);
    }
}
