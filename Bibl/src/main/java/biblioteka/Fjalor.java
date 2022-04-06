public class Fjalor extends Liber {
    // krijojme dy variabla te vecanta per kete kategori libri
    private int numri;
    private String ribotim;
    public Fjalor(String t, String a , int v , double vl, int nr, String r) {
        super(t, a , v , vl);
        this.numri = nr;
        this.ribotim = r;
    }
    public int getNrFjaleve(){
        return numri;
    }
    public String getRibotim(){
        return ribotim;
    }

    // funksioni qe afishon kategorine ku ben pjes libri    
    public void kategori() {
        System.out.println("\n");
        System.out.println("\n Kategoria : Fjalor ");
    }
    // funksion qe afishon informacione shtese mbi librin
    public void info_shtese(){
        System.out.println("---Informacion shtese mbi librin --- ");
        System.out.println("Numri i fjaleve te perkthyera : " + getNrFjaleve()+ " fjale");
        System.out.println("Ribotim i librit : " +getRibotim());
    }
}
