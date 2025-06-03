package pkg_calculadora;

import pkg_utilidades.CalculadoraControl;
import pkg_utilidades.EntradaSalidaDatos;

public class GestionCalculadora {

    private CalculadoraControl cc;
    private EntradaSalidaDatos esd;
    
    public GestionCalculadora() {
        cc = new CalculadoraControl();
        esd = new EntradaSalidaDatos();
    }
    
    public void menu() {
        boolean salir = false;
        do {
            esd.mostrarCadena("MENÚ"
                    + "\t1. Suma\n"
                    + "\t2. Resta\n"
                    + "\t3. Multiplicación\n"
                    + "\t4. División\n"
                    + "\t5. Factorial\n"
                    + "\t6. Número primo\n"
                    + "\t7. Par o impar\n"
                    + "\t8. Raíz cuadrada\n"
                    + "\t9. Año bisiesto\n"
                    + "\t99. Salir\n"
                    + "Elige una opción: ");
            int opcion = esd.introducirValorEnteroPositivo();
            switch (opcion) {
                case 1:
                    cc.suma();
                    break;
                case 2:
                    cc.resta();
                    break;
                case 3:
                    cc.multiplicacion();
                    break;
                case 4:
                    cc.division();
                    break;
                case 5:
                    cc.factorial();
                    break;
                case 6:
                    cc.numPrimo();
                    break;
                case 7:
                    cc.esPar();
                    break;
                case 8:
                    cc.raizCuadrada();
                    break;
                case 9:
                    cc.yearBisiesto();
                    break;
                case 99:
                    salir = true;
                    break;
                default:
                    esd.mostrarCadena("¡Opción no válida!");
            }
        } while (!salir);
    }
}
