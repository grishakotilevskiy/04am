package hw7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
    private String name;
    private String group;
    private int course;
    private ArrayList<Integer> grades;

    static  ArrayList<Student> students = new ArrayList<Student>();

    public Student(String name, String group, int course, ArrayList<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;

        students.add(this);
    }
    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }
    public double getAverageGrade() {
        if (grades == null || grades.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public static void processStudents() {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getAverageGrade() < 3) {
                iterator.remove();
            } else {
                s.course++;
            }
        }
    }

    public static void printStudents(int course) {
        for (Student s : Student.students) {
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }



}

public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Integer> grades1 = new ArrayList<>();
        grades1.add(4);
        grades1.add(5);
        grades1.add(3);

        ArrayList<Integer> grades2 = new ArrayList<>();
        grades2.add(2);
        grades2.add(2);
        grades2.add(3);

        ArrayList<Integer> grades3 = new ArrayList<>();
        grades3.add(3);
        grades3.add(3);
        grades3.add(4);

        new Student("Андрій", "ІПЗ-21", 1, grades1);
        new Student("Оля", "ІПЗ-21", 1, grades2);
        new Student("Марія", "ІПЗ-21", 1, grades3);


        Student.processStudents();


        System.out.println("Студенти 2 курсу:");
        Student.printStudents(2);
    }

}
