package br.com.minic.elementos;

import java.util.List;

public class DeclaracaoIdentificador implements IExpressao{
	
	private Identificador id;
	private List<IExpressao> expressao;
	
	public Identificador getId() {
		return id;
	}
	public void setId(Identificador id) {
		this.id = id;
	}
	public List<IExpressao> getExpressao() {
		return expressao;
	}
	public void setExpressao(List<IExpressao> expressao) {
		this.expressao = expressao;
	}
	
	public DeclaracaoIdentificador (Identificador id, List<IExpressao> exprAtr) {
		this.setId(id);
		this.setExpressao(exprAtr);
		
	}
	
	
	@Override	
    public String toString() {
    	
    	StringBuilder declaraid = new StringBuilder();
    	declaraid.append(this.getId());
    	declaraid.append("=");
    	declaraid.append(this.getExpressao());
    	
        return declaraid.toString();
    }
	@Override
	public void setEntreParenteses(boolean isEntreParenteses) {
		// TODO Auto-generated method stub
		
	}
	
}
