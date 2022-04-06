import java.time.LocalDate;
public abstract class Liber {
    String titulli;
    String autori;
    int viti;
    double vlersimi;
    public Liber(String t, String a, int v, double vl) {
        this.titulli = t;
        this.autori = a;
        this.viti = v;
        this.vlersimi = vl;
    }
    // funksion qe afishon nje mesazh pershendetes
    public void hyrja() {
        System.out.println("Pershendetje , kjo eshte faqja e pare e bibliotekes");
    }
    // marrim vlerat e variablave me ane te metodes get
    public String getTitulli() {
        return titulli;
    }
    public String getAutori() {
        return autori;
    }
    public int getViti() {
        return viti;
    }
    public double getVlersimi(){
        return vlersimi; 
    }
    public void setAutori(String a) {
        autori = a;
    } 

    // krijojme nje variabel i cili do te ruaje daten kur duhet te kthehet libri
    LocalDate newDate1 =  LocalDate.now().plusDays(14);

    // funksioni toString qe afishon te dhenat kryesore mbi librin
    public String toString(){
        return 
        "\n\nTitulli i librit : " + getTitulli()+
        "\nAutori i ketij libri : " + getAutori()+
        "\nViti i botimit te librit : " + getViti()+
        "\nVleresimi i ketij libri : " + getVlersimi()+
        "\nData e sotme : " + LocalDate.now()+
        "\nData kur duhet ta ktheni librin : " + newDate1 +"(pas 2 javesh)";
    }

}
