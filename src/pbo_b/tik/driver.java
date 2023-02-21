package pbo_b.tik;
import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        Customer listCustomer[] = new Customer[10];
        Customer cust1 = new Customer();
        //admin account
        cust1.setEmail("1@gmail.com");
        cust1.setNama("admin1");
        cust1.setPassword("123");
        cust1.setAddress("bdg");
        int count = 0;
        listCustomer[count] = cust1;
        count++;
        
        // data product
        Product[] listProduct = new Product[4];
        Product p1 = new Product("Kebaya Merah", "L", 5, 500000);
        Product p2 = new Product("Batik Mega Mendung", "L", 10, 750000);
        Product p3 = new Product("Batik Mega Mendung", "M", 5, 700000);
        Product p4 = new Product("Kebaya Hijau", "L", 15, 650000);

        listProduct[0] = p1;
        listProduct[1] = p2;
        listProduct[2] = p3;
        listProduct[3] = p4;

        System.out.println("====Btik====");
        System.out.println("1. Register");
        System.out.println("2. Log in");
        System.out.println("0. Exit");
        System.out.print("Masukkan pilihan : ");

        int pilih = obj.nextInt();
        while (pilih !=0){
            //register
            if (pilih == 1){
                System.out.print("Name: ");
                String nama = obj.next();
                System.out.print("email: ");
                String email = obj.next();
                System.out.print("password: ");
                String password = obj.next();
                System.out.print("address: ");
                String address = obj.next();

                Register rgs1 = new Register();
                Customer result = rgs1.signUp(listCustomer, email, password, nama, address, count);

                if(result != null){
                    Scanner inp = new Scanner(System.in);
                    listCustomer[count++] = result;
                    System.out.println("REGISTER");
                    System.out.println("[Profile]");
                    System.out.println("Name    : " + result.getNama());
                    System.out.println("Email   : " + result.getEmail());
                    System.out.println("Password : " + result.getPassword());
                    System.out.println("Welcome new user " +result.getNama() + " !!!");
                    count++;
                    order(listProduct);
                    break;
                } 
                else{
                    System.out.println("Proses registrasi gagal");
                }
            }
            //login
            else if(pilih == 2){
                Scanner inp = new Scanner(System.in);
                System.out.println("LOGIN");
                System.out.print("email : ");
                String emailR = obj.next();
                System.out.print("password: ");
                String passwordR = obj.next();
                Login log = new Login();
                boolean hasil = log.ChekLogin(listCustomer, emailR, passwordR, count);
                Dashboard d = new Dashboard(listProduct);
                if (hasil == true){
                    order(listProduct);
                }
                while (hasil == false) {
                    System.out.println("LOGIN");
                    System.out.print("email : ");
                    emailR = obj.next();
                    System.out.print("password: ");
                    passwordR = obj.next();
                    hasil = log.ChekLogin(listCustomer, emailR, passwordR, count);
                    if (hasil == true){
                        order(listProduct);
                    }
                }
                break;
            }
            else{
                break;
            }
        }
    }
    
    public static void order(Product[] arr){
        Scanner inp = new Scanner(System.in);
        
        Dashboard d = new Dashboard(arr);
        d.viewDashboard();
        System.out.print("Nomor Barang yang akan di beli :");
        int chk = inp.nextInt();

        if (chk ==1){
            Checkout c = new Checkout(new Product[]{arr[0]});
            boolean hasil = c.viewCheckout();
            if (hasil == false){
                order(arr);
            }
            else{
                System.exit(0);
            }

        } else if (chk == 2) {
            Checkout c = new Checkout(new Product[]{arr[1]});
            boolean hasil = c.viewCheckout();
            if (hasil == false){
                order(arr);
            }
            else{
                System.exit(0);
            }
        }else if (chk == 3) {
            Checkout c = new Checkout(new Product[]{arr[2]});
            boolean hasil = c.viewCheckout();
            if (hasil == false){
                order(arr);
            }
            else{
                System.exit(0);
            }
        }
        else if (chk == 4) {
            Checkout c = new Checkout(new Product[]{arr[3]});
            boolean hasil = c.viewCheckout();
            if (hasil == false){
                order(arr);
            }
            else{
                System.exit(0);
            }
        }
    }
}
       
             
    

