
package edu.eci.cvds.servlet.model;

/**
 *
 * La clase Todo representa tareas por hacer
 */
public class Todo {
    private int userId;
    private int id;
    private String title;
    private boolean completed;

    /**
     *Constructor
     */
    public Todo(){
    }
    
    /**
     * Retorna la ID del usuario
     * @return
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Retorna la ID de la tarea
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *Retorna la Descripcion de la tarea
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * Retorna el estado si la tarea fue terminada
     * @return
     */
    public boolean getCompleted() {
        return completed;
    }

    /**
     * Asigna el ID al usuario
     * @param userId
     */
    public void setUserId(int userId) {
        this.userId=userId;
    }

    /**
     * Asigna un ID a una tarea
     * @param id
     */
    public void setId(int id) {
        this.id=id;
    }

    /**
     * Asigna una Descripcion a una tarea
     * @param title
     */
    public void setTitle(String title) {
        this.title= title;
    }

    /**
     * Asigna si una tarea esta completada
     * @param completed
     */
    public void setCompleted(boolean completed) {
        this.completed=completed;
    }
}
