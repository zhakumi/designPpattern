package com.wangcan.design.pattern.iterator;

/**
 * @author: wangcan
 * @date: 2021/7/6 21:45
 */
public class List implements Container {

    private String[] list = {"1", "2"};

    @Override
    public Iteartor getIterator() {
        return new InnerList();
    }

    public class InnerList implements Iteartor {

        int index;

        @Override
        public boolean hasNext() {
            if (index < list.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object getNext() {
            return list[index++];
        }
    }

    public static void main(String[] args) {
        List list = new List();
        Iteartor iteartor = list.getIterator();
        while (iteartor.hasNext()) {
            System.out.println(iteartor.getNext());
        }
    }
}
