public class Ejercicio11 {
    public static void main(String[] args){
        int sumaPar = 0;
        int sumaImpar = 0;
        for (int i = 100; i <=200; i++){
            if (i%2 == 0) sumaPar = sumaPar+i;
            else sumaImpar = sumaImpar+i;
        }
        System.out.println("El resultado de sumar los números pares entre 100 y 200 es: "+sumaPar);
        System.out.println("El resultado de sumar los números impares entre 100 y 200 es: "+sumaImpar);
    }
}
