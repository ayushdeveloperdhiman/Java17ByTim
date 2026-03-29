public class Main {

    public static void main(String[] args) {

        System.out.println("5ft, 8in = " + convertToCentimeters(5,8) + " cm");
        System.out.println("68 in = " + convertToCentimeters(68) + " cm");
    }

    public static double convertToCentimeters(int heightInInches) {

        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches) {

//        return convertToCentimeters((heightInFeet * 12) + remainingHeightInInches);

        int feetToInches = heightInFeet * 12;
        int totalInches = feetToInches + remainingHeightInInches;
        double result = convertToCentimeters(totalInches);
        return result;
    }
}
