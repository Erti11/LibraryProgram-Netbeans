public class LiteratureArtistike extends Liber {
    // krijojme dy variabla te vecanta per kete kategori libri
    private String lloji;
    private String film;
    public LiteratureArtistike(String t, String a , int v , double vl, String ll, String f) {
        super(t, a , v , vl);
        this.lloji = ll;
        this.film = f;
    }
    public String getLlojiLibrit(){
        return lloji;
    }
    public String getFilm(){
        return film;
    }
    
    // funksioni qe afishon kategorine ku ben pjes libri
    public void kategori() {
        System.out.println("\n");
        System.out.println("Kategoria : Libra Artistik ");
    }
    // funksion qe afishon informacione shtese mbi librin
    public void info_shtese(){
        System.out.println("---Informacion shtese mbi librin --- ");
        System.out.println("Lloji i librit : " + getLlojiLibrit());
        System.out.println("A eshte i perkthyer ne film ky liber : " +getFilm());
    }
}