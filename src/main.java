import java.util.ArrayList;

public class main
{
     public static void main(String[] args) {

        EtudiantService service= new EtudiantService();
        Etudiant E1=new Etudiant("S001", "Avossou", "Michel", "Masculin", 25);
        Etudiant E2=new Etudiant("S005", "Medenou", "Micheline", "Féminin", 20);
        Etudiant E3=new Etudiant("S008", "Azin", "Alain", "Masculin", 19);
        Etudiant E4=new Etudiant("S007", "Azin", "Philomène", "Féminin", 30);
        Etudiant E5=new Etudiant("S003", "Dansou", "Alain", "Masculin", 23);
        Etudiant E6=new Etudiant("S0010", "Kouhontondé", "Gilbert", "Masculin", 29);
        Etudiant E7=new Etudiant("S0011", "Yèhouénou", "Fawaz", "Masculin", 17);
        Etudiant E8=new Etudiant("S0022", "Klotoé", "Huberte", "Féminin", 38);
        Etudiant E9=new Etudiant("S009", "Attolou", "Yasmine", "Féminin", 35);
        Etudiant E10=new Etudiant("S006", "Assogba", "Wilfred", "Masculin", 40);


        
        service.AjouterEtudiant(E1);
        service.AjouterEtudiant(E2);
        service.AjouterEtudiant(E3);
        service.AjouterEtudiant(E4);
        service.AjouterEtudiant(E5);
        service.AjouterEtudiant(E6);
        service.AjouterEtudiant(E10);
        service.AjouterEtudiant(E7);
        service.AjouterEtudiant(E8);
        service.AjouterEtudiant(E9);

        //Ajouter des notes aux étudiants
        E1.ajouterNote(15);
        E1.ajouterNote(18);
        E1.ajouterNote(12);
        E2.ajouterNote(14);
        E2.ajouterNote(16);     
        E3.ajouterNote(10);
        E3.ajouterNote(13);
        E3.ajouterNote(9);
        E4.ajouterNote(19);
        E4.ajouterNote(17);
        E5.ajouterNote(11);
        E5.ajouterNote(15);
        E5.ajouterNote(14);

        //Calculer et afficher la moyenne de chaque étudiant
        System.out.println("Moyenne des étudiants:");
        System.out.println(E1.getNom()+" "+E1.getPrenom()+": "+E1.calculerMoyenne());
        System.out.println(E2.getNom()+" "+E2.getPrenom()+": "+E2.calculerMoyenne());
        System.out.println(E3.getNom()+" "+E3.getPrenom()+": "+E3.calculerMoyenne());
        System.out.println(E4.getNom()+" "+E4.getPrenom()+": "+E4.calculerMoyenne());
        System.out.println(E5.getNom()+" "+E5.getPrenom()+": "+E5.calculerMoyenne());

        //Afficher la liste des étudiants
        System.out.println("Listes des Etudiant et leur moyenne:");
        service.afficherEtudiant();

        //Suavegarde et afficher la liste des étudiants dans un fichier txte de type scv

        service.sauvegarderEtudiant("Etudiants.scv");
        service.lire_contenu("Etudiants.scv");
        //Supprimer un étudiant par son matricule
        System.out.println("Suppression de l'étudiant S001");
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



