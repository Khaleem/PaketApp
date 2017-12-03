/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chaidir.Dao;

import Chaidir.Model.Tarif;
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
            Scanner scan = new Scanner(new File("C:\\Users\\KHAIDIR\\Documents\\Chaidir\\NetBeansProjects\\contoh.txt"));

            while (scan.hasNextLine()) {
                Tarif tarif = new Tarif();
                String line = scan.nextLine();
                String[] data = line.split(",");
                
                tarif.setKotaTujuan(data[0]);
                
                String reg = data[1];
                double reguler = Double.parseDouble(reg);
                tarif.setReguler(reguler);
                
                String kil = data[2];
                double kilat = Double.parseDouble(kil);
                tarif.setKilat(kilat);
                
                String sd = data[3];
                double sds = Double.parseDouble(sd);
                tarif.setSds(sds);
                
                String on = data[4];
                double ons = Double.parseDouble(on);
                tarif.setOns(ons);
                
                String h = data[5];
                double hds = Double.parseDouble(h);
                tarif.setHds(hds);
   
                tarifList.add(tarif);
                }
    
        } catch (FileNotFoundException fileErr) {
            System.out.println("File not found");
        }
        return tarifList;
    }
    
    
}
