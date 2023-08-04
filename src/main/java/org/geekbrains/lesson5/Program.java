package org.geekbrains.lesson5;

import org.geekbrains.lesson5.models.Table;
import org.geekbrains.lesson5.models.TableModel;
import org.geekbrains.lesson5.presenters.BookingPresenter;
import org.geekbrains.lesson5.presenters.Model;
import org.geekbrains.lesson5.presenters.View;
import org.geekbrains.lesson5.views.BookingView;

import java.util.ArrayList;
import java.util.Date;

public class Program {

    /**
     * TODO: Домашняя работа
     *  метод changeReservationTable должен заработать!!!
     * @param args
     */
    public static void main(String[] args) {

        View view = new BookingView();
        Model model = new TableModel();

        BookingPresenter bookingPresenter = new BookingPresenter(view, model);
        bookingPresenter.showTables();

        view.reservationTable(new Date(), 3, "Станислав");
//        model.reservationTable(new Date(), 3, "Станислав");
//        bookingPresenter.showTables();

        view.changeReservationTable(1001, new Date(), 4, "Станислав");
        System.out.println("end");

    }

}
