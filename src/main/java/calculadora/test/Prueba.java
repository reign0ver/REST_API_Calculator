
package calculadora.test;

import calculadora.VO.OperacionesVO;
import calculadora.facade.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;

/**
 *
 * @author Andrés
 */
public class Prueba {
    
    public static void main (String [] args) {
        
        Server server = new Server(8081);

        ServletContextHandler ctx = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);
                
        ctx.setContextPath("/");
        server.setHandler(ctx);

        ServletHolder serHol = ctx.addServlet(ServletContainer.class, "/*");
        serHol.setInitOrder(1);
        serHol.setInitParameter("jersey.config.server.provider.packages", "calculadora.restapi");
        serHol.setInitParameter("jersey.config.server.provider.classnames", "org.glassfish.jersey.jackson.JacksonFeature");

        try {
            server.start();
            server.join();
        } catch (Exception ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            server.destroy();
        }
            
//            Fachada fachada = new Fachada();
//            
//            int opcion = 0;
//            double numero1 = 0;
//            double numero2 = 0;
//            
//            do {
//                opcion = Integer.parseInt(JOptionPane.showInputDialog(
//                        "Bienvenido, seleccione la operación que desea realizar: "
//                                + "\n1. Sumar"
//                                + "\n2. Restar"
//                                + "\n3. Multiplicar"
//                                + "\n4. Dividir"
//                                + "\n5. Salir"));
//                
//                switch (opcion) {
//                    case 1:
//                        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero1: "));
//                        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero1: "));
//                        JOptionPane.showMessageDialog(null, "El resultado de la suma es: \n" + fachada.sumar(numero1, numero2));
//                    case 2:
//                        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero1: "));
//                        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero1: "));
//                        JOptionPane.showMessageDialog(null, "El resultado de la resta es: \n" + fachada.restar(numero1, numero2));
//                        break;
//                    case 3:
//                        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero1: "));
//                        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero1: "));
//                        JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: \n" + fachada.multiplicar(numero1, numero2));
//                        break;
//                    case 4:
//                        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero1: "));
//                        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero1: "));
//                        JOptionPane.showMessageDialog(null, "El resultado de la división es: \n" + fachada.dividir(numero1, numero2));
//                        break;
//                    case 5:
//                        break;
//                }
//            } while (opcion!=5);
        
        
    }
    
}
