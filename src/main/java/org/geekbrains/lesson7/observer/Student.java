package org.geekbrains.lesson7.observer;

public class Student implements Observer {

    private String name;
    int salary = 2000;
    private JobVacancyType jobVacancyType;

    public Student(String name, JobVacancyType jobVacancyType) {
        this.name = name;
        this.jobVacancyType = jobVacancyType;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, JobVacancyType jobVacancyType) {
        if (this.salary <= salary && this.jobVacancyType == jobVacancyType){
            System.out.printf("Student %s: Мне нужна эта работа! (company: %s; salary: %d; jobVacancyType: %s)\n", name,
                    nameCompany, salary, jobVacancyType);
            this.salary = salary;
        }
        else {
            System.out.printf("Student %s: Я найду работу получше! (company: %s; salary: %d; jobVacancyType: %s)\n", name,
                    nameCompany, salary, jobVacancyType);
        }
    }
}
