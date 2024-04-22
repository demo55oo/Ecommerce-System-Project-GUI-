public class customer {
  private Integer customerId ;
  private  String name ;

  private String address ;

  public customer(Integer customerId, String name, String address) {
    this.customerId = Math.abs(customerId);
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public Integer getCustomeId() {
    return customerId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setCustomeId(Integer customeId) {
    this.customerId = Math.abs(customeId);
  }


}
