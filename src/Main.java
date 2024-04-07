//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
// mat fiz kim biyo tar mzk derslerinin sınav puanlarını
// kullanıcıdan alan ve ortalamalarını bastıran programı yazın
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int fiz,kim,mat,trh,mzk,trk;
        System.out.println("Fizik notunu giriniz>");
        fiz= scan.nextInt();
        System.out.println("Kimya notunu giriniz>");
        kim= scan.nextInt();
        System.out.println("Matematik notunu giriniz>");
        mat= scan.nextInt();
        System.out.println("Türkçe notunu giriniz>");
        trk=scan.nextInt();
        System.out.println("Müzik notunu giriniz>");
        mzk= scan.nextInt();
        System.out.println("Tarih notunu giriniz>");
        trh= scan.nextInt();
        int toplam=(fiz+kim+mat+trh+mzk+trk);
        int ort=toplam/6 ;
        System.out.println("Ortalama>"+ort);
        String sonuc= (ort>=60)?("Sınıfı geçti"):("Sınıfta kaldı");
        System.out.println(sonuc);


    }
}