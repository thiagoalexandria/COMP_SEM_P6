package br.com.minic.elementos;

public class LiteralChar implements IExpressao {

  // Atributos
	
  private char valor;

  
  // Construtor
  
  public LiteralChar(char valor) {
 
    this.setValor( valor );
	
  }

  
  // Métodos
  
  public char getValor() {
	
    return valor;

  }

  public void setValor(char valor) {
	
	this.valor = valor;
	
  }

  @Override
	
  public void setEntreParenteses(boolean isEntreParenteses) {
	
  }
	
  @Override

  public String toString() {

    return String.valueOf( this.getValor() );

  }

}
