public class Main {

    public static void main(String[] args) {
        sehirVer();
        topla(5);
        topla2(2, 3, 4, 5, 6);
    }

    public static void ekle() {

    }

    public static void sil() {

    }

    public static void guncelle() {

    }

    public static int topla(int sayi) {
        return sayi;
    }

    public static String sehirVer() {
        return "sehir";
    }

    public static int topla2(int... sayi) {
        for (int s : sayi
        ) {
            System.out.println(s);
        }
        return 0;
    }
}

