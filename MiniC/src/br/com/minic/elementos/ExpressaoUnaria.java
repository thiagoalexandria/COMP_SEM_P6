package br.com.minic.elementos;

public class ExpressaoUnaria implements IExpressao {

  // Atributos
	
  private String operador;
  private IExpressao expressao;
  private boolean isEntreParenteses;
  
  
  // Construtor
  
  public ExpressaoUnaria(String operador, IExpressao expressao) {

	this.setOperador( operador );
    this.setExpressao( expressao );
    
  }

  
  // Métodos
  
  public String getOperador() {
	
    return operador;

  }

  public void setOperador(String operador) {
	
    this.operador = operador;

  }

  public IExpressao getExpressao() {
	
    return expressao;

  }

  public void setExpressao(IExpressao expressao) {
	
    this.expressao = expressao;

  }

  public boolean isEntreParenteses() {
	
    return isEntreParenteses;

  }

  @Override

  public void setEntreParenteses(boolean isEntreParenteses) {
	
    this.isEntreParenteses = isEntreParenteses;

  }
  
  @Override
	
  public String toString() {
	
	if( this.isEntreParenteses ) {
		  
	  return "(" + this.getOperador() + "" + this.getExpressao() + ")";
		  
	} else {
		
	  return this.getOperador() + "" + this.getExpressao();
	
	}
	
  }
  
}
