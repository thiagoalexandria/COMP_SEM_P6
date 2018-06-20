package br.com.minic.elementos;

public class ComandoIf implements IComando{
	
	// Atributos
	
		private ExpRel expressaorel; 
		private IComando comando;
		

		// Construtor
		public ComandoIf(ExpRel expressaorel, IComando comando){
			
			this.setExpressaorel (expressaorel);
			this.setComando (comando);
			
		  }  

		
		
		// Gets e Sets
		public ExpRel getExpressaorel() {
			return expressaorel;
		}



		public void setExpressaorel(ExpRel expressaorel) {
			this.expressaorel = expressaorel;
		}



		public IComando getComando() {
			return comando;
		}



		public void setComando(IComando comando) {
			this.comando = comando;
		}
		
		@Override
		
		  public String toString() {
			  
			  StringBuilder comandoif = new StringBuilder();
			  
			  comandoif.append( " if (" );
			  comandoif.append( this.getExpressaorel());
			  comandoif.append(")");
			  comandoif.append("/n");
			  comandoif.append(this.getComando());
			  comandoif.append("/n");
			
			  return comandoif.toString();
			  
		  }



		@Override
		public void setEntreParenteses(boolean isEntreParenteses) {
			// TODO Auto-generated method stub
			
		}
		
		
		

	
}
