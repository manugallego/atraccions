package ClassesPrincipals;

/**
 *
 * @author Grup2: Evaldas Casas, Manu Gallego
 */
public abstract class Persona {
    private String nom;
    private String cognom;
    
    private static int totalPersones = 0; //variable de classe

    public Persona() {
        nom = "";
        cognom = "";
    }
    
    /* GETTERS */
    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }
    
    /* Variable de classe */
    public static int getTotalPersones() {
        return totalPersones;
    }
    
    /* SETTERS */
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
    
    public int setTotalPersones(int n) {
        this.totalPersones = n;
        return totalPersones;
    }
    
    /* MÈTODES */
    public static int augmentarTotalPersones() {
        totalPersones = totalPersones+1;
        return totalPersones;
    }
    
    public static int disminuirTotalPersones() {
        totalPersones--;
        return totalPersones;
    }
    
    //toString()
    @Override
    public String toString() {
        return "Nom: "+this.nom+", Cognom: "+this.cognom;
    }
    
}