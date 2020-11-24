package com.company;

import java.util.ArrayList;

class quack{
    ArrayList<String> list=new ArrayList<>();
    quack(String... items) {
        for (String s:items) {
            list.add(s);
        }
    }
    void push(String x){
        int size=list.size()-1;
        list.add(list.get(size));

        for (int i=size;i>0;i--)
            list.set(i,list.get(i-1));

        list.set(0,x);
    }
    String pop(){
        String ret=list.get(0);
        for(int i=1;i<list.size();i++){
            list.set(i-1,list.get(i));
        }
        list.remove(list.size()-1);
        return ret;
    }
    void pull(){
        list.remove(list.size()-1);
    }
    void print(){
        System.out.println(list);
    }

}
