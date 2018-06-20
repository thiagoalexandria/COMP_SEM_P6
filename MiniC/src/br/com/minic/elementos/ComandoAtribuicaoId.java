package br.com.minic.elementos;

public class ComandoAtribuicaoId implements IComando{

	private String tipo;
	private Identificador identificador;
	private DeclIdOpt declidopt;
	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Identificador getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Identificador identificador) {
		this.identificador = identificador;
	}

	public DeclIdOpt getDeclidopt() {
		return declidopt;
	}

	public void setDeclidopt(DeclIdOpt declidopt) {
		this.declidopt = declidopt;
	}

	public ComandoAtribuicaoId ( String tipo, Identificador identificador, DeclIdOpt declidopt) {
		this.setTipo(tipo);
		this.setIdentificador(identificador);
		this.setDeclidopt(declidopt);
		
	}
	
	@Override
    public String toString() {
		
		StringBuilder comandoatribuicao = new StringBuilder();
		comandoatribuicao.append(this.getTipo());
		comandoatribuicao.append(this.getIdentificador());
		comandoatribuicao.append(this.getDeclidopt());
		comandoatribuicao.append(";");
		
		return comandoatribuicao.toString();
		
	}
	
	@Override
	public void setEntreParenteses(boolean isEntreParenteses) {
		// TODO Auto-generated method stub
		
	}

}
