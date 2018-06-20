package br.com.minic.elementos;

public class ExpressaoAtributicao implements IComando{

  // Atributos
	
  private Identificador identificador;
  private IExpressao expressao;
 
  
  // Construtor
  
  public ExpressaoAtributicao(Identificador identificador, IExpressao expressao) {
	
    this.setIdentificador( identificador );
    this.setExpressao( expressao );
    
  }

  
  // M�todos
  
  public Identificador getIdentificador() {
	
    return identificador;

  }

  public void setIdentificador(Identificador identificador) {
	
    this.identificador = identificador;

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
	  declaracaoAtr.append(this.getIdentificador());
	  declaracaoAtr.append(" = ");
	  declaracaoAtr.append(this.getExpressao());
      return declaracaoAtr.toString();
	
  }


@Override
public void setEntreParenteses(boolean isEntreParenteses) {
	// TODO Auto-generated method stub
	
}
  
}
