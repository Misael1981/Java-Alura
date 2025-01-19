public class Principal {
    public static void main(String[] args) {

        Pessoa minhaPessoa = new Pessoa();
        minhaPessoa.exibeSaudacao();

        Calculadora minhCalculadora = new Calculadora();
        System.out.println(minhCalculadora.retornaODobro(60));

        Musica minhasMusicas = new Musica();
        minhasMusicas.titulo = "Faroeste Caboclo";
        minhasMusicas.artista = "Legião Urbana";
        minhasMusicas.anoLancamento = 1986;

        minhasMusicas.avalia(8);
        minhasMusicas.avalia(10);
        minhasMusicas.avalia(9.5);

        System.out.println(minhasMusicas.avaliacao);
        System.out.println(minhasMusicas.numAvaliacao);

        Carro meuCarro = new Carro();
        meuCarro.modelo = "Toyota";
        meuCarro.ano = 2022;
        meuCarro.cor = "Black";

        meuCarro.exibeFichaTecnicaDoCarro();
        System.out.println(meuCarro.retornaIdadeDoCarro());

        Aluno meAluno = new Aluno();
        meAluno.exibeFichaDoAluno();
    }
}
