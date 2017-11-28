# Trabalho GoF

Implemente a arquitetura do sistema (não precisa funcionar, mas a arquitetura deve estar correta) tomando como base os casos de uso e modelo de domínio fornecidos (vide site da disciplina). Implemente o projeto respeitando as seguintes restrições arquiteturais e de design. Para cada restrição implemente o padrão de projeto do GoF apropriado.

**1. A classe que gerencia as conexões com o banco de dados (ou outra forma de persistência) deve ter somente uma instância.**

**2. Respeite a arquitetura DDD e forneça interfaces bem definida e centralizadoras para acesso as camadas.**

**3. Os comandos que a aplicação realizará serão passados para ela utilizando um parâmetro do tipo string. Interprete esta string identificando o comando que a aplicação irá realizar e implemente uma classe de tratamento para cada comando.**

**4. Forneça de uma forma flexível e que possa ser adicionada em tempo de execução a necessidade de autenticação para execução de um comando.**

**5. Forneça uma estrutura composta para representar o índice de um livro. Um índice é um conjunto de seções. Uma seção é um conjunto de subseções. As subseções podem ter subseções, e assim por diante, não tendo um limite para os níveis de hierarquia do índice.**

**6. Forneça um mecanismo para percorrer e imprimir o índice de uma forma sequencial sem expor a estrutura interna do índice. O cliente que consumir este recurso deve atuar pedindo sempre o próximo elemento do índice, podendo assim percorrer todos eles de forma transparente.**

**7. Forneça um mecanismo de notificação dos usuários aguardando por um livro que atue da seguinte maneira. Os usuários aguardando por um livro são organizados em uma fila sequencial por ordem de cronológica de pedido. Quando um livro é devolvido os usuários são notificados na ordem da fila. Caso eles possam tomar um livro como empréstimo ele recebem uma mensagem sobre isto, caso contrário, repassa a solicitação para o próximo usuário na cadeia.**

**8. Forneça fábricas apropriadas para criação de agregados.**

**9. Forneça um algoritmo padrão para o cálculo do total de multas de um determinado usuário. Este algoritmo deve ser independente da fórmula de cálculo da multa específica de um livro, devendo utilizar somente a interface do método (abstrato).**

**10. Faça com que os métodos da classe livro respondam de forma adequada dependendo do estado de reserva deste para um usuário. Organize os métodos em classes por estado da reserva.**

**11. Crie pelo menos mais uma estratégia, diferente da enunciada no caso de uso, para os métodos podeReservar e podeTomarEmpréstimo da classe usuário. Faça com que o usuário possa aderir a uma das estratégias de reserva e empréstimo dinamicamente.**

**12. Considere que a autenticação do sistema será realizada através de uma API de autenticação coorporativa. Contudo, como utilizamos o DDD no projeto o método autenticar deve estar na classe de domínio correspondente, no caso, Usuário. Crie o método autenticar de usuário como uma adaptação da API de autenticação coorporativa. Esta API deve estar representada em outra classe que não usuário.**

**13. Considere que a sua biblioteca agora aceita um novo tipo de livro, os livros virtuais. Contudo há diferenças grandes em empréstimos de livros virtuais, pois não existem exemplares físicos, ou seja, não há limites para empréstimos de um mesmo livro. Faça com que o sistema tenha duas linhas de produto, Livro Físico e Livro Virtual e trabalhe de forma homogênea para criação das classes associadas as estas linhas de produto.**
