public class Biblioteka {  
    public static void main(String [] args) {

        // Titulli,Autori,Viti Botimit,Vlersimi,Lloji,Perkthyer ne Film //
        LiteratureArtistike l1 = new LiteratureArtistike("Blithe Spirit","Noël Coward", 2016, 7.1,"Roman","Po");
        LiteratureArtistike l2 = new LiteratureArtistike("Alien Corn","Sidney Howard",2010, 7.4,"Roman","Jo");
        
        // Titulli,Autori,Viti Botimit,Vlersimi,Numri Fjaleve,Ribotim //
        Fjalor f1 = new Fjalor("Anglisht-Shqip","Shpetim Cucka",2006,8.2,35000,"Jo");
        Fjalor f2 = new Fjalor("Italisht-Shqip","Ferdinand Leka",2006,7.9,40000,"Po");
        
        // Titulli,Autori,Viti Botimit,Vlersimi,Mosha e Lexuesve,Tematika //
        Enciklopedi e1 = new Enciklopedi("Funk & Wagnalls new world encyclopedia", "Carruthers",2002,7.9,18,"Natyren");
        Enciklopedi e2 = new Enciklopedi("The Canadian Encyclopedia","Beckwith",2012,8.3,18,"Hapesiren");

        // Krijojme nga nje tabele me te dhena per secilen kategori libri //
        LiteratureArtistike[] la = {l1,l2};
        Fjalor[] f = {f1,f2};
        Enciklopedi[] e = {e1,e2};

        l1.hyrja();

        l1.kategori();
        for (int i = 0 ; i<la.length ; i++){
            System.out.println(la[i].toString());
            la[i].info_shtese();
        }
        f1.kategori();
        for (int i = 0 ; i<f.length ; i++){
            System.out.println(f[i].toString());
            f[i].info_shtese();
        }
        e1.kategori();
        for (int i = 0 ; i<e.length ; i++){
            System.out.println(e[i].toString());
            e[i].info_shtese();
        }

        }

       }
