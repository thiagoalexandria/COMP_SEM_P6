package br.com.minic.elementos;

public class ComandoAtribuicaoIdexp implements IComando{

	private String tipo;
	private Identificador id;
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
	public DeclIdOpt getDeclidopt() {
		return declidopt;
	}

	public void setDeclidopt(DeclIdOpt declidopt) {
		this.declidopt = declidopt;
	}


	public Identificador getId() {
		return id;
	}
	public void setId(Identificador id) {
		this.id = id;
	}
	
	public ComandoAtribuicaoIdexp ( String tipo, Identificador id,IExpressao expressao, DeclIdOpt declidopt) {
		this.setTipo(tipo);
		this.setId(id);
		this.setDeclidopt(declidopt);
		this.setExpressao(expressao);
		
	}
	
	@Override
    public String toString() {
		
		StringBuilder comandoatribuicaoexp = new StringBuilder();
		comandoatribuicaoexp.append(this.getTipo());
		comandoatribuicaoexp.append(this.getId());
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
