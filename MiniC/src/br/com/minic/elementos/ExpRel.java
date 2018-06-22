package br.com.minic.elementos;

public class ExpRel implements IExpressao{

	private IExpressao exprelaux;
	private String operadorrelacional;
	private IExpressao exprelaux2;
	
	
	
	public IExpressao getExprelaux() {
		return exprelaux;
	}



	public void setExprelaux(IExpressao exprelaux) {
		this.exprelaux = exprelaux;
	}



	public String getOperadorrelacional() {
		return operadorrelacional;
	}



	public void setOperadorrelacional(String operadorrelacional) {
		this.operadorrelacional = operadorrelacional;
	}



	public IExpressao getExprelaux2() {
		return exprelaux2;
	}



	public void setExprelaux2(IExpressao exprelaux2) {
		this.exprelaux2 = exprelaux2;
	}

	
	public ExpRel (IExpressao exprelaux,String operadorrelacional,IExpressao exprelaux2 ) {
		this.setExprelaux(exprelaux);
		this.setOperadorrelacional(operadorrelacional);
		this.setExprelaux2(exprelaux2);
	}
	
	  public String toString() {
		  
		  StringBuilder exprel = new StringBuilder();
		  
		  exprel.append( this.getExprelaux());	
		  exprel.append( this.getOperadorrelacional() );
		  exprel.append( this.getExprelaux());   
		  return exprel.toString();
	    
	  }

	@Override
	public void setEntreParenteses(boolean isEntreParenteses) {
		// TODO Auto-generated method stub
		
	}
	
	


}
