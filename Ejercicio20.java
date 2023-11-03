import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args){
        System.out.print("Dime un número: ");
        int num = CastNum();
        if (num >=0 && num <= 20) {
            for (int i = 1; i <= num; i++){
                for (int j = 1; j<=i; j++){
                    System.out.print(i);
                }
                System.out.println();
            }
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

