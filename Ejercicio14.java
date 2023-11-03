import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        boolean multiploDeCinco = false;
        int[] billetes = {500,200,100,50,20,10,5};
        int[] contador = {0,0,0,0,0,0,0};

        int euros = 0;

        while (!multiploDeCinco){
            euros = CastNum();
            if (euros%5==0)multiploDeCinco = true;
            else System.out.println("Debe ser múltiplo de 5");
        }
        for (int i = 0; i <7; i++){
            while (euros >= billetes[i]){
                euros = euros-billetes[i];
                contador[i]++;
            }
        }
        String billete;
        System.out.println("Hacen falta: ");
        for (int i = 0; i<7;i++){
            if (contador[i]>1){
                billete = " billetes ";
            }else billete = " billete ";
            if (contador[i] >0) System.out.println(contador[i]+billete+"de "+billetes[i]+" ");

        }


    }
    static int CastNum(){
        System.out.print("Introduce un valor: ");
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean valido = false;

        while (!valido) {
            try {
                num = scanner.nextInt();
                valido = true;
            } catch (Exception e) {
                scanner.next();
                System.out.println("Introduce un numero valido");
            }
        }
        return num;
    }
}
