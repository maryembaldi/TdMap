// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Test {
    public static void main(String[] args) {
        SocieteHashMap socité=new SocieteHashMap();
        Employe emp1=new Employe(123,"az12","yaich","zaineb");
        Employe emp2=new Employe(124,"az13","aa","bb");
        Employe emp3=new Employe(125,"az14","yy","zz");
        Departement dep1=new Departement(12,"informatique");
        Departement dep2=new Departement(13,"logistique");

        socité.ajouterEmployeDepartement(emp1,dep1);
        socité.ajouterEmployeDepartement(emp2,dep2);

        socité.afficherDepartement(emp1);
        socité.afficherDepartement(emp2);
        System.out.println(socité.rechercherDepartement(dep2));
        System.out.println(socité.rechercherDepartement(new Departement(2,"ee")));
        socité.supprimerEmploye(emp3);
        System.out.println("treemap");
        SocieteTreeMap societeT=new SocieteTreeMap();
        societeT.ajouterEmployeDepartement(emp1,dep2);
        societeT.ajouterEmployeDepartement(emp2,dep1);
        societeT.afficherLesEmployesLeursDepartements();

    }
}