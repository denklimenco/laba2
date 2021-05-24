package com.lab2;
import java.util.Scanner;
// класс трёхмерной точки
public class Point3d {
    private double xCord; // координата X
    private double yCord; // координата Y
    private double zCord; // координата Z
    public Point3d(double x, double y, double z) { // конструктор инциализации
        xCord = x;
        yCord = y;
        zCord = z;
    }
    public Point3d() { this(0,0,0); } // конструктор по умолчанию
    public double getX() { return xCord; } // возвращение координаты X
    public double getY() { return yCord; } // возвращение координаты Y
    public double getZ() { return zCord; } // возвращение координаты Z
    public void setX (double val) { xCord = val; } // установка значения координаты X
    public void setY (double val) { yCord = val; } // установка значения координаты Y
    public void setZ (double val) { zCord = val; } // установка значения координаты Z
    public static boolean comparison(Point3d a, Point3d b) { // метод для сравнения значений двух объектов Point3d
        return (a.xCord == b.xCord && a.yCord == b.yCord && a.zCord == b.zCord);
    }
    public double distanceTo(Point3d a) { // метод для вычисления расстояния между двумя точками
        double dist = Math.sqrt((xCord - a.xCord) * (xCord - a.xCord) +
                (yCord - a.yCord) * (yCord - a.yCord) + (zCord - a.zCord) * (zCord - a.zCord)) * 100;
        dist = (int)dist;
        return dist / 100;
    }
    public static void main(String[] args) // основной метод
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 3 координаты: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double z1 = in.nextDouble();
        Point3d Point1 = new Point3d(x1,y1,z1); // создаем конструктором инициализации
        System.out.print("Введите 3 координаты: ");
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        z1 = in.nextDouble();
        Point3d Point2 = new Point3d(); // создаем конструктором по умолчанию
        Point2.setX(x1); Point2.setY(y1); Point2.setZ(z1); // устанавливаем значения с помощью методов
        System.out.println("(" + Point1.getX() + "," + Point1.getY() + "," + Point1.getZ() + ")"); // выводим первый объект
        System.out.println("(" + Point2.getX() + "," + Point2.getY() + "," + Point2.getZ() + ")"); // выводим второй объект
        if (comparison(Point1, Point2)) // проверка на равенство значений
            System.out.println("Значения объектов равны.");
        else System.out.println("Значения объектов НЕ равны.");
        System.out.println("Расстояние между объектами: " + Point1.distanceTo(Point2)); // вывод расстояния между точками
    }
}
