package Chaidir.Model;


public class Paket {

    private String noPaket;
    private TarifFileDAO tarifPaket;
    private int berat;

    public Paket() {
    }

    public Paket(String noPaket, TarifFileDAO tarifPaket, int berat) {
        this.noPaket = noPaket;
        this.tarifPaket = tarifPaket;
        this.berat = berat;
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

    /**
     * @return the berat
     */
    public int getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(int berat) {
        this.berat = berat;
    }
    
    public double hitungBiaya(int berat, String tujuan){
        Tarif tarif = new Tarif();
        double biaya = 0.0;
        String tipe = "";
        
//            if (tujuan.equalsIgnoreCase(tarif.getKotaTujuan())) {
//            if (tipe.equalsIgnoreCase(tarif.getReguler())) {
//                biaya = berat * ;
//            } else if (tipe.equalsIgnoreCase("Express")) {
//                biaya = berat * biayaPerKG + tipe1;
//            } else if (tipe.equalsIgnoreCase("Reguler")) {
//                biaya = berat * biayaPerKG + tipe2;
//            }
//
//        } else if (tujuan.equalsIgnoreCase("Surabaya")) {
//            if (tipe.equalsIgnoreCase("SDS")) {
//                biaya = berat * biayaPerKG2;
//            } else if (tipe.equalsIgnoreCase("Express")) {
//                biaya = berat * biayaPerKG2 + tipe1;
//            } else if (tipe.equalsIgnoreCase("Reguler")) {
//                biaya = berat * biayaPerKG2 + tipe2;
//            }
//        } else {
//            System.out.println("Paket atau Tujuan tidak ada!");
//        }

//     return biaya;
//    
//}
