package pkg_operaciones;

public class Operaciones {

    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public int dividir(int num1, int num2) {
        return num1 / num2;
    }

    public long factorial(int num) {
        long resultado = 1L;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public boolean esPrimo(int num) {
        return (num % 1 == 0 && num % num == 0);
    }

    public boolean esPar(int num) {
        return num % 2 == 0;
    }

    public double raizCuadrada(int num) {
        return Math.sqrt(num);
    }

    public boolean yearBisiesto(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
    
}
