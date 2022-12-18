package org.example;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
        public static void main(String[] args) {
            Set<Integer> set = new HashSet<>();
            set.add(10);
            set.add(20);
            set.add(30);
            set.add(40);
            set.add(10);
            set.add(null);
            Set<Integer> set2 = new HashSet<>();
            set.add(110);
            set.add(202);
            set.add(303);
            set.add(404);
            set.add(100);

            set.addAll(set2);
            System.out.println(set.contains(100));

            System.out.println(set);

        }
    }


