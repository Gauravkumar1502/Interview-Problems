package com.company;

import java.util.ArrayList;

public class anagrammingString {
    ArrayList<String> numbers=new ArrayList<>();
    String string;
    anagrammingString(String str){
        this.string=str.toLowerCase();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        numbers.add("five");
        numbers.add("six");
        numbers.add("seven");
        numbers.add("eight");
        numbers.add("nine");
        anagramming();
    }
    void anagramming(){
        //Validation
        if(string.length()<3){
            System.out.println("Not able to form a arranged integer");
            return;
        }
        //false case
        String num="onetwothreefourfivesixseveneightnine";
        for (char c='a';c<='z';c++)
            if(num.contains(""+c)==false)
                if(string.contains(""+c)) {
                    System.out.println("Not able to form a arranged integer");
                    return;
                }
        formInteger();
    }

    void formInteger(){
        String numInString="";
        int i=0,k=0,num=0;
        while(i<10 && string.length()>0){
            String restore=string;
            String tmp="";
            k=0;
            while(k<numbers.get(i).length()){
                if(string.contains(""+numbers.get(i).charAt(k))) {
                    int index=string.indexOf(numbers.get(i).charAt(k));
                    tmp=tmp+string.charAt(index);
                    string=string.substring(0,index)+string.substring(index+1,string.length());
                    k++;
                }else{
                    string=restore;
                    break;
                }
            }
            if(k==numbers.get(i).length()){
                numInString=numInString+tmp;
                num=(num*10)+(i+1);
            }
            i++;
        }
        System.out.println("String : "+numInString);
        System.out.println("Number : "+num);
    }
}
