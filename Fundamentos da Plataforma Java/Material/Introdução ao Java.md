# INTRODUÇÃO AO JAVA

## **O QUE É LINGUAGEM DE PROGRAMAÇÃO?**

- As linguagens de programação para **solucionar qualquer tipo de problema** na área tecnológica computacional.
- Cada linguagem possui suas **particularidades**.
- Permite que um programador crie programas a partir de um **conjunto de ordens, ações consecutivas, dados e  algoritmos.**
- Java é uma linguagem de script de alto nível e de tipagem forte

## **A LINGUAGEM JAVA**

- **Java** é uma linguagem de programação de propósito geral, orientada a objetos, que foi desenvolvida pela **Sun Microsystems** (agora parte da Oracle Corporation) na década de 1990. Desde então, tornou-se uma das linguagens de programação mais populares e amplamente utilizadas em todo o mundo.
- Ela foi desenvolvida por uma equipe de engenheiros liderada por **James Gosling**, Mike Sheridan e Patrick Naughton, conhecidos como o "Green Team". O trabalho começou em 1991 e a linguagem foi oficialmente lançada em 1995.
- **james Gosling, o pai do Java**
    
    !https://d2bs8hqp6qvsw6.cloudfront.net/article/images/740x500/dimg/m_img_18653.jpg
    

## **PORQUE JAVA?**

- **Plataforma Independente:** Java é conhecido por sua capacidade de ser executado em qualquer plataforma que tenha uma máquina virtual Java (JVM) instalada, garantindo portabilidade.
- **Ampla Aceitação no Mercado**: Java é uma das linguagens de programação mais populares e amplamente adotadas, com uma vasta comunidade de desenvolvedores e muitas oportunidades de carreira.
- **Orientação a Objetos**: Sua forte orientação a objetos promove um código modular, reutilizável e fácil de dar manutenção.
- **Rica Biblioteca Padrão**: Java possui uma extensa biblioteca padrão (Java Standard Edition - SE) que oferece suporte para uma ampla gama de tarefas de programação, desde manipulação de strings até entrada/saída de arquivos e redes.
- **Segurança**: Java é conhecido por sua segurança, com recursos como verificação de tipos, gerenciamento de memória automatizado e sandboxing.
- **Desempenho**: Embora a inicialização da JVM possa ser mais lenta em comparação com linguagens compiladas, o desempenho do código Java pode ser otimizado com o tempo de execução (JIT), resultando em alta performance em aplicações de longa duração.
- **Suporte a Multithreading**: Java oferece recursos poderosos para programação concorrente e multithreading, permitindo o desenvolvimento de aplicativos escaláveis e responsivos.
- **Comunidade e Ecossistema**: Java possui uma comunidade ativa e diversificada, com uma ampla variedade de frameworks, bibliotecas e ferramentas disponíveis para facilitar o desenvolvimento de software em diversos domínios e setores.

# SINTAXE BÁSICA

## ANATOMIA DAS CLASSES

- A anatomia das classes em **Java** segue uma estrutura padrão que define como uma classe é declarada e organizada.
1. **Palavra-chave `public`**: Indica que a classe é acessível de fora do pacote onde está definida. Isso significa que outras classes podem acessá-la.
2. **Palavra-chave `class`**: Indica que estamos definindo uma nova classe.
3. **Nome da Classe**: É o nome que damos à nossa classe. Geralmente, segue convenções de nomenclatura, como **CamelCase**, começando com uma letra maiúscula.
4. **Corpo da Classe `{}`**: Aqui é onde definimos os membros da classe, como atributos e métodos.
5. **Nome do arquivo**: O nome do arquivo deve ser idêntico ao nome da classe pública, com a extensão "**.java**".

```java
public class MinhaClasse {
    // Corpo da classe
}
```

Dentro do corpo da classe, podemos definir atributos (variáveis) e métodos (funções). Por exemplo:

```java
public class MinhaClasse {
    // Atributos
    private int idade;
    private String nome;
    
    // Método construtor
    public MinhaClasse(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }
    
    // Métodos
    public void imprimirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
```

Quanto à sugestão de que apenas uma classe deve ter o método **`main`**, isso é porque o método **`main`** é o ponto de entrada para um programa Java. É onde a execução do programa começa. Porém, é possível ter múltiplas classes definidas em um único arquivo Java. Somente a classe que contém o método **`main`** será utilizada para iniciar a execução do programa.

O método **`main`** é definido da seguinte maneira:

```java
public static void main(String[] args) {
    // Corpo do método main
}
```

Portanto, em um arquivo Java que contenha várias classes, apenas uma delas terá o método **`main`** conforme descrito acima. As outras classes podem ser utilizadas para definir diferentes funcionalidades do programa.

## PADRÃO DE NOMECLATURA

O padrão de nomenclatura em Java é fundamental para manter o código limpo, legível e consistente. Aqui estão as convenções de nomenclatura comumente seguidas:

### **Arquivo .java:**

- Começar com letra MAIÚSCULA.
- Se a palavra for composta, a segunda palavra também deve ser maiúscula.
Exemplos: **`Calculadora.java`**, **`CalculadoraCientifica.java`**

### **Nome da Classe no Arquivo:**

- A classe deve possuir o mesmo nome do arquivo **`.java`**.
Exemplo:

```java
// arquivo CalculadoraCientifica.java

public class CalculadoraCientifica {
    // Corpo da classe
}
```

### **Nome de Variável (camelCase):**

- Começar com letra minúscula.
- Se a palavra for composta, a primeira letra da segunda palavra deve ser MAIÚSCULA.
Exemplos: **`ano`**, **`anoFabricacao`**

### **Constantes (geralmente em letras maiúsculas):**

- Se a variável representar um valor constante e não sofrerá alteração, usar letras MAIÚSCULAS.
- Se a palavra for composta, separar com **`_`** (underline).
Exemplos: **`BR = "Brasil"`**, **`PI = 3.14`**, **`ESTADOS_BRASILEIROS = 27`**, **`ANO_2000 = 2000`**

<aside>
💡 Existe uma regra adicional para variáveis quando na mesma queremos identificar que ela não sofrerá alteração de valor, exemplo: queremos determinar que uma variável de nome **br** sempre representará **"Brasil"** e nunca mudará seu valor, logo, determinamos como escrita o código abaixo:

</aside>

<aside>
⚠️ Recomendações: Para declarar uma variável nós podemos utilizar caracteres, números e símbolos, porém devemos seguir algumas regras da linguagem.

</aside>

### **Recomendações para Nome de Variável:**

- Pode conter apenas letras, **`_`** (underline), **`$`** ou números de 0 a 9.
- Deve obrigatoriamente iniciar com uma letra, **`_`** ou **`$`**, jamais com número.
- Deve iniciar com uma letra minúscula (boa prática).
- Não pode conter espaços.
- Não podemos usar palavras-chave da linguagem.
- O nome deve ser único dentro de um escopo.

### **Exemplos de Declaração de Variáveis:**

```java
// Declaração inválida de variáveis
int numero&um = 1; // Os únicos símbolos permitidos são _ e $
int 1numero = 1;    // Uma variável não pode começar com número
int numero um = 1; // Não pode ter espaço no nome da variável
int long = 1; // "long" faz parte das palavras reservadas da linguagem

// Declaração válida de variáveis
int numero$um = 1;
int numero1 = 1;
int numeroum = 1;
int longo = 1;
```

<aside>
💡 Seguir essas convenções de nomenclatura torna o código mais fácil de entender e colaborar, além de ajudar na manutenção e na detecção de erros.

</aside>