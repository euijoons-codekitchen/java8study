package com.teamtreehouse.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

//
//
//    public static void usingAnonymousInLIneClass(){
//        List<Book> books = Books.all();
//        Collections.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o1.getTitle().compareTo(o2.getTitle());
//            }
//        });
//
//
//        for (Book book : books){
//            System.out.println(book.toString());
//        }
//    }


//
//    public static void usinglLamdasInLongForm(){
//        List<Book> books = Books.all();
//        Collections.sort(books, (Book b1, Book b2) -> {
//            return b1.getTitle().compareTo(b2.getTitle());
//        });
//
//
//        for (Book book : books){
//            System.out.println(book.toString());
//        }
//    }

    public static void usinglLamdasInShortForm(){
        List<Book> books = Books.all();
        Collections.sort(books, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));


        for (Book book : books){
            System.out.println(book.toString());
        }

        
    }

    public static void main(String[] args) {
	// write your code here
       // usinglLamdasInLongForm();
        usinglLamdasInShortForm();
    }
}
