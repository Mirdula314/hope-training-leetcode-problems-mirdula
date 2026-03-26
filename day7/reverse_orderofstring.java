import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s="";
        String word="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                word=word+ch;
            }
            else{
                s=word+" "+s;
                word="";
            }
        }
        s=word+" "+s;
        System.out.print(s);
    }
}