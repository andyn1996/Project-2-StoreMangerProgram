public interface IReceiptBuilder {

    public void appendHeader(String header);
    public void appendCustomer(CustomerModel customer);
    public void appendProduct(ProductModel product);
    public void appendPurchase(PurchaseModel purchase);
    public void appendFooter(String footer);

    //Thank You For Shopping With Us!

    public String toString();

}
