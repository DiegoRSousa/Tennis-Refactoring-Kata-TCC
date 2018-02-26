# Tennis Refactoring Kata

Imagine que você trabalha para uma empresa de consultoria, e um de seus colegas tem feito algum trabalho para Tennis Society. O contrato é para 10 horas de trabalho faturável, e seu colega passou 8.5 horas trabalhando nisso. Infelizmente ele ficou doente. Ele diz que completou o trabalho, e todos os testes passaram. Seu chefe pediu que você se apropriasse dele. Ele quer que você gaste uma hora ou mais no código para que ele possa faturar o cliente por 10 horas completas. Ele instruiu para que você a arrume o código um pouco e talvez faça algumas anotações para que você possa dar ao seu colega alguns comentários sobre o design escolhido. Você também deve se preparar para conversar com o seu chefe sobre o valor dessa refatoração, além das horas adicionais faturáveis.

Existem três versões deste kata de refatoração, cada um com seus próprios cheiros de código e desafios. Sugiro que você inicie pelo primeiro, com a classe TennisGame1. O conjunto de testes fornecido é bastante abrangente e rápido para executar. Você não precisa mudar os testes, apenas executá-los com frequência enquanto você refatora o código.

Se você gostar desse kata, você pode estar interessado no meu livro, The Coding Dojo Handbook.

## Tennis Kata

O jogo tênis tem um sistema de pontuação bastante peculiar e, para os recém chegados, pode ser um pouco difícil de acompanhar. A sociedade de tênis contratou você para construir um placar para exibir a pontuação atual durante os jogos de tênis.

Sua tarefa é escrever uma classe TennisGame contendo a lógica que produz a pontuação correta em um string para exibição no placar. Quando um jogador marca um ponto, ele desencadeia um método para ser chamado em sua classe, informando quem marcou o ponto. Mais tarde você receberá uma chamada pontuacao() do placar perguntando o que deve exibir. Esse método deve retornar uma string com a pontuação atual.

Abaixo um resumo sobre as regras de pontuação do jogo tênnis:

1. Um game é ganho pelo primeiro jogador a ganhar pelo menos quatro pontos no total e pelo menos dois pontos a mais do que o oponente.
2. A pontuação de execução de cada jogo é descrita de forma peculiar para o tênis: os pontos de zero a três são descritos como Love, Quinze, Trinta e Quarenta, respectivamente.
3. Se pelo menos três pontos foram marcados por cada jogador e resultados são iguais, o resultado é Deuce.
4. Se pelo menos três pontos foram marcados por cada jogador e um tiver um ponto a mais que o adversário, a pontuação do jogo é Vantagem para o jogador na liderança.

Você só precisa informar a pontuação para o jogo atual. Conjuntos e jogos estão fora do escopo.

O código utilizado neste repositório está disponível em: [fonte](https://github.com/emilybache/Tennis-Refactoring-Kata)
