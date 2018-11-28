package ArvoreInvestigadora.ProjetoInvestigacao;
import java.util.LinkedList;
public class Dispositivo {
	private String id;
	private Data data;
	private String pc;
	private LinkedList<Atividade> atividades;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public String getPc() {
		return pc;
	}
	public void setPc(String pc) {
		this.pc = pc;
	}
	public LinkedList<Atividade> getAtividades() {
		return atividades;
	}
	public void setAtividades(LinkedList<Atividade> atividades) {
		this.atividades = atividades;
	}
}
