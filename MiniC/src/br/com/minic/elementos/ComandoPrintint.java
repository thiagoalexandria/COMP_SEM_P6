package br.com.minic.elementos;

public class ComandoPrintint implements IComando{
	
		private IExpressao expressao;
		
		public IExpressao getExpressao() {
			return expressao;
		}

		public void setExpressao(IExpressao expressao) {
			this.expressao = expressao;
		}

		public ComandoPrintint (IExpressao expressao ) {
			
			this.setExpressao(expressao);
		
		}
		
		@Override
		
		  public String toString() {
			  
			  StringBuilder comandoprintint = new StringBuilder();
			  
			  comandoprintint.append( " printint (" );
			  comandoprintint.append( this.getExpressao());
			  comandoprintint.append(");");
			  comandoprintint.append("/n");
			 
			  return comandoprintint.toString();
			  
		  }

}
