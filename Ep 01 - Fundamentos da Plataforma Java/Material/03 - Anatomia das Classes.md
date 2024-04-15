# Anatomia das Classes em Java

As classes são componentes fundamentais da linguagem Java, permitindo a criação de objetos, que são instâncias dessas classes. Aqui está uma explicação simples da anatomia de uma classe em Java:

```java
public class MinhaClasse {
    // Campos (ou atributos) da classe
    private int meuCampoInteiro;
    private String meuCampoString;
    
    // Construtor da classe
    public MinhaClasse(int inteiroInicial, String stringInicial) {
        this.meuCampoInteiro = inteiroInicial;
        this.meuCampoString = stringInicial;
    }
    
    // Métodos da classe
    public void meuMetodo() {
        System.out.println("Método da classe!");
    }
    
    // Getter e setter para os campos
    public int getMeuCampoInteiro() {
        return this.meuCampoInteiro;
    }
    
    public void setMeuCampoInteiro(int novoValor) {
        this.meuCampoInteiro = novoValor;
    }
    
    public String getMeuCampoString() {
        return this.meuCampoString;
    }
    
    public void setMeuCampoString(String novoValor) {
        this.meuCampoString = novoValor;
    }
}
```
- Declaração da Classe: A palavra-chave class é usada para declarar uma classe em Java. No exemplo acima, temos uma classe chamada MinhaClasse.

- Campos (ou Atributos): Os campos representam os dados que pertencem a uma classe. No exemplo, meuCampoInteiro e meuCampoString são campos da classe MinhaClasse.

- Construtor: O construtor é um método especial chamado no momento da criação de um objeto. Ele inicializa os campos da classe. No exemplo, o construtor MinhaClasse aceita dois parâmetros para inicializar os campos meuCampoInteiro e meuCampoString.

- Métodos: Os métodos representam o comportamento da classe. No exemplo, meuMetodo é um método que imprime uma mensagem na saída padrão.

- Getters e Setters: São métodos utilizados para acessar (get) e modificar (set) os campos de uma classe de forma controlada. Eles garantem encapsulamento, permitindo o acesso seguro aos campos da classe. No exemplo, há métodos getters e setters para os campos meuCampoInteiro e meuCampoString.

Essa é uma visão básica da estrutura de uma classe em Java, mas à medida que você avança em seus estudos, encontrará conceitos mais avançados e técnicas de programação orientada a objetos em Java.