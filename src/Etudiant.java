public class Etudiant {
    private String matricule,nom,prenom,sexe;
    private int age;

    public Etudiant(String v_matricule, String v_nom, String v_prenom, String v_sexe, int v_age){
        this.matricule=v_matricule;
        this.nom=v_nom;
        this.prenom=v_prenom;
        this.sexe=v_sexe;
        this.age=v_age;
    }
    
    public String getMatricule(){
        return matricule;
    }

    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public String getsexe(){
        return sexe;
    }
    public int getAge(){
        return age;
    }

    public void setMatricule( String v_matricule){
        this.matricule=v_matricule;
    }
    public void setNom( String v_nom){
        this.nom=v_nom;
    }
    public void setPrenom( String v_prenom){
        this.prenom=v_prenom;
    }
    public void setSexe( String v_sexe){
        this.sexe=v_sexe;
    }
    public void setAge( int v_age){
        this.age=v_age;
    }
    
    @Override
    public String toString(){
        return "Etudiant[Matricule: "+matricule+" -Nom: "+nom+" -Prenom: "+prenom+" -Sexe: "+sexe+" -Age: "+age+"]";        
    }
}
