package lacos_condicionais;
import java.util.Scanner;
public class doacao_sangue {
	
public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
System.out.print("Digite o Nome do doador: ");
String nome = leia.nextLine();

System.out.print("Digite a Idade do doador: ");
int idade = leia.nextInt();

System.out.print("Primeira doação de sangue? ");
boolean primeiraDoacao = leia.nextBoolean();
boolean apto;

if (idade < 18 || idade > 69) {
apto = false;
	 } else if (idade >= 60 && idade <= 69 && primeiraDoacao) {
	            apto = false;
	 } else {
apto = true;
	        }
if (apto) {
    System.out.println(nome + " está apto para doar sangue!");
} else {
    System.out.println(nome + " não está apto para doar sangue!");
}

leia.close();
}
}