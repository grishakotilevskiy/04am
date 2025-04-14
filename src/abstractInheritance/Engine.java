package abstractInheritance;

public class Engine {
    void start(){
        System.out.println("Engine start");
    }
}
class Car{
    Engine engine;
 Car(){
    engine = new Engine();
 }

 void start(){
     engine.start();
     System.out.println("car start");
 }

}
class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }
}

class Square {
    private Point point;      // HAS-A — Square має Point
    private double side;

    public Square(int x, int y, double side) {
        this.point = new Point(x, y); // створюємо точку
        this.side = side;
    }

    public void printInfo() {
        System.out.println("Square at (" + point.getX() + ", " + point.getY() + "), side: " + side);
    }
}

class TestCar{
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.engine = new Engine();
        Square square = new Square(74, 38, 26);
        square.printInfo();
    }

}

