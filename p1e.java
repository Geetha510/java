package com.hackathon1;

import java.util.Scanner;

public class p1e {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        String s = scan.next();
        int l=s.length();
        int i=0,j=l-1;
        for(int k=0;k<l;k++){
            for(int m=0;m<l;m++){
                if(m==i){
                    System.out.print(s.charAt(k));
                }
                else if(m==j){
                    System.out.print(s.charAt(j));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            i++;
            j--;
        }
    }
}
