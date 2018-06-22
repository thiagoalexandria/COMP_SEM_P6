package br.com.minic.elementos;



import java.util.List;

public class ComandoDeclIdentificadores implements IComando{
	private String tipo;
	private List<DeclaracaoIdentificador> declaracaoidentificador;
	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public List<DeclaracaoIdentificador> getDeclaracaoidentificador() {
		return declaracaoidentificador;
	}

	public void setDeclaracaoidentificador(List<DeclaracaoIdentificador> declaracaoidentificador) {
		this.declaracaoidentificador = declaracaoidentificador;
	}

	public ComandoDeclIdentificadores (String tipo, List<DeclaracaoIdentificador> declaracaoidentificador ) {
		this.setTipo(tipo);
		this.setDeclaracaoidentificador(declaracaoidentificador);
	}


	@Override
	
	  public String toString() {
		
		StringBuilder dclaraident = new StringBuilder();
		
		dclaraident.append( this.getTipo() );
		dclaraident.append(this.getDeclaracaoidentificador());
		dclaraident.append("/n");
		
		  return dclaraident.toString();
	    
	  }

	@Override
	public void setEntreParenteses(boolean isEntreParenteses) {
		// TODO Auto-generated method stub
		
	}
}
