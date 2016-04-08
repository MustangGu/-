package com.imooc;
import java.util.Scanner;
public class A_for_if {
	public static void main(String[] args){      
		Scanner input=new Scanner(System.in);       
		System.out.println("请输入考试成绩：");
		        int score = input.nextInt(); 
		        
		        // 变量保存加分次数
		        int count = 0;


		        //打印输出加分前成绩 
		        System.out.println("加分前成绩："+score);  
		       
		        
		        // 只要成绩小于60，就循环执行加分操作，并统计加分次数
		        while(score<60){
		        	score++;
		            count++;
		            }
		         //打印输出加分后成绩，以及加分次数
		      System.out.println("加分后成绩："+score); 
		        System.out.println("共加了"+count+"次！"); 
  }
		}	
	
	
	
	

