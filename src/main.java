import java.util.ArrayList;

public class main
{
     public static void main(String[] args) {

        EtudiantService service= new EtudiantService();
        Etudiant E1=new Etudiant("S001", "Avossou", "Michel", "Masculin", 25);
        Etudiant E2=new Etudiant("S005", "Medenou", "Micheline", "Féminin", 20);
        Etudiant E3=new Etudiant("S008", "Azin", "Alain", "Masculin", 19);
        Etudiant E4=new Etudiant("S007", "Azin", "Philomène", "Féminin", 30);
        Etudiant E5=new Etudiant("S002", "Dansou", "Alain", "Masculin", 23);
        
        service.AjouterEtudiant(E1);
        service.AjouterEtudiant(E2);
        service.AjouterEtudiant(E3);
        service.AjouterEtudiant(E4);
        service.AjouterEtudiant(E5);
        System.out.println("Listes des Etudiant");

        service.afficherEtudiant();

        service.SupprimerEtudiant("S001");

        System.out.println("Liste des étudiants après la suppression de S001");

        service.afficherEtudiant();
        //Rechercher etudiant par matricule
        System.out.println("Rechercher Etudiant par matricule:");

        Etudiant e=service.rechEtudiantParMatricule("S002");
        if (e != null) {
            System.out.println(e);
        }else{
            System.out.println("Aucun Etudiant trouvé!");
        }

        //Rechercher Etudiant par nom

        System.out.println("Recherche d'un étudiant par son nom");

        ArrayList<Etudiant> rEtudiants=service.rechEtudiantParNom("Azin");
        if (rEtudiants.isEmpty()) {
            System.out.println("Aucun Etudiant trouvé!");
        } else {
            for(Etudiant et: rEtudiants){
                System.out.println(et);
            }
        }

    }
}



