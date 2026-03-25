
class Main{
    public static void main(String[] args){
   String str="madamm";
   int v=0;
   int c=0;
   for(int i=0;i<str.length();i++){
       char ch=str.charAt(i);
       if(ch>='a' && ch<='z'){
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
               v++;
           }
           else c++;
       }

   }
   System.out.print(v+" "+c);

    }
}
