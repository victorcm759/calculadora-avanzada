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
    }

    public void division() {
    }
    
}
