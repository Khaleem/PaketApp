/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chaidir.Dao;

import Chaidir.Model.Tarif;
import java.util.List;

/**
 *
 * @author KHAIDIR
 */
public class AsuransiDAO {
     public Tarif hitungHarga(String namaKota, int berat, double hargaBarang) {
        Tarif t = new Tarif();
        List<Tarif> lisKota = TarifFileDAO.PaketKota();
        for (Tarif tarif : lisKota) {
            if (namaKota.equalsIgnoreCase(tarif.getKotaTujuan())) {
               t.setBerat(berat);
               t.setHargaBarang(hargaBarang);
                t.setKotaTujuan(namaKota);
                t.setReguler(tarif.getReguler());
                t.setKilat(tarif.getKilat());
                t.setOns(tarif.getOns());
                t.setSds(tarif.getSds());
                t.setHds(tarif.getHds());
                
                t.hitungBiayaRegulerWintAsuransi();
                t.hitungBiayaKilatWithAsuransi();
                t.hitungBiayaSDSWithAsuransi();
                t.hitungBiayaONSWithAsuransi();
                t.hitungBiayaHDSWithAsuransi();
                
            }
        }
        
        return t;
    }
}
