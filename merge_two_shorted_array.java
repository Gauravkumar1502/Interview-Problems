package com.company;

public class merge_two_shorted_array {

    void merge(int[] a, int[] b){
        int n1=a.length;
        int n2=b.length;
        int[] shorted=new int[n1+n2];
        int i=0,j=0,k=0;
        while (i < n1 && j < n2) {
            if (a[i] < b[j])
                shorted[k++] = a[i++];
            else
                shorted[k++] = b[j++];
        }
        while(i<n1)
            shorted[k++]=a[i++];
        while(j<n2)
            shorted[k++]=b[j++];
        for(i=0;i<n1+n2;i++)
            System.out.print(shorted[i]+"  ");
    }

}
