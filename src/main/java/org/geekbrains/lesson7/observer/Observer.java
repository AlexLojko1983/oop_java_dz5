package org.geekbrains.lesson7.observer;

public interface Observer {

    void receiveOffer(String nameCompany, int salary, JobVacancyType jobVacancyType);

}
