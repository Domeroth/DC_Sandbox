public class Sixth {


    public static void main(String[] args) {


        //for (float amount = 0.01f; amount <= 0.99f; amount += 0.01f) {
        for (float amountIncrement = 1f; amountIncrement <= 99f; amountIncrement += 1f) {
            //float amount = 0.37f;
            float amount = amountIncrement/100;
            System.out.println("Checking for " + amount);

            for (float f = 1; f <= 100; f++) {
                float floatDivision = f / amount;
                if (Math.round(floatDivision) == floatDivision) {
                    String string = String.format("Number %.2f is divisible by %.2f, the amount has to be paid %.2f times.",
                            f, amount, floatDivision);
                    System.out.println(string);
                }
            }
        }
    }
}

