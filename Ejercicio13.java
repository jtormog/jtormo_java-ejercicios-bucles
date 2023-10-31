import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args){
        boolean igual = false;
        int minimo = 1;
        int maximo =100;
        int numeroRandom = (int) (Math.random()*maximo+minimo);


        while (!igual){

            System.out.print("\nHe pensado en :"+ numeroRandom+"\n");
            System.out.println("Indica \">\" si es mayor, \"<\" si es menor o \"=\" si es igual");
            Scanner scanner = new Scanner(System.in);
            String opcion = scanner.nextLine();

            switch (opcion){
                case "<":
                    System.out.println(maximo);
                    maximo = numeroRandom;
                    System.out.println(maximo);
                    break;
                case ">":
                    System.out.println(minimo);
                    minimo = numeroRandom;
                    System.out.println(minimo);
                    break;
                case "=":
                    igual = true;
                    break;
            }
            numeroRandom = (int) (Math.random()*maximo+minimo);
        }


    }
}
