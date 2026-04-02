class Amazon{
    void delivery(){
        System.out.println("delivery");
    }
}
class std extends Amazon{
    void delivery(){
        System.out.println("delivery in 10 days");
    }

}
class express extends Amazon{
    void delivery(){
        System.out.println("delivery in 2 days");
    }

}
class prime extends Amazon{
    void delivery(){
        System.out.println("delivery in 24 hours");
    }

}

public class Main{
    public static void main(String[] args) {
        Amazon a= new Amazon();
        a=new std();
        a.delivery();
        a=new prime();
        a.delivery();
        a=new express();
        a.delivery();

    }
}