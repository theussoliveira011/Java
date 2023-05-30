package matheus.tbm.maratonaJava.javacore.Hheritage.test;

import matheus.tbm.maratonaJava.javacore.Hheritage.domains.Funcionario;

public class HerançaTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Ricardo");
        /*
         Ordem de inicialização de uma classe que herda de outra classe.
         1 - Blocos de inicialização estático. ¹° SuperClasse
         2 - Bloco de inicialização estático. ²° SubClasse
         3 - Alocado espaço em memória pro objeto. ¹° SuperClasse
         4 - Blocos de inicialização na ordem em que aparecem. ¹° SuperClasse
         5 - Construtor. ¹° SuperClasse
         6 - Alocado espaço em memória pro objeto. 2°SubClasse.
         7 - Blocos de inicialização na ordem em que aparecem. 2° SubClasse
         8 - Construtor. ²° SubClasse

        Os Atributos da SuperClasse e SubClasse são iniciados com valores 'default' ou o que for passado como parâmetro.

        output:
        * Dentro do bloco de inicialização estático de pessoa
          Dentro do bloco de inicialização estático de Funcionário
          Dentro do bloco de inicialização de pessoa 1
          Dentro do bloco de inicialização de pessoa 2
          Dentro do construtor de Pessoa
          Dentro do bloco de inicialização de Funcionário 1
          Dentro do bloco de inicialização de Funcionário 2
          Dentro do construtor de Funcionário
        * */
    }

}
