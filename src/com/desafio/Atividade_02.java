package com.desafio;

public class Atividade_02 {

	 public static void main(String[] args) {
		  String senha = "Ya3"; 

		    if(senha.length()>=6){
		      String segura = "(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=. [@#$%^&+=]).{6,}";
		      
		    }else{
		      int restante = 0;
		      restante = 6 - senha.length();
		       System.out.println(restante);
		    }

		}
		}