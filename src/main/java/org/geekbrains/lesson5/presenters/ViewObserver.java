package org.geekbrains.lesson5.presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date reservationDate, int tableNo, String name);
    void changeReserv(int oldReservationTable, Date reservationDate, int tableNo, String name);

}
