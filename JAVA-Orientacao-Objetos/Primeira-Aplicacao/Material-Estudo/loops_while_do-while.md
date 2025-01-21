# Loops while e do-while em Java: Uma explicação interessante

Os loops `while` e `do-while`são ferramentas poderosas em Java que permitem executar um bloco de código repetidamente enquanto uma determinada condição for verdadeira. Vamos entender melhor cada um deles:

## Loop `while`

O loop `while` executa um bloco de código enquanto uma condição especificada é verdadeira. A sintaxe básica é a seguinte:

```
while (condição) {
    // Código a ser executado enquanto a condição for verdadeira
}
```

### Como funciona:

1. A condição é verificada.
2. Se a condição for verdadeira, o código dentro do bloco é executado.
3. A condição é verificada novamente.
4. Os passos 2 e 3 se repetem enquanto a condição permanece verdadeira.

### Exemplo:

```
int contador = 0;
while (contador < 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```

Neste exemplo, o código dentro do loop será executado 5 vezes, pois a condição contador < 5será verdadeira enquanto o valor contadorfor menor que 5.

## Laço `do...while`

O loop `do...while` é semelhante ao `while`, mas com uma pequena diferença: o bloco de código é executado **pelo menos uma vez** antes de a condição ser verificada. A sintaxe básica é a seguinte:

```
do {
    // Código a ser executado pelo menos uma vez
} while (condição);
```

### Como funciona:

1. O código dentro do bloco é executado.
2. A condição é verificada.
3. Se a condição for verdadeira, o código dentro do bloco é executado novamente.
4. Os passos 2 e 3 se repetem enquanto a condição permanece verdadeira.

### Exemplo:

```
int numero = 1;
do {
    System.out.println("Número: " + numero);
    numero++;
} while (numero <= 10);
```

Neste exemplo, o número 1 será impresso na tela, mesmo que a condição `numero <= 10` ainda não seja verdadeira na primeira iteração.

## Quando usar cada loop?

- **while**: Use quando você não tem certeza se o bloco de código precisa ser executado pelo menos uma vez. A condição é verificada antes de cada execução.
- **do-while**: Use quando você precisa garantir que o bloco de código seja executado pelo menos uma vez. A condição é verificada após a primeira execução.

### Considerações importantes:

- **Condição**: A condição deve ser uma expressão booleana que retorna trueou false.
- **Incremento/Decremento**: É comum usar variáveis ​​de controle dentro dos loops para controlar o número de iterações. Essas variáveis ​​são geralmente incrementadas ou decrementadas a cada iteração.
- **Loop infinito**: Se a condição nunca se tornar falsa, o loop continuará indefinidamente, causando um loop infinito.

### Em resumo:

Os loops `while` e `do-while`são ferramentas essenciais para a programação em Java, permitindo que você automatize tarefas repetitivas e crie programas mais dinâmicos. A escolha entre um loop whileou do-whiledepende de sua lógica específica e de se o bloco de código precisa ser executado pelo menos uma vez.

### [Menu - Java: Criando sua Primeira Aplicação](./menu.md)