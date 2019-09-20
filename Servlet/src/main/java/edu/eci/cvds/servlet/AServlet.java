package edu.eci.cvds.servlet;

import static edu.eci.cvds.servlet.Service.getTodo;
import static edu.eci.cvds.servlet.Service.todosToHTMLTable;
import edu.eci.cvds.servlet.model.Todo;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Optional;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * La clase AServlet ofrece recursos web
 */
@WebServlet(
    urlPatterns = "/cvdsServlet"
)
public class AServlet extends HttpServlet{
   static final long serialVersionUID = 36L; 
   /**
    *El metodo do doGet ofrece recursos web
    */
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {       
       Writer responseWriter = resp.getWriter();
       try{
           
           Optional<String> optName = Optional.ofNullable(req.getParameter("id"));
           String name = optName.isPresent() && !optName.get().isEmpty() ? optName.get() : "";
           Integer id = Integer.parseInt(name);
       
       
            Todo infoId = getTodo(id);
            ArrayList<Todo> lista = new ArrayList<Todo>();
            lista.add(infoId);
            responseWriter.write(todosToHTMLTable(lista));
       }
       catch(java.lang.NumberFormatException e){
           responseWriter.write("requerimiento inválido");
       }
       catch(java.net.MalformedURLException k){
           responseWriter.write("error interno en el servidor");
       }
       catch(Exception n){
           responseWriter.write("requerimiento inválido");
       }                          
   }
    /**
    *El metodo do doPost ofrece recursos web
    */
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {       
       Writer responseWriter = resp.getWriter();
       try{
           
           Optional<String> optName = Optional.ofNullable(req.getParameter("id"));
           String name = optName.isPresent() && !optName.get().isEmpty() ? optName.get() : "";
           Integer id = Integer.parseInt(name);
       
       
            Todo infoId = getTodo(id);
            ArrayList<Todo> lista = new ArrayList<Todo>();
            lista.add(infoId);
            responseWriter.write(todosToHTMLTable(lista));
       }
       catch(java.lang.NumberFormatException e){
           responseWriter.write("requerimiento inválido");
       }
       catch(java.net.MalformedURLException k){
           responseWriter.write("error interno en el servidor");
       }
       catch(Exception n){
           responseWriter.write("requerimiento inválido");
       }                          
   }
   
}
