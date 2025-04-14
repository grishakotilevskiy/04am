interface Payable {
   int getSalary();
}

interface BonusEligible{
    int getBonus();
}


abstract class Employee{
    String name;
    int experience;
    int baseSalary;
    abstract void work();
    Employee(String name, int experience, int baseSalary){
        this.name = name;
        this.experience = experience;
        this.baseSalary = baseSalary;
    }
    String getName(){
        return name;
    }
    int getExperience(){
        return experience;
    }
    int getBaseSalary(){
        return baseSalary;
    }
}

class Developer extends Employee implements Payable, BonusEligible{
Developer(String name, int experience, int baseSalary){
    super(name, experience, baseSalary);
}
@Override
public int getSalary(){
    return baseSalary + experience * 500;
 }
 public int getBonus(){
    return 1000;
 }

    @Override
    void work() {
        System.out.println("Developer " + name + " is working.");
    }
}

class Manager extends Employee implements Payable, BonusEligible {
    Manager(String name, int experience, int baseSalary){
        super(name, experience, baseSalary);
    }
    @Override
    void work() {
        System.out.println("Developer " + name + " is working.");
    }
    public int getSalary(){
        return baseSalary + experience * 250;
    }
    public int getBonus(){
        return 1000;
    }
}
class Intern extends Employee implements Payable{
    public Intern(String name, int experience, int baseSalary) {
        super(name, experience, baseSalary);
    }
    @Override
    void work() {
        System.out.println("Developer " + name + " is working.");
    }
    public int getSalary(){
        return baseSalary + experience * 100;
    }
}
public class chatGPTask {



}
