package Biblioteques;
import Menu.*;
import java.util.Scanner;
/**
 * @author Grup2: Evaldas Casas, Manu Gallego
 */
public class iO {
    
    public static void ImprimirMenu(){
        MenuAtraccio menu = new MenuAtraccio();
        for(int i = 0; i< menu.menuInicial.length;i++){
            System.out.println(menu.menuInicial[i]);
        }
    }
    
    public static void ImpMenuModificar(){
        int numeracioMenu = 9;
        String[] menuMod = new String [numeracioMenu];
    
        menuMod[0] = "1 Modificar Nom";
        menuMod[1] = "2 Modificar Tipus";
        menuMod[2] = "3 Modificar Descripcio";
        menuMod[3] = "4 Modificar Data";
        menuMod[4] = "5 Modificar Duracio";
        menuMod[5] = "6 Modificar Altura minima";
        menuMod[6] = "7 Modificar Altura maxima";
        menuMod[7] = "8 Modificar accessibilitat";
        menuMod[8] = "9 Modificar entrada express";

        for(int i=0; i<menuMod.length; ++i){
            System.out.println(menuMod[i]);
        }
    }
    
    public static String LlegirString(){
        Scanner sc = new Scanner(System.in);
        String entrada = sc.next();
        return entrada;
    }
    
    public static int LlegirInt(){
        Scanner sc = new Scanner(System.in);
        int opcio = sc.nextInt();
        return opcio;   
    }
    
    public static String LlegirAfirmacio(){
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        if (entrada.equals("yes") || entrada.equals("no")){
            
        }
        else {
            System.out.println("ERROR: Introduce una opcion valida");
            entrada = sc.nextLine();
        }
        return entrada;
    } 
    
    public static void imprimirMenuInicial() {
        final int maxMenu = 4;
        String[] menuInicial = new String[maxMenu];
        
        menuInicial[0]="1. Gestio Atraccions";
        menuInicial[1]="2. Gestio Empleats";
        menuInicial[2]="3. Gestio Assignacions";
        menuInicial[3]="0. Sortir";
        
        System.out.println("---------------");
        for(int i=0; i<menuInicial.length; i++) {
            System.out.println(menuInicial[i]);
        }
        System.out.println("---------------");
        System.out.println("Opcio?");
    }
    
    public static void imprimirMissatge(String m) {
        System.out.println(m);
    }
    
    public static void imprimir(String m) {
        System.out.print(m);
    }
    
    public static char llegirOpcio() {
        Scanner sc = new Scanner(System.in);
        char opcio = sc.next().charAt(0);
        return opcio;
    }
        
    public static void imprimirMenuEmpleat() {
        final int MAXMENUEMPLEAT = 5;
        String[] menuOpcionsEmpleat = new String [MAXMENUEMPLEAT];
        
        menuOpcionsEmpleat[0] = "1. Crear empleat";
        menuOpcionsEmpleat[1] = "2. Llistar empleats";
        menuOpcionsEmpleat[2] = "3. Modificar empleat";
        menuOpcionsEmpleat[3] = "4. Eliminar empleat";
        menuOpcionsEmpleat[4] = "0. Sortir";
        
        System.out.println("---------------");
        System.out.println("GESTIO EMPLEATS");
        System.out.println("---------------");
        for(int i=0; i<menuOpcionsEmpleat.length; i++) {
            System.out.println(menuOpcionsEmpleat[i]);
        }
        System.out.println("---------------");
        System.out.println("Opcio?");
    }
    
    public static void imprimirMenuModEmpleat() {
        final int MAXOPMENUMODEMPLEAT = 5;
        String[] menuModEmpleat = new String [MAXOPMENUMODEMPLEAT];
        
        menuModEmpleat[0] = "1. Modificar Nom";
        menuModEmpleat[1] = "2. Modificar Cognom";
        menuModEmpleat[2] = "3. Modificar Numero SS";
        menuModEmpleat[3] = "4. Modificar Numero Nomina";
        menuModEmpleat[4] = "0. Tornar enrere";
        
        System.out.println("---------------");
        System.out.println("MODIFICAR EMPLEAT");
        System.out.println("---------------");
        for(int i=0; i<menuModEmpleat.length; i++) {
            System.out.println(menuModEmpleat[i]);
        }
        System.out.println("---------------");
        System.out.println("Opcio?");
    }
    
    
    public static void imprimirMenuAssignacio() {
        final int MAXMENUASSIGNACIO = 5;
        String[] menuOpcionsEmpleat = new String [MAXMENUASSIGNACIO];
        
        menuOpcionsEmpleat[0] = "1. Crear assignacio";
        menuOpcionsEmpleat[1] = "2. Llistar assignacions";
        menuOpcionsEmpleat[2] = "3. Modificar assignacio";
        menuOpcionsEmpleat[3] = "4. Eliminar assignacio";
        menuOpcionsEmpleat[4] = "0. Sortir";
        
        System.out.println("---------------");
        System.out.println("GESTIO ASSIGNACIONS");
        System.out.println("---------------");
        for(int i=0; i<menuOpcionsEmpleat.length; i++) {
            System.out.println(menuOpcionsEmpleat[i]);
        }
        System.out.println("---------------");
        System.out.println("Opcio?");
    }
    

    //Principal
    public static void ImprimirMenuPrincipal(){
        MenuPrincipal menuprinc = new MenuPrincipal();
        for(int i = 0; i< menuprinc.menuprincipal.length;i++){
            
            System.out.println(menuprinc.menuprincipal[i]);
           
            
        }
        
    }
   
    
    
}
