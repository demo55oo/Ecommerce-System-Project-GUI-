public class order {
    private  Integer customerId;
    private  Integer orderId ;
    product[] products ;
    float totalprice ;
    public order(Integer customerId, Integer orderId, product[] products, float totalprice) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalprice = Math.abs(totalprice);
    }
    public Integer getCustomerId() {
        return customerId;
    }

    public product[] getProducts() {
        return products;
    }

    public float getTotalprice() {
        return totalprice;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = Math.abs(customerId);
    }

    public void setProducts(product[] products) {
        this.products = products;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = Math.abs(orderId);
    }

    public void setTotalprice(float totalprice) {
        this.totalprice = Math.abs(totalprice);
    }
    public void printorderinfo() {
        System.out.println("order id : " + orderId);
        System.out.println("customer id: " + customerId);
        System.out.println("products:");
        for (product product : products) {
            System.out.println("name: " + product.getName());
            System.out.println("price: $" + product.getPrice());
        }
        System.out.println("total Price: $" + totalprice);
    }
}
