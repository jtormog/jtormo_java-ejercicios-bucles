import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args){
        System.out.print("Dime un número inicial: ");
        int contador = 0;
        int contadorFallos = 0;
        int numeroPrevio = 0;
        int num = CastNum();

        while (num !=0) {
            if (num < numeroPrevio) {
                System.out.println("Fallo es menor");
                contadorFallos++;
            }
            System.out.print("Dime un número: ");
            numeroPrevio = num;
            num = CastNum();
            contador++;
        }
        System.out.println("Total de números introducidos: "+contador);
        if (contadorFallos>0) System.out.println("Números fallados: "+contadorFallos);
        else System.out.println("No se han fallado números.");
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
