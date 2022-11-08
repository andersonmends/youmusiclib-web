# YouMusicLib

Projeto idealizado para ser uma biblioteca de músicas com acesso via streaming, semelhante ao Spotify e outros apps. Inicialmente pensado o back-end em Java e o front-end em JSF.

![screenshot01](https://github.com/andersonmends/youmusiclib-web/blob/master/img1.png)
https://github.com/andersonmends/youmusiclib-web/blob/master/01.png

Esse projeto pessoal também foi usado como parte da minha dissertação de mestrado na UFAL, que visava avaliar o desempenho de linguagens para aplicações web que fizesse uso de streaming, em termos de CPU, de uso de memória RAM, de tempo de resposta e de taxa de transferência. A seguir um resumo da dissertação para quem possa interessar:

# UM MÉTODO PARA APOIAR DECISÕES DE PROJETO EM APLICAÇÕES WEB COM STREAMING DE MÍDIA VISANDO DESEMPENHO E ESCALABILIDADE

# RESUMO

O presente trabalho tem
como finalidade a investigação de tecnologias de desenvolvimento Web que possam auxiliar projetos de aplicações baseadas em streaming de mídia. Para tal, foi proposto um método que é aplicado no contexto desse trabalho como um caso teste. Entre as diversas etapas, é feito um estudo comparativo das principais tecnologias (linguagem de programação e framework) utilizadas atualmente, destacando as duas mais promissoras pra uma comparação mais detalhada: uma tecnologia baseada em Java e outra baseada em Python. A seleção de
uma arquitetura de referência a ser utilizada como base para o projeto e implementação das aplicações de teste. Também é utilizado um método de avaliação de desempenho e
escalabilidade através benchmarking, onde foram definidos cenários com 10, 100 e 1000 usuários executando pelo período de 20 minutos em um ambiente controlado. As tecnologias
foram avaliadas em termos de uso de CPU, uso de memória RAM, tempo de resposta e taxa de transferência com uso de pseudo streaming. Como resultado da aplicação do método, temos
que Java tende a ter melhor desempenho em algumas métricas, à medida que a quantidade de usuários cresce; enquanto Python se mostra constante e uma boa solução em cenários
com menos usuários.


As linguagens que foram selecionado após alguns critério previamente definidos fora, Java e Python, então o benchamarking é em relação as duas linguagens. Segue o a organização
do texto para melhor compreensão do que foi executado.


• Capítulo 2 – Streaming, Avaliação de Desempenho e Tecnologias Web Nesse capítulo

são descritas as principais tecnologias que estão inseridas no contexto de streaming de mídia. São abordados aspectos sobre avaliação de desempenho em sistemas, incluindo
técnicas, métricas e procedimentos recomendados. Assim como as tecnologias de desenvolvimento Web que podem ser usadas para desenvolver aplicações com streaming
de mídia.

• Capítulo 3 – Método para Seleção da Tecnologia de Desenvolvimento Adotada. Nessa parte do trabalho é apresentando com maior detalhe a composição do método adotado.

• Capitulo 4 – Seleção das Linguagens. Nesta capítulo é aplicado parte do método referentes as linguagens de programação e frameworks que estão em destaque na
atualidade, identificando as mais promissoras, definindo os critérios de escolha, e então determinando quais farão parte da aplicação teste do trabalho.

• Capitulo 5 – Arquiteturas de Referência e Especificação da Aplicação do Experimento. Aqui são apresentadas as arquitetura dos principais sistemas Web de streaming,
e definido a arquitetura de referência para as aplicações Web. São abordadas também algumas fases do desenvolvimento dos sistemas do experimento, tais como objetivo do
sistema, levantamento de requisitos, diagrama de casos de uso, diagrama de classes de análise e implementação das aplicações.

• Capítulo 6 – Benchmarking e Resultados. Neste capítulo é apresentada a última etapa de aplicação do método, com a condução e execução dos experimentos, através de
benchmarking entres os sistemas desenvolvidos, de acordo com os cenários definidos. Também são apresentados os resultados obtidos na avaliação de cada uma das
aplicações em termos de consumo de CPU, uso de memória, tempo de resposta e taxa de transferência.

• Capítulo 7 – Conclusão. Por fim, são apresentadas algumas considerações finais do estudo em questão, assim como direcionamentos para trabalhos futuros.

Abaixo segue alguns dos resultado:


![image](https://user-images.githubusercontent.com/10708492/140088420-10d07b5b-219b-49dc-ae0b-fd1c32eca677.png)

![image](https://user-images.githubusercontent.com/10708492/140088549-73977aee-234f-4fb2-8ddf-60b4e1ab0ff2.png)

![image](https://user-images.githubusercontent.com/10708492/140088646-4c58a5e0-70b4-4753-ab29-e46858b5afa8.png)



[Dissertacao de Mestrado v. final - UFAL.pdf](https://github.com/andersonmends/youmusiclib-web/files/7468630/Dissertacao.de.Mestrado.v.final.-.UFAL.pdf)



