import java.util.Scanner;

public class HolaMundo {
    public static void main(String [] args) {
        System.out.println("Hola Mundo"); //esta es una instrucción de salidas
        System.out.println("Probando");
        System.out.println("Venimos bien");
        System.out.println(5+10);
        String nombre; //defino el tipo y luego la variable
        nombre = "Cristian"; //variable
        System.out.println(nombre);
        int edad = 37; //defino una variable ya con su tipo
        System.out.println(edad);

        Scanner input = new Scanner(System.in);
        String nombre1;
        System.out.print("Ingresa tu nombre: ");
        nombre1 = input.nextLine();
        System.out.println("Hola " + nombre1);
    }

}
