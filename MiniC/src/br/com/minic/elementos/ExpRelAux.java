package br.com.minic.elementos;

public class ExpRelAux implements IExpressao{
	private IExpressao expressao;
	
	public ExpRelAux(IExpressao expressao) {
		setExpressao(expressao);
	}

	public IExpressao getExpressao() {
		return expressao;
	}

	public void setExpressao(IExpressao expressao) {
		this.expressao = expressao;
	}

	public String toString() {
		StringBuilder toString = new StringBuilder();
		
		toString.append(this.getExpressao());
		
	    return toString.toString();
	}

	@Override
	public void setEntreParenteses(boolean isEntreParenteses) {
		// TODO Auto-generated method stub
		
	}

}
