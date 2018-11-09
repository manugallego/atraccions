package Gestio;
import ClassesPrincipals.*;
import Biblioteques.iO;
import java.util.Random;

/**
 * @author Grup2: Evaldas Casas, Manu Gallego
 */
public class FuncionalitatEmpleat {
    
    public static void crearEmpleat(Persona[] arrayPersona) {
        if(Persona.getTotalPersones()==GestioPrincipal.CAPACITAT) {
            iO.imprimirMissatge("ERROR: No es poden introduir més empleats");
        }
        else {
            iO.imprimirMissatge("Introdueix les dades de l'Empleat");
            String inicialID = "E";
            Random random = new Random();
            String idTemp = String.format("%04d", random.nextInt(10000));
            iO.imprimirMissatge("ID Empleat: "+inicialID+idTemp);
            
            Empleat e = new Empleat();
            iO.imprimir("Nom: ");
            e.setNom(iO.LlegirString());
            iO.imprimir("Cognom: ");
            e.setCognom(iO.LlegirString());
            //Set del ID random
            e.setIdEmpleat(inicialID+idTemp);
            iO.imprimir("Numero SS: ");
            e.setNumSS(iO.LlegirString());
            iO.imprimir("Numero Nomina: ");
            e.setNumNomina(iO.LlegirString());
                
            arrayPersona[Persona.getTotalPersones()] = e; //Asignacio de objecte empleat a l'array de Persones
            Persona.augmentarTotalPersones(); //Augmentem el nombre de persones que hi ha a l'array
                //System.out.println("CIM:"+Persona.getTotalPersones()); //debugging
        }
    }
    
    public static void llistarEmpleat(Persona[] arrayPersona) {
        if(Persona.getTotalPersones()==0) {
            iO.imprimirMissatge("ERROR: NO HI HA REGISTRES GUARDATS");
        }
        else {
             for (int i=0;i<Persona.getTotalPersones();i++) {
                if (arrayPersona[i] instanceof Empleat) {
                    iO.imprimirMissatge(arrayPersona[i].toString());
                }
            }
        }
    }

    public static void modificarEmpleat(Persona[] arrayPersona) {
        char opcio3;
        if(Persona.getTotalPersones()==0) {
            iO.imprimirMissatge("ERROR: NO HI HA REGISTRES GUARDATS");
        }
        else {
            boolean shaTrobat = false;
            iO.imprimirMissatge("Introdueix el ID de l'empleat:");
            String buscador = iO.LlegirString();
            for (int i = 0; i < Persona.getTotalPersones() && shaTrobat == false; i++) {
                if (arrayPersona[i] instanceof Empleat) {
                    if (buscador.equalsIgnoreCase(((Empleat)arrayPersona[i]).getIdEmpleat())) {
                        shaTrobat = true;
                        do {
                            iO.imprimirMissatge("Has escollit l'empleat: " + ((Empleat)arrayPersona[i]).toString());
                            iO.imprimirMenuModEmpleat();
                            opcio3 = iO.llegirOpcio();
                            switch (opcio3) {
                                case '1': //Modificar Nom
                                    iO.imprimir("Introdueix el nou registre 'Nom': ");
                                    String newNom = iO.LlegirString();
                                    ((Empleat)arrayPersona[i]).setNom(newNom);
                                    break;
                                case '2': //Modificar Cognom
                                    iO.imprimir("Introdueix el nou registre 'Cognom': ");
                                    String newCognom = iO.LlegirString();
                                    ((Empleat)arrayPersona[i]).setCognom(newCognom);
                                    break;
                                case '3': //Modificar NumSS
                                    iO.imprimir("Introdueix el nou registre 'Numero SS': ");
                                    String newNumSS = iO.LlegirString();
                                    ((Empleat)arrayPersona[i]).setNumSS(newNumSS);
                                    break;
                                case '4': //Modificar NumNomina
                                    iO.imprimir("Introdueix el nou registre 'Numero Nomina': ");
                                    String newNumNomina = iO.LlegirString();
                                    ((Empleat)arrayPersona[i]).setNumNomina(newNumNomina);
                                    break;
                            }
                        } while (opcio3!='0');
                    } else {
                        iO.imprimirMissatge("ERROR: El registre no existeix");
                    } 
                }
            }
        }
    }
    
    public static void eliminarEmpleat(Persona[] arrayPersona) {
        int opcio4;
        if (Persona.getTotalPersones()==0) {
            iO.imprimirMissatge("ERROR: NO HI HA REGISTRES GUARDATS");
        } else {
            boolean shaTrobat = false;
            iO.imprimirMissatge("Introdueix el ID de l'empleat:");
            String buscador = iO.LlegirString();
            for (int i = 0; i < Persona.getTotalPersones() && shaTrobat == false; i++) {
                if (arrayPersona[i] instanceof Empleat) {
                    if (buscador.equalsIgnoreCase(((Empleat)arrayPersona[i]).getIdEmpleat())) {
                        shaTrobat = true;
                        iO.imprimirMissatge("Has escollit l'empleat: " + ((Empleat)arrayPersona[i]).toString());
                        iO.imprimirMissatge("Estas segur de voler eliminar l'empleat seleccionat? (s/n)");
                        opcio4 = iO.llegirOpcio();
                        switch (opcio4) {
                            case 's':
                                for (int j = i; j < arrayPersona.length - 1; j++) {
                                    arrayPersona[j] = arrayPersona[j + 1];
                                }
                                Persona.disminuirTotalPersones();
                                iO.imprimirMissatge("S'ha esborrat el registre correctament");
                                break;
                            case 'n':
                                iO.imprimirMissatge("Has cancel·lat la eliminacio");
                                break;
                        }
                    }
                }
            }
        }
    }
}