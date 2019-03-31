package timecalculator;

public class jamdetik implements calculator{
    private String hasil;
    int jam, sisadetik, detik;
    @Override
    public void convert(int wa) {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
        jam = wa / 3600;
        sisadetik = wa % 60;
        detik = sisadetik;
        String jam1 = Integer.toString(jam);
        String detik1 = Integer.toString(detik);
        hasil = jam1 + " Jam " + detik1 + " Detik ";
    }

    @Override
    public String getHasil() {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
        return this.hasil;
    }
    
}