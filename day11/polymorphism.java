class Amazon{
    void search(String product){
        System.out.println("product: "+product);
    }
    void search(String product,int price){
        System.out.println("product: "+product+"price: "+price);

    }
    void search(String product,String electronics){
        System.out.println("product: "+product+"electronics: "+electronics);
    }
}

public class Main{
    public static void main(String[] args) {
        Amazon a= new Amazon();
        a.search("laptop");
        a.search("laptop",500000);
        a.search("laptop","electronics");
    }
}