# Padrões de Projetos

O padrão traz uma solução para um problema em um contexto.

Tem uma dependência bem forte com OO.

Padrões de projeto é um mapa, ñ estratégia.

**Características:**



*   Devem possuir um nome
*   Descrever os problemas e consequências
*   Descrever quais problemas ele vai solucionar e em quais condições ele vai ser utilizado
*   Descrever os elementos que compõem o projeto, seus relacionamentos, responsabilidades e colaborações

**Quando os padrões não vão ajudar:**



*   Quando você não estiver contextualizado com o problema
*   Você não utilizará o padrão pensando em querer programar com boas práticas, você usará quando você tiver um problema e precisar de uma solução que o padrão pode sanar.

**Anti Padrões:**



*   Os que descrevem soluções ruins que resultam em situações ruins
*   Aqueles que descrevem como se livrar de uma situação ruim e como proceder para uma boa.

**Como eles solucionam problemas**



*   Utilizam recursos chaves da orientação a objetos
*   Podem existir objetos que não condizem com a realidade

**Como selecionar um padrão de projeto**



*   Como os padrões solucionam o problema
*   Verificar a intenção do padrão
*   Como esse padrão se relaciona com os demais
*   Estudar semelhanças existentes entre os padrões
*   Examinar a causa de reformulação do projeto
*   Considerar o que deve ser variável no projeto em vez de forçar uma mudança no projeto.

**Como usar um padrão de projeto**



*   Ler o padrão pro completo uma vez
*   Conhecer principalmente sua aplicabilidade e consequências para que consiga solucionar o seu problema
*   Definir as classes e nomes


## Padrões de criação (Gof -> dividido em 23 partes)



*   Abstrai como é feito a criação
*   Encapsula o conhecimento sobre as classes concretas
    *   Não pode acessar diretamente classes concretas, serão acessadas por meio de abstrações
*   Ocultam o modo como essas classes são criadas e montadas

**Padrões:**



*   **Singleton**
    *   Garante que o objeto vai ter uma única instância, ou seja, ela vai ser instanciada uma única vez no sistema todo.
    *   Algumas aplicações tem a necessidade de controlar o número de instâncias criadas de algumas classes, seja por motivo de performance e economia de recursos ou a própria lógica.
    *   Forma estática que permite aos clientes obterem o objeto único.
*   **Factory Method**
    *   Padrão bem difundido, não há a necessidade de explorar o código feito
    *   Remove acoplamento forte, separa a lógica de negócio e os códigos de criação de instâncias
    *   Com baixo acoplamento, há apenas um local a ser alterado se quiser alterar algo referente ao constructor da classe
*   **Abstract Factory**
    *   **Pontos positivos:** Encapsulamento do código de criação em pontos únicos do projeto, removendo tambem com isso o forte acoplamento entre classes que não deveriam ter um alto nível de relacionamento umas com as outras
    *   **Ponto negativo:** Implementar um Abstract Factory quando um simples Simple Factory ou Factory Method seriam o suficiente, pode piorar a performance do projeto, ainda mais na leitura dele.
*   **Builder**
    *   Separar a construção de um objeto complexo de sua representação de modo que o mesmo processo de construção possa criar diferentes representações.
    *   **Vantagens:**
      * Separar em pequenos passos a construção do objeto complexo.
      *   Builder é bem menor que a dos factorys
    *   **Desvantagem:**
      *   O padrão Builder, não existe o conceito de vários produtos ou de famílias de produtos, como nos outros dois padrões.
      *   Builder foca na divisão de responsabilidades na construção do Produto.
      *   O processo de criação e devolver o produto no final, definindo quais os passos devem ser executados
*   **Prototype**
    *   Gera uma instância de um protótipo e conforme vai se desenvolvendo vai incrementando na instância, a instância não é alterada.
    *   Permite que o cliente instancie vários protótipos, quando um deles não é mais necessário, basta removê-lo. Se é preciso adicionar novos protótipos, basta incluir a instanciação no cliente. Essa flexibilidade pode ocorrer inclusive em tempo de execução.
    *   É preciso garantir que o método de cópia esteja implementado corretamente, para evitar que a alteração nos valores mude todas as instâncias. 
    *   O padrão Prototype leva grande vantagem quando o processo de criação de seus produtos é muito caro, ou mais caro do que uma clonagem.


## Padrões estruturais

   Os padrões estruturais vão se preocupar em como as classes e objetos são compostos, ou seja, como é a sua estrutura. O objetivo destes padrões e facilitar o design do sistema identificando maneiras de realizar o relacionamento entre as entidades, deixando o desenvolvedor livre desta preocupações inerentes a alto acoplamento (por exemplo).



*   **Adapter**
    *   Gambiarra
    *   converte uma interface de uma classe para outra interface que o cliente espera encontrar, permitindo que classes com interfaces incompatíveis trabalhem juntas.
*   **Bridge**
    *   Fornece um nível de abstração maior que o Adapter, pois são separadas as implementações e as abstrações, permitindo que cada uma varie independentemente.
    *   


## Padrões comportamentais:



*   Identifica os padrões de comunicação entre objetos


# 


# **Aula 2**


## Composite

   Funciona como uma pasta do windows, que pode ter arquivos e outras pastas e dentro das outras pastas, mais arquivos e outras pastas, de forma infinita. No composite você terá vários objetos em níveis e você pode navegar sobre esses níveis. É uma árvore.


## Decorator



*   Os decoradores têm o mesmo super tipo que os objetos que eles decoram
*   Você pode usar um ou mais decoradores para englobar um objeto
*   Os objetos podem ser decorados a qualquer momento, de maneira dinâmica no tempo de execução com quantos decoradores desejarmos

**Desvantagens:**



*   Conforme a família for crescendo (decorando objetos), fica difícil entender o todo, de como funciona o todo
*   Difícil rastrear 


## Facade

   Faz um conjunto de coisas por trás de uma única ação, ao ínves de as pessoas acessarem várias partes do projeto, você fornece uma ponta e as pessoas acessam por ela.

**Desvantagens**



*   Pode crescer descontroladamente
*   Pode ser complexo


## FlyWeight

Manipular grandes objetos com uma abstração, cria uma estrutura de compartilhamento de objetos pequenos.

A ideia desse padrão é abstrair as funcionalidades, usar somente o necessário e padrão.


## Proxy

   É uma classe que funciona como camada intermediária entre dois lados. Middleware, etc.



*   **Protection Proxy:** Controlam o acesso aos objetos, por exemplo, verificando se quem chama possui a devida permissão.
*   **Virtual Proxy:** mantém informações sobre o objeto real, adiando o acesso/criação do objeto em si.
*   **Remote Proxy:** fornece um representante local para um objeto em outro espaço de endereçamento.
*   **Smart Reference:** este proxy é apenas um substituto simples para executar ações adicionais quando o objeto é acessado.

	

## Strategy


## Injeção de dependência

   Responsável por injetar as dependências (instâncias). Olha se está implementado, pega uma instância e manda.


## Observer

   É um padrão de projeto que coloca instâncias observando alteração de valores para notificar os dependentes e atualiza-los.


## State

   Permite que o objeto altere seu comportamento quando seu estado mudar, sem precisar de um trilhão de IFs


## Template Method

   Algoritmo flexível que possa ser reaproveitável em outras implementações, define um esqueleto para que siga de exemplo para outras implementações.


## Visitor

   Permite representar uma operação a ser executada nos elementos de uma estrutura de objetos, permitindo gerar novas operações e não exigindo alteração dos objetos.
