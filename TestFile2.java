import java.util.Scanner;

class TestFile2{
    public static void main(String[] args) {
        String newStr = new String();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name >> ");
        newStr = scan.next();

        System.out.println(newStr);
    }
}