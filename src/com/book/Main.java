package com.book;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Task1();
        Task2();
    }
    private static void Task1(){
        Book book = new Book();
        book.function();
        System.out.println(book);
    }
    private static void Task2() {

        Scanner scanner = new Scanner(System.in);
        Film film = new Film();
        Film film1 = new Film();
        Film film2 = new Film();
        System.out.println("First film title:");
        film.title = scanner.nextLine();
        System.out.println("Second film title:");
        film1.title = scanner.nextLine();
        System.out.println("Thierd film title:");
        film2.title = scanner.nextLine();
        Date date = new Date((int) (Math.random() * 1212121212121L - 18000));
        Date date1 = new Date((int) (Math.random() * 1212121212121L - 18000));
        Date date2 = new Date((int) (Math.random() * 1212121212121L - 18000));
        int sec = (int) (Math.random() * 8000);
        int sec1 = (int) (Math.random() * 8000);
        int sec2 = 7200;
        film.duration = sec/3600;
        film1.duration = sec1/3600;
        film2.duration = sec2/3600;
        film.time = date.getHours();
        film1.time = date1.getHours();
        film2.time = 19;
        film.budget = (int) (Math.random() * 2000000);
        film1.budget = (int) (Math.random() * 2000000);
        film2.budget = (int) (Math.random() * 2000000);
        int J = (int) (Math.random() * 5);
        int J1 = (int) (Math.random() * 5);
        int J2 = (int) (Math.random() * 5);
        switch (J){
            case 1: film.Janr = "Action";
                    break;
            case 2: film.Janr = "comedy";
                    break;
            case 3: film.Janr = "thriller";
                    break;
        }
        switch (J1){
            case 1: film1.Janr = "Action";
                    break;
            case 2: film1.Janr = "comedy";
                    break;
            case 3: film1.Janr = "thriller";
                    break;
        }
        switch (J2){
            case 1: film2.Janr = "Action";
                break;
            case 2: film2.Janr = "comedy";
                break;
            case 3: film2.Janr = "thriller";
                break;
        }

        if (film.duration > 1.66 && film.time > 18 ){
            System.out.println("Title: " + film.title + " Time: " + film.time + " Duration: "+ film.duration + " Budget: " + film.budget + " Janr: " + film.Janr);
        }
        if (film1.duration > 1.66 && film1.time > 18 ){
            System.out.println("Title: " + film1.title + " Time: " + film1.time + " Duration: "+ film1.duration + " Budget: " + film1.budget + " Janr: " + film1.Janr);
        }
        if (film2.duration > 1.66 && film2.time > 18 ){
            System.out.println("Title: " + film2.title + " Time: " + film2.time + " Duration: "+ film2.duration + " Budget: " + film2.budget + " Janr: " + film2.Janr);
        }

    }

}