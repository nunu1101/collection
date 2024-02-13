package com.ohgiraffers.section02.set.run;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Set 자료구조의 특성을 이해하고 HashMap 을 이용할 수 있다. */
        /* Set
         *  Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징
         *  1. 요소의 저장 순서를 유지하지 않는다.
         *  2. 같은 요소의 중복 저장을 허용하지 않는다. (null 값도 중복하지 않게 하나의 null 만 저장한다.)
         */

        /* HashSet 클래스
         *  Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
         *  JDK 1.2부터 제공되고 있으며 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다.
         */

        HashSet<String> hset = new HashSet<>();
//        Set hset2 = new HashSet();
//        Collection hset3 = new HashSet<>();

        hset.add(new String("java"));
        hset.add(new String("oracle"));
        hset.add(new String("jdbc"));
        hset.add(new String("html"));
        hset.add(new String("css"));

        System.out.println("hset = " + hset);

        hset.add(new String("java"));

        System.out.println("hset = " + hset);
        System.out.println(hset.size());
        System.out.println(hset.contains(new String("oracle")));

        /* toArray() 배열로 바꾸고 for 문 사용 */
        Object[] arr = hset.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " + arr[i]);
        }

        /* iterator() 로 목록 만들어 연속 처리 */
        Iterator<String> inter = hset.iterator();
        while (inter.hasNext()) {
            System.out.println(inter.next());
        }

        /* clear() 로 내용 삭제 */
        hset.clear();
        System.out.println(hset.isEmpty());
    }
}
