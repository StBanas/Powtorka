package com.kodilla.abstracts.homework;

public class Person {

    String firstName;
    Job job;
    int age;

    public Person(String firstName, Job job, int age) {
        this.firstName = firstName;
        this.job = job;
        this.age = age;
    }

        public String showResponsibilities() {
        return job.getResponsibilities();
    }
}
