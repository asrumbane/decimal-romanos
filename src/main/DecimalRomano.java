package main;

import java.util.Scanner;

public class DecimalRomano {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 
		//Programa Java que le um número e converte em números romanos
		      Scanner sc = new Scanner(System.in);
		      int num;
		      do {
		             System.out.print("Insira um número entre qualquer: ");
		             num = sc.nextInt();
		      } while (num < 1 || num > 30000);
		      System.out.println(num + " em romano: -> " + converterNumerosArabesEmRomanos(num));
		  }

		  //método para passar números romanos
		  public static String converterNumerosArabesEmRomanos(int numero) {
		      int i, milhares, centenas, dezenas, unidades;
		      String romano = "";
		      
		     //Obtendo cada cifra do número
		      milhares = numero / 1000;
		      centenas = numero / 100 % 10;
		      dezenas = numero / 10 % 10;
		      unidades = numero % 10;

		     //millar
		      for (i = 1; i <= milhares; i++) {
		             romano = romano + "M";
		      }

		     //centenas
		      if (centenas == 9) {
		          romano = romano + "CM";
		      } else if (centenas >= 5) {
		                     romano = romano + "D";
		                     for (i = 6; i <= centenas; i++) {
		                            romano = romano + "C";
		                     }
		      } else if (centenas == 4) {
		                      romano = romano + "CD";
		      } else {
		                  for (i = 1; i <= centenas; i++) {
		                         romano = romano + "C";
		                  }
		      }

		     //dezenas
		      if (dezenas == 9) {
		           romano = romano + "XC";
		      } else if (dezenas >= 5) {
		                      romano = romano + "L";
		                      for (i = 6; i <= dezenas; i++) {
		                            romano = romano + "X";
		                      }
		      } else if (dezenas == 4) {
		                      romano = romano + "XL";
		      } else {
		                    for (i = 1; i <= dezenas; i++) {
		                           romano = romano + "X";
		                    }
		      }

		     //unidades
		      if (unidades == 9) {
		           romano = romano + "IX";
		      } else if (unidades >= 5) {
		                      romano = romano + "V";
		                      for (i = 6; i <= unidades; i++) {
		                             romano = romano + "I";
		                      }
		      } else if (unidades == 4) {
		                      romano = romano + "IV";
		      } else {
		                  for (i = 1; i <= unidades; i++) {
		                         romano = romano + "I";
		                  }
		      }
		      return romano;
		  }

	}

