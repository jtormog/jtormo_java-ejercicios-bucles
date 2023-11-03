import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        int contador = 0;
        System.out.print("Dime un número: ");
        int numA = CastNum();
        System.out.print("Dime otro número mayor al anterior: ");
        int numB = CastNum();

        while (numB < numA){
            System.out.print("El segundo número debe ser mayor que el primero: ");
            numB = CastNum();
        }
        for (int i = numA; i <= numB; i++){
            System.out.print(" "+i+" ");
            if (i%2 == 0) contador++;
        }
        System.out.println("\nLa cantidad de pares son: "+contador);
    }

    static int CastNum(){
        Scanner scanner = new Scanner(System.in);
        boolean valido = false;
        int num = 0;

        while (!valido) {
            try {
                num = scanner.nextInt();
                valido = true;
            }catch (Exception e){
                System.out.println("aaaa la verga");
            }
        }
        return num;
    }
}
