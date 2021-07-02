package by.epam.training_center.part2;

import by.epam.training_center.part2.beans.task3.Country;
import by.epam.training_center.part2.beans.task3.District;
import by.epam.training_center.part2.beans.task3.Region;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Aggregation and composition
 */
public final class Task3 {
    public static Country solution() {
        Region region1 = regionFromFile(REGION1_FILE_PATH);
        Region region2 = regionFromFile(REGION2_FILE_PATH);
        Region region3 = regionFromFile(REGION3_FILE_PATH);
        Region region4 = regionFromFile(REGION4_FILE_PATH);
        Region region5 = regionFromFile(REGION5_FILE_PATH);
        Region region6 = regionFromFile(REGION6_FILE_PATH);

        Country rb = new Country(region5.getCenter());
        rb.add(region1);
        rb.add(region2);
        rb.add(region3);
        rb.add(region4);
        rb.add(region5);
        rb.add(region6);

        System.out.println(rb);
        return rb;
    }

    private static Region regionFromFile(String filename) {
        Region region = new Region();

        try (Scanner sc = new Scanner(new FileReader(filename))) {
            sc.findAll(REGEX).forEach(mr -> {
                String city = mr.group(1);
                double area = Double.parseDouble(mr.group(2));
                District district = new District(city, area);
                region.add(district);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        return region;
    }

    private static final String REGEX = "#(.+)#(\\d+.\\d+)";
    private static final String REGION1_FILE_PATH = "src\\part2\\input\\region1.txt";
    private static final String REGION2_FILE_PATH = "src\\part2\\input\\region2.txt";
    private static final String REGION3_FILE_PATH = "src\\part2\\input\\region3.txt";
    private static final String REGION4_FILE_PATH = "src\\part2\\input\\region4.txt";
    private static final String REGION5_FILE_PATH = "src\\part2\\input\\region5.txt";
    private static final String REGION6_FILE_PATH = "src\\part2\\input\\region6.txt";
}
