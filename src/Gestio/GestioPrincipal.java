/*
 * Es mostra un menu
 * Opció 1:
 *  Es crida la funció inici de GestioAtraccio que conté el programa per gestionar les atraccions
 * Opció 2:
 *  Es crida la funció inici de GestioEmpleat que conté el programa per gestionar els empleats
 * Opció 3:
 *  Es crida la funció inici de GestioAssignacio que conté el programa per gestionar les assignacions
 * Opció 0:
 *  Sortir del menu.
 */

package Gestio;
import Biblioteques.iO;
import ClassesPrincipals.*;

/**
 * @author Grup2: Evaldas Casas, Emmanuel Gallego
 * @version 1.0
 */
public class GestioPrincipal {
    char opcio ;
    
    /* Declaració d'arrays */
    public final static int CAPACITAT = 5;
    public static Atraccio[] A = new Atraccio[CAPACITAT];
    public static Persona[] arrayPersona = new Persona[CAPACITAT];
    //public static Atraccio[] arrayAtraccio = new Atraccio[CAPACITAT];
    
    public static void main(String[] args)
    {   
        GestioPrincipal principal = new GestioPrincipal();
        principal.inici();
    }
    
    public void inici(){
        do { //Farem un do while per a iniciar una situacio de reproduccio del menu
            System.out.println("--------------------------------------------------------");
            iO.ImprimirMenuPrincipal();
            System.out.println("--------------------------------------------------------");
            System.out.println("");
           
            System.out.println("Introdueix el numero de la opció que vols elegir.");
            opcio = iO.llegirOpcio();
            
            System.out.println("");
            switch (opcio){
                case '1':
                    GestioAtraccions.inici();
                break;
                
                case '2':
                    GestioEmpleat.inici();
                break;
                
                case '3':
                    GestioAssignacio.inici();
                break;
                /*case '0':
                    System.exit(0);
                    break;
                default:
                    iO.imprimirMissatge("ERRROR: Introdueix una opcio valida.");*/
            }
        }while(opcio!='0');
    }
}