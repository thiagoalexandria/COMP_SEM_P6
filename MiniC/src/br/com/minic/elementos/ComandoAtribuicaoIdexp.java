package br.com.minic.elementos;

public class ComandoAtribuicaoIdexp implements IComando{

	private String tipo;
	private Identificador identificador;
	private IExpressao expressao;
	private DeclIdOpt declidopt;
	
	public IExpressao getExpressao() {
		return expressao;
	}
	public void setExpressao(IExpressao expressao) {
		this.expressao = expressao;
	}
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

	public ComandoAtribuicaoIdexp ( String tipo, Identificador identificador,IExpressao expressao, DeclIdOpt declidopt) {
		this.setTipo(tipo);
		this.setIdentificador(identificador);
		this.setDeclidopt(declidopt);
		this.setExpressao(expressao);
		
	}
	
	@Override
    public String toString() {
		
		StringBuilder comandoatribuicaoexp = new StringBuilder();
		comandoatribuicaoexp.append(this.getTipo());
		comandoatribuicaoexp.append(this.getIdentificador());
		comandoatribuicaoexp.append(this.getExpressao());
		comandoatribuicaoexp.append(this.getDeclidopt());
		comandoatribuicaoexp.append(";");
		
		return comandoatribuicaoexp.toString();
		
	}
	
	@Override
	public void setEntreParenteses(boolean isEntreParenteses) {
		// TODO Auto-generated method stub
		
	}

}
