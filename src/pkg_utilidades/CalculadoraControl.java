package pkg_utilidades;

import pkg_operaciones.Operaciones;

public class CalculadoraControl {
    private EntradaSalidaDatos esd;
    private Operaciones op;
    
    public CalculadoraControl() {
        esd = new EntradaSalidaDatos();
    }

    public void suma() {
        esd.mostrarCadena("Introduce primer número: ");
        int num1 = esd.introducirValorEnteroPositivo();
        esd.mostrarCadena("Introduce segundo número: ");
        int num2 = esd.introducirValorEnteroPositivo();
        int resultado = op.sumar(num1, num2);
        esd.mostrarResultado(resultado);
    }

    public void resta() {
        esd.mostrarCadena("Introduce primer número: ");
        int num1 = esd.introducirValorEnteroPositivo();
        esd.mostrarCadena("Introduce segundo número: ");
        int num2 = esd.introducirValorEnteroPositivo();
        int resultado = op.restar(num1, num2);
        esd.mostrarResultado(resultado);
    }

    public void multiplicacion() {
        esd.mostrarCadena("Introduce primer número: ");
        int num1 = esd.introducirValorEnteroPositivo();
        esd.mostrarCadena("Introduce segundo número: ");
        int num2 = esd.introducirValorEnteroPositivo();
        int resultado = op.multiplicar(num1, num2);
        esd.mostrarResultado(resultado);
    }

    public void division() {
        esd.mostrarCadena("Introduce primer número: ");
        int num1 = esd.introducirValorEnteroPositivo();
        esd.mostrarCadena("Introduce segundo número: ");
        int num2 = esd.introducirValorEnteroPositivo();
        int resultado = 0;
        if (num2 == 0) {
            esd.mostrarCadena("¡No se puede dividir entre cero!");
        } else {
            resultado = op.dividir(num1, num2);
        }
        esd.mostrarResultado(resultado);
    }
    
}
