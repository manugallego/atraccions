package ClassesPrincipals;
/**
 *Declararem els atributs i crearem els getters i els seters amb els seus tipus de dades corresponents.
 * @author Manu
 */
public class Atraccio {
    /*Atributs*/
    private String idA;
    private String nom;                 //variable string
    private String tipusAtraccio;       //variable string
    private String descripcioAtraccio;  //variable string  
    private String dataInauguracio;     //variable string
    private String duracioViatge;          //variable int
    private String alturamin;              //variable int
    private String alturamax;              //variable int
    private String accessibilitat;      //variable string
    private String accesexpress;        //variable string
    
    private static int totalAtraccions = 0; //variable de classe
    
    /*Constuctors*/
    public Atraccio (){
        idA = null; 
        nom = null;
        tipusAtraccio = null;
        descripcioAtraccio = null;
        dataInauguracio = "dd/mm/yyyy";
        duracioViatge = null;
        alturamin = null;
        alturamax = null;
        accessibilitat = null;
        accesexpress = null;
        
    }
    final static int CAPACITAT = 1000;
    public static Atraccio[] arrayAtraccio = new Atraccio[CAPACITAT];
    
    /* Variable de classe */
    public static int getTotalAtraccions() {
        return totalAtraccions;
    }
    
    /*Getters*/
    public String getIdA(){
        return idA;
    }
    public String getNom(){
        return nom;
    }
    public String getTipusAtraccio(){
        return tipusAtraccio;
    }
    public String getDescripcioAtraccio(){
        return descripcioAtraccio;
    }
    public String getDataInauguracio(){
        return dataInauguracio;
    }
    public String getDuracioViatge(){
        return duracioViatge;
    }
    public String getAlturaMin(){
        return alturamin;
    }
    public String getAlturaMax(){
        return alturamax;
    }
    public String getAccessibilitat(){
        return accessibilitat;
    }
    public String getAccesExpress(){
        return accesexpress;
    }
    
    /*Setters*/

    public void setIdA(String idAtraccio) {
        idA =idAtraccio;
    }
    
    
    /**
     * 
     * @param name 
     */
    public void setNom(String name){
        nom = name;
        
    }
    /**
     * 
     * @param type 
     */
    public void setTipuisAtraccio(String type){
        tipusAtraccio = type;
        
    }
    /**
     * 
     * @param description
     */
    public void setDescripcioAtraccio(String description){
        descripcioAtraccio = description;
        
    }
    /**
     * 
     * @param date
     */
    public void setDataInnauguracio(String date){
        dataInauguracio = date;
        
    }
    /**
     * 
     * @param Duration 
     */
    public void setDuracioViatge(String Duration){
        duracioViatge = Duration;
        
    }
    /**
     * 
     * @param Altminima 
     */
    public void setAlturaMin(String Altminima){
        alturamin = Altminima;
        
    }
    /**
     * 
     * @param Altmaxima 
     */
    public void setAlturaMax(String Altmaxima){
        alturamax = Altmaxima;
        
    }
    /**
     * 
     * @param accessible 
     */
    public void setAccessibilitat(String accessible){
        accessibilitat = accessible;
        
    }
    /**
     * 
     * @param express 
     */
    public void setAccesExpress(String express){
        accesexpress = express;
        
    }
    
        /* MÈTODES */
    public static int augmentarTotalAtraccions() {
        totalAtraccions = totalAtraccions+1;
        return totalAtraccions;
    }
    
    public static int disminuirTotalAtraccions() {
        totalAtraccions--;
        return totalAtraccions;
    }
    
    @Override
    public String toString() {
        return "ID: "+idA+" Nom: "+nom+" Tipus d'Atraccio: "+tipusAtraccio+", Descripció: "+descripcioAtraccio+" Data Innaugural: "+dataInauguracio+" Duració: "+duracioViatge+" Altura minima: "+alturamin+" Altura maxima :"+alturamax+" Accesibilitat: "+accessibilitat+" Acces express: "+accesexpress;
    }
    
    
        
    }