package ArvoreInvestigadora.ProjetoInvestigacao;
import java.util.LinkedList;

public class Arvore {
	// Criando os nós das árvores
	LinkedList<No> usuarios;

	public Arvore() {
		super();
		this.usuarios = new LinkedList<No>();
	}

	public LinkedList<No> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(LinkedList<No> usuarios) {
		this.usuarios = usuarios;
	}	
}
