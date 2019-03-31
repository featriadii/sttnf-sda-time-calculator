package timecalculator;

public class menitdetik implements calculator{
    private String hasil;
    int menit, sisadetik, detik;
    @Override
    public void convert(int wa) {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
        menit = wa / 60;
        sisadetik = wa % 60;
        detik = sisadetik;
        String menit1 = Integer.toString(menit);
        String detik1 = Integer.toString(detik);
        hasil = menit1 + " Menit " + detik1 + " Detik ";
    }

    @Override
    public String getHasil() {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
        return this.hasil;
    }
    
}