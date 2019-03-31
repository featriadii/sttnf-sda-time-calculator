package timecalculator;

public class jam implements calculator{
    private String hasil;
    int Jam = 3600;
    int hasil1;
    @Override
    public void convert(int wa) {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
        if(wa<Jam){
            hasil1 = 0;
        }
        hasil1 = wa / Jam;
        String wat = Integer.toString(hasil1);
        hasil = wat + " Jam ";
    }

    @Override
    public String getHasil() {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
        return this.hasil;
    }
    
}
