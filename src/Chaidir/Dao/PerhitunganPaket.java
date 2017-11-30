/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chaidir.Dao;

import Chaidir.Model.Paket;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class PerhitunganPaket {
    
//    public Paket kota(String kotaTujuan){
//    Paket paket = new Paket();
    
//    try {
//            Scanner scan = new Scanner(new File("E:/tarif.txt"));
//
//            while (scan.hasNextLine()) {
//                String line = scan.nextLine();
//                String[] data = line.split(",");
//
//                if (data[0].equalsIgnoreCase(kotaTujuan)) {
//                    paket.setKotaTujuan(data[0]);
//                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//                    Date tglLahir = sdf.parse(data[1]);
//                    person.setDateOfBirth(tglLahir);
//                    person.setInfoBirthday(+person.getAge() + " Tahun");
//                    break;
//                }
//            }
//        } catch (FileNotFoundException fileErr) {
//            //fileErr.printStackTrace();
//            System.out.println("File not found");
//        }
//        return paket;
//
//    }
    
    public List<Paket> getPersonList(String kotaTujuan) {
        List<Paket> paketList = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File("E:/tarif.txt"));

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] data = line.split(",");

                if (data[0].equalsIgnoreCase(kotaTujuan)) {
                    //paketList.
//                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//                    Date tglLahir = sdf.parse(data[1]);
//                    person.setDateOfBirth(tglLahir);
//                    person.setInfoBirthday(+person.getAge() + " Tahun");
                    break;
                }
            }
        } catch (FileNotFoundException fileErr) {
            //fileErr.printStackTrace();
            System.out.println("File not found");
        }
        return paketList;
    }
}

