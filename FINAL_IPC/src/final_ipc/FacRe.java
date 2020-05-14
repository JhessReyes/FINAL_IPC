/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_ipc;

/**
 *
 * @author jhess
 */
public class FacRe {
    
    private String Nu;
    private String Nom;
    private String NIT;
    private String Dir;
    private String Vent;
    
    public FacRe(String Nu,String Nom, String NIT, String Dir, String Vent){
        this.Nu=Nu;
        this.Nom=Nom;
        this.NIT=NIT;
        this.Dir=Dir;
        this.Vent=Vent;
    }

    

    /**
     * @return the Nu
     */
    public String getNu() {
        return Nu;
    }

    /**
     * @param Nu the Nu to set
     */
    public void setNu(String Nu) {
        this.Nu = Nu;
    }

    /**
     * @return the Nom
     */
    public String getNom() {
        return Nom;
    }

    /**
     * @param Nom the Nom to set
     */
    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    /**
     * @return the NIT
     */
    public String getNIT() {
        return NIT;
    }

    /**
     * @param NIT the NIT to set
     */
    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    /**
     * @return the Dir
     */
    public String getDir() {
        return Dir;
    }

    /**
     * @param Dir the Dir to set
     */
    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    /**
     * @return the Vent
     */
    public String getVent() {
        return Vent;
    }

    /**
     * @param Vent the Vent to set
     */
    public void setVent(String Vent) {
        this.Vent = Vent;
    }
    @Override
    public String toString(){
        return this.Nu+this.Nom+this.NIT+this.Dir+this.Vent;
    }
    
}
