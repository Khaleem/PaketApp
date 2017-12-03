package Chaidir.Model;

import Chaidir.Dao.TarifFileDAO;
import com.sun.management.jmx.Trace;


public class Paket {

    private String noPaket;
    private TarifFileDAO tarifPaket;

    public Paket(){
    }

    public Paket(String noPaket, TarifFileDAO tarifPaket) {
        this.noPaket = noPaket;
        this.tarifPaket = tarifPaket;
    }

    /**
     * @return the noPaket
     */
    public String getNoPaket() {
        return noPaket;
    }

    /**
     * @param noPaket the noPaket to set
     */
    public void setNoPaket(String noPaket) {
        this.noPaket = noPaket;
    }

    /**
     * @return the tarifPaket
     */
    public TarifFileDAO getTarifPaket() {
        return tarifPaket;
    }

    /**
     * @param tarifPaket the tarifPaket to set
     */
    public void setTarifPaket(TarifFileDAO tarifPaket) {
        this.tarifPaket = tarifPaket;
    }
        
}
