package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	/*Main é um metodo auto executavel em java*/
	public static void main(String[] args) {
		
		/* new Aluno é uma instancia (Criação de um Objeto)*/
		/* aluno1 é uma referencia para o obejeto aluno*/
		Aluno aluno1 = new Aluno(); /*Aqui sera o aluno Joao*/
		
		Aluno aluno2 = new Aluno(); /*Aqui sera o aluno Pedro*/
		
		Aluno aluno3 = new Aluno(); /*Aqui sera o aluno MArcio*/
		
		Aluno aluno4 = new Aluno("Maria"); /*O valor padrao é Maria */
		
		Aluno aluno5 = new Aluno("Jose", 50);
		
	}
}
