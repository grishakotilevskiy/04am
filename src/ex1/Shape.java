package ex1;

public abstract class Shape {

protected String name;

public Shape(String name) {
    this.name = name;
}

public double getArea() {
    return 0;
}

public abstract double calculateArea();

public String getName() {
    return name;
}

}


class Rectangle extends Shape {
    String name;
    int width;
    int height;
    public Rectangle(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;

    }
    public double calculateArea(){
 return width *  height;
    }
}

class Circle extends Shape {
    private double radius;
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        return  Math.PI * Math.pow(radius, 2);
    }

}

class Shapedemo{
    public static void main(String[] args) {


Shape[]shapes = new Shape [3];

shapes[0] = new Circle("grisha", 2);
shapes[1] = new Rectangle("grish2a", 3, 4);
shapes[2] = new Rectangle("grish3", 5, 6);

for(Shape shape : shapes) {
    System.out.println("Area of circle:" + shape.calculateArea() + "  is  " + shape.getName());
}
    }
}
