interface Mom {
    void hs();
}
interface Dad {
    void business();
}
class child implements Mom,Dad{
    public void hs(){
        System.out.print("study higher studies");
    }
    public void business(){
        System.out.print("do business");
    }

}


public class Main{
    public static void main(String[] args) {
        child c = new child();
        c.hs();
        c.business();

    }
}
