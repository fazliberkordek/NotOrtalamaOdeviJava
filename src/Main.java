import  java.util.Scanner;
public class Main {
    
    /**
     * @author  Fazlı Berk Ördek -- 20 Mart 2023
     */
    public static void main(String[] args) {

        /*TODO: Java ile not Ortalaması hESAPLAYAN program:
                Java ile Matematik,Fizik,Kimya,Türkçe,Tarih,Müzik
                derslerinin sınav puanlarını kullanıcıdan alan ve
                ortalamalarını hesaplayıp ekrana bastırılan
                programı yazınız.
                -Dersler değişken olacak
                -Alınacak derslerin notlar tam sayı olmalı
                -Ortalam ondalıklı olacaktır.
                -Kullanıcıdan alınan değerler her zaman int olmalı.
        */

        //Scanner sınıfı tanımlandı:
        Scanner input = new Scanner(System.in);

        //Değişkenleri tanımlandı:
        int mat,fizik,kimya,turkce,tarih,muzik,sınırNot=60;
        double ort;

        System.out.print("Matematik Not Giriniz:");
        mat = input.nextInt();

        System.out.print("Fizik Not Giriniz:");
        fizik = input.nextInt();

        System.out.print("Kimya Not Giriniz:");
        kimya = input.nextInt();

        System.out.print("Türkçe Not Giriniz:");
        turkce = input.nextInt();

        System.out.print("Tarih Not Giriniz:");
        tarih = input.nextInt();

        System.out.print("Müzşk Not Giriniz:");
        muzik = input.nextInt();

        //Kulaanıcılardan notlar alındı: Şimdi ortolama hesaplanmalı.

        ort = (mat + fizik + kimya + turkce + tarih + muzik);
        ort/=6;
        boolean result = ort >= sınırNot;
        String str = result? "Sınıfı Geçti":"Sınıfta Kaldı";

        System.out.print("Ortalama:" + ort + "Geçme Durumu:" + str);





    }
}