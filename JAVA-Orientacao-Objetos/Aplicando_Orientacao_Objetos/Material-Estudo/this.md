# A palavra chave ''this''

***“This”***, traduzindo para o português (Isto/este/esta), é usado para fazer referência aos atributos da classe, especialmente em métodos que têm parâmetros com o mesmo nome do atributo da classe em que estamos trabalhando.

Para compreendermos essa ideia na prática, vamos ver um exemplo:

```
public class Conta { 
    private double saldo;
    private int numero;

    public void deposita(double valor) {
        saldo = saldo + valor;
    }
}
```

Repare que nesse primeiro exemplo, dentro da classe conta, nós temos os atributos `saldo` e `numero`, e em seguida o método deposita, que recebe como parâmetro um `double valor`. Nesse caso, não temos nenhum atributo com o mesmo nome do parâmetro e estamos dentro da classe, o que nos permite utilizar o atributo `saldo` a vontade, sem a necessidade do “`this`”.

Algo diferente ocorre quando temos um atributo da classe com o mesmo nome de um parâmetro de algum método dessa mesma classe:

```
public class Lampada {
    private boolean ligada;
    private String modelo;

    public void acendeLampada(boolean ligada) {
       ligada = ligada;
    }
}
```

Perceba que nesse exemplo, temos um atributo da classe chamado `ligada`, e o método `acendeLampada` que define um novo valor para esse atributo.

O método recebe como parâmetro um boolean que tem o mesmo nome do atributo da classe. É aí que está o problema! O que faríamos para saber quem é o atributo da classe e quem é o parâmetro do método?

Nessa situação vamos fazer o uso da palavra chave “this”:

```
public class Lampada {
    private boolean ligada;
    private String modelo;

    public void acendeLampada(boolean ligada) {
       this.ligada = ligada;
    }
}
```

Podemos concluir então que “this” se refere ao objeto atual e não ao parâmetro do método. É comum usarmos o `this` para eliminar essa confusão entre os atributos e parâmetros, sendo que ele não é uma exclusividade do Java, pois outras linguagens de programação orientadas a objetos também possuem esse recurso.

### [Voltar ao Menu - Aplicando Orientação a Objetos](../menu.md)