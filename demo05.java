package com.imooc;
import java.util.Arrays; 
public class demo05 {		   
public static void main(String[] args) {
int [] scores={89,-23,64,91,119,52,73};    
System.out.println("TOP3");
demo05 hello = new demo05();
hello.sort(scores);   
}
 public void sort(  int[ ] scores         ){
		    Arrays.sort(scores);
		    int num=0;
		    for ( int i = scores.length - 1; i >= 0; i-- ) { 
		        if (scores[i]<0||scores[i]>100){
		            continue;
		        }
		         num++;   
		          if(num>3)  {  
		         break;
		         }
		            
		        
		        
				System.out.println(scores[i]);
 }	
 }		
}
