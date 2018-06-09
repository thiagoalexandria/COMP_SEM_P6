
package br.com.minic.elementos;

public class DeclaracaoParametro {

  // Atributos
	
  private String tipo;
  private Identificador identificador;
  
  
  // Construtor
  
  public DeclaracaoParametro(String tipo, Identificador identificador) {

    this.setTipo( tipo );
    this.setIdentificador( identificador );
    
  }


  // Métodos

  public String getTipo() {
	
    return tipo;

  }

  public void setTipo(String tipo) {
	
    this.tipo = tipo;

  }

  public Identificador getIdentificador() {
	
    return identificador;

  }

  public void setIdentificador(Identificador identificador) {
	
    this.identificador = identificador;

  }
  
  @Override
	
  public String toString() {
	
    return this.getTipo() + " " + this.getIdentificador();
    
  }
  
}
