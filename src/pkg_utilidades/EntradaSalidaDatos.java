package pkg_utilidades;

import java.util.Scanner;

public class EntradaSalidaDatos {

    private Scanner sc;

    public EntradaSalidaDatos() {
        sc = new Scanner(System.in);
    }

    public void mostrarResultado(int resultado) {
        mostrarCadena("Resultado: " + resultado);
    }

    public void mostrarResultado(double resultado) {
        mostrarCadena("Resultado: " + resultado);
    }

    public void mostrarResultado(long resultado) {
        mostrarCadena("Resultado: " + resultado);
    }

    public void mostrarResultado(boolean resultado) {
        mostrarCadena("Resultado: " + resultado);
    }

    public void mostrarCadena(String cadena) {
        System.out.println(cadena);
    }

    public String pedirCadena() {
        String cadena = sc.nextLine();
        return cadena;
    }

    public int introducirValorEnteroPositivo() {
        int valor = 0;
        boolean valido = false;
        do {
            if (!sc.hasNextInt()) {
                sc.nextLine();
                mostrarCadena("¡Tiene que ser un valor entero!");
            } else {
                valor = sc.nextInt();
                if (valor < 0) {
                    sc.nextLine();
                    mostrarCadena("¡Tiene que ser un valor positivo!");
                } else {
                    valido = true;
                }
            }
        } while (!valido);
        return valor;
    }

}
