class Goods {

    public int count;
    public String name;
    public double price;
    public String description;
  
  
    public Goods(int count, String name, double price, String description) {
      this.count = count;
      this.name = name;
      this.price = price;
      this.description = description;
    }

    // public Goods(String name) {
    //     this.name = new ProxyName(name).getVal();
    // }

    public void print() {
        System.out.println(
            String.format(
                "%d %s %f %s",
                count,
                name,
                price,
                description));
      }
}
