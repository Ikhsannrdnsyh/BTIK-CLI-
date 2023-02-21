package pbo_b.tik;

public class Login{
    public boolean ChekLogin(Customer[] loginAr, String email, String password, int countCustomer){
        String status = "";
        for (int i = 0; i < countCustomer; i++){
            if(!loginAr[i].getEmail().equals(email)) {
                System.out.println("Email tidak terdaftar");
                return false;
            }
            if(!loginAr[i].getPassword().equals(password)){
                System.out.println("Password anda salah");
                return false;
            }
            else if (loginAr[i].getEmail().equals(email) && loginAr[i].getPassword().equals(password)){
                System.out.println("Selamat Anda Berhasil Login");
                return true;
            }
        }
        System.out.println(status);
        return false;
    }
}

