package timecalculator;

public class detik implements calculator{
    private String hasil;
    
    @Override
    public void convert(int wa) {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
        String wat = Integer.toString(wa);
        hasil = wat + " Detik ";
    }

    @Override
    public String getHasil() {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
        return this.hasil;
    }
    
}
