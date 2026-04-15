import java.util.*;
public class Main {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        System.out.print("add");
        list.add(11);
        list.add(19);
        list.add(18);
        list.add(11);
        System.out.print(list+"\n");
        System.out.print("remove");
        list.remove(2);
        System.out.print(list+"\n");
        System.out.print("access");
        System.out.print(list.get(3)+"\n");
        System.out.print("update");
        list.set(2,14);
        System.out.print(list+"\n");
        System.out.print("travel");
        for(int x:list){
            System.out.print(x+" ");
        }


    }}