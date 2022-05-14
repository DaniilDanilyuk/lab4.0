package com.book;

import java.util.Random;
import java.util.Scanner;

public class Book {
    private String Autor;
    private int pages;
    private int edition;
    private int year;


    public void function() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Writte 5 authors:");
        String a[] = new String[5];
        for (int i = 0; i<5; i++) {
            a[i] = scanner.nextLine();
        }
        //pages
        int t[] = new int[5];
        for (int i = 0; i<5; i++) {
            t[i] = (int) (Math.random() * 999);
        }
        //edition
        int ed[] = new int[5];
        for (int i = 0; i<5; i++) {
            ed[i] = (int) (Math.random() * 10000000);
        }
        //year
        int ye[] = new int[5];
        for (int i = 0; i<5; i++) {
            ye[i] = (int) (Math.random() * 4000 - 2000);
        }
        t[4] = 150;
        for (int i = 0; i< 5; i++){
            if (t[i]==150){
                System.out.println("Author: "+a[i] + " Pages: "+t[i]+" Edition: "+ed[i]+" Year: "+ye[i]);
            }
        }


    }
}


