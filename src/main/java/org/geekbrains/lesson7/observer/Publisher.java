package org.geekbrains.lesson7.observer;


/**
 * Интерфейс рассылки вакансий.
 *
 */
public interface Publisher {

    void sendOffer(String companyName, int salary, JobVacancyType jobVacancyType);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);


}
