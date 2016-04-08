package com.imooc;

public class HelloWolrd2 {
	 public static void main(String[] args) {
	int score = 90;
	String sex = "男";
    if(score>80){
        if(sex.equals("女")){
            System.out.println("进入女子组决赛");
            }else{
                System.out.println("进入男子组决赛");
                }
    }else{System.out.println("淘汰");}
}
}