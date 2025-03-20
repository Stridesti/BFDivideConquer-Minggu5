import java.util.Scanner;;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah elemen: ");
        int elemen = input.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i=0;i<elemen;i++){
            System.out.print("Masukkan nilai basis elemen ke-"+(i+1)+": ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat(basis, pangkat);
        }

        System.out.println("Hasil Pangkat BRUTEFORCE: ");
        for (Pangkat p : png) {
            System.out.println(p.nilai+"^"+p.Pangkat+": "+p.pangkatBF(p.nilai, p.Pangkat));
        }
        System.out.println("Hasil Pangkat DIVIDE AND CONQUER: ");
        for (Pangkat p : png) {
            System.out.println(p.nilai+"^"+p.Pangkat+": "+p.pangkatDC(p.nilai, p.Pangkat));
        }

        input.close();
    }
}
