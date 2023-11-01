import java.util.Map;
import java.util.TreeMap;

public class SocieteTreeMap implements InterfaceSociete{
    private TreeMap<Employe,Departement> treeM=new TreeMap<>();

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d)
    {
        treeM.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e)
    {
        System.out.println(treeM.clone());
    }

    @Override
    public void afficherLesEmployesLeursDepartements()
    {
        for (Map.Entry<Employe, Departement> entry:treeM.entrySet()){
            Employe employe= entry.getKey();
            Departement departement=entry.getValue();
            System.out.println("Employé : "+employe+" , Département : "+departement);
        }
    }

    @Override
    public void afficherLesEmployes()
    {
        for (Employe employe : treeM.keySet()){
            System.out.println("Employé :"+ employe);
        }
    }

    @Override
    public void afficherLesDepartements()
    {
        for (Departement departement : treeM.values()){
            System.out.println("Departements :"+ departement);
        }
    }

    @Override
    public void afficherDepartement(Employe e)
    {
        Departement departement=treeM.get(e);
        if (departement != null){
            System.out.println("Le département de l'employé "+e.getNom()+" est "+departement);
        }else {
            System.out.println("l'employé "+e.getNom()+" n'a pas de département");
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e)
    {
        if (treeM.containsKey(e)){
            return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement e)
    {
        if (treeM.containsValue(e))
            return true;
        return false;
    }
}
