package ru.mirea.gibo01.pr5;

public class PerSq {
    public double radius;

    public double getCirclePerimeter(double radius) {
        return Math.PI * radius * 2;
    }
    public double getCircleSq(double radius) {
        return Math.PI * Math.pow(radius,2);
    }

    public double sqSide;

    public double getSquarePerimeter(double sqSide) {
        return sqSide * 4;
    }

    public double getSquareSq(double sqSide) {
        return sqSide * sqSide;
    }

    public double rectSide1;
    public double rectSide2;
    public double getRectPerimeter(double rectSide1, double rectSide2) {
        return rectSide1 + rectSide2;
    }
    public double getRectSquare(double rectSide1, double rectSide2) {
        return rectSide1 * rectSide2;
    }
}
