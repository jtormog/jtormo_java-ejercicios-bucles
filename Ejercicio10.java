import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        int num = CastNum();
        boolean diez = false;

        while (num != -1){
            if (num == 10){
                diez = true;
            } else if (num <0 || num > 10) {
                System.out.println("Error: Se esperaba un valor entre 0 y 10");
            }
            num = CastNum();
        }
        if (diez) System.out.println("Hay notas con valor 10");
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
