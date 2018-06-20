package br.com.minic.elementos;

public class ComandoPrintf implements IComando{
	
	private IExpressao expressao;
	
	public IExpressao getExpressao() {
		return expressao;
	}

	public void setExpressao(IExpressao expressao) {
		this.expressao = expressao;
	}

	public ComandoPrintf (IExpressao expressao ) {
		
		this.setExpressao(expressao);
	
	}
	
	@Override
	
	  public String toString() {
		  
		  StringBuilder comandoprintf = new StringBuilder();
		  
		  comandoprintf.append( " printf (" );
		  comandoprintf.append( this.getExpressao());
		  comandoprintf.append(");");
		  comandoprintf.append("/n");
		 
		  return comandoprintf.toString();
		  
	  }

	@Override
	public void setEntreParenteses(boolean isEntreParenteses) {
		// TODO Auto-generated method stub
		
	}

}
