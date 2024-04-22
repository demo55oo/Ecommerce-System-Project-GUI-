class product{
    private Integer product_id ;
    private String name ;
    private Float Price ;

    public product(Integer product_id, String name, Float price) {
        this.product_id = Math.abs(product_id);
        this.name = name;
        this.Price = Math.abs(price);
    }
    public void setPrice(Float price) {
        Price = Math.abs(price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = Math.abs(product_id);
    }

    public String getName() {
        return name;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public Float getPrice() {
        return Price;
    }
}
class ElectronicProduct extends product{
    private String brand ;
    private Integer warrantyPeriod ;


    public ElectronicProduct(Integer product_id, String name, Float price, String brand, Integer warrantyPeriod) {
        super(product_id, name, price);
        this.brand = brand;
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarrantyPeriod(Integer warrantyPeriod) {
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }

    public Integer getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }
}
class ClothingProduct extends product {
    private String size  ;
    private String fabric;


    public ClothingProduct(Integer product_id, String name, Float price, String size, String fabric) {
        super(product_id, name, price);
        this.size = size;
        this.fabric = fabric;
    }
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public String getSize() {
        return size;
    }
}
class BookProduct extends product{
    private String author ;
    private String publisher ;

    public BookProduct(Integer product_id, String name, Float price, String author, String publisher) {
        super(product_id, name, price);
        this.author = author;
        this.publisher = publisher;
    }
    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}

