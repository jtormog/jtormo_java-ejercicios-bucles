import java.util.Scanner;

public class Ejercicio06 {
    public static void main (String[] args){
        int contador = 0;
        boolean negativo = false;
    while (contador <100){
        int num = CastNum();
        if (num <0) negativo = true;
        if (num != 0) contador++;

    }
    if (negativo) System.out.println("Se han registrado números negativos");
    else System.out.println("No se han registrado números negativos");


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
