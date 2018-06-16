package br.com.minic.elementos;


public class DeclInclude {
	
	 // Atributos
	
	  private String identificador;  
		   
	  // Construtor

	  public DeclInclude(String identificador){

	    this.setIdentificador( identificador );

	    
	  }  

	  // Metodos


	  public String getIdentificador() {
		
	    return identificador;

	  }

	  public void setIdentificador(String identificador) {
		
	    this.identificador = identificador;

	  }
	  
	  	  

	  @Override
		
	  public String toString() {
		
		  return "#include <" + this.getIdentificador() + ".h >";
	    
	  }
	  
	
}
