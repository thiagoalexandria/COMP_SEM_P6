
package br.com.minic.elementos;

import java.util.List;

public class DeclaracaoFuncao {

  // Atributos
	
  private TipoMain tipo;
  private String identificador;
  private List<DeclaracaoParametro> parametros;
  private IExpressao expressao;
  
	   
  // Construtor

  public DeclaracaoFuncao(TipoMain tipo, String identificador, List<DeclaracaoParametro> parametros, 
   IExpressao expressao) {

    this.setTipo( tipo );
    this.setIdentificador( identificador );
    this.setParametros( parametros );
    this.setExpressao( expressao );
    
  }  

  // Métodos

  public TipoMain getTipo() {
	
    return tipo;

  }

  public void setTipo(TipoMain tipo) {
	
    this.tipo = tipo;

  }

  public String getIdentificador() {
	
    return identificador;

  }

  public void setIdentificador(String identificador) {
	
    this.identificador = identificador;

  }

  public List<DeclaracaoParametro> getParametros() {
	
    return parametros;

  }

  public void setParametros(List<DeclaracaoParametro> parametros) {
	
    this.parametros = parametros;

  }

  public IExpressao getExpressao() {
	 
    return expressao;

  }

  public void setExpressao(IExpressao expressao) {

    this.expressao = expressao;

  }
  
  @Override

  public String toString() {
	
    StringBuilder declaracaoFuncao = new StringBuilder();
    
    declaracaoFuncao.append( this.getTipo().toString() );
    declaracaoFuncao.append( " " );
    declaracaoFuncao.append( this.getIdentificador() );
    declaracaoFuncao.append( "(" );
    
    if( this.getParametros() != null ) {
    	
      int totalParametros = this.getParametros().size();
      int totalParametrosMenos1 = this.getParametros().size() - 1;
      
      for(int i = 0; i < totalParametros; i++) {
    	  
        DeclaracaoParametro declaracaoParametro = this.getParametros().get( i );
    	  
        declaracaoFuncao.append( declaracaoParametro.toString() );
        
        if( i < totalParametrosMenos1 ) {
        	
          declaracaoFuncao.append( ", " );
        	
        }
        
      } // FOR PARAMETROS
      
    }
    
    declaracaoFuncao.append( ") {\n\n" );
    
    declaracaoFuncao.append( "  return " );
    declaracaoFuncao.append( this.getExpressao().toString() );
    declaracaoFuncao.append( ";" );
    
    declaracaoFuncao.append( "\n\n}" );    
    
	return declaracaoFuncao.toString();

  }

}
