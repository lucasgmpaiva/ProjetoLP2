package ArvoreInvestigadora.ProjetoInvestigacao;
import java.util.LinkedList;

public class No {
	private Tipo tipo;
	private LinkedList<No> filhos;
	private Integer histograma[];
	
	public No(Tipo tipo, LinkedList<No> filhos) {
		this.tipo = tipo;
		this.filhos = filhos;
		this.histograma = new Integer[24];
	}
	
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public LinkedList<No> getFilhos() {
		return filhos;
	}
	public void setFilhos(LinkedList<No> filhos) {
		this.filhos = filhos;
	}

	public Integer[] getHistograma() {
		return histograma;
	}
	public void setHistograma(Integer[] histograma) {
		this.histograma = histograma;
	}

	public void addChilds(No filho) {
		if (filho.getTipo() != null) {
			if (filhos == null) {
				filhos = new LinkedList<No>();
				filhos.add(filho);
			} else {
				filhos.add(filho);
			}
		}
	}	
}
