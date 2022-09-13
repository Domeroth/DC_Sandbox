import java.util.Scanner;

public class Third {
    int x;

    public Third(int y) {
        x=y;
    }

    static class OuterClass {
        int x = 10;
        class InnerClass {
            int y = 5;
        }
    }

    public static void main(String[] args) {
        Third myObj = new Third(5);
        System.out.println(myObj.x);
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj2.nextLine();
        System.out.println("Username is: " + userName);
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);

    }


}
