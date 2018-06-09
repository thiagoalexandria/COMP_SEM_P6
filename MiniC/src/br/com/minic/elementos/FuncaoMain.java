
package br.com.minic.elementos;

public class FuncaoMain {

	// Atributos

	private TipoMain tipoMain;
	private TipoRetorno retorno;
	
	
	// Construtor

	public FuncaoMain(TipoMain tipoMain, TipoRetorno retorno) {

	  this.setTipoMain( tipoMain );
	  this.setRetorno( retorno );
	  
	}
	
	// Métodos

  public TipoMain getTipoMain() {
	
    return tipoMain;
	
  }

  public void setTipoMain(TipoMain tipoMain) {
	
    this.tipoMain = tipoMain;
	
  }

  public TipoRetorno getRetorno() {
	
	return retorno;
	
  }

  public void setRetorno(TipoRetorno retorno) {
	
    this.retorno = retorno;

  }

  @Override
	
  public String toString() {
	
	StringBuilder toString = new StringBuilder();
	
	toString.append( this.getTipoMain().toString() );
	toString.append( " main () {\n\n" );	
	
	if( this.getRetorno() != null ) {
		
	  toString.append( "  return " );
	  toString.append( this.getRetorno().toString() );
	  toString.append( ";" );
	  
	}
	
	toString.append( "\n\n}" );
	
    return toString.toString();
	  
  }
	
}
