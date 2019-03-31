/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timecalculator;

public class jammenitdetik implements calculator{
    private String hasil;
    int menit, sisadetik, detik;
    int jam,jam1,menit1;
    @Override
    public void convert(int wa) {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
        jam =wa/3600;
        jam1=wa%3600;
        menit=jam1/60;
        menit1=jam1%60;
        detik=menit1;
        String jam2= Integer.toString(jam);
        String menit2= Integer.toString(menit);
        String detik1 = Integer.toString(detik);
        hasil = jam2 + " Jam " + menit2 + " Menit " + detik1 + " Detik ";
    }

    @Override
    public String getHasil() {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
        return this.hasil;
    }
    
}