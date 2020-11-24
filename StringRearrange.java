package com.company;

class StringRearrange{
    String str;
    StringRearrange(String str){
        this.str=str;
        pop();
    }
    private void pop(){
        String pop="",tmp=""+str.charAt(0);
        int index=1,n=str.length();
        while(index<n){
            if(str.charAt(index)==str.charAt(index-1)){
                pop=pop+str.charAt(index++);
                continue;
            }
            tmp=tmp+str.charAt(index++);
        }
        System.out.println("Real String is : "+str+"\n\tpop : "+pop+" String  : "+tmp);
        push(pop,tmp);
    }
    private void push(String pop, String str){
        int i=0,j=1;
        String tmp=""+str.charAt(0);
        while (i<pop.length() && j<str.length()){
            if(pop.charAt(i)!=str.charAt(j) && pop.charAt(i)!=str.charAt(j-1)){
                str=str.substring(0,j)+pop.charAt(i)+str.substring(j,str.length());
                i++;
            }j++;
            if(j==str.length() && pop.charAt(i)!=str.charAt(j-1)){
                str=str+pop.charAt(i++);
            }
        }
        if(i==pop.length())
            System.out.println("true and Rearrange String is : "+str);
        else
            System.out.println("false");
    }
}
