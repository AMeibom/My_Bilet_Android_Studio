package com.example.my_bilet_android_studio.model;
import com.example.my_bilet_android_studio.model.RailwayTicket;


public class RailwayTicketPensioner extends RailwayTicket {
        // задание полей
        private float ticketDiscountPensioner; // скидка на билет пенсионеров

        // создание пустого конструктора
    public RailwayTicketPensioner() {
        }
        // создание конструктора исходных данных детского билета (стоимость билета, количество билетов, скидка)
    public RailwayTicketPensioner(float ticketPrice, int numberOfTickets, float ticketDiscountPensioner) {
            super(ticketPrice, numberOfTickets);
            this.ticketDiscountPensioner = ticketDiscountPensioner;
        }

        // переопределение метода подсчёта стоимости детских билетов
        public float ticketPriceAll() {
            return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscountPensioner))/100; // нужно умножить количество билетов на стоимость одного билета и на скидку и всё разделить на 100
        }
    }


