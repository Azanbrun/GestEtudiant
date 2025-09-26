import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

    //Sauvegarder dans un fichier texte de type csv

    public void sauvegarderEtudiant(String nomFichier){
        try (BufferedWriter writer=new BufferedWriter(new FileWriter(nomFichier))) {
            writer.write("Matricule;Nom;Prenoms;Sexe;Age;Notes;Moyenne");
            writer.newLine();
            for (Etudiant e : listeEtudiants) {
                String ligne=e.getMatricule()+";"+
                e.getNom()+";"+
                e.getPrenom()+";"+
                e.getsexe()+";"+
                e.getAge()+";"+
                String.join(",",e.getNotes().stream()
                .map(Object::toString).toArray(String[]::new))+";"+
                e.calculerMoyenne();
                writer.write(ligne);
                writer.newLine();
            }
            System.out.println("Sauvegarde réussie dans "+nomFichier);
        } catch (IOException ex) {
            System.out.println("erreur de la sauvegarde "+ex.getMessage());
        }
    }

    //Lire un texte et afficher le contenu

    public void lire_contenu(String nomFichier){
        try(BufferedReader bReader=new BufferedReader(new FileReader(nomFichier))) {
            String ligne;
            System.out.println("===Contenu du fichier"+nomFichier);
            while ((ligne=bReader.readLine())!=null) {
                System.out.println(ligne);
            }
        } catch (IOException ex) {
            System.out.println("Erreur de lecture"+ex.getMessage());
        }
    }
    
}