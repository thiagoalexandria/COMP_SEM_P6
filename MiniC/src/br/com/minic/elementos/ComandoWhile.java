package br.com.minic.elementos;

public class ComandoWhile implements IComando{
	
	private ExpRel expressao;
	private IComando comando;
	
	public ComandoWhile (ExpRel expressao, IComando comando) {
		this.setExpressao(expressao);
		this.setComando(comando);
	}
	
	public ExpRel getExpressao() {
		return expressao;
	}
	public void setExpressao(ExpRel expressao) {
		this.expressao = expressao;
	}
	public IComando getComando() {
		return comando;
	}
	public void setComando(IComando comando) {
		this.comando = comando;
	}
	
	@Override
	
	  public String toString() {
		  
		  StringBuilder comandowhile = new StringBuilder();
		  
		  comandowhile.append( " while (" );
		  comandowhile.append( this.getExpressao());
		  comandowhile.append(")");
		  comandowhile.append("/n");
		  comandowhile.append(this.getComando());
		  comandowhile.append("/n");
		 
		  return comandowhile.toString();
		  
	  }

	@Override
	public void setEntreParenteses(boolean isEntreParenteses) {
		// TODO Auto-generated method stub
		
	}
	

}
