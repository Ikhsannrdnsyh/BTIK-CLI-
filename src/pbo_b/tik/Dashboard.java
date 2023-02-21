package pbo_b.tik;

/**
 *
 * @author Raffifhzq
 */
public class Dashboard{
    private Product[] listProduct;

    public Dashboard(Product[] listProduct){
        this.listProduct = listProduct ;
    }


    public void viewDashboard(){
        System.out.println("");
        System.out.println("======DASHBOARD======");
        System.out.println("warning : tekan 0 untuk keluar aplikasi");

        int i = 0;
        while (i < listProduct.length) {
            System.out.println(i+1);
            System.out.println("Name : " + listProduct[i].getNameProduct());
            System.out.println("Size : " + listProduct[i].getSize());
            System.out.println("Quantity : " + listProduct[i].getQuantity());
            System.out.println("Price : " + listProduct[i].getPrice());
            System.out.println(" ");
            i+=1;
        }
    }

    public Product[] getListProduct() {
        return listProduct;
    }

}


