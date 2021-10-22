package ru.mirea.gibo01.pr5;

public enum Geometry {
    CIRCLE ("Круг"),
    SQUARE ("Квадрат"),
    RECTANGLE ("Прямоугольник");

    public String title;

    Geometry(String title) {
        this.title = title;
    }

    public String getTitle(int num) {
        return title;
    }
}


