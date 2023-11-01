import java.util.HashMap;
import java.util.Map;

public class SocieteHashMap implements InterfaceSociete {
    private HashMap<Employe, Departement> hashE=new HashMap<>();
    public void ajouterEmployeDepartement(Employe e,Departement d)
    {
        hashE.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e)
    {
        System.out.println(hashE.clone());
    }

    @Override
    public void afficherLesEmployesLeursDepartements()
    {
        for (Map.Entry<Employe, Departement> entry:hashE.entrySet()){
            Employe employe= entry.getKey();
            Departement departement=entry.getValue();
            System.out.println("Employé : "+employe+" , Département : "+departement);
        }
    }

    @Override
    public void afficherLesEmployes()
    {
        for (Employe employe : hashE.keySet()){
            System.out.println("Employé :"+ employe);
        }
    }

    @Override
    public void afficherLesDepartements()
    {
        for (Departement departement : hashE.values()){
            System.out.println("Departements :"+ departement);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        Departement departement=hashE.get(e);
        if (departement != null){
            System.out.println("Le département de l'employé "+e.getNom()+" est "+departement);
        }else {
            System.out.println("l'employé "+e.getNom()+" n'a pas de département");
        }

    }

    @Override
    public boolean rechercherEmploye(Employe e)
    {
        if (hashE.containsKey(e)){
            return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        if (hashE.containsValue(e)){
            return true;}
        return false;
    }
}
