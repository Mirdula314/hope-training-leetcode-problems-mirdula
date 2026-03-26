class Main{
    public static void main(String[] args){
        String str="   hi  helloo  bye";
        boolean flag=true;
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                if(flag){
                count++;
                flag=false;}
            }
            else flag=true;
        }
        System.out.print(count);

    }
}
