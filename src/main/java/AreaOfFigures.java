import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваю длину стороны квадрата от пользователя
        System.out.println("Введите длину стороны квадрата:");
        double squareSide = scanner.nextDouble();
        double squareArea = calculateSquareArea(squareSide);
        System.out.println("Площадь квадрата: " + squareArea);

        // Запрашиваю радиус круга от пользователя
        System.out.println("Введите радиус круга:");
        double circleRadius = scanner.nextDouble();
        double circleArea = calculateCircleArea(circleRadius);
        System.out.println("Площадь круга: " + circleArea);

        // Запрашиваю длины сторон треугольника от пользователя
        System.out.println("Введите длину первой стороны треугольника:");
        double triangleSide1 = scanner.nextDouble();
        System.out.println("Введите длину второй стороны треугольника:");
        double triangleSide2 = scanner.nextDouble();
        System.out.println("Введите длину третьей стороны треугольника:");
        double triangleSide3 = scanner.nextDouble();
        double triangleArea = calculateTriangleArea(triangleSide1, triangleSide2, triangleSide3);
        System.out.println("Площадь треугольника: " + triangleArea);
    }

    // Функция для расчета площади квадрата
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    // Функция для расчета площади круга
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Функция для расчета площади треугольника с использованием формулы Герона
    public static double calculateTriangleArea(double side1, double side2, double side3) {
        double semiPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }
}





