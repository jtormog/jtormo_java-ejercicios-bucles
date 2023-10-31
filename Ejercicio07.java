import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main (String[] args){
        int contador = 0;
        int contador_negativos = 0;
        int contador_positivos = 0;

        while (contador <100){
            int num = CastNum();
            if (num <0) contador_negativos++;
            else contador_positivos++;
            if (num != 0) contador++;

        }
        if (contador_negativos >0) System.out.println("se han registrado "+ contador_negativos +" números negativos");
        if (contador_positivos >0) System.out.println("Se han registrado "+ contador_positivos +" números positivos");


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

