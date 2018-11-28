package ArvoreInvestigadora.ProjetoInvestigacao;
import java.util.LinkedList;
public class Usuario {
	private String nome;
	private String id;
	private String dominio;
	private String email;
	private String funcao;
	private LinkedList<Dispositivo> dispositivos;
	private Integer histograma[];
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDominio() {
		return dominio;
	}
	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public LinkedList<Dispositivo> getDispositivos() {
		return dispositivos;
	}
	public void setDispositivos(LinkedList<Dispositivo> dispositivos) {
		this.dispositivos = dispositivos;
	}
	
	@Override
	public String toString() {
		String string = "-> "+this.id+" ["+this.nome+"]\n"; 
		return string;
	}
}
