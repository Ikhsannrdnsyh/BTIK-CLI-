package pbo_b.tik;
import java.util.Scanner;

public class Checkout {
    private Product[] product;

    public Checkout(Product[] product) {
        this.product = product;
    }

    public boolean viewCheckout(){
        Scanner sc = new Scanner(System.in);
        System.out.println("====Checkout====");
        for (int i = 0;i<product.length;i++){
            System.out.println("Name     : " + product[i].getNameProduct());
            System.out.println("Size     : " + product[i].getSize());
            System.out.print("Quantity : " );
            int inp = sc.nextInt();
            System.out.println("TOTAL    : " + product[i].getPrice() * inp);
            int total = product[i].getPrice() * inp;
            System.out.println("");
            System.out.println("====Pembayaran====");
            System.out.println("TOTAL : Rp"+total);
            System.out.println("Transfer : 7751261971(BCA)");
            System.out.println("a.n MOCHAMAD IKHSAN NURDIANSYAH");
            System.out.println("Upload Bukti Transaksi:");
            System.out.println("Apakah sudah Tranfer? : 1.Yes || 2.No");
            int p = sc.nextInt();
            if(p ==1){
                System.out.println("TRANSAKSI DITERIMA,TERIMAKASIH");
                return true;
            }else if(p == 2){
                System.out.println("TRANSAKSI GAGAL");
                return false;
            }
        }
        return true;
    }
}






