public class cart {
    private Integer customerId  ;
    private Integer nproducts  ;
    private product [] products ;
    public cart(Integer customerId, Integer nproducts, product[] products) {
        this.customerId = Math.abs(customerId);
        this.nproducts = Math.abs(nproducts);
        this.products = products;
    }
    public Integer getCustomerId() {
        return customerId;
    }

    public Integer getNproducts() {
        return nproducts;
    }

    public product[] getProducts() {
        return products;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = Math.abs(customerId);
    }

    public void setNproducts(Integer nproducts) {
        this.nproducts = Math.abs(nproducts);
    }

    public void setProducts(product[] products) {
        this.products = products;
    }
    public void addProduct(product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
    }
    public void removeProduct(product xproduct) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].equals(xproduct)) {
                products[i] = null;
                System.out.println("removed product from cart: " + xproduct.getName());
                return; }}
        System.out.println("product is not there : " + xproduct.getName());
    }
    public double getPrice(){
        double total=0;
        for (int i = 0; i < products.length; i++) {
            total = total + products[i].getPrice();
        }
        return total;
    }

}
