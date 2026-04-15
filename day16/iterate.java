import java.util.*;
public class Main {
    public static void main(String[] args){
       List<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(11);
        list.add(12);
        ListIterator<Integer> it=list.listIterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
        while(it.hasPrevious()){
            System.out.print(it.previous());
        }


    }}