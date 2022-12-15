package pl.futurecollars.lesson5.task4;

import java.math.BigDecimal;

public class Employee {

    private final String name;
    private final String surname;
    private int age;
    private BigDecimal basicSalary;
    private BigDecimal bonus;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        this(name,surname);
        this.age = age;
    }

    public Employee(String name, String surname, int age, BigDecimal basicSalary) {
        this(name,surname,age);
        this.basicSalary = basicSalary;

    }

    public Employee(String name, String surname, int age, BigDecimal basicSalary, BigDecimal bonus) {
        this(name,surname,age,basicSalary);
        this.bonus = bonus;

    }

    public String getEmployeeInfo() {
        return "Employee name : " + name + " " + surname;
    }

    public String getEmployeeDetails() {
        return "Employee details : " + name + " " + surname + " is " + age;
    }

    public BigDecimal getBasicSalaryWithBonus() {
        return basicSalary.add(bonus);
    }

    public BigDecimal getBasicSalary() {
        return basicSalary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }
}
