import java.util.Scanner;
public class notort {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce , tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.println("mat notunu gir :");
        mat =inp.nextInt();
        System.out.println("kimya notunu gir :");
        fizik = inp.nextInt();
        System.out.println("turkce notunu gir :");
        turkce = inp.nextInt();
        System.out.println("turkce notunu gir :");
        kimya = inp.nextInt();
        System.out.println("tarih notunu gir :");
        tarih = inp.nextInt();
        System.out.println("muzik notunu gir :");
        muzik = inp.nextInt();

        int toplam =  (mat + fizik + turkce + tarih + kimya + muzik);
        double sonuc = toplam / 6.0;
        System.out.println(sonuc);
        boolean kosul = sonuc >= 60;
        String gectiMi = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(gectiMi);



    }
}
