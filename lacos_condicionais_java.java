package lacos_condicionais_java;

import java.util.Scanner;

public class lacos_condicionais_java {

	public static void main(String[] args) {
	   
	Scanner leia = new Scanner(System.in);
	        
	int numero;
	String resultadoParImpar;
	String resultadoPositivoNegativo;
	        
	System.out.print("Digite um número: ");
	numero = leia.nextInt();
	        
	if (numero % 2 == 0) {
	resultadoParImpar = "par";
	} else {
	resultadoParImpar = "ímpar";
	}
	        
	if (numero >= 0) {
	resultadoPositivoNegativo = "positivo";
	} else {
	resultadoPositivoNegativo = "negativo";
	}
	        
	System.out.println("O Número " + numero + " é " + resultadoParImpar + " e " + resultadoPositivoNegativo + "!");
	        
	leia.close();
	}
	}


