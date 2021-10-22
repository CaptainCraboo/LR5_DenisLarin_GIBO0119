package ru.mirea.gibo01.pr5;

import java.util.Scanner;

public class GeometryTest {
    public double side;
    public static void main(String[] args) {
        Geometry title = Geometry.CIRCLE;
        PerSq var = new PerSq();
        Scanner sc = new Scanner(System.in); // номер фигуры
        Scanner sc1 = new Scanner(System.in); // радиус круга
        Scanner sc2 = new Scanner(System.in); // сторона квадрата
        Scanner sc3 = new Scanner(System.in); // длина прямоугольника
        Scanner sc4 = new Scanner(System.in); // ширина прямоугольника
        System.out.println("Введите радиус круга: ");
        double r = sc1.nextInt();
        System.out.println("Введите сторону квадрата: ");
        double s = sc2.nextInt();
        System.out.println("Введите длину прямоугольника: ");
        double rec1 = sc3.nextInt();
        System.out.println("Введите ширину прямоугольника: ");
        double rec2 = sc4.nextInt();
        System.out.println("Введите номер фигуры от 1 до 3, где 1 - это круг, 2 - квадрат, 3 - прямоугольник: ");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("Это: " + Geometry.CIRCLE);
            System.out.println("Периметр равен: " + var.getCirclePerimeter(r));
            System.out.println("Площадь равна: " + var.getCircleSq(r));
        }
        if (num == 2) {
            System.out.println("Это: " + Geometry.SQUARE);
            System.out.println("Перметр равен: " + var.getSquarePerimeter(s));
            System.out.println("Площадь равна: " + var.getSquareSq(s));
        }
        if (num == 3) {
            System.out.println("Это: " + Geometry.RECTANGLE);
            System.out.println("Перметр равен: " + var.getRectPerimeter(rec1, rec2));
            System.out.println("Площадь равна: " + var.getRectSquare(rec1, rec2));
        }

    }
}
