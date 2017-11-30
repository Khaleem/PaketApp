/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chaidir.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class TarifFileDAO {
    
    public static List<Tarif> PaketKota() {
        
        List<Tarif> tarifList = new ArrayList<>();
        
        try {
            Scanner scan = new Scanner(new File("E:/tarif.txt"));

            while (scan.hasNextLine()) {
                Tarif tarif = new Tarif();
                String line = scan.nextLine();
                String[] data = line.split(",");
                
                String reg = data[1];
                double reguler = Double.parseDouble(reg);
                String kil = data[2];
                double kilat = Double.parseDouble(kil);
                String sd = data[3];
                double sds = Double.parseDouble(sd);
                String on = data[4];
                double ons = Double.parseDouble(on);
                String h = data[5];
                double hds = Double.parseDouble(h);
                
                tarif.setKotaTujuan(data[0]);
                tarif.setReguler(reguler);
                tarif.setKilat(kilat);
                tarif.setHds(hds);
                tarif.setOns(ons);
                tarif.setSds(sds);
                
                tarifList.add(tarif);
                }
    
        } catch (FileNotFoundException fileErr) {
            System.out.println("File not found");
        }
        return tarifList;
    }
    
    
}
