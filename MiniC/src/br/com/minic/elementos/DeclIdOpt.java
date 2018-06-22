package br.com.minic.elementos;

public class DeclIdOpt {
	
	private Identificador id;
    
	public Identificador getId() {
		return id;
	}

	public void setId(Identificador id) {
		this.id = id;
	}


	  public DeclIdOpt(Identificador id, DeclIdOpt declidopt){

		  this.setId( id );

	    
	  } 

	@Override	
    public String toString() {
    	
    	StringBuilder declaraidopt = new StringBuilder();
    	declaraidopt.append(",");
    	declaraidopt.append(this.getId());
        return declaraidopt.toString();
    }
}
