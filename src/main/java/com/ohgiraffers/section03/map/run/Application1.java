package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Map의 자료구조에 대해 이해하고 HashMap을 이용할 수 있다. */
        /* Map 인터페이스의 특징
         *  Collection 인터페이스와는 다른 저장 방식을 가진다.
         *  키(key)와 값(value)를 하나의 쌍으로 저장하는 방식을 사용한다.
         *
         *  키(key)란?
         *  값(value)를 찾기 위한 이름 역할을 하는 객체를 의미한다.
         *  1. 요소의 저장 순서를 유지하지 않는다.
         *  2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값은 저장 가능하다.
         *
         *  HashMap, HashTable, TreeMap 등의 대표적인 클래스가 있다.
         *  HashMap이 가장 많이 사용되며, HashTable은 JDK 1.0부터 제공되며
         *  HashMap과 동일하게 동작한다. 하위 호환을 위해 남겨놓았기 때문에 가급적이면 HashMap을 사용하는 것이 좋다.
         *
         *  HashMap : JDK 1.2부터 제공되는 클래스로 해시 알고리즘을 사용하여 검색 속도가 매우 빠르다.
         */

        HashMap hmap = new HashMap<>();
//        Map hmap2 = new HashMap<>();

        hmap.put("one", new Date());
        hmap.put(12, "red appler");
        hmap.put(33, 123);

        System.out.println("hmap = " + hmap);

        hmap.put(12, "yellow banana");
        System.out.println("hmap = " + hmap);

        hmap.put(11, "yellow banana");
        hmap.put(9, "yellow banana");
        System.out.println("hamp = " + hmap);

        System.out.println("hmap = " +hmap.get(9));

        hmap.remove(9);
        System.out.println("hmap = " + hmap);

        System.out.println(hmap.size());

        HashMap<String, String> hmap2 = new HashMap<>();

        hmap2.put("one", "java");
        hmap2.put("two", "oracle");
        hmap2.put("three", "jdbc");
        hmap2.put("four", "html");
        hmap2.put("five", "css");

        /* 목차 1. keySet()을 이용해서 키만 따로 set으로 만들고, iterator()로 키에 대한 목록을 만듦 */

        Iterator<String> keyIter = hmap2.keySet().iterator();

        while (keyIter.hasNext()) {
            String key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println("value = " + value);
        }

        /* 목차 2. 저장된 value 객체들만 values()로 Collection으로 만듦 */
        Collection<String> values = hmap2.values();

        /* 목차 2-1. Iterator()로 목록 만들어서 처리 */
        Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()) {
            System.out.println(valueIter.next());
        }

        /* 목차 2-2. 배열로 만들어서 처리 */
        Object[] valueArr = values.toArray();
        for (int i = 0; i < valueArr.length; i++) {
            System.out.println(i + " : " + valueArr[i]);
        }

        /* 목차 3. Map의 내부클래스인 EntrySet을 이용 : entrySet() */
        Set<Map.Entry<String, String>> set = hmap2.entrySet();
        /* Entry : 키 객체와 값 객체를 쌍으로 묶은 것 */
        Iterator<Map.Entry<String, String>> entryIterator = set.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> entry = entryIterator.next();
            System.out.println(entry.getKey() +  " : " + entry.getValue());
        }


    }
}
