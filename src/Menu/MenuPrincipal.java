
package Menu;

/**
 *
 * @author Manu
 */
public class MenuPrincipal {
    /*menu*/
    int numeracioMenu = 4;// variable que servira per a determinar la mida de l'array
    public String[] menuprincipal = new String [numeracioMenu];// Array de mida 7 donada per la variable numeracioMenu
       
    public MenuPrincipal(){
        menuprincipal[0] = "1. Gestio Atraccio";
        menuprincipal[1] = "2. Gestio Empleat";
        menuprincipal[2] = "3. Gestio Assignacio";
        menuprincipal[3] = "0. Sortir";
    }   
    
}
    

