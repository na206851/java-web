package lesson00.ProductMain;

public class ProductMainClass {

    public String nameProduct;
    public int requiredQuantity;   //требуемое количество
    public int quantityInStock;    //количество на складе
    public int productPrice;       //цена продукта
    public int sizeDiscount;       //размер скидки в рублях
    public String IDClient;       //индивидуальный номер клиента
    public String emailClient;     //электронная почта клиента
    public String phoneNumberClient;      //телефонный номер клиента
    public String dateDelivery;       //дата доставки клиенту

    public ProductMainClass(String nameProduct, int requiredQuantity, int quantityInStock,
                            int productPrice, int sizeDiscount, String IDClient, String emailClient, String phoneNumberClient, String dateDelivery) {
        this.nameProduct = nameProduct; //название продукта
        this.requiredQuantity = requiredQuantity;   //требуемое количество
        this.quantityInStock = quantityInStock;     //количество на складе
        this.productPrice = productPrice;           //цена товара
        this.sizeDiscount = sizeDiscount;           //размер скидке
        this.IDClient = IDClient;                   //имя клиента
        this.emailClient = emailClient;             //электронная почта клиента
        this.phoneNumberClient = phoneNumberClient; //номер телефона клиента
        this.dateDelivery = dateDelivery;           //дата доставки клиенту
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setRequiredQuantity(int requiredQuantity) {
        this.requiredQuantity = requiredQuantity;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public void setSizeDiscount(int sizeDiscount) {
        this.sizeDiscount = sizeDiscount;
    }

    public void setIDClient(String IDClient) {
        this.IDClient = IDClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public void setPhoneNumberClient(String phoneNumberClient) {
        this.phoneNumberClient = phoneNumberClient;
    }

    public void setDateDelivery(String dateDelivery) {
        this.dateDelivery = dateDelivery;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getRequiredQuantity() {
        return requiredQuantity;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public int getSizeDiscount() {
        return sizeDiscount;
    }

    public String getIDClient() {
        return IDClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public String getPhoneNumberClient() {
        return phoneNumberClient;
    }

    public String getDateDelivery() {
        return dateDelivery;
    }

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
