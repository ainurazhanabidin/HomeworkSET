package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
//        Эки setтин симметриялык айырмасын эсептеген symmetricDifference методун ишке ашырыныз.
//        Метод натыйжаны жаңы set катары кайтарышы керек. Методко параметр катары берилген setтерди өзгөртүүгө жол берилбейт.
//
//       Мисалы: [1, 2, 3} жана {0, 1, 2]
//        Жооп: [0, 3]
//
//        public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2) методу болушу керек
//
//

        Set<Integer>aynura=new HashSet<>();
        aynura.add(1);
        aynura.add(2);
        aynura.add(3);

        Set<Integer>maksat=new HashSet<>();
        maksat.add(0);
        maksat.add(1);
        maksat.add(2);

        Set<Integer>datka=new HashSet<>(aynura);
       datka.removeAll(maksat); // 3

        maksat.removeAll(aynura); // 0

       datka.addAll(maksat);
        System.out.println(datka);









    }
}
