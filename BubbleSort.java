package clovis;

import java.util.Scanner;
public class program {
	public static void main(String[] args) {
			class alunos {
			String nome; // nome da pessoa
			int celular; // n. do celular
			}
			alunos[] pessoas = new alunos[5];
			//
			for (int i=0; i<pessoas.length; i++) {
				pessoas[i] = new alunos();
				Scanner entrada = new Scanner(System.in);
				System.out.println((i+1)+"a. Pessoa ");
				System.out.print("Nome : ");
				pessoas[i].nome = entrada.nextLine();
				System.out.print("Celular : ");
				pessoas[i].celular = entrada.nextInt();
			}
			//metodo de ordenação da bolha :)
			String aux;
			int i=pessoas.length;
			boolean troca = true;
			while (i >=1 && troca == true) {
			troca=false;
			for (int j =0; j < (i-1); j++) { // se a>b se b>c se c>d ...
				if (pessoas[j].nome.compareTo(pessoas[j+1].nome)>0) {
					aux=pessoas[j].nome;
					pessoas[j].nome=pessoas[j+1].nome;
					pessoas[j+1].nome=aux;
					troca=true;
				}
			}
			i=i-1;
			}
			System.out.println("*** nomes ordenados ***");
			for (int l = 0; l < pessoas.length; l++) {
				System.out.println("Nome : "+pessoas[l].nome);
				System.out.println("Celular : "+pessoas[l].celular);
			}
		}
}
