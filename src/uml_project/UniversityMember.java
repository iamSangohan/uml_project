package uml_project;

public abstract class UniversityMember {
	public String prenom;
	public String nom;
	public int ssNo;
	
	public String afficheNom() {
	    return (prenom + " " + nom);
	}

	public UniversityMember(String prenom, String nom, int ssNo) {
	    this.prenom = prenom;
	    this.nom = nom;
	    this.ssNo = ssNo;
	}

	public String getPrenom() {
	    return prenom;
	}

	public void setPrenom(String prenom) {
	    this.prenom = prenom;
	}

	public String getNom() {
	    return nom;
	}

	public void setNom(String nom) {
	    this.nom = nom;
	}

	public int getSsNo() {
	    return ssNo;
	}

	public void setSsNo(int ssNo) {
	    this.ssNo = ssNo;
	}

}
