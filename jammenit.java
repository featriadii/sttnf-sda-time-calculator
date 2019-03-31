package timecalculator;

public class jammenit implements calculator{
    private String hasil;
    int jam, sisadetik, menit;
    @Override
    public void convert(int wa) {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
        jam = wa / 3600;
        sisadetik = wa % 3600;
        menit = sisadetik / 60;
        String jam1 = Integer.toString(jam);
        String menit1 = Integer.toString(menit);
        hasil = jam1 + " Jam " + menit1 + " Menit ";
    }

    @Override
    public String getHasil() {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
        return this.hasil;
    }
    
}