package com.inzy.ds.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet {

    public static Set<String> intersection(Set<String> set1, Set<String> set2) {
        Set<String> setOfBooks = new HashSet<>();
        Iterator<String> itr = set1.iterator();
        while (itr.hasNext()) {
            String str = itr.next();
            if (set2.contains(str)) {
                try {
                    set2.remove(str);
                    setOfBooks.add(str);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
        return setOfBooks;
    }

    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> output = new HashSet<>();
        Iterator<String> itr1 = set1.iterator();
        while (itr1.hasNext()) {
            String str = itr1.next();
            output.add(str);
        }
        Iterator<String> itr2 = set2.iterator();
        while (itr2.hasNext()) {
            String str = itr2.next();
            output.add(str);
        }
        return output;
    }
}
