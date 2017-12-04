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

    public Tarif hitungHarga(String namaKota, int berat) {

        Tarif tariff = new Tarif();

        List<Tarif> lisKota = TarifFileDAO.PaketKota();

        for (Tarif tarif : lisKota) {
            if (namaKota.equalsIgnoreCase(tarif.getKotaTujuan())) {
                tariff.setBerat(berat);
                tariff.setKotaTujuan(namaKota);
                tariff.setReguler(tarif.getReguler());
                tariff.setKilat(tarif.getKilat());
                tariff.setOns(tarif.getOns());
                tariff.setSds(tarif.getSds());
                tariff.setHds(tarif.getHds());

                tariff.hitungBiayaReguler();
                tariff.hitungBiayaKilat();
                tariff.hitungBiayaSDS();
                tariff.hitungBiayaONS();
                tariff.hitungBiayaHDS();
            }
        }
        return tariff;
    }
    
    public Tarif hitungHarga(String namaKota, int berat, double hargaBarang) {

        Tarif tariff = new Tarif();

        List<Tarif> lisKota = TarifFileDAO.PaketKota();

        for (Tarif tarif : lisKota) {
            if (namaKota.equalsIgnoreCase(tarif.getKotaTujuan())) {
                tariff.setBerat(berat);
                tariff.setHargaBarang(hargaBarang);
                tariff.setKotaTujuan(namaKota);
                tariff.setReguler(tarif.getReguler());
                tariff.setKilat(tarif.getKilat());
                tariff.setOns(tarif.getOns());
                tariff.setSds(tarif.getSds());
                tariff.setHds(tarif.getHds());

                tariff.hitungBiayaRegulerWintAsuransi();
                tariff.hitungBiayaKilatWithAsuransi();
                tariff.hitungBiayaSDSWithAsuransi();
                tariff.hitungBiayaONSWithAsuransi();
                tariff.hitungBiayaHDSWithAsuransi();

            }
        }

        return tariff;
    }
    
}
