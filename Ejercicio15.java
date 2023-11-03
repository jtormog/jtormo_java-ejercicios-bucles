import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args){
        System.out.print("Dime un número: ");
        int num = CastNum();
        int contador = 0;

        for (int i = 1; i <= num; i++){
            if (i % 3 == 0) contador++;
        }
        if (contador > 0) System.out.println("Cantidad de múltiplos de 3: "+contador);
        else System.out.println("No hay ningún múltiplo de 3 entre 1 y "+num);
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
                scanner.next();
                System.out.println();
            }
        }
        return num;
    }
}
