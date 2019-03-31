package timecalculator;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TimeCalculator {
    public static void main(String[] args) {
        boolean done = false;
        JOptionPane.showMessageDialog(null, "Selamat Datang!");
        while (!done) {
            try {
                int ulang = 1;
                int inputulang = 0;
                int totalwaktu = 0;
                while(ulang == 1){
                    while(inputulang == 0){
                        done = false;
                        String waktu = JOptionPane.showInputDialog(null,
                        "Input Waktu");

                        Scanner w = new Scanner(waktu).useDelimiter("\\s*[ ]\\s*");

                        ArrayList<String> wak = new ArrayList<>();

                        while(w.hasNext()){
                            String wa = w.next();
                            wak.add(wa);
                        }

                        if(wak.contains("jam") == false){
                            if(wak.contains("menit") == false){
                                if(!wak.contains("detik")){
                                    throw new myownexception();
                                }
                            }
                        }
                        

                        done = true;

                        String jams = "jam";
                        String mens = "menit";
                        String dets = "detik";
                        String pls = "+";
                        String min = "-";
                        int counter = 0;
                        int jamc = 0;
                        int tambah = 0;
                        int kurang = 0;

                        for(String time : wak){
                            int total = 0;
                            if(!time.contains(jams)){
                                jamc = wak.indexOf("jam");
                                wak.set(jamc, "");
                                jamc = jamc - 1;
                                String str = wak.get(jamc);
                                int wkt = Integer.parseInt(str);
                                total = wkt * 3600;
                            }else if(time.contains(mens)){
                                jamc = wak.indexOf("menit");
                                wak.set(jamc, "");
                                jamc = jamc - 1;
                                String str = wak.get(jamc);
                                int wkt = Integer.parseInt(str);
                                total = wkt * 60;
                            }else if(time.contains(dets)){
                                jamc = wak.indexOf("detik");
                                wak.set(jamc, "");
                                jamc = jamc - 1;
                                String str = wak.get(jamc);
                                int wkt = Integer.parseInt(str);
                                total = wkt;
                            }else if(time.contains(min)){
                                counter = 1;
                            }else if(time.contains(pls)){
                                counter = 0;
                            }
                            if(counter == 0){
                                tambah = tambah + total;
                            }
                            else{
                                kurang = kurang + total;
                            }
                        }

                        System.out.println(tambah);
                        System.out.println(kurang);
                        totalwaktu = tambah - kurang;
                        inputulang = 1;
                    }
                    
                    jammenitdetik p1 = new jammenitdetik();
                    jammenit p2 = new jammenit();
                    jamdetik p3 = new jamdetik();
                    menitdetik p4 = new menitdetik();
                    jam p5 = new jam();
                    menit p6 = new menit();
                    detik p7 = new detik();

                    calculator[] pilihan = {p1,p2,p3,p4,p5,p6,p7};
                    
                    String kon_pilihan = JOptionPane.showInputDialog(
                            "Pilih Format Waktu :\n"
                                    + "1. Jam Menit Detik\n"
                                    + "2. Jam Menit\n"
                                    + "3. Jam Detik\n"
                                    + "4. Menit Detik\n"
                                    + "5. Jam\n"
                                    + "6. Menit\n"
                                    + "7. Detik\n");

                    int pilih = Integer.parseInt(kon_pilihan);
                    calculator format = pilihan[pilih-1];
                    format.convert(totalwaktu);
                    JOptionPane.showMessageDialog(null,
                            "Hasil Waktu adalah " + format.getHasil());
                    
                    int keluar = JOptionPane.showOptionDialog(null, 
                            "Apakah anda ingin mengulang program?", 
                            "Konfirmasi", 
                            JOptionPane.YES_NO_OPTION, 
                            JOptionPane.YES_OPTION, null, null, null);
                    if(keluar == JOptionPane.NO_OPTION || keluar == JOptionPane.CLOSED_OPTION){
                        JOptionPane.showMessageDialog(null, 
                                "Program Akan Ditutup");
                        System.exit(0);
                    }
                    
                    int input = JOptionPane.showOptionDialog(null, 
                        "Apakah anda ingin meng-input ulang?", 
                        "Konfirmasi", 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.YES_OPTION, null, null, null);
                    if(input == JOptionPane.NO_OPTION){
                        inputulang = 1;
                    }
                    else if(input == JOptionPane.YES_OPTION){
                        inputulang = 0;
                    }
                }
                
                
            }   
            catch (myownexception ex) {
                JOptionPane.showMessageDialog(null,
                        "Inputan Anda Salah! Silahkan Input Kembali");
            }
        }
    }
}