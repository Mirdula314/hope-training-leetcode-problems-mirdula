class Main{
    public static void main(String[] args){
   String str="hello123@#";
   int alpha=0;
   int num=0;
   int special=0;
   for(int i=0;i<str.length();i++){
       char ch=str.charAt(i);
       if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
           alpha++;
       }
       else if(ch>='0' && ch<='9'){
           num++;
       }
       else special++;

   }
   System.out.print(alpha+" "+num+" "+special);

    }
}
