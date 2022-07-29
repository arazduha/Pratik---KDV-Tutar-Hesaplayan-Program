import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        //degiskenler
        double fiyat, sn;
        //scanner tanımı
        Scanner inp = new Scanner(System.in);

        System.out.print("fiyat giriniz:");
        fiyat = inp.nextDouble();
        System.out.println(fiyat);

        //karşılaştırma
        sn = (1000>fiyat) ? fiyat*18/100 : fiyat*8/100;
        String snm =(1000>fiyat) ? " **KDV 18% olarak hesaplandi" : " **KDV 8% olarak hesaplandi";
        Double fl = sn + fiyat;

        System.out.println("KDV'siz fiyat " + fiyat);
        System.out.println("KDV tutari= " + sn + snm);
        System.out.println("KDV'li fiyat= " + fl);
    }
}
