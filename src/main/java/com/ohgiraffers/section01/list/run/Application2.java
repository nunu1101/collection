package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. ArrayList의 정렬 기능을 이용할 수 있다. */
        List<BookDTO> bookList = new ArrayList<>();

        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 50000));

        /* 제네릭의 타입 제한에 의해 Comparable 타입을 가지고 있는 경우에만 sort가 사용 가능하다. */
//        Collections.sort(bookList);

        for(BookDTO bookDTO : bookList) {
            System.out.println(bookDTO);
        }

        bookList.sort(new AscendingPrice());

        System.out.println("========== 가격 오름차순 정렬 ==========");
        for (BookDTO bookDTO : bookList) {
            System.out.println(bookDTO);
        }

        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getPrice() >= o2.getPrice()? -1: 1;
            }
        });

        System.out.println("========== 가격 내림차순 정렬 ==========");
        for (BookDTO bookDTO : bookList) {
            System.out.println(bookDTO);
        }

        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

        System.out.println("========== 책 제목 오름차순 정렬 ==========");
        for (BookDTO bookDTO : bookList) {
            System.out.println(bookDTO);
        }
    }
}
