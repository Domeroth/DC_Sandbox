public class Main {
    int x  =5;
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    static void myName(String fname, int age){
        System.out.println("My name is: " + fname + " and my age is: " + age + ".");
    }

    static int myAddition(int x) {
        return x + 5;
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    static int plusMethod(int x, int y) {
        return x + y;
    }
    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {

        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

        String[] cars = {"Volvo", "Toyota", "Ford"};
        cars[0] = "Opel";
        System.out.println(cars[0]);

        System.out.println(cars.length);

        myMethod();
        myName("John", 20);
        myName("Bob", 32);

        int z = myAddition(3);
        System.out.println(z);

        checkAge(20);
//        String txt = "We are the so-called \"Vikings\" from the north.";
//        System.out.println(txt);
//
//        System.out.println(Math.max(5,10));
//        System.out.println(Math.min(5,10));
//        System.out.println(Math.sqrt(6561));
//        System.out.println(Math.abs(-4.7));
//        int randomNum = (int)(Math.random() * 101);
//        System.out.println(randomNum);
//
//        System.out.println(10>9);
//
//        int x =20,   y= 18;
//        if (x>y) {
//            System.out.println("x is greater than y.");
//        }
//
//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }
//
//        int j = 0;
//        do {
//            System.out.println(j);
//            j++;
//        }
//        while (j<5);
//

//        String firstNa1me = "John";
//        String lastName = "Doe";
//        System.out.println("Hello " + firstName +  " " + lastName);
//        int x = 10, y = 9, z = 14;
//        int p, q;
//        p = q = 50;
//        System.out.println(x + y);
//        System.out.println(p + q);
//        long myNum = 150111222L;
//        System.out.println(myNum);
//        float myFloat = 5.75f;
//        System.out.println(myFloat);
//        double myDouble = 6.31d;
//        System.out.println(myDouble/myFloat);
//
//        float f1 = 35e3f;
//        double d1 = 12E4d;
//        System.out.println(f1);
//        System.out.println(d1);
//
//        boolean isJavaFun = true;
//        boolean isFishTasty = false;
//        System.out.println(isJavaFun);
//        System.out.println(isFishTasty);
//
//        char myGrade = 'B';
//        System.out.println(myGrade);
//        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
//        System.out.println(myVar1 + " "  + myVar2 + " " + myVar3);
//
//
//        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        System.out.println("The length of the txt string is: " + txt.length());
//        System.out.println(txt.toUpperCase());
//        System.out.println(txt.toLowerCase());
//
//        String txt2 = "Please locate where 'locate' occurs!";
//        System.out.println(txt2.indexOf("locate")); // Outputs 7
    }

}