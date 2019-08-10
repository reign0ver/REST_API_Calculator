
package calculadora.mediador;

import calculadora.VO.*;
import calculadora.DAO.*;
import java.util.ArrayList;

/**
 *
 * @author Andrés
 */
public class MediadorOperaciones {
                
    public double sumar (double numero1, double numero2) {
        
        OperacionesVO operacionesVO = new OperacionesVO();
        OperacionesDAO operacionesDAO = new OperacionesDAO();
        HistorialJSON historialJSON = new HistorialJSON();
        double resultado = 0;
        
        resultado = numero1 + numero2;
        
        operacionesVO.setNumero1(numero1);
        operacionesVO.setNumero2(numero2);
        operacionesVO.setOperacion("+");
        
        operacionesDAO.insertOperacion(operacionesVO);
        historialJSON.addHistorialOperaciones(operacionesVO);
        
        return resultado;
    }
    
    public double restar (double numero1, double numero2) {
        
        OperacionesVO operacionesVO = new OperacionesVO();
        OperacionesDAO operacionesDAO = new OperacionesDAO();
        HistorialJSON historialJSON = new HistorialJSON();
        double resultado = 0;
        
        resultado = numero1 - numero2;
        
        operacionesVO.setNumero1(numero1);
        operacionesVO.setNumero2(numero2);
        operacionesVO.setOperacion("-");
        
        operacionesDAO.insertOperacion(operacionesVO);
        historialJSON.addHistorialOperaciones(operacionesVO);
        
        return resultado;
    }
    
    public double multiplicar (double numero1, double numero2) {
        
        OperacionesVO operacionesVO = new OperacionesVO();
        OperacionesDAO operacionesDAO = new OperacionesDAO();
        HistorialJSON historialJSON = new HistorialJSON();
        double resultado = 0;
        
        resultado = numero1 * numero2;
        
        operacionesVO.setNumero1(numero1);
        operacionesVO.setNumero2(numero2);
        operacionesVO.setOperacion("*");
        
        operacionesDAO.insertOperacion(operacionesVO);
        historialJSON.addHistorialOperaciones(operacionesVO);
        
        return resultado;
    }
    
    public double dividir (double numero1, double numero2) {
        
        OperacionesVO operacionesVO = new OperacionesVO();
        OperacionesDAO operacionesDAO = new OperacionesDAO();
        HistorialJSON historialJSON = new HistorialJSON();
        double resultado = 0;
        
        resultado = numero1 / numero2;
        
        operacionesVO.setNumero1(numero1);
        operacionesVO.setNumero2(numero2);
        operacionesVO.setOperacion("/");
        
        operacionesDAO.insertOperacion(operacionesVO);
        historialJSON.addHistorialOperaciones(operacionesVO);
        
        return resultado;
    }
    
}
