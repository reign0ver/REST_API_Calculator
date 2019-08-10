
package calculadora.restapi;

import calculadora.facade.Fachada;
import calculadora.VO.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.eclipse.jetty.server.Server;
import javax.ws.rs.Consumes;
import java.util.ArrayList;

/**
 *
 * @author Andrés
 */

@Path("")
public class Api {
    
    Fachada fachada = new Fachada();
            
    @POST
    @Path("/suma")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response sumar (OperacionesJSON operacionesJSON){        
        ResultadoJSON resultadoJSON = new ResultadoJSON();
        double resultado;
        resultado = fachada.sumar(operacionesJSON.getNumero1(), operacionesJSON.getNumero2());
        resultadoJSON.setResultado(resultado);
        
        return Response.status(200).entity(resultadoJSON).build();
    }
    
    @POST
    @Path("/resta")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response restar (OperacionesJSON operacionesJSON){        
        ResultadoJSON resultadoJSON = new ResultadoJSON();
        double resultado;
        resultado = fachada.restar(operacionesJSON.getNumero1(), operacionesJSON.getNumero2());
        resultadoJSON.setResultado(resultado);
        
        return Response.status(200).entity(resultadoJSON).build();
    }
    
    @POST
    @Path("/multiplicacion")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)    
    public Response multiplicar (OperacionesJSON operacionesJSON){        
        ResultadoJSON resultadoJSON = new ResultadoJSON();
        double resultado;
        resultado = fachada.multiplicar(operacionesJSON.getNumero1(), operacionesJSON.getNumero2());
        resultadoJSON.setResultado(resultado);
        
        return Response.status(200).entity(resultadoJSON).build();
    }
    
    @POST
    @Path("/division")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response dividir (OperacionesJSON operacionesJSON){        
        ResultadoJSON resultadoJSON = new ResultadoJSON();
        double resultado;
        resultado = fachada.dividir(operacionesJSON.getNumero1(), operacionesJSON.getNumero2());
        resultadoJSON.setResultado(resultado);
        
        return Response.status(200).entity(resultadoJSON).build();
    }
    
    @GET
    @Path("/historial")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listar () {
        
        HistorialJSON historialJSON = new HistorialJSON();        
        
        return Response.status(200).entity(historialJSON.getHistorialOperaciones()).build();
    }
    
    
}
