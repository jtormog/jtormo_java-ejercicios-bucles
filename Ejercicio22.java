import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        System.out.print("Dime un número para realizar su pirámide: ");
        int num = CastNum();
        int contador = 1;
        int extra = 0;
        int contadorInverso = num;

        while (contador < num+1) {
            for (int i = contadorInverso; i > 0; i--)
            {
                System.out.print(" ");
            }
            for (int i = 0; i < contador + extra; i++) {
                System.out.print("*");

            }
            extra++;
            System.out.println();
            contadorInverso--;
            contador++;
        }

    }
    static int CastNum(){
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean valido = false;
        while (!valido){
            try {
                num = scanner.nextInt();
                valido = true;
            }catch (Exception e){
                System.out.println("Introduce un valor valido");
            }
        }
        return num;
    }
}
