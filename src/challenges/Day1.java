package challenges;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner in = new Scanner(System.in);

        int intVar = in.nextInt();
        double doubleVar = in.nextDouble();
        in.nextLine();
        String stringVar = in.nextLine();

        System.out.println(i + intVar);

        DecimalFormat df = new DecimalFormat("#.0");
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println(df.format(d + doubleVar));

        System.out.println(s + stringVar);
    }
}
