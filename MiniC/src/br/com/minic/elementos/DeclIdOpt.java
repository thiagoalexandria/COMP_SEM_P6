package br.com.minic.elementos;

public class DeclIdOpt {
	
	private Identificador identificador;
    private String nome;
    
    public Identificador getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Identificador identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override	
    public String toString() {
    	
    	StringBuilder declaraidopt = new StringBuilder();
    	declaraidopt.append(",");
    	declaraidopt.append(this.getIdentificador());
    	declaraidopt.append(" ");
    	declaraidopt.append(this.getNome());
        return declaraidopt.toString();
    }
}
