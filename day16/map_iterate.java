import java.util.*;
public class Main {
    public static void main(String[] args){
       Map<Integer,String> map=new HashMap<>();
       map.put(1,"A");
        map.put(2,"S");
        map.put(3,"C");
        for(Map.Entry<Integer,String> e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
       for(Integer a:map.keySet()){
           System.out.println(map.get(a));
       }
        for(Integer a:map.keySet()){
            System.out.println(a);
        }



    }}