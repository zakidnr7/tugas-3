package praktikum3;

import java.util.Scanner;

class Baju {
    String bahan;
    int harga;
    int jumlah;

    public Baju (String bahanBaju, int jumlahBaju){
        this.bahan = bahanBaju;
        this.jumlah = jumlahBaju;
    }
        
    final int bajuBahanA = 100000;
    final int bajuBahanB = 125000;
    final int bajuBahanC = 175000;
    
    void hargaBajuA(){
        if (jumlah > 100) {
            harga = 95000;
        } else {
            harga = bajuBahanA;
        }
    }
    
    void hargaBajuB(){
        if (jumlah > 100) {
            harga = 120000;
        } else {
            harga = bajuBahanB;
        }
    }
    
    void hargaBajuC(){
        if (jumlah > 100) {
            harga = 160000;
        } else {
            harga = bajuBahanC;
        }
    }
    
    void display(){
    if (bahan.equalsIgnoreCase("a"))
        hargaBajuA();
    else if (bahan.equalsIgnoreCase("b"))
        hargaBajuB();
    else if (bahan.equalsIgnoreCase("c"))
        hargaBajuC();
    
        System.out.println("Jenis Baju Yang Anda Beli\t: " + bahan);
        System.out.println("Harga Per Buah\t\t\t: " + harga);
        System.out.println("Total Harga Keseluruhan\t\t: " + harga * jumlah);
    } 
    
}

public class Praktikum3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Baju Yang Tersedia Di Toko Erigo : ");
        System.out.print("**************************************************\n");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
        
        System.out.print("**************************************************\n");
        System.out.print("Baju yang akan anda beli bertipe \t: ");
        String bahan = scan.next().toLowerCase();

        System.out.print("Jumlah baju yang akan anda beli adalah  : " );
        int jumlah = scan.nextInt();
      
        Baju JualBaju = new Baju (bahan, jumlah);
        JualBaju.display();
        System.out.print("===================================================");
        System.out.println();
        
    }
    
}
