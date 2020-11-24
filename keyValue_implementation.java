package com.company;

import java.util.ArrayList;

public class keyValue_implementation {
    private ArrayList<Integer> keys=new ArrayList<Integer>();
    private ArrayList<Integer> vals=new ArrayList<Integer>();
    void update(int key, int val){
        if(keys.indexOf(key)>-1) {
            vals.set(keys.indexOf(key),val);
        } else{
            keys.add(key);
            vals.add(val);
        }
    }
    int get(int key){

        return vals.get(keys.indexOf(key));
    }
    int max_key(int val){
        int max_key=0;
        for (int v=0;v< vals.size();v++){
            if(vals.get(v)==val && max_key<keys.get(v)){
                max_key=keys.get(v);
            }
        }
        return max_key;
    }
    void print(){
        System.out.println(keys);
        System.out.println(vals);
    }
}