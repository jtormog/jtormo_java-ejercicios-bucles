import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args){
        boolean igual = false;
        int minimo = 1;
        int maximo =100;
        int numeroRandom = (int) (Math.random()*(minimo-maximo+1)+maximo);

        Scanner scanner = new Scanner(System.in);
        while (!igual){

            System.out.print("\nHe pensado en :"+ numeroRandom+"\n");
            System.out.println("Indica \">\" si es mayor, \"<\" si es menor o \"=\" si es igual");
            String opcion = scanner.nextLine();
            switch (opcion){
                case "<":
                    maximo = numeroRandom;
                    numeroRandom = (int) (Math.random()*(minimo-maximo+1)+maximo);
                    break;
                case ">":
                    minimo = numeroRandom;
                    numeroRandom = (int) (Math.random()*(minimo-maximo+1)+maximo);
                    break;
                case "=":
                    System.out.println("Gracias por jugar");
                    igual = true;
                    break;
                default:
                    System.out.println("No has introducido una instrucción valida");
                    break;
            }

        }


    }
}
