# Java

Estou documentando todo meu aprendizado nessa linguagem, para que me ajude no futuro com conceitos "básicos" e espero que possa ajudar a outros como eu.


# Por que está estudando essa linguagem?
R: De todas as linguagens de programação, Java é a que mais me chama atenção por sua tipagem e também pela organização que o Paradigma Orientado a Objetos proporciona.

# Como eu estou estudando essa Linguagem.
R: Para aprender a sintaxe da língua, sobre Classes e as peculiaridades estou usando a <a href="https://www.youtube.com/playlist?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW">Maratona Dev Dojo</a><br>
R: Porém, paralelo a isso, estou lendo livros para entender como as coisas funcionam por debaixo dos panos.
Eles são: <ul>
	<li>Use a cabeça - Java</li>
	<li>Orientação a Objetos - Aprenda seus conceitos e suas aplicabilidades de forma eletiva</li>
	<li>Algoritmos e Estrutura de Dados em Java</li>
</ul>
R: Não leio todos de uma vez, mas se pudesse indicar eu recomendaria começar por "Orientação a Objetos", é através dele que você entenderá o que são as estruturas, o que são objetos como eles funcionam por debaixo dos planos, com ele você conseguirá entender as diferenças entre o paradigma estruturado e o paradigma OO.

# Tipos primitivos em Java
``` java
int, byte, long, char, short, float, double and boolean
```

# POO - Definição e Aplicabilidade.
Definição segundo o Wikipédia: <em>"A Orientação a Objetos é um paradigma de análise, projeto e programação de Sistemas de software baseado na composição e interação entre diversas unidades de software chamadas de objetos"</em>.


O POO em sua essência visa melhorar complexidades que a Programação Estruturada possui, por exemplo a reutilização de códigos <strong>Herânça</strong>, a capacidade de um trecho de código fazer apenas uma tarefa <strong>Coesão</strong> e também a capacidade de um código se relacionar com outro trecho de código <strong>Acoplamento</strong>.
<i>Lembrando... uma linguagem que usa o Paradigma Estruturado, consegue fazer Herânça, Coesão e Acoplamento, porém a complexidade para atingir esses termos é muito grande</i> 

Ela representa de forma mais eficaz as características e necessidades que um Software possue.

## POO - Principios.

<strong>Reúso</strong> -> Em Linguagens de Programação nota-se que duas coisas podem ser reutilizadas: Comportamentos - <em>Operações, serviços e açoes</em> - e Informações - <em>Dados e características.</em>
Obs: Para se atingir o Reuso atráves de Linguagens Estruturadas é necessário um código mais complexo, o que o torna mais propricio a erros.
<br><br>
<strong>Coesão</strong> -> Este princípio diz que cada trecho de código deve ser responsável por apenas uma função.
<br><br>
<strong>Acoplamento</strong> -> Citação do livro <em>"Poo - Aprenda seus conceitos e aplicabilidades"</em>: Acoplamento é uma conexão, união ou ligação entre dois ou mais corpos, formando um único conjunto. Para a computação, acoplamento é o nível de interdependência entre os códigos de um programa de computador.
<br><br>

## POO - Fundamentos
<strong>Abstração</strong>Significado segundo o dicionário Michaelis: <em>"Processo pelo qual se isolam características de um objeto, considerando os que tenham em comum certos grupos de objetos".</em> Uma abstração por natureza será incompleta, mas isso não quer dizer que ela não terá utilidade. Na verdade, isso a torna valiosa, pois apartir dessa abstração podemos modelas, adicionar e editar novas características.
<strong>EXEMPLO:</strong> Imagine que uma fábrica de motos fosse representar da maneira mais simples <i>(Abstrata)</i> os produtos que ela fábrica e vende. Ela não saberia todos os tipos de moto que poderia fabricas, mas saberia que uma moto precisa de acento, motor, pneus e etc...<br>
E apartir dessa abstração pode-se criar novos modelos de moto, onde uma moto pode ter 3 rodas, uma outra moto pode ter o acento reclinável e assim se segue.
<br><br><br>
<strong>Encapsulamento</strong>: Tornar o complexo, simples e tragável.<br>
Com o encapsulamento podemos esconder toda a complexidade do código e retornar apens o resultado esperado.

# POO - Estrutural

## Classe

As Classes são a estrutura miníma <strong>necessária</strong> de um Código OO.<br>
Antes de existir um <strong>Objeto</strong> é necessário existir uma classe, isso nos mostra que não é possível criar objetos sem que existam classes.
<br><br>
A Classe é a abstração inicial de um produto ou <em>"abstração de uma entidade"</em>. <br>
Seja ela <strong style="font-size:24px;">Física</strong><em> (Bola, pessoa)</em> ou <strong style="font-size:24px;">Conceitual</strong> <em> (viagem, venda, estoque e etc...)</em>
<br><br>
<strong style="font-size:35px;">Dica</strong><br>
Para facilitar o processo de indentificação das necessidades de um software o ponto de partida é pensar em <strong><em>Substantivos</em></strong>.
<br>
Ex: Imagine que precisamos desenvolver um site de vendas online, entidades como Venda, Cliente, Fornecedor, Produto.
<br><br>
```java
	public class Cliente{
    	// Implementação aqui
	}

	public class Venda{
    	// Implementação aqui
	}
    
    public class Fornecedor{
		// Implementação aqui
	}
    
    public class Produto{
    	// Implementação aqui
	}
```
<br>

## O Atributo
<br>
Os atributos de uma classe, são suas características. Imagine nossa classe <strong>Cliente</strong>, como atributos poderiámos ter <em>Nome, CPF, Email, RA e etc...</em>

```java
public class Cliente{
    // Características
	int id;
    	String nome;
    	String CPF;
    	String Email;
}
```
<br>
<strong>Em Java é necessário informar o tipo e variável que será criada</strong>
<br><br>

## O Método

Método é um trecho de código, disponibilizado pela Classe.<br>
É executado quando é feita uma requisição a ele.
<br><br>

<strong style="font-size:35px;">Dica</strong><br>
Para facilitar a indentificação de um método pense em verbos.<br>
Por exemplo, a classe <strong>Cliente</strong> pode ter os métodos <em>getNome, getCPF, getEmail, setEmail, setNome, setCPF</em>.

```java
public class Cliente{
	// Características
	int id;
	String nome;
	String CPF;
	String email;
    
    // Métodos
	// setters
	public void setNome(String nome){
        this.nome = nome;
	}
    
    public void setCPF(String CPF){
		this.CPF = CPF;
	}
    
    public void setEmail(String email){
        this.email = email;
	}
    
    // getters
	public int getId(){
    	return id;    
	}
    
	public String getNome(){
        return nome;
	}
    
	public String getCPF(){
		return CPF;
	}

	public String getEmail(){
		return email;
	}
}
```
<br>
Nos Métodos <strong>getters</strong> temos que informar o tipo de retorno da variável.
<br>
<strong style="font-size:30px">Lembrete: </strong> <em>Na Linguagem Java o retorno informado deve ser retornado</em>.<br>

![Alt text](/image/tipoDeRetorno.png "return type")