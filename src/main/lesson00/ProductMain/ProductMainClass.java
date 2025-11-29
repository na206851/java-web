package lesson00.ProductMain;

import java.util.Date;

public class ProductMainClass {

    public String nameProduct;
    public int requiredQuantity;   //требуемое количество
    public int quantityInStock;    //количество на складе
    public int productPrice;       //цена продукта
    public int sizeDiscount;       //размер скидки в рублях
    public String IDClient;       //индивидуальный номер клиента
    public String emailClient;     //электронная почта клиента
    public String phoneNumberClient;      //телефонный номер клиента
//    public Date dateDelivery;       //дата доставки клиенту

    public ProductMainClass() {
    }

    public ProductMainClass(String nameProduct, int requiredQuantity, int quantityInStock,
                            int productPrice, int sizeDiscount, int IDClient, String emailClient, int phoneNumberClient, Date dateDelivery) {
        this.nameProduct = nameProduct;
        this.requiredQuantity = requiredQuantity;
        this.quantityInStock = quantityInStock;
        this.productPrice = productPrice;
        this.sizeDiscount = sizeDiscount;
        this.IDClient = IDClient;
        this.emailClient = emailClient;
        this.phoneNumberClient = phoneNumberClient;
        this.dateDelivery = dateDelivery;

    }
}
