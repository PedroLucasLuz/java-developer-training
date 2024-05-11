# Controle de Fluxo em Processo Seletivo

Vamos explorar diferentes cenários em um processo seletivo, utilizando controle de fluxo condicional e repetição.

## Caso 1

Suponha que em um processo seletivo o valor base salarial seja R$ 2.000,00 e cada candidato informe seu salário pretendido. Vamos criar um controle de fluxo conforme as seguintes condições:

- Se o salário base for maior que o salário pretendido, imprima: **LIGAR PARA O CANDIDATO**.
- Senão, se o salário base for igual ao salário pretendido, imprima: **LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA**.
- Caso contrário, imprima: **AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS**.

## Caso 2

Para garantir que apenas no máximo 5 candidatos com salário pretendido menor ou igual ao salário base sejam selecionados para entrevista, utilizaremos a seguinte lista de candidatos e um método para simular o valor pretendido:

```java
// Array com a lista de candidatos
String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};

// Método que simula o valor pretendido
import java.util.concurrent.ThreadLocalRandom;

static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
}
```
## Caso 3

Para imprimir a lista dos candidatos selecionados, a fim de disponibilizá-la para o RH entrar em contato.

## Caso 4

O RH deverá realizar uma ligação para os candidatos selecionados, com no máximo 03 tentativas para cada candidato. Após as tentativas, imprima:

- Se conseguir contato: **"CONSEGUIMOS CONTATO COM [CANDIDATO] APÓS [TENTATIVA] TENTATIVA(S)"**.
- Caso contrário: **"NÃO CONSEGUIMOS CONTATO COM O [CANDIDATO]"**.
