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
public class Registro_Trajes {
    private String clave;
    private String Fecha;
    private String desc;
    private String state;
    private String user;

    public Registro_Trajes(String clave,String Fecha,String desc,String state,String user){
        this.clave=clave;
        this.Fecha= Fecha;
        this.desc= desc;
        this.state= state;
        this.user=user;
                
    }
    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the Fecha
     */
    public String getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }
    
    @Override
    public String toString(){
        return this.clave + this.Fecha + this.desc + this.state + this.user;
}
    
}
