package estruturaDeDados;

public class Aluno {

	private String nome; // Atributo (variável)
	private int idade;
	
	public String getNome() { // getAlgumaCoisa
		return nome;
	}
	
	public void setNome(String nomeQueDouNoMomentoDaInstanciacao) { // setAlgumaCoisa = Setar = Fazer
		this.nome = nomeQueDouNoMomentoDaInstanciacao;
	}
	
	public String toString() {
		return this.nome;
	}
	
	// Serve para comparar dois objetos do tipo Aluno
	public boolean equalsObject(Object object) {
		Aluno outro = (Aluno)object;
		return this.nome.equals(outro.nome);
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
//	Aluno aluno1 = new Aluno();
//	Aluno aluno2 = new Aluno();
//	Aluno aluno3 = new Aluno();
//	Cliente cliente1 = new Cliente();
//	
//	aluno1.setNome("Ana");
//	aluno1.getNome();
	
//	cliente1.setNome()

}

