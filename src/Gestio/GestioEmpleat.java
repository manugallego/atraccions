package Gestio;
import Biblioteques.iO;
import static Gestio.GestioPrincipal.*;

/**
 * @author Grup2: Evaldas Casas, Manu Gallego
 */
public class GestioEmpleat {
    
    public static void main(String[] args) {
        GestioEmpleat programa = new GestioEmpleat();
        programa.inici();
    }
    
    public static void inici(){
        char opcio;
        do {
            
            iO.imprimirMenuEmpleat();
            opcio=iO.llegirOpcio();
            
            switch(opcio) {
                /* CREAR EMPLEAT */
                case '1':
                    FuncionalitatEmpleat.crearEmpleat(arrayPersona);
                    break;
                    
                /* LLISTAR EMPLEATS */
                case '2':
                    FuncionalitatEmpleat.llistarEmpleat(arrayPersona);
                    break;
                    
                /* MODIFICAR EMPLEAT */
                case '3':
                    FuncionalitatEmpleat.modificarEmpleat(arrayPersona);
                    break;
                    
                    /* ELIMINAR EMPLEAT */
                case '4':
                    FuncionalitatEmpleat.eliminarEmpleat(arrayPersona);
                    break;
            }
            
        }while (opcio!='0');  
    }
}