package packEtudiant;

public class MiseAJourEtudiant {

	public static void main(String[] args) {
		//instanciation des 2 étudiants
		Etudiant e1 = new Etudiant();
		Etudiant e2 = new Etudiant();
		
		Etudiant e3 = new Etudiant("Alex", "Terrieur" ,"alex.terrieur");
		
		//Change les valeurs de 1
		e1.setNom("Dagault");
		e1.setPrenom("Anne");
		e1.setLogin("anne.dagault");
		
		
		
		
		e1.setStage_realise(true);
		
		
		
		
		//Change les valeurs de 2
		e2.setNom("Terrieur");
		e2.setPrenom("Alain");
		e2.setLogin("alain.terrieur");
		
		//Affichage des étudiants
		System.out.println(e1.toString());
		System.out.println("");
		System.out.println(e2.toString());
		
		
		
		System.out.println("");

		
		
		
		//on definit la moyenne de e1 a 120 pour respecter la condition
		e1.setMoyenne(120);
		System.out.println(e1.passage2annee());
		System.out.println(e2.passage2annee());
		
		System.out.println("");
		System.out.print(e3.toString());
		System.out.println("");
		System.out.print(e1.toString());
		System.out.println("");
		System.out.print(e2.toString());
		

		

	}

}
