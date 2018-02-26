# Tennis Refactoring Kata

Imagine que voc� trabalha para uma empresa de consultoria, e um de seus colegas tem feito algum trabalho para Tennis Society. O contrato � para 10 horas de trabalho fatur�vel, e seu colega passou 8.5 horas trabalhando nisso. Infelizmente ele ficou doente. Ele diz que completou o trabalho, e todos os testes passaram. Seu chefe pediu que voc� se apropriasse dele. Ele quer que voc� gaste uma hora ou mais no c�digo para que ele possa faturar o cliente por 10 horas completas. Ele instruiu para que voc� a arrume o c�digo um pouco e talvez fa�a algumas anota��es para que voc� possa dar ao seu colega alguns coment�rios sobre o design escolhido. Voc� tamb�m deve se preparar para conversar com o seu chefe sobre o valor dessa refatora��o, al�m das horas adicionais fatur�veis.

Existem tr�s vers�es deste kata de refatora��o, cada um com seus pr�prios cheiros de c�digo e desafios. Sugiro que voc� inicie pelo primeiro, com a classe TennisGame1. O conjunto de testes fornecido � bastante abrangente e r�pido para executar. Voc� n�o precisa mudar os testes, apenas execut�-los com frequ�ncia enquanto voc� refatora o c�digo.

Se voc� gostar desse kata, voc� pode estar interessado no meu livro, The Coding Dojo Handbook.

## Tennis Kata

O jogo t�nis tem um sistema de pontua��o bastante peculiar e, para os rec�m chegados, pode ser um pouco dif�cil de acompanhar. A sociedade de t�nis contratou voc� para construir um placar para exibir a pontua��o atual durante os jogos de t�nis.

Sua tarefa � escrever uma classe TennisGame contendo a l�gica que produz a pontua��o correta em um string para exibi��o no placar. Quando um jogador marca um ponto, ele desencadeia um m�todo para ser chamado em sua classe, informando quem marcou o ponto. Mais tarde voc� receber� uma chamada pontuacao() do placar perguntando o que deve exibir. Esse m�todo deve retornar uma string com a pontua��o atual.

Abaixo um resumo sobre as regras de pontua��o do jogo t�nnis:

1. Um game � ganho pelo primeiro jogador a ganhar pelo menos quatro pontos no total e pelo menos dois pontos a mais do que o oponente.
2. A pontua��o de execu��o de cada jogo � descrita de forma peculiar para o t�nis: os pontos de zero a tr�s s�o descritos como Love, Quinze, Trinta e Quarenta, respectivamente.
3. Se pelo menos tr�s pontos foram marcados por cada jogador e resultados s�o iguais, o resultado � Deuce.
4. Se pelo menos tr�s pontos foram marcados por cada jogador e um tiver um ponto a mais que o advers�rio, a pontua��o do jogo � Vantagem para o jogador na lideran�a.

Voc� s� precisa informar a pontua��o para o jogo atual. Conjuntos e jogos est�o fora do escopo.

O c�digo utilizado neste reposit�rio est� dispon�vel em: [fonte](https://github.com/emilybache/Tennis-Refactoring-Kata)
