package com.company;

public class removeCount_vowels {

    String str;
    removeCount_vowels(String str){
        this.str=str;
        solution();
    }

    void solution() {

        int n=str.length();
        String new_str="";
        int[] vowels=new int[]{0,0,0,0,0};

        for(int i=0;i<n;i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='A')
                vowels[0]++;
            else if(str.charAt(i)=='e' || str.charAt(i)=='E')
                vowels[1]++;
            else if(str.charAt(i)=='i' || str.charAt(i)=='I')
                vowels[2]++;
            else if(str.charAt(i)=='o' || str.charAt(i)=='O')
                vowels[3]++;
            else if(str.charAt(i)=='u' || str.charAt(i)=='U')
                vowels[4]++;
            else
                new_str+=str.charAt(i);
        }

        System.out.println("a : "+vowels[0]);
        System.out.println("e : "+vowels[1]);
        System.out.println("i : "+vowels[2]);
        System.out.println("o : "+vowels[3]);
        System.out.println("u : "+vowels[4]);
        System.out.println(new_str);
    }
}
