import java.util.Objects;

public class Employe implements Comparable<Employe>{
    int cin;
    String matricule;
    String nom;
    String prenom;
    public Employe(){}
    public Employe (int cin, String mat, String nom, String prenom)
    {
        this.cin=cin;
        this.matricule=mat;
        this.nom=nom;
        this.prenom=prenom;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "cin=" + cin +
                ", matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return cin == employe.cin && Objects.equals(matricule, employe.matricule) && Objects.equals(nom, employe.nom) && Objects.equals(prenom, employe.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cin, matricule, nom, prenom);
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    @Override
    public int compareTo(Employe o) {
        return this.cin-o.cin;
    }
}
