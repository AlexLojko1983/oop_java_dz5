package org.geekbrains.lesson7.observer;

import java.util.Random;

public class Company {

    private Random random = new Random();

    Publisher jobAgency;

    private String name;

    private int maxSalary;
    private JobVacancyType jobVacancyType;

    public Company(Publisher jobAgency, String name, int maxSalary, JobVacancyType jobVacancyType) {
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
        this.jobVacancyType = jobVacancyType;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary,jobVacancyType);
    }

}
