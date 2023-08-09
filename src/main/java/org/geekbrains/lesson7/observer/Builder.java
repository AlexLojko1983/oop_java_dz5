package org.geekbrains.lesson7.observer;

public class Builder implements Observer{
    private String name;
    int salary = 20000;

    public JobVacancyType jobVacancyType;

    public Builder(String name, JobVacancyType jobVacancyType) {
        this.name = name;
        this.jobVacancyType = jobVacancyType;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, JobVacancyType jobVacancyType) {
        if (this.salary <= salary && this.jobVacancyType == jobVacancyType){
            System.out.printf("Builder %s: Мне нужна эта работа! (company: %s; salary: %d; jobVacancyType: %s)\n", name,
                    nameCompany, salary, jobVacancyType);
            this.salary = salary;
        }
        else {
            System.out.printf("Builder %s: Я найду работу получше! (company: %s; salary: %d; jobVacancyType: %s)\n", name,
                    nameCompany, salary, jobVacancyType);
        }
    }


}
