import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args){
        int num = CastNum();
        int resultado = 1;
        System.out.print(num+"! = ");
        for (int i = num; i >= 1; i--){
            System.out.print(i);
            if (i > 1) System.out.print("*");
            else System.out.print(" = ");
            resultado = resultado * i;
        }
        System.out.println(resultado);

    }
    static int CastNum(){
        System.out.println("Introduce un valor");
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean valido = false;

        while (!valido){
            try {
                num = scanner.nextInt();
                valido = true;
            }catch (Exception e ){
                scanner.next();
                System.out.println("Introduce un numero valido");
            }
        }return num;
    }
}
