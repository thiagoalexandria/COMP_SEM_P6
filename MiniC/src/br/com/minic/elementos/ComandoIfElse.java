package br.com.minic.elementos;

public class ComandoIfElse implements IComando{
	
	// Atributos
	
	private ExpRel expressaorel; 
	private IComando comando;
	private IComando comando2;
	

	// Construtor
	public ComandoIfElse(ExpRel expressaorel, IComando comando, IComando comando2){
		
		this.setExpressaorel (expressaorel);
		this.setComando (comando);
		this.setComando2 (comando2);
		
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



	public IComando getComando2() {
		return comando2;
	}



	public void setComando2(IComando comando2) {
		this.comando2 = comando2;
	}

	
	@Override
	
	  public String toString() {
		  
		  StringBuilder comandoifelse = new StringBuilder();
		  
		  comandoifelse.append( " if (" );
		  comandoifelse.append( this.getExpressaorel());
		  comandoifelse.append(")");
		  comandoifelse.append("/n");
		  comandoifelse.append(this.getComando());
		  comandoifelse.append("/n");
		  comandoifelse.append("else");
		  comandoifelse.append("/n");
		  comandoifelse.append(this.getComando2());
		  comandoifelse.append("/n");
		
		  return comandoifelse.toString();
		  
	  }
	
	
	
	
}