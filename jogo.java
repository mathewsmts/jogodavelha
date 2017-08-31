package JogodaVelha;

import java.util.Scanner;

public class jogo {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		char[][] jogoVelha = new char [3][3];
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		char sinal;
		int linha= 0;
		int coluna = 0;

		
			for(int jogada = 1; jogada<10; jogada++){
				
			if(jogada % 2 ==1){//vez do jogador
				System.out.println("Vez do jogador 1. Escolha a linha e coluna (1-3)");
				sinal = 'X';
			}else{
				System.out.println("Vez do jogador 2. Escolha a linha e coluna (1-3)");
				sinal = 'O';
			}
			
			boolean linhaValida = false;
			while(!linhaValida){//verifica se a linha digitada está correta
				System.out.println("Entre com a linha: 1, 2 ou 3");
				linha = scan.nextInt();
				if(linha>=1 && linha<=3){
					linhaValida = true;
				}else{
					System.out.println("Entrada inválida, tente novamente");
				}
			}
			
			boolean colunaValida = false;
			while(!colunaValida){//verifica se a coluna digitada está correta
				System.out.println("Entre com a coluna: 1, 2 ou 3");
				coluna = scan.nextInt();
				if(coluna>=1 && coluna<=3){
					colunaValida = true;
				}else{
					System.out.println("Entrada inválida, tente novamente");
				}
			}
			linha--;
			coluna--;
			if(jogoVelha[linha][coluna]== 'X' || jogoVelha[linha][coluna]=='O'){//verifica se a linha e coluna não estão sendo repetidas
				System.out.println("Posição já usada, tente novamente");
				jogada --;
			}else{
				jogoVelha[linha][coluna]= sinal;
			}
			
			//imprimindo jogo da velha
			for(int i=0;i<jogoVelha.length; i++){
				for(int j=0; j<jogoVelha[i].length; j++){
					System.out.print(jogoVelha[i][j]+ " | ");
					
				}
				System.out.println();
			}
			
			if(jogoVelha[0][0]== 'X' && jogoVelha[0][1]=='X' && jogoVelha[0][2]=='X' 
					|| (jogoVelha[1][0]== 'X' && jogoVelha[1][1]=='X' && jogoVelha[1][2]=='X')
					|| (jogoVelha[2][0]== 'X' && jogoVelha[2][1]=='X' && jogoVelha[2][2]=='X')
					|| (jogoVelha[0][0]== 'X' && jogoVelha[1][0]=='X' && jogoVelha[2][0]=='X')
					|| (jogoVelha[0][1]== 'X' && jogoVelha[1][1]=='X' && jogoVelha[2][1]=='X')
					|| (jogoVelha[0][2]== 'X' && jogoVelha[1][2]=='X' && jogoVelha[2][2]=='X')
					|| (jogoVelha[0][0]== 'X' && jogoVelha[1][1]=='X' && jogoVelha[2][2]=='X')
					|| (jogoVelha[0][2]== 'X' && jogoVelha[1][1]=='X' && jogoVelha[2][2]=='X')){//verifica as possibilidades do jogador 1 ganhar
				
				System.out.println("Parabéns jogador 1, você ganhou!");
				break;
				
			}else if(jogoVelha[0][0]== 'O' && jogoVelha[0][1]=='O' && jogoVelha[0][2]=='O' 
					|| (jogoVelha[1][0]== 'O' && jogoVelha[1][1]=='O' && jogoVelha[1][2]=='O')
					|| (jogoVelha[2][0]== 'O' && jogoVelha[2][1]=='O' && jogoVelha[2][2]=='O')
					|| (jogoVelha[0][0]== 'O' && jogoVelha[1][0]=='O' && jogoVelha[2][0]=='O')
					|| (jogoVelha[0][1]== 'O' && jogoVelha[1][1]=='O' && jogoVelha[2][1]=='O')
					|| (jogoVelha[0][2]== 'O' && jogoVelha[1][2]=='O' && jogoVelha[2][2]=='O')
					|| (jogoVelha[0][0]== 'O' && jogoVelha[1][1]=='O' && jogoVelha[2][2]=='O')
					|| (jogoVelha[0][2]== 'O' && jogoVelha[1][1]=='O' && jogoVelha[2][2]=='O')){//verifica as possibilidades do jogador 2 ganhar
				
				System.out.println("Parabéns jogador 2, você ganhou!");
				break;
				
			}else{
				System.out.println("Deu Velha!");
			}
			
		 }
					
       }

    }

