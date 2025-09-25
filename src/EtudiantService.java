import java.util.ArrayList;

public class EtudiantService {

    private ArrayList<Etudiant> listeEtudiants;

    public EtudiantService(){
        listeEtudiants=new ArrayList<>();
    }

    //Ajout des étudiants

    public void AjouterEtudiant(Etudiant e){
        listeEtudiants.add(e);
    }

    //Supprimer des étudiants

    public void SupprimerEtudiant(String matricule){
        listeEtudiants.removeIf(e -> e.getMatricule().equals(matricule));
    }

    public void afficherEtudiant(){
        for (Etudiant e : listeEtudiants) {
            System.out.println(e);
        }
    }

    //Rechercher par le numero matricule

    public Etudiant rechEtudiantParMatricule(String matricule){
        for(Etudiant e : listeEtudiants){
            if (e.getMatricule().equalsIgnoreCase(matricule)) {
                return e;
            }
        }
        return null;
    }

    //Rechercher par nom
    public ArrayList<Etudiant> rechEtudiantParNom(String nom){
        ArrayList<Etudiant> resultat=new ArrayList<>();
        for(Etudiant e: listeEtudiants){
            if (e.getNom().equalsIgnoreCase(nom)) {
                resultat.add(e);
            }
        }
        return resultat;
    }
    
}