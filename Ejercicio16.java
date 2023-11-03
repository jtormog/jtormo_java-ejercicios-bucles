import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        System.out.print("Dime un número: ");
        int num = CastNum();
        if (EsPrimo(num) && num !=1|| num == 2) System.out.println("Es primo.");
        else System.out.println("No es primo.");

    }
    static boolean EsPrimo(int num) {
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    static int CastNum() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean valido = false;

        while (!valido){
            try {
                num = scanner.nextInt();
                valido = true;
            }catch (Exception e){
                scanner.next();
                System.out.println("Introduce un numero valido");
            }
        }
        return num;
    }
}

