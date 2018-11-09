/* La classe GestioAtraccions serà la classe principal des d'on gestionarem tot
l'aplicatiu. Dins d'aquesta reproduirem mitjançant les funcions de les altres
classes, el menu, i les diferents funcions per a cada cas que ens presentarà el
menu a mes de tindre declarades les variables principals.

/**
 *
 * @author Manu
 */



package Gestio;
//import java.util.Arrays;
//import java.util.Scanner;

import ClassesPrincipals.Atraccio;
import Biblioteques.iO;
import static Gestio.GestioPrincipal.A;

 
public class GestioAtraccions {
        
    
    public static void main(String[] args)
    {
        GestioAtraccions proves = new GestioAtraccions();
        proves.inici();
    }
    
    public static void inici(){
        char opcio ; // Declarem la variable integer "opcio" que ens servira per escollir el numero de la opcio del menu.
        String entrada = null; //  les variables "entrada" (String) i "entrada2" (int) que ens serviran per a registrar dades introduides per l'usuari.
        //Declarem un array de 5 possicions (provisional) on guardarem les atraccions i tots els seus atributs.
        //int numeroAtraccions=0; //Declarem aquesta variable que ens servira com a contador i que augmentara o disminuira a mesura que afegim o esborrem una atraccio respectivament.
        do { //Farem un do while per a iniciar una situacio de reproduccio del menu
            System.out.println("--------------------------------------------------------");
            iO.ImprimirMenu();
            System.out.println("--------------------------------------------------------");
            System.out.println("");
           
            System.out.println("Introdueix el numero de la opció que vols elegir.");
            opcio = iO.llegirOpcio();
            
            System.out.println("");
            switch (opcio){
                case '1':
                    A [Atraccio.getTotalAtraccions()]= new Atraccio();
                    FuncionalitatAtraccions.CreaAtraccio(A,entrada);
                   // ++numeroAtraccions;
                    break;
                case '2':
                    //if(numeroAtraccions != 0){
                    FuncionalitatAtraccions.EliminaAtraccio(A);
                    // --numeroAtraccions;
                  //  }
                    
                    break;   
                case '3':
                    //if(numeroAtraccions != 0){
                    FuncionalitatAtraccions.ModificaAtraccio(A);
                    break;
                   // }
                case '4':
                    //if(numeroAtraccions != 0){
                    FuncionalitatAtraccions.CercaAtraccio(A);
                   // }
                    break;
                case '5':
                    //if(numeroAtraccions != 0){
                    FuncionalitatAtraccions.LlistaAtraccio(A);
                    break;
                    //}
            }
            
        }
        while (opcio != '0');
        System.out.println("Has sortit correctament");
        
        
            
    
    
}
    public void LlistaAtraccions(){
        
    }
    
}
