package data;

public class Auto {
    private String rekNro;
    
    public Auto()
    {
    	rekNro = "";
    }
    
    public Auto(String r)
    {
    	rekNro = r;
    }
    
    public void tulostaTiedot() 
    {
    	System.out.println("Rekisterinumero: " + rekNro);
    }
}
