public class Hello {

    public static void main(String[] args){
        System.out.println("Hello, Ayush");

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar){
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if(isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double myFirstVariable = 20.00;
        double mySecondVariable = 80.00;
        double myValuesTotal = (myFirstVariable + mySecondVariable) * 100.00;
        System.out.println("myValuesTotal = " + myValuesTotal);
        double remainder = myValuesTotal % 40.00;
        System.out.println("theRemainder = " + remainder);
        boolean isNoRemainder = (remainder == 0.00) ? true : false;
        System.out.println("isNoRemainder : " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }

}
