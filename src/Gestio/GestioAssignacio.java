/*
 * Es mostra un menu
 * Opció 1:
 *  Es crida la funció crearAssignacio
 * Opció 2:
 *  Es crida la funció llistarAssignacio
 * Opció 3:
 *  Es crida la funció modificarAssignacio
 * Opció 4:
 *  Es crida la funció eliminarAssignacio
 * Opció 0:
 *  Sortir del menu.
 */
package Gestio;
import Biblioteques.iO;
import ClassesPrincipals.*;
import static Gestio.GestioPrincipal.*;

public class GestioAssignacio {
    
    public final static int CAPACITAT = 5;
    public static Assignacio[] arrayAssignacio = new Assignacio[CAPACITAT];
    
    public static void main(String[] args) {
        GestioAssignacio programa = new GestioAssignacio();
        programa.inici();
    }
    
    public static void inici(){
        char opcio;
        do {
            iO.imprimirMenuAssignacio();
            opcio=iO.llegirOpcio();
            
            switch(opcio) {
                /* CREAR ASSIGNACIO */
                case '1':
                    FuncionalitatAssignacio.crearAssignacio(A, arrayPersona, arrayAssignacio);
                    break;
                    
                /* LLISTAR ASSIGNACIO */
                case '2':
                    FuncionalitatAssignacio.llistarAssignacio(A, arrayPersona, arrayAssignacio);
                    break;
                    
                /* MODIFICAR ASSIGNACIO */
                case '3':
                    FuncionalitatAssignacio.modificarAssignacio(arrayAssignacio);
                    break;
                    
                /* ELIMINAR ASSIGNACIO */
                case '4':
                    FuncionalitatAssignacio.eliminarAssignacio(arrayAssignacio);
                    break;
            }
            
        }while (opcio!='0');  
    }
}
