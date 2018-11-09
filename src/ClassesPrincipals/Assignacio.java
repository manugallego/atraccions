/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesPrincipals;

/**
 *
 * @author Manu
 */
public class Assignacio {
    
    private String idAssignacio;
    private String idE;
    private String idA;
    private String dataAssignacio;
    private static int totalAssignacions = 0;
    
    
    public Assignacio(){
        idAssignacio = null;
        idE = null;
        idA= null;
        dataAssignacio= null;
    }

    /* GETTERS */
    public String getIdAssignacio() {
        return idAssignacio;
    }

    public String getIdE() {
        return idE;
    }

    public String getIdA() {
        return idA;
    }

    public String getDataAssignacio() {
        return dataAssignacio;
    }
    
    public static int getTotalAssignacions() {
        return totalAssignacions;
    }
    
    /* SETTERS */
    public void setIdAssignacio(String idAssignacio) {
        this.idAssignacio = idAssignacio;
    }
    
    public void setIdE(String idE) {
        this.idE = idE;
    }

    public void setIdA(String idA) {
        this.idA = idA;
    }

    public void setDataAssignacio(String dataAssignacio) {
        this.dataAssignacio = dataAssignacio;
    }
    
    /* MÈTODES */
    public static int augmentarTotalAssignacions() {
        totalAssignacions = totalAssignacions+1;
        return totalAssignacions;
    }
    
    public static int disminuirTotalAssignacions() {
        totalAssignacions = totalAssignacions-1;
        return totalAssignacions;
    }
    
    //toString()
    @Override
    public String toString() {
        return "ID Assignacio: "+this.idAssignacio+", ID Empleat: "+this.idE+", ID Atraccio: "+this.idA+", Data Assignacio: "+this.dataAssignacio;
    }
    
}