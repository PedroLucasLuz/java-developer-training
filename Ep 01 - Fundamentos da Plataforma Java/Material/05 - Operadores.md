# Operadores em Java

Os operadores em Java são símbolos especiais que realizam operações em operandos, como variáveis e valores, produzindo um resultado. Eles são usados para realizar cálculos, comparações, atribuições e outras operações.

## 1. Operadores Aritméticos

Os operadores aritméticos são utilizados para realizar operações matemáticas básicas.

- **Adição (+):** Soma dois operandos.
- **Subtração (-):** Subtrai o operando direito do operando esquerdo.
- **Multiplicação (*):** Multiplica dois operandos.
- **Divisão (/):** Divide o operando esquerdo pelo operando direito.
- **Módulo (%):** Retorna o resto da divisão do operando esquerdo pelo operando direito.

```java
public class OperadoresExemplo {
    public static void main(String[] args) {
        // Operadores aritméticos
        int a = 10;
        int b = 5;
        int soma = a + b; // Soma: 15
        int subtracao = a - b; // Subtração: 5
        int multiplicacao = a * b; // Multiplicação: 50
        int divisao = a / b; // Divisão: 2
        int modulo = a % b; // Módulo: 0
    }
}
```

## 2. Operadores de Atribuição

Os operadores de atribuição são usados para atribuir valores a variáveis.

- **Atribuição simples (=):** Atribui o valor do operando direito ao operando esquerdo.
- **Atribuição com Adição (+=):** Adiciona o valor do operando direito ao operando esquerdo e atribui o resultado ao operando esquerdo.
- **Atribuição com Subtração (-=):** Subtrai o valor do operando direito do operando esquerdo e atribui o resultado ao operando esquerdo.
- **Atribuição com Multiplicação (*=):** Multiplica o valor do operando direito pelo operando esquerdo e atribui o resultado ao operando esquerdo.
- **Atribuição com Divisão (/=):** Divide o valor do operando esquerdo pelo operando direito e atribui o resultado ao operando esquerdo.
- **Atribuição com Módulo (%=):** Calcula o módulo do operando esquerdo pelo operando direito e atribui o resultado ao operando esquerdo.

```java
public class OperadoresExemplo {
    public static void main(String[] args) {  
        // Operadores de atribuição
        int resultado = 0;
        resultado += soma; // Adição e atribuição: 15
        resultado -= subtracao; // Subtração e atribuição: 10
        resultado *= multiplicacao; // Multiplicação e atribuição: 500
        resultado /= divisao; // Divisão e atribuição: 250
        resultado %= modulo; // Módulo e atribuição: 0
    }
}
```

## 3. Operadores Relacionais

Os operadores relacionais são utilizados para comparar valores.

- **Igual (==):** Verifica se dois operandos são iguais.
- **Diferente (!=):** Verifica se dois operandos são diferentes.
- **Maior que (>):** Verifica se o operando esquerdo é maior que o operando direito.
- **Menor que (<):** Verifica se o operando esquerdo é menor que o operando direito.
- **Maior ou igual (>=):** Verifica se o operando esquerdo é maior ou igual ao operando direito.
- **Menor ou igual (<=):** Verifica se o operando esquerdo é menor ou igual ao operando direito.

```java
public class OperadoresExemplo {
    public static void main(String[] args) {
        // Operadores relacionais
        boolean igual = a == b; // Igualdade: false
        boolean diferente = a != b; // Diferença: true
        boolean maiorQue = a > b; // Maior que: true
        boolean menorQue = a < b; // Menor que: false
        boolean maiorOuIgual = a >= b; // Maior ou igual: true
        boolean menorOuIgual = a <= b; // Menor ou igual: false
    }
}
```

## 4. Operadores Lógicos

Os operadores lógicos são utilizados para combinar expressões condicionais.

- **E lógico (&&):** Retorna verdadeiro se ambas as expressões forem verdadeiras.
- **OU lógico (||):** Retorna verdadeiro se pelo menos uma das expressões for verdadeira.
- **NÃO lógico (!):** Inverte o valor de uma expressão lógica.

```java
public class OperadoresExemplo {
    public static void main(String[] args) {
        // Operadores lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;
        boolean resultadoE = condicao1 && condicao2; // E lógico: false
        boolean resultadoOU = condicao1 || condicao2; // OU lógico: true
        boolean resultadoNao = !condicao1; // NÃO lógico: false
    }
}
```

## 5. Operadores de Incremento e Decremento

Os operadores de incremento e decremento são utilizados para aumentar ou diminuir o valor de uma variável em uma unidade.

- **Incremento (++):** Aumenta o valor da variável em uma unidade.
- **Decremento (--):** Diminui o valor da variável em uma unidade.

```java
public class OperadoresExemplo {
    public static void main(String[] args) {
        // Operadores de incremento e decremento
        int contador = 0;
        contador++; // Incremento: 1
        contador--; // Decremento: 0
    }
}
```

## 6. Operadores de Bitwise

Os operadores de bitwise são utilizados para realizar operações de bit a bit em operandos inteiros.

- **AND Bit a Bit (&):** Realiza a operação AND em cada par de bits.
- **OR Bit a Bit (|):** Realiza a operação OR em cada par de bits.
- **XOR Bit a Bit (^):** Realiza a operação XOR em cada par de bits.
- **NOT Bit a Bit (~):** Inverte todos os bits de um operando.

```java
public class OperadoresExemplo {
    public static void main(String[] args) {
        // Operadores bitwise
        int x = 5; // Representado em binário: 101
        int y = 3; // Representado em binário: 011
        int resultadoAND = x & y; // Resultado em binário: 001 (1 em decimal)
        int resultadoOR = x | y; // Resultado em binário: 111 (7 em decimal)
        int resultadoXOR = x ^ y; // Resultado em binário: 110 (6 em decimal)
        int resultadoNOT = ~x; // Resultado em binário: 11111111111111111111111111111010 (-6 em decimal)
    }
}
```

## 7. Operadores de Deslocamento de Bits

Os operadores de deslocamento de bits são utilizados para deslocar os bits de um número para a esquerda ou para a direita.

- **Deslocamento para a Esquerda (<<):** Desloca os bits de um número para a esquerda, preenchendo os bits deslocados com zeros.
- **Deslocamento para a Direita (>>):** Desloca os bits de um número para a direita, preenchendo os bits deslocados com o bit mais significativo do número original.
- **Deslocamento para a Direita sem Sinal (>>>):** Desloca os bits de um número para a direita, preenchendo os bits deslocados com zeros.

Estes são os principais operadores em Java utilizados para realizar diferentes tipos de operações em variáveis e valores. O entendimento desses operadores é fundamental para o desenvolvimento de aplicativos Java eficazes.

```java
public class OperadoresExemplo {
    public static void main(String[] args) {
        // Operadores de deslocamento de bits
        int numero = 8; // Representado em binário: 1000
        int deslocamentoEsquerda = numero << 2; // Resultado em binário: 100000 (32 em decimal)
        int deslocamentoDireita = numero >> 1; // Resultado em binário: 100 (4 em decimal)
        int deslocamentoDireitaSemSinal = numero >>> 1; // Resultado em binário: 100 (4 em decimal)
    }
}
```