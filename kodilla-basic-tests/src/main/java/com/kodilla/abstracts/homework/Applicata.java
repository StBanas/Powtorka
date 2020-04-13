package com.kodilla.abstracts.homework;

public class Applicata {
    public static void main(String[] args) {
        Tester tester = new Tester();
        Developer developer = new Developer();

        Person john = new Person("John Monnahan", tester, 23);
        Person collin = new Person("Collin Munro", developer, 34);

        System.out.println(john.firstName + "'s responsibility is " + john.job.getResponsibilities() + ". His salary is : " + john.job.getSalary());
        System.out.println(collin.firstName + "'s responsibility is " + collin.job.getResponsibilities() + ". His salary is : " + collin.job.getSalary());

    }
}
