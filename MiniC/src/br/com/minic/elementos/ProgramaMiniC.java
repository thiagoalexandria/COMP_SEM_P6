
package br.com.minic.elementos;

import java.util.List;

public class ProgramaMiniC {

  // Atributos
  private List<DeclInclude> declInclude;
  private FuncaoMain funcaoMain;
  private List<DeclaracaoFuncao> declFuncoes;

  // Construtor

  public ProgramaMiniC(List<DeclInclude> declInclude, FuncaoMain funcaoMain, List<DeclaracaoFuncao> declFuncoes) {
	this.setDeclInclude( declInclude );
    this.setFuncaoMain( funcaoMain );
    this.setDeclFuncoes( declFuncoes );
    
  }
  
  
  // M�todos
  public List<DeclInclude> getDeclInclude() {
		
	    return declInclude;
		
  }

  public void setDeclInclude(List<DeclInclude> declInclude) {
		
	    this.declInclude = declInclude;
		
  }

  
  
  public FuncaoMain getFuncaoMain() {
	
    return funcaoMain;
	
  }
 
  public void setFuncaoMain(FuncaoMain funcaoMain) {
	
    this.funcaoMain = funcaoMain;
	
  }

  public List<DeclaracaoFuncao> getDeclFuncoes() {
	
    return declFuncoes;
	
  }

  public void setDeclFuncoes(List<DeclaracaoFuncao> declFuncoes) {
	
    this.declFuncoes = declFuncoes;
	
  }

  @Override
	
  public String toString() {
	
    StringBuilder programaMiniC = new StringBuilder();
    
    if( this.declInclude != null ) {
    	
        for(DeclInclude declInclude: this.declInclude) {
        	  
          programaMiniC.append( declInclude.toString() );
          programaMiniC.append( "\n" );
          
        }
    }
    
    programaMiniC.append( "\n" );
    
    programaMiniC.append( this.funcaoMain.toString() );
    
    programaMiniC.append( "\n" );
    programaMiniC.append( "\n" );
    
    if( this.declFuncoes != null ) {
    	
      for(DeclaracaoFuncao declaracaoFuncao: this.declFuncoes) {
      	  
        programaMiniC.append( declaracaoFuncao.toString() );
        programaMiniC.append( "\n" );
        
      }
      
    }
    
    return programaMiniC.toString();
    
  }
  
}
