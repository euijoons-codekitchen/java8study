package com.teamtreehouse.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {


//
//    public static void usingAnonymousInLIneClass(){//lamda 적용 전.
//        List<Book> books = Books.all();
//        Collections.sort(books, new Comparator<Book>() {//무명 객체 사용시 (이경우를 SAM이라고 함) Lamda 사용
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o1.getTitle().compareTo(o2.getTitle());//이부분 뺴고 다 날릴 수 있음
//            }
//        });
//
//
//        for (Book book : books){
//            System.out.println(book.toString());
//        }
//    }



    public static void usinglLamdasInLongForm(){
        List<Book> books = Books.all();
        Collections.sort(books, (Book b1, Book b2) -> { //인자 종류만 남기고 리턴하는 코드만 중괄호 안에 작성
            return b1.getTitle().compareTo(b2.getTitle());
        });


        for (Book book : books){
            System.out.println(book.toString());
        }
    }

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
        //usinglLamdasInShortForm();
    }
}
