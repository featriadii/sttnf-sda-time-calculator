package timecalculator;

public class menit implements calculator {
    private String hasil;
    int menit = 60;
    int hasil1;
    @Override
    public void convert(int wa) {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
        hasil1 = wa / menit;
        String wat = Integer.toString(hasil1);
        hasil = wat + " Menit ";
    }

    @Override
    public String getHasil() {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
        return this.hasil;
    }
    
}
