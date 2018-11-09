package ClassesPrincipals;

/**
 *
 * @author Grup2: Evaldas Casas, Manu Gallego
 */
public class Empleat extends Persona {
    private String idE;
    private String numSS;
    private String numNomina;
    

    public Empleat() {
        super();
        idE="";
        numSS="";
        numNomina="";
    }
    
    /* GETTERS */
    public String getIdEmpleat() {
        return idE;
    }
    
    public String getNumSS() {
        return numSS;
    }

    public String getNumNomina() {
        return numNomina;
    }

    /* SETTERS */
    public void setIdEmpleat(String idE) {
        this.idE = idE;
    }
    
    public void setNumSS(String numSS) {
        this.numSS = numSS;
    }

    public void setNumNomina(String numNomina) {
        this.numNomina = numNomina;
    }
    
    //toString()
    @Override
    public String toString() {
        return "ID: "+this.idE+" "+super.toString()+", Num SS: "+this.numSS+", Num Nomina: "+this.numNomina;
    }
}