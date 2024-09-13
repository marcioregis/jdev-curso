package cursojava.classes;

/*Esta é nossa classe/obejeto que representa o Aluno */
public class Aluno {
	
	/* Esses são os atributos do Aluno(nome,idade,dataNasc...)
	   instancia = new 
	   referencia = variavel aluno() */
	
	String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	
	/*Contrutores*/
	public Aluno() { /*Cria os dados na memoria*/
	
	}
	
 	public Aluno(String nomePadrao) {
 		nome = nomePadrao;
 	}
 	
 	public Aluno (String nomePadrao, int idadePadrao) {
 		nome = nomePadrao;
 		idade = idadePadrao;
 	}
	
}
