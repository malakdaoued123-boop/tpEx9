package ex9;

public class Test {
    public static void main(String[] args) {
    	Dictionnaire d=new Dictionnaire(10, "Dict fr");
        Mot_dict m1=new Mot_dict("bnjr", "salut");
        Mot_dict m2=new Mot_dict("sbeh lkhir", "salut");
        d.Ajouter_Mot(m1);
        d.Ajouter_Mot(m2);
        d.Lister_dictionnaire();
        System.out.println("def : "
                + d.Rech_dicho("bnjr"));

        System.out.println("nbr de syn : "+ d.Nombre_synonyme(m1));
        d.Supprimer_Mot(m2);
        System.out.println("apres supp :");
        d.Lister_dictionnaire();
    }
}