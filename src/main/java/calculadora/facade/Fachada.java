
package calculadora.facade;

import calculadora.mediador.*;
import calculadora.VO.*;
import java.util.ArrayList;

/**
 *
 * @author Andrés
 */
public class Fachada {
    
    MediadorOperaciones mediador = new MediadorOperaciones();
    HistorialJSON historial = new HistorialJSON();
    
    public double sumar (double numero1, double numero2) {
        
        return mediador.sumar(numero1, numero2);
    }
    
    public double restar (double numero1, double numero2) {
        
        return mediador.restar(numero1, numero2);
    }
    
    public double multiplicar (double numero1, double numero2) {
        
        return mediador.multiplicar(numero1, numero2);
    }
    
    public double dividir (double numero1, double numero2) {
        
        return mediador.dividir(numero1, numero2);
    }
    
    public ArrayList<OperacionesVO> listarHistorial () {
        return historial.getHistorialOperaciones();
    }
    
}
