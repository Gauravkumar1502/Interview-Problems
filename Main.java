package com.company;

public class Main {

    public static void main(String[] args) {

        //Merge two shorted Arrays
        merge_two_shorted_array m=new merge_two_shorted_array();
        int[] a=new int[]{3,5,10,15};
        int[] b=new int[]{1,6,9,19};
        m.merge(a,b);

        //Count and Remove vowels from a string
        removeCount_vowels rv=new removeCount_vowels("Gaurav Kumar Singh");

        //Quack
        quack q=new quack("2","4","6","8","10");
        System.out.print("Quack before push : ");
        q.print();
        q.push("10");
        System.out.print("Quack after push : ");
        q.print();
        String pop=q.pop();
        System.out.print("After pop "+pop+" from Quack : ");
        q.print();
        q.pull();
        System.out.print("After pull from Quack : ");
        q.print();

        //Key Value Implementaion
        keyValue_implementation kv=new keyValue_implementation();
        kv.update(1,1);
        kv.update(2,1);
        kv.update(4,3);
        kv.update(3,1);
        kv.print();
        System.out.println(kv.get(2));
        System.out.println(kv.max_key(1));
        kv.print();

        //Arrange a String that no charater repeat next to it
        StringRearrange sr1=new StringRearrange("aaabccb");

        //rearrange user input anagramming numbers in character in assending order
        anagrammingString as=new anagrammingString("niesevehrtfeev");

    }
}
