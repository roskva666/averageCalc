import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //DEĞİŞKENLER
        int mat, fizik, kimya, muzik, turkce;

        //GİRDİLER

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        mat = input.nextInt();
        if ((mat > 100) || (mat < 0)) {
            mat = 0;
        }

        System.out.print("Türkçe Notunuz:");
        turkce = input.nextInt();
        if ((turkce < 0) || (turkce > 100)) {
            turkce = 0;
        }

        System.out.print("Fizik Notunuz:");
        fizik = input.nextInt();
        if ((fizik < 0) || (fizik > 100)) {
            fizik = 0;
        }

        System.out.print("Kimya Notunuz:");
        kimya = input.nextInt();
        if ((kimya < 0) || (kimya > 100)) {
            kimya = 0;
        }

        System.out.print("Müzik Notunuz:");
        muzik = input.nextInt();
        if ((muzik < 0) || (muzik > 100)) {
            muzik = 0;
        }


        //HESAPLAMALAR

        double average = (mat + fizik + kimya + turkce + muzik) / 5;


        //ÇIKTILAR

        if (average >= 55) {
            System.out.println("Sınıfı Geçtiniz, Tebrikler!");
            System.out.println("Ortalamanız: " + average);

        } else {
            System.out.println("Sınıfı Geçemediniz.");
            System.out.println("Ortalamanız: " + average);

        }

    }

}
