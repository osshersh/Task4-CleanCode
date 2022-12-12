package pl.futurecollars.lesson5.task4;

import java.math.BigDecimal;

public class Employee {

    public static final String WHITE_SPACE = " ";
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
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Employee(String name, String surname, int age, BigDecimal value) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.basicSalary = value;

    }

    public Employee(String name, String surname, int age, BigDecimal value1, BigDecimal value2) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.basicSalary = value1;
        this.bonus = value2;

    }

    public String getEmployeeInfo() {
        return "Employee name : " + name + WHITE_SPACE + surname;
    }

    public String getEmployeeDetails() {
        return "Employee details : " + name + WHITE_SPACE + surname + " is " + age;
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
