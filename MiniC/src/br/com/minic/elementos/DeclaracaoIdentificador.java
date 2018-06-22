package br.com.minic.elementos;

public class DeclaracaoIdentificador {
	
	private Identificador id;
	private IExpressao expressao;
	
	public Identificador getId() {
		return id;
	}
	public void setId(Identificador id) {
		this.id = id;
	}
	public IExpressao getExpressao() {
		return expressao;
	}
	public void setExpressao(IExpressao expressao) {
		this.expressao = expressao;
	}
	
	public DeclaracaoIdentificador (Identificador id, IExpressao expressao) {
		this.setId(id);
		this.setExpressao(expressao);
		
	}
	
	
	@Override	
    public String toString() {
    	
    	StringBuilder declaraid = new StringBuilder();
    	declaraid.append(this.getId());
    	declaraid.append("=");
    	declaraid.append(this.getExpressao());
    	
        return declaraid.toString();
    }
	
}
