import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        System.out.print("Dime un número: ");
        int num = CastNum();

        switch (num) {
            case 2:
            case 3:
            case 5:
            case 7:
                System.out.println("Es primo.");
                break;
            default:
                if (num % 2 == 0 | num % 3 == 0 | num % 5 == 0 | num % 7 == 0) System.out.println("No es primo.");
                else System.out.println("Es primo.");
                break;
        }


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
