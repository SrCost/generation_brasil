programa
{
	
	funcao inicio()
	{
	/*
	 * Construa um sistema para ler uma variável numérica N e imprimi-la somente se 
	 * a mesma for maior que 100, caso contrário imprimi-la com o valor zero.
	 */

	 inteiro N
	 	escreva("Digite o número: ")
	 	leia(N)

	 	se(N > 100) {
	 		escreva("Número: ", N)
	 	}
	 	senao {
	 		N = 0
	 		escreva("Número: ",N)
	 		
	 	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 366; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */