package ClassBoxDataValidation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double length = readLine(bufferedReader);
        double width = readLine(bufferedReader);
        double height = readLine(bufferedReader);

        try {
            Box box = new Box(length, width, height);
            System.out.printf("Surface Area - %.2f%n", box.calculateSurfaceArea());
            System.out.printf("Lateral Surface Area - %.2f%n", box.calculateLateralSurfaceArea());
            System.out.printf("Volume - %.2f%n", box.calculateVolume());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

    }

    private static double readLine(BufferedReader bufferedReader) throws IOException {
        return Double.parseDouble(bufferedReader.readLine());
    }
}
