/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chaidir.Model;

/**
 *
 * @author user
 */
public class Tarif {
    
    private String kotaTujuan;
    private double reguler;
    private double kilat;
    private double sds;
    private double ons;
    private double hds;
    private double hargaBarang;
    private int berat;

    public Tarif() {
    }

    public Tarif(String kotaTujuan, double reguler, double kilat, double sds, double ons, double hds,int berat) {
        this.kotaTujuan = kotaTujuan;
        this.reguler = reguler;
        this.kilat = kilat;
        this.sds = sds;
        this.ons = ons;
        this.hds = hds;
        this.hargaBarang = hargaBarang;
        this.berat = berat;
    }

    /**
     * @return the kotaTujuan
     */
    public String getKotaTujuan() {
        return kotaTujuan;
    }

    /**
     * @param kotaTujuan the kotaTujuan to set
     */
    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }

    /**
     * @return the reguler
     */
    public double getReguler() {
        return reguler;
    }

    /**
     * @param reguler the reguler to set
     */
    public void setReguler(double reguler) {
        this.reguler = reguler;
    }

    /**
     * @return the kilat
     */
    public double getKilat() {
        return kilat;
    }

    /**
     * @param kilat the kilat to set
     */
    public void setKilat(double kilat) {
        this.kilat = kilat;
    }

    /**
     * @return the sds
     */
    public double getSds() {
        return sds;
    }

    /**
     * @param sds the sds to set
     */
    public void setSds(double sds) {
        this.sds = sds;
    }

    /**
     * @return the ons
     */
    public double getOns() {
        return ons;
    }

    /**
     * @param ons the ons to set
     */
    public void setOns(double ons) {
        this.ons = ons;
    }

    /**
     * @return the hds
     */
    public double getHds() {
        return hds;
    }

    /**
     * @param hds the hds to set
     */
    public void setHds(double hds) {
        this.hds = hds;
    }

    /**
     * @return the hargaBarang
     */
    public double getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }
    
    @Override
    public String toString() {
        return this.kotaTujuan;
    }
    Paket p = new Paket();
    public double hitungBiayaReguler() {
        return this.reguler = this.getBerat() * this.reguler;
    }
    public double hitungBiayaKilat () {
        return this.kilat = this.getBerat() *this.kilat;
    }
    public double hitungBiayaSDS () {
        return this.sds = this.getBerat() * this.sds;
    }
    public double hitungBiayaONS () {
        return this.ons = this.getBerat()*this.ons;
                 
    }
    public double hitungBiayaHDS () {
        return this.hds = this.getBerat() * this.hds;
    }
    public double hitungBiayaRegulerWintAsuransi () {
        return this.reguler = (this.getBerat() * this.reguler) + (this.hargaBarang * 0.03); 
    }
    public double hitungBiayaKilatWithAsuransi () {
        return this.kilat = (this.getBerat() *this.kilat) + (this.hargaBarang * 0.03);
    }
    public double hitungBiayaSDSWithAsuransi () {
        return this.sds = (this.getBerat() * this.sds) + (this.hargaBarang * 0.03);
    }
    public double hitungBiayaONSWithAsuransi () {
        return this.ons = (this.getBerat()*this.ons) + (this.hargaBarang * 0.03);
                 
    }
    public double hitungBiayaHDSWithAsuransi () {
        return this.hds = (this.getBerat() * this.hds) + (this.hargaBarang * 0.03);
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
    
    
    
}
