public class product {
    private String  name;
    private float price;
    private int amount;
    public  product (String name1 ,float price1 , int amount1 ){
        name = name1;
        price = price1;
        amount = amount1;
    }
    public void  showInto(){

        System.out.println(this.name+"\t"+this.price+"\t"+this.amount);
    }
}
