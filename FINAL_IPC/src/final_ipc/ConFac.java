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
public class ConFac {
    private String Fac;
    private String Cantidad;
    private String Desc;
    private String PU;
    private String Total;
    
    public ConFac(String Fac,String Cantidad, String Desc, String PU,String Total){
        this.Fac=Fac;
        this.Cantidad=Cantidad;
        this.Desc=Desc;
        this.PU=PU;
        this.Total=Total;
    }

    /**
     * @return the Cantidad
     */
    public String getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    /**
     * @return the Desc
     */
    public String getDesc() {
        return Desc;
    }

    /**
     * @param Desc the Desc to set
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * @return the PU
     */
    public String getPU() {
        return PU;
    }

    /**
     * @param PU the PU to set
     */
    public void setPU(String PU) {
        this.PU = PU;
    }

    /**
     * @return the Total
     */
    public String getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }
    @Override
    public String toString(){
        return this.Fac+this.Cantidad+this.Desc+this.PU+this.Total;
    }

    /**
     * @return the Fac
     */
    public String getFac() {
        return Fac;
    }

    /**
     * @param Fac the Fac to set
     */
    public void setFac(String Fac) {
        this.Fac = Fac;
    }
    
}
