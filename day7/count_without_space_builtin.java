import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.trim();

        if (str.isEmpty()) {
            System.out.print(0);
        } else {
            String[] a = str.split("\\s+");
            System.out.print(a.length);
        }
    }
}