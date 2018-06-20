package br.com.minic.elementos;

public class ComandoPrintstr implements IComando{
	
	private IExpressao expressao;
	
	public IExpressao getExpressao() {
		return expressao;
	}

	public void setExpressao(IExpressao expressao) {
		this.expressao = expressao;
	}

	public ComandoPrintstr (IExpressao expressao ) {
		
		this.setExpressao(expressao);
	
	}
	
	@Override
	
	  public String toString() {
		  
		  StringBuilder comandoprintsrt = new StringBuilder();
		  
		  comandoprintsrt.append( " printstr (" );
		  comandoprintsrt.append( this.getExpressao());
		  comandoprintsrt.append(");");
		  comandoprintsrt.append("/n");
		 
		  return comandoprintsrt.toString();
		  
	  }
}
