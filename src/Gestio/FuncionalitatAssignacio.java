/*
 * Funció crearAssignacio:
 *  Si el array d'assignacions no esta ple i hi ha registres d'atraccions i empleats,
 *  es demanen dades a l'usuari, es comparen en dades existents en els arrays de Atraccions
 *  i Empleats i si existeixen, es crea un objecte i s'afegeix a l'array d'assignacions
 *  S'augmenta el nombre d'assignacions en 1
 * Funció llistarAssignacio:
 *  Si el array d'assignacions esta buit no s'imprimeix res, en cas contrari es mostren
 *  tots els registres guardats en l'array d'assignacions
 * Funció modificarAssignacio:
 *  Si el array d'assignacions esta buit no es demana res, en cas contrari es demana
 *  el ID d'una assignació a modificar, si aquest ID existeix en el array es mostren
 *  les dades i es dona la opció de modificar la data de l'assignació (però no el empleat
 *  o l'atracció assignats, ja que per a fer això, fem una assignació nova)
 * Funció eliminarAssignacio:
 *  Si el array d'assignacions esta buit no es demana res, en cas contrari es demana
 *  el ID d'una assignació a eliminar, si aquest ID existeix en el array es mostren
 *  les dades i es demana confirmació per eliminar el registre, si la resposta
 *  es afirmativa s'elimina el registre, en cas contrari no
 *  Es disminueix el nombre d'assignacions en 1.
 */
package Gestio;
import ClassesPrincipals.*;
import Biblioteques.iO;
import java.util.Random;

public class FuncionalitatAssignacio {
    
    public static void crearAssignacio(Atraccio[] A, Persona[] arrayPersona, Assignacio[] arrayAssignacio) {
        if(Assignacio.getTotalAssignacions()==GestioPrincipal.CAPACITAT) {
            iO.imprimirMissatge("ERROR: No es poden introduir més assignacions");
        }
        else if (Persona.getTotalPersones()== 0 || Atraccio.getTotalAtraccions() == 0){
            iO.imprimirMissatge("ERROR: No hi han atraccions o empleats crea'n.");
        }
        else {
            iO.imprimirMissatge("Introdueix les dades de la Assignacio");
            String inicialID = "AS";
            Random random = new Random();
            String idTemp = String.format("%03d", random.nextInt(1000));
            
            boolean shaTrobat=false;
            boolean shaTrobat2=false;
            
            Assignacio a = new Assignacio();
            
            iO.imprimirMissatge("---------------");
            iO.imprimirMissatge("LLISTAT EMPLEATS");
            FuncionalitatEmpleat.llistarEmpleat(arrayPersona);
            iO.imprimirMissatge("---------------");
            
            iO.imprimirMissatge("ID Assignacio: "+inicialID+idTemp);
            iO.imprimir("ID Empleat: ");
            String idEmpleat_Comparar = iO.LlegirString();
            
            for(int i=0;i<Persona.getTotalPersones() && shaTrobat == false;i++) {
                if (arrayPersona[i] instanceof Empleat) {
                    if (idEmpleat_Comparar.equals(((Empleat)arrayPersona[i]).getIdEmpleat())) {
                        shaTrobat=true;
                        a.setIdE(idEmpleat_Comparar); //SET AL ID EMPLEAT DE ASSIGNACIO
                    }
                }
            }
            
            if (shaTrobat==true) {
                iO.imprimirMissatge("---------------");
                iO.imprimirMissatge("LLISTAT ATRACCIONS");
                FuncionalitatAtraccions.LlistaAtraccio(A);
                iO.imprimirMissatge("---------------");

                iO.imprimir("ID Atraccio: ");
                String idAtraccio_Comparar = iO.LlegirString();

                for (int j = 0; j < Atraccio.getTotalAtraccions() && shaTrobat2 == false; j++) {
                    if (idAtraccio_Comparar.equals(A[j].getIdA())) {
                        shaTrobat2 = true;
                        a.setIdA(idAtraccio_Comparar); //SET AL ID ATRACCIO DE ASSIGNACIO
                        a.setIdAssignacio(inicialID + idTemp); //SET ID RANDOM

                        iO.imprimir("Data Assignacio: ");
                        a.setDataAssignacio(iO.LlegirString()); //SET A LA DATA DE ASSIGNACIO
                        iO.imprimirMissatge("Has afegit una Assignacio correctament!");
                        arrayAssignacio[Assignacio.getTotalAssignacions()] = a; //Asignacio de objecte assignacio a l'array de Assignacions
                        Assignacio.augmentarTotalAssignacions(); //Augmentem el nombre total de assignacions
                    }
                }
                if(shaTrobat2==false) {
                    iO.imprimirMissatge("ERROR: Aquest ID Atraccio NO EXISTEIX");
                }
            }
            else {
                iO.imprimirMissatge("ERROR: Aquest ID Empleat NO EXISTEIX");
            }
        }
    }
    
    public static void llistarAssignacio(Atraccio[] A, Persona[] arrayPersona, Assignacio[] arrayAssignacio) {
        if (Assignacio.getTotalAssignacions()==0){
            iO.imprimirMissatge("ERROR: NO HI HA REGISTRES GUARDATS");
        }
        else {
             for (int i=0;i<Assignacio.getTotalAssignacions();i++) {
                    iO.imprimirMissatge(arrayAssignacio[i].toString());
            }
        }
    }
    
    public static void modificarAssignacio(Assignacio[] arrayAssignacio) {
        if(Assignacio.getTotalAssignacions()==0) {
            iO.imprimirMissatge("ERROR: NO HI HA REGISTRES GUARDATS");
        }
        else {
            boolean shaTrobat = false;
            iO.imprimirMissatge("Introdueix el ID de l'assignacio:");
            String buscador = iO.LlegirString();
            for (int i = 0; i < Assignacio.getTotalAssignacions() && shaTrobat == false; i++) {
                if (buscador.equalsIgnoreCase(arrayAssignacio[i].getIdAssignacio())) {
                    shaTrobat = true;
                    iO.imprimirMissatge("Has escollit l'assignacio: " + (arrayAssignacio[i]).toString());
                    iO.imprimirMissatge("Introdueix el registre nou 'Data Assignacio': ");
                    String newDataAssignacio = iO.LlegirString();
                    arrayAssignacio[i].setDataAssignacio(newDataAssignacio);
                } else {
                    iO.imprimirMissatge("ERROR: El registre no existeix");
                }
            }
        }
    }
    
    public static void eliminarAssignacio(Assignacio[] arrayAssignacio) {
        int opcio4;
        if (Assignacio.getTotalAssignacions()==0) {
            iO.imprimirMissatge("ERROR: NO HI HA REGISTRES GUARDATS");
        } else {
            boolean shaTrobat = false;
            iO.imprimirMissatge("Introdueix el ID de l'assignacio:");
            String buscador = iO.LlegirString();
            for (int i = 0; i < Persona.getTotalPersones() && shaTrobat == false; i++) {
                if (buscador.equalsIgnoreCase(arrayAssignacio[i].getIdAssignacio())) {
                    shaTrobat = true;
                    iO.imprimirMissatge("Has escollit l'assignacio: " + (arrayAssignacio[i]).toString());
                    iO.imprimirMissatge("Estas segur de voler eliminar l'assignacio seleccionada? (s/n)");
                    opcio4 = iO.llegirOpcio();
                    switch (opcio4) {
                        case 's':
                            for (int j = i; j < arrayAssignacio.length - 1; j++) {
                                arrayAssignacio[j] = arrayAssignacio[j + 1];
                            }
                            Assignacio.disminuirTotalAssignacions();
                            iO.imprimirMissatge("S'ha esborrat el registre correctament");
                            break;
                        case 'n':
                            iO.imprimirMissatge("Has cancel·lat la eliminacio");
                            break;
                    }
                }
                else {
                    iO.imprimirMissatge("ERROR: El registre no existeix");
                }
            }
        }
    }
    
}
