package com.imooc;
import java.util.Scanner;
public class A_for_if {
	public static void main(String[] args){      
		Scanner input=new Scanner(System.in);       
		System.out.println("�����뿼�Գɼ���");
		        int score = input.nextInt(); 
		        
		        // ��������ӷִ���
		        int count = 0;


		        //��ӡ����ӷ�ǰ�ɼ� 
		        System.out.println("�ӷ�ǰ�ɼ���"+score);  
		       
		        
		        // ֻҪ�ɼ�С��60����ѭ��ִ�мӷֲ�������ͳ�Ƽӷִ���
		        while(score<60){
		        	score++;
		            count++;
		            }
		         //��ӡ����ӷֺ�ɼ����Լ��ӷִ���
		      System.out.println("�ӷֺ�ɼ���"+score); 
		        System.out.println("������"+count+"�Σ�"); 
  }
		}	
	
	
	
	

