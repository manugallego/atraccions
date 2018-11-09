
package Gestio;

import ClassesPrincipals.*;
import Biblioteques.iO;
import java.util.Random;

/**
 * Les funcions d'aquesta classe ens serviran per demanar les dades que necessitem, borrar-les llistarles en general tractar les dades que guardem a l'array.
 * @author Manu
 */
public class FuncionalitatAtraccions {
   
        
    public static void CreaAtraccio(Atraccio [] A,String entrada){ //Funcio Crear
                if(Atraccio.getTotalAtraccions() ==GestioPrincipal.CAPACITAT) {
                    iO.imprimirMissatge("ERROR: No es poden introduir més assignacions");
                }
                else {
                    String InicialID = "A";
                    Random random = new Random();
                    String id = String.format("%04d", random.nextInt(10000));
                    System.out.println("La ID de l'atraccio sera assignada automaticament...");
                    A[Atraccio.getTotalAtraccions()].setIdA(InicialID + id);
                    System.out.println("ID "+InicialID + id+" assignada");
                    System.out.println("Digues el nom de la atraccio");
                    entrada = iO.LlegirString();
                    A[Atraccio.getTotalAtraccions()].setNom(entrada);
                    System.out.println("Digues quin tipus d'atracció es.");
                    entrada = iO.LlegirString();
                    A[Atraccio.getTotalAtraccions()].setTipuisAtraccio(entrada);
                    System.out.println("Introdueix una descripcio de l'atracció.");
                    entrada = iO.LlegirString();
                    A[Atraccio.getTotalAtraccions()].setDescripcioAtraccio(entrada);
                    System.out.println("Data d'innauguració format (dd/mm/yyyy)");
                    entrada = iO.LlegirString();
                    A[Atraccio.getTotalAtraccions()].setDataInnauguracio(entrada);
                    System.out.println("Duracio del viatge (min).");
                    entrada = iO.LlegirString();
                    A[Atraccio.getTotalAtraccions()].setDuracioViatge(entrada);
                    System.out.println("Altura Minima (cm).");
                    entrada = iO.LlegirString();
                    A[Atraccio.getTotalAtraccions()].setAlturaMin(entrada);
                    System.out.println("Altura Maxima en (cm).");
                    entrada = iO.LlegirString();
                    A[Atraccio.getTotalAtraccions()].setAlturaMax(entrada);
                    System.out.println("Accessible (yes/no)");
                    entrada = iO.LlegirAfirmacio();
                    A[Atraccio.getTotalAtraccions()].setAccessibilitat(entrada);
                    System.out.println("Express (yes/no)");
                    entrada = iO.LlegirAfirmacio();
                    A[Atraccio.getTotalAtraccions()].setAccesExpress(entrada);
                    System.out.println("");
                    System.out.println("Atraccio Creada.");
                    System.out.println("");
                    
                    Atraccio.augmentarTotalAtraccions();
                }             
                    
    }
    public static void EliminaAtraccio(Atraccio[]A){ //Funcio Eliminar
        boolean trobat = false;
        System.out.println("Introdueix el nom de l'atracció que vols eliminar?");
        String eliminarAtraccio = iO.LlegirString();
        for(int i = 0;i< Atraccio.getTotalAtraccions() && trobat == false ;i++){
            if(eliminarAtraccio.equals(A[i].getNom())) {
                trobat = true;
                System.out.println("Estas segur de que vols eliminar aquesta atracció? (yes/no)");
                if(iO.LlegirAfirmacio().equals("yes")){
                    for(int j=i;j<Atraccio.getTotalAtraccions();j++){
                        A[j] = A[j+1];
                    }
                    Atraccio.disminuirTotalAtraccions();
                System.out.println("Has borrado la atraccion ");
                }
                    else break;
                    }
                else {
                    System.out.println("No se ha encontrado el registro");
                    break;

                }
        }
    }
    public static void ModificaAtraccio(Atraccio[] A){       //Funcio Modificar
        int opcio3;
        if(Atraccio.getTotalAtraccions()==0) {
            iO.imprimirMissatge("ERROR: NO HI HA REGISTRES GUARDATS");
        }
        else {
            boolean shaTrobat = false;
            iO.imprimirMissatge("Introdueix el ID de l'Atraccio:");
            String buscador = iO.LlegirString();
            for (int i = 0; i < Atraccio.getTotalAtraccions() && shaTrobat == false; i++) {
                    if (buscador.equalsIgnoreCase (A[i].getIdA())) {
                        shaTrobat = true;
                        do {
                            iO.imprimirMissatge("Has escollit l'atraccio: " + A[i].getIdA()+" "+ A[i].getNom());
                            System.out.println(" ");
                            iO.ImpMenuModificar();
                            opcio3 = iO.llegirOpcio();
                            switch (opcio3) {
                                case '1': //Modificar Nom
                                    iO.imprimir("Introdueix el nou registre 'Nom': ");
                                    String newNom = iO.LlegirString();
                                    A[i].setNom(newNom);
                                    break;
                                case '2': //Modificar Cognom
                                    iO.imprimir("Introdueix el nou registre 'Tipus d'Atraccio: ");
                                    String newTipus = iO.LlegirString();
                                    A[i].setTipuisAtraccio(newTipus);
                                    break;
                                case '3': //Modificar NumSS
                                    iO.imprimir("Introdueix el nou registre 'Descripcio Atraccio': ");
                                    String newDescription = iO.LlegirString();
                                    A[i].setDescripcioAtraccio(newDescription);
                                    break;
                                case '4': //Modificar NumNomina
                                    iO.imprimir("Introdueix el nou registre 'Data Innaugural': ");
                                    String newDataInn = iO.LlegirString();
                                    A[i].setDataInnauguracio(newDataInn);
                                    break;
                                case '5': //Modificar NumNomina
                                    iO.imprimir("Introdueix el nou registre 'Duracio': ");
                                    String newDuracio = iO.LlegirString();
                                    A[i].setDuracioViatge(newDuracio);
                                    break;
                                case '6': //Modificar NumNomina
                                    iO.imprimir("Introdueix el nou registre 'Altura Minima': ");
                                    String newAltMin = iO.LlegirString();
                                    A[i].setAlturaMin(newAltMin);
                                    break;
                                case '7': //Modificar NumNomina
                                    iO.imprimir("Introdueix el nou registre 'Altura Maxima': ");
                                    String newAltMax = iO.LlegirString();
                                    A[i].setAlturaMax(newAltMax);
                                    break;
                                case '8': //Modificar NumNomina
                                    iO.imprimir("Introdueix el nou registre 'Accesibilitat': ");
                                    String newAcces = iO.LlegirString();
                                    A[i].setAccessibilitat(newAcces);
                                    break;
                                case '9': //Modificar NumNomina
                                    iO.imprimir("Introdueix el nou registre 'Acces Express': ");
                                    String newAcessExpress = iO.LlegirString();
                                    A[i].setAccesExpress(newAcessExpress);
                                    break;
                            }
                        } while (opcio3!='0');
                    } else {
                        iO.imprimirMissatge("ERROR: El registre no existeix");
                    } 
                }
            }
        }
    
    public static void CercaAtraccio(Atraccio[]A){       //Funcio crear
        boolean trobat = false;
        System.out.println("Introdueix el nom de l'atracció que vols cercar?");
        String cercarAtraccio = iO.LlegirString();
        for(int i = 0;i< Atraccio.getTotalAtraccions() && trobat == false ;i++){
            if(cercarAtraccio.equals(A[i].getNom())) {
                trobat = true;
                System.out.println(i + " " +A[i].toString());

            }
            else {
                System.out.println("No se ha encontrado el registro introduce un nombre que este en el sistema");
                           
            }
        }
        
    }
    
    public static void LlistaAtraccio( Atraccio[]A){        //Funcio llistar
                    if (Atraccio.getTotalAtraccions()<=0){
                        System.out.println("No hi han registres d'atraccions");
                    } 
                    else {
                        for(int i=0; i< Atraccio.getTotalAtraccions();i++){
                            System.out.println(A[i].toString());
                        }
                    }
    }
    
}
