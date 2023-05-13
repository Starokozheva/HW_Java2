package Exercise3;

public class Converter {

    public static void main(String[] args) {

        double euroAmount = 100.00;
        double exchangeRate = 1.09;

        double usdAmount = convertEuroToUsd(euroAmount, exchangeRate);

        System.out.println(euroAmount + " евро = " + usdAmount + " долларов США");

    }

    public static double convertEuroToUsd(double euroAmount, double exchageRate) {
        return euroAmount * exchageRate;
    }
}
