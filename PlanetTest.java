package ru.mirea.gibo01.pr5;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class PlanetTest {
    public static void main(String[] args) {
        Planet planet = Planet.EARTH;
        System.out.println("Каков ваш вес");
        Scanner sc = new Scanner(System.in);
        int ves=sc.nextInt();
        double mas=ves/planet.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("Your weight on %s is %f%n",
                    p, p.surfaceWeight(mas));
        DecimalFormat fmt=new DecimalFormat("#.##");
        for (Planet p : Planet.values()) System.out.println("Ваш вес на планете: "+p+" "+fmt.format(p.surfaceWeight(mas)));

    }
}
