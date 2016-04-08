package com.imooc;

public class Helloworld {
public static void main (String[] args){
	System.out.println("Hello World!");
	boolean a = true; // a同意
	boolean b = false; // b反对
	boolean c = false; // c反对
	boolean d = true; // d同意
    System.out.println((a && b) + "未通过");
    System.out.println((a || d) + "未通过");
    System.out.println((!a) + "未通过");
    System.out.println((c ^ d) + "未通过");
	int score=68;
	String mark = (score>=60) ? "及格":"不及格";
	System.out.println("考试成绩如何："+mark);
	int one = 20 ;
    if(one%2==0){System.out.println("one是偶数");}
	int age=100;
	if(age>60){
        System.out.println("老年");
	}
    else if(age>40){
        System.out.println("中年");
        }
    else if(age>18)
    {System.out.println("少年");
    }
    else{System.out.println("童年");
        }
	
     
    
    
    
    

















}
}
