import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matematik,fizik,kimya,biyoloji,bedenegitimi,geometri,turkce,ingilizce;

        System.out.print("Öğrenci Adını Giriniz: ");
        String ad = scanner.nextLine();
        System.out.println("------------------------------------------------");
        System.out.println("Notlar: ");
        System.out.print("Matematik Notunuzu Giriniz: ");
        matematik = scanner.nextInt();
        if (matematik>100 || matematik<0) {
            System.out.println("Matematik Dersi İçin Geçersiz Bir Not Girdiniz. Notunuz 0 olarak kabul edilecektir...");
            matematik = 0;
        }
        
        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = scanner.nextInt();
        if (fizik>100 || fizik<0) {
            System.out.println("Fizik Dersi İçin Geçersiz Bir Not Girdiniz. Notunuz 0 olarak kabul edilecektir...");
            fizik = 0;
        }
        
        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = scanner.nextInt();
        if (kimya>100 || kimya<0) {
            System.out.println("Kimya Dersi İçin Geçersiz Bir Not Girdiniz. Notunuz 0 olarak kabul edilecektir...");
            kimya = 0;
        }
        
        System.out.print("Biyoloji Notunuzu Giriniz: ");
        biyoloji = scanner.nextInt();
        if (biyoloji>100 || biyoloji<0) {
            System.out.println("Biyoloji Dersi İçin Geçersiz Bir Not Girdiniz. Notunuz 0 olarak kabul edilecektir...");
            biyoloji = 0;
        }
        
        System.out.print("Beden Eğitimi Notunuzu Giriniz: ");
        bedenegitimi = scanner.nextInt();
        if (bedenegitimi>100 || bedenegitimi<0) {
            System.out.println("Beden Eğitimi Dersi İçin Geçersiz Bir Not Girdiniz. Notunuz 0 olarak kabul edilecektir...");
            bedenegitimi = 0;
        }
        
        System.out.print("Geometri Notunuzu Giriniz: ");
        geometri = scanner.nextInt();
        if (geometri>100 || geometri<0) {
            System.out.println("Geometri Dersi İçin Geçersiz Bir Not Girdiniz. Notunuz 0 olarak kabul edilecektir...");
            geometri = 0;
        }
        
        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = scanner.nextInt();
        if (turkce>100 || turkce<0) {
            System.out.println("Türkçe Dersi İçin Geçersiz Bir Not Girdiniz. Notunuz 0 olarak kabul edilecektir...");
            turkce = 0;
        }
        
        System.out.print("İngilizce Notunuzu Giriniz: ");
        ingilizce = scanner.nextInt();
        if (ingilizce>100 || ingilizce<0) {
            System.out.println("İngilizce Dersi İçin Geçersiz Bir Not Girdiniz. Notunuz 0 olarak kabul edilecektir...");
            ingilizce = 0;
        }
        
        System.out.println("------------------------------------------------");
        double ortalama = (fizik+matematik+kimya+bedenegitimi+biyoloji+geometri+turkce+ingilizce)/8;
        System.out.println("Ortalamanız = "+ortalama);
        if (ortalama < 55) {
            System.out.println("Üzgünüz "+ad+" Sınıfta Kaldınız , Seneye Görüşmek Üzere! :( " +ortalama);
        }
        else{
            System.out.println("Tebrikler "+ad+" Sınıfı Geçtiniz :D "+ortalama);
        }
        if (ortalama >= 85) {
            System.out.println(ad + " adlı öğrenci üstün başarı göstererek takdir belgesi almaya hak kazanmıştır.");
        }
        else if (ortalama <85 && ortalama >= 70) {
            System.out.println(ad + " adlı öğrenci başarı göstererek teşekkür belgesi almaya hak kazanmıştır.");
        }
        else{
            System.out.println(ad + " adlı öğrenci malesef hiçbir belge almaya hak kazanamamıştır.");
        }
    }
}
