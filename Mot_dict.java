package ex9;

public class Mot_dict {
	private String Mot; 
	private String Definition; 
	public Mot_dict(String mot, String definition) { 
		this.Mot=mot; 
		this.Definition=definition; 
		} 
	public String getMot() { 
		return Mot; 
		} 
	public String getDefinition() { 
		return Definition; } 
	public void setDefinition(String definition) { 
		this.Definition=definition; } 
	public void setMot(String mot) { 
		this.Mot=mot; } 
	public boolean synonyme(String mot) { 
		return this.Mot.equals(mot); 
		 } 
	public String toString() {
		return this.Mot +":"+ this.Definition;
	}
	}
