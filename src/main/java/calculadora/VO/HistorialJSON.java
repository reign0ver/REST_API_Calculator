
package calculadora.VO;

import calculadora.VO.OperacionesVO;
import java.util.ArrayList;

/**
 *
 * @author Andrés
 */
public class HistorialJSON {
        
    ArrayList<OperacionesVO> historialOperaciones = new ArrayList<>();
    
    public HistorialJSON () {
        
    }

    public ArrayList<OperacionesVO> getHistorialOperaciones() {
        return historialOperaciones;
    }

    public void addHistorialOperaciones(OperacionesVO operacionesVO) {
        this.historialOperaciones.add(operacionesVO);
    }
    
}
