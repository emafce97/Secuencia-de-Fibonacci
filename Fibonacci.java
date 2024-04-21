public class Fibonacci {

    public static void obtenerSecuencia(int num){
        int a = 0, b = 1;
        for(int i=0;i<=num;i++){
            System.out.print(a + " -- " + b + " ");
            int suma = a + b;
            System.out.print("-- " + (a + b) + "\n");
            a = b;
            b = suma;
        }
    }
}
