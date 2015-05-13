package com.iterator.pattern;


/**
 * Created by wyr on 2015/5/13.
 */
public class Test {
    public static void main(String[] args) {
        //sequence iterator
        List<String> list = new List<>();
        list.append("1");
        list.append("2");
        list.append("3");
        printIterator(list);
        //skip one
        SkipList<String> skipList = new SkipList<>();
        skipList.append("1");
        skipList.append("2");
        skipList.append("3");
        printIterator(skipList);
    }

    private static void printIterator(AbstractList<String> list) {
        for (Iterator<String> iterator = list.createIterator();iterator.isDone();){
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
