package br.com.minic.elementos;

public class ExpressaoAtributicao implements IComando{

  // Atributos
	
  private Identificador id;
  private IExpressao expressao;
 
  
  // Construtor
  
  public ExpressaoAtributicao(Identificador id, IExpressao expressao) {
	
    this.setId( id );
    this.setExpressao( expressao );
    
  }

  
  // M�todos
  
  public Identificador getId() {
	return id;
}


public void setId(Identificador id) {
	this.id = id;
}


  public IExpressao getExpressao() {
	
    return expressao;

  }


public void setExpressao(IExpressao expressao) {
	
    this.expressao = expressao;

  }
  
  @Override
	
  public String toString() {
	  
	  StringBuilder declaracaoAtr = new StringBuilder();
	  declaracaoAtr.append(this.getId());
	  declaracaoAtr.append(" = ");
	  declaracaoAtr.append(this.getExpressao());
      return declaracaoAtr.toString();
	
  }


@Override
public void setEntreParenteses(boolean isEntreParenteses) {
	// TODO Auto-generated method stub
	
}
  
}
