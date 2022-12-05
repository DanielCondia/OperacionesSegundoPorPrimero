import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo número");
        int b = sc.nextInt();
        System.out.println("El resultado de la suma es " + suma(a, b));
        System.out.println("El resultado de la resta es " + resta(a, b));
        System.out.println("El resultado de la multiplicación es " + multiplicacion(a, b));
        System.out.println("El resultado de la división es " + division(a, b));
    }

    public static int suma(int a,int b){
        int resultadoSuma = b + a;
        return resultadoSuma;
    }


    public static int resta(int a, int b){
        int resultadoResta = b - a;
        return resultadoResta;
    }
    public static int multiplicacion(int a, int b){
        int resultadoMultiplicacion = b * a;
        return resultadoMultiplicacion;
    }
    public static int division (int a, int b){
        int resultadoDivision = b / a;
        return resultadoDivision;
    }
}

