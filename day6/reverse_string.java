
class Main{
    public static void main(String[] args){
        String str="hello";
        char[] c=str.toCharArray();
        int l=0;
        int r=str.length()-1;
        while(l<r){
            char temp=c[l];
            c[l]=c[r];
            c[r]=temp;
            l++;
            r--;

        }
System.out.print(new String(c));
    }
}