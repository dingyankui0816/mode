package com.design.mode.tenet.lawOfDemeter;

public class App {
    private Book book = new Book();
    public void read(){
        System.out.println(book.getTitle());
    }
}
