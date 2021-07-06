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
            if (this.hasNext()) {
                return list[index++];
            }
            return null;
        }
    }

    public static void main(String[] args) {
        List list = new List();
        for(Iteartor iter = list.getIterator(); list.getIterator().hasNext();){
            System.out.println(iter.getNext());
        }
    }
}
