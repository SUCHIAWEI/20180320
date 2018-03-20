public class Main {

    public static void main(String[] args) {
        invoice inv = new invoice();
        product prods[]=new product[3];

            prods[0]= new product("綠茶",20,1);
            prods[1]= new product("紅茶",21,2);
            prods[2]= new product("烏龍茶",21.5f,3);
        inv.showInto();
        System.out.println("商品"+"\t"+"價格"+"\t"+"數量"+"\t");
            for (int i =0;i<3 ;i++){
            prods[i].showInto();}




    }


}

