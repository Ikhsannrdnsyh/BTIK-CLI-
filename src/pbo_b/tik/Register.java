package pbo_b.tik;

public class Register {
    private final Customer newCustomer = new Customer();
    
    public Customer signUp(Customer[] registeredCust, String email, String password, String nama, String address, int countCustomer){
        if(!email.isEmpty() && !password.isEmpty() && !nama.isEmpty() && !address.isEmpty()){
            for(Customer cust: registeredCust){
                if(cust.getEmail().contains("@")){
                    if(!cust.getEmail().equals(email)){
                        newCustomer.setEmail(email);
                        newCustomer.setPassword(password);
                        newCustomer.setNama(nama);
                        newCustomer.setAddress(address);
                        return newCustomer;
                    } 
                    else{
                        System.out.println("Email sudah terdaftar");
                    }
                } 
                else {
                    System.out.println("Email tidak valid");
                }
            }
        } 
        else{
            System.out.println("Semua field tidak boleh kosong");
        }  
        
        for (int i = 0; i < countCustomer; i++){
            if (registeredCust[i].getPassword().equals(password)){
                System.out.println("Password sudah terdaftar");
            }
        }
        return null;
    }  
}


