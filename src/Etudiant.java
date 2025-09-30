import java.lang.reflect.Array;
import java.util.ArrayList;

public class Etudiant {
    private String matricule,nom,prenom,sexe;
    private int age;
    private ArrayList<Integer> notes ;

    public Etudiant(String v_matricule, String v_nom, String v_prenom, String v_sexe, int v_age){
        this.matricule=v_matricule;
        this.nom=v_nom;
        this.prenom=v_prenom;
        this.sexe=v_sexe;
        this.age=v_age;
        this.notes=new ArrayList<>();

    }
    
    public ArrayList<Integer> getNotes(){
        return notes;
    }
    public void ajouterNote(int note){
        notes.add(note);
    }

    public double calculerMoyenne(){
        if (notes.isEmpty()) {
            return 0.0;
        }
        int somme=0;
        for(int note: notes){
            somme+=note;
        }
        return (double) somme/notes.size();
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

    public String getMention(){
        double m= calculerMoyenne();

        double tresBien=Double.parseDouble(ConfigManager.getProperty("mention.tresbien"));
        double bien=Double.parseDouble(ConfigManager.getProperty("mention.bien"));
        double assezBien=Double.parseDouble(ConfigManager.getProperty("mention.assezbien"));
        double passable=Double.parseDouble(ConfigManager.getProperty("mention.passable"));


        if (m>= tresBien) return "Très Bien";
        else if(m>=bien) return "Bien";
        else if(m>=assezBien) return "Assez Bien";
        else if(m>=passable) return "Passable";
        else return"Echec";

    }
    
    @Override
    public String toString(){
        return "Etudiant[Matricule: "+matricule+" -Nom: "+nom+" -Prenom: "+prenom+" -Sexe: "+sexe+" -Age: "+age+"-Notes: "+notes+"-Moyenne: "+calculerMoyenne()+"]";        
    }


}
