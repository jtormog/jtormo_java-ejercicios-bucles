import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args){
        int num = CastNum();
        for (int i = 1;  i <= num; i++){
            System.out.println(i);
        }

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
            }catch (Exception e){
                scanner.next();
                System.out.println("Introduce un valor valido");
            }
        }return num;
    }
}
