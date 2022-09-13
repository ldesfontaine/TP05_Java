package packEtudiant;

public class Etudiant {
	
	/**** parties priv�es ****/
	// attributs
	private String nom;
	private String prenom;
	private String login;
	private boolean stage_realise=false;

	private double moyenne=12;
	/**** parties publiques ****/
	// constructeur
	// Cr�ation d'un �tudiant avec Anonymous comme valeur du nom par d�faut.
	public Etudiant(){
	this.nom="Anonymous";
	}
	
	public Etudiant(String nom, String prenom, String login) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
	}


	// m�thodes
	// Repr�sentation texte de l'objet
	public String toString() {
	String res = "*** Etudiant ***";
	res = res + "\nNom : " + this.getNom();
	res = res + "\nPrenom : " + this.getPrenom();
	res = res + "\nLogin : " + this.getLogin();
	res = res + "\nStage : ";
	res = res + ((stage_realise) ? "R�alis�\n" : "Non r�alis�\n");
	res = res + ((passage2annee()) ? "Passage accept�\n" : "passage refus�\n");
	return res;
	}
	
	
	
	
	
	//@return String le login
	public String getLogin(){
	return this.login;
	}
	
	// @return String le nom
	public String getNom() {
	return this.nom;
	}
	
	// @return String le prenom
	public String getPrenom(){
	return this.prenom;
	}
	
	//@return string le stage
	public Boolean getStage_realise(){
		return this.stage_realise;
	}
	
	public double getMoyenne() {
		return moyenne;
	}

	
	
	
	
	
	
	
	
	// @param unLogin le nouveau login
	public void setLogin(String unLogin){
	this.login = unLogin;
	}
	
	
	// @param unNom le nouveau nom
	public void setNom(String unNom){
	this.nom = unNom;
	}
	
	
	// @param unPrenom le nouveau prenom
	public void setPrenom(String unPrenom){
	this.prenom = unPrenom;
	}
	
	// @param unStage_realise le nouveau stage_realise
	public void setStage_realise(Boolean Unstage_realise){
		this.stage_realise=Unstage_realise;
	}

	
	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;

	}
	
	
	public boolean passage2annee(){
			return (stage_realise && moyenne >=100); 

	}
	
	

	
	
}
