import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        System.out.print("Introduce la base: ");
        int base = CastNum();
        System.out.print("Introduce el exponente: ");
        int exponente = CastNum();

        System.out.println(Math.pow(base,exponente));
    }
    static int CastNum(){
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean valido = false;
        while (!valido){
            try{
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
