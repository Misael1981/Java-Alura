# Orientação a Objetos em Java

## O que é Orientação a Objetos (OO)?

Imagine o mundo real como um conjunto de objetos: carros, pessoas, casas, etc. Cada um possui características próprias (***atributos***) e realização de ações (***métodos***). A programação voltada a objetos busca modelar esse mundo real no software, organizando o código em torno desses "objetos".

### Em Java, a OO gira em torno de:

- **Classes**: São como moldes para criar objetos. Definem os `atributos` (***variáveis***) e `métodos` (***funções***) que um objeto terá.
- **Objetos**: São instâncias de uma classe. Cada objeto possui seus próprios valores para os atributos.

#### Exemplo:

```
// Classe Carro
public class Carro {
    // Atributos
    String marca;
    String modelo;
    int ano;

    // Método
    void acelerar() {
        System.out.println("O carro está acelerando!");
    }
}
```

### 

```
// Criando um objeto da classe Carro
Carro meuCarro = new Carro();
meuCarro.marca = "Honda";
meuCarro.modelo = "Civic";
meuCarro.ano = 2023;
meuCarro.acelerar();
```

### Conceitos Essenciais:

- **Encapsulamento**: Esconder os detalhes internos de um objeto, expondo apenas o necessário. Isso é feito através de modificadores de acesso (público, privado, protegido).
- **Herança**: Criar novas classes (subclasses) a partir de classes existentes (superclasses), herdando seus atributos e métodos. Isso promove uma reutilização de código.
- **Polimorfismo**: Permitir que objetos de classes diferentes sejam tratados como se fossem de uma mesma classe. Isso torna o código mais flexível e adaptável.

### Por que usar OO em Java?

- **Organização**: O código fica mais organizado e fácil de entender.
- **Reutilização**: A herança permite reutilizar código.
- **Manutenção**: Facilita a manutenção e atualização do código.
- **Modelagem do mundo real**: Permite modelar problemas do mundo real de forma mais natural.

### Exemplo prático: Criando uma classe "Pessoa"

```
public class Pessoa {
    String nome;
    int idade;

    void falar(String frase) {
        System.out.println(nome + ": " + frase);
    }
}
```
```
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.idade = 30;
        pessoa1.falar("Olá, mundo!");
    }
}
```

### [Voltar ao Menu - Aplicando Orientação a Objetos](../menu.md)

