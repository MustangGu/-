package com.imooc;

public class demo03 {
	   public static void main(String[] args) {
	        
			// �������󣬶�����Ϊhello
			demo03 hello = new demo03();
			
	        // ���÷������������ſγ̵ĳɼ�
			hello.calcAvg(94, 81);
		}

		/*
		 * ���ܣ��������ſγ̿��Գɼ���ƽ���ֲ����ƽ����
		 * ����һ���������������ķ����������������ſγ̵ĳɼ�
		 */


	public void calcAvg(int a,int b){
	    double avg=(a+b)/2.0;
	    System.out.println(avg);
	}




}
