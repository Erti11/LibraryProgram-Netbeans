public class Enciklopedi extends Liber {
    // krijojme dy variabla te vecanta per kete kategori libri
    private int mosha;
    private String tematika;
    public Enciklopedi(String t, String a , int v , double vl, int m, String tm) {
        super(t, a , v, vl);
        this.mosha = m;
        this.tematika = tm;
    }
    public int getMosha(){
        return mosha;
    }
    public String getTematika(){
        return tematika;
    }

    // funksioni qe afishon kategorine ku ben pjes libri
    public void kategori() {
        System.out.println("\n");
        System.out.println("\n Kategoria : Libra Enciklopedik ");
    }
    // funksion qe afishon informacione shtese mbi librin
    public void info_shtese(){
        System.out.println("---Informacion shtese mbi librin --- ");
        System.out.println("Tematika e kesaj enciklopedie eshte mbi : " +getTematika());
        System.out.println("Mosha e lexuesve duhet te jete : "+"+"+getMosha()+"(mbi "+ getMosha()+" vjec)");
    }
   }
   