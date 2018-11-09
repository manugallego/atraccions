package Menu;

/**
 *
 * @author Manu
 */
public class MenuAtraccio {
    /*menu*/
    int numeracioMenu = 6;// variable que servira per a determinar la mida de l'array
    public String[] menuInicial = new String [numeracioMenu];// Array de mida 7 donada per la variable numeracioMenu
       
    public MenuAtraccio(){
        menuInicial[0] = "1 Crear Atracció";
        menuInicial[1] = "2 Eliminar Atracció";
        menuInicial[2] = "3 Modificar Atraccio";
        menuInicial[3] = "4 Cercar Atracció";
        menuInicial[4] = "5 Consultar Atraccions";
        menuInicial[5] = "0 Sortir del Programa";
        
        
    
    }   
    
}
