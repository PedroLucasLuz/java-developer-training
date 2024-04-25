# Anatomia das Classes em Java

## Declaração da Classe:

Uma classe é declarada usando a palavra-chave `class`, seguida pelo nome da classe.

```java
public class MinhaClasse {
    // Corpo da classe
}
```
## Atributos (Variáveis de Instância):

Os atributos representam as características dos objetos da classe.
Eles são definidos dentro da classe.
Cada objeto da classe terá suas próprias cópias dos atributos.

```java
public class MinhaClasse {
    int idade;
    String nome;
}
```
## Métodos (Funções):

Os métodos representam o comportamento dos objetos da classe.
Eles são definidos dentro da classe.
Os métodos podem ter parâmetros e retornar valores (ou serem void).

```java
public class MinhaClasse {
    void mostrarNome() {
        System.out.println(nome);
    }
}
```
## Construtores:

Os construtores são métodos especiais usados para inicializar objetos quando são criados.
Eles têm o mesmo nome da classe e não têm tipo de retorno explícito.

```java
public class MinhaClasse {
    public MinhaClasse(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }
}
```
## Método main():

O método `main()` é o ponto de entrada para a execução do programa Java.
Ele deve ser público, estático e sem retorno.

```java
public class MinhaClasse {
    public static void main(String[] args) {
        // Corpo do método main
    }
}
```
## Modificadores de Acesso:

Os modificadores de acesso controlam a visibilidade dos membros da classe (atributos, métodos, construtores).
Os principais modificadores são `public`, `private` e `protected`.

```java
public class MinhaClasse {
    private int idade; // Atributo privado
    public void mostrarIdade() { // Método público
        System.out.println(idade);
    }
}
```
## Encapsulamento:

O encapsulamento é uma técnica de proteção dos atributos, tornando-os privados e fornecendo métodos públicos para acessá-los e modificá-los.

```java
public class MinhaClasse {
    private int idade; // Atributo privado
    
    // Métodos públicos para acessar e modificar idade
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }
}
```
Esses são os elementos básicos que constituem uma classe em Java. Com o tempo, você aprenderá a utilizá-los de forma mais avançada e aprofundada.
