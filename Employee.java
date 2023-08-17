package lesson14.hw;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "E{" +
                "i=" + id +
                ", n='" + name + '\'' +
                ", a='" + age + '\'' +
                ", s=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee e) {
        return Integer.compare(getId(),e.getId());
    }

    public static Comparator<Employee> nameComparator =
            (e1, e2) -> e1.getName().compareTo(e2.getName());

    public static Comparator<Employee> ageComparator =
            (e1, e2) -> Integer.compare(e1.getAge(), e2.getAge());

    public static Comparator<Employee> salaryComparator =
            (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary());





}

