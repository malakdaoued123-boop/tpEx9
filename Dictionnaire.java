package ex9;

public class Dictionnaire {
    private int nb_mots;
    private Mot_dict[] Dict;
    private String Nom;

    public Dictionnaire(int taille, String nom) {
        Dict=new Mot_dict[taille];
        nb_mots=0;
        Nom=nom;
    }
    public void Ajouter_Mot(Mot_dict mot) {
        if (nb_mots<Dict.length) {
            Dict[nb_mots]=mot;
            nb_mots=nb_mots+1;
        }
    }
    public void Lister_dictionnaire() {
        System.out.println("Dictionnaire : "+Nom);

        for (int i=0;i<nb_mots; i++) {
            System.out.println(
                Dict[i].getMot()+ ": "+Dict[i].getDefinition()
            );
        }
    }
    public void Supprimer_Mot(Mot_dict mot) {
        for (int i=0;i<nb_mots;i++) {
            if (Dict[i].getMot().equals(mot.getMot())) {
                for (int j=i;j<nb_mots-1; j++) {
                    Dict[j]=Dict[j+1];
                }
                Dict[nb_mots-1]=null;
                nb_mots=nb_mots-1																																																																																																																														;
                return;
            }
        }
    }
    
    public String Rech_dicho(String mot) {
        int deb=0;
        int fin=nb_mots-1;

        while (deb<= fin) {
            int mil=(deb+ fin)/ 2;
            int resultat=Dict[mil].getMot()
                    .compareTo(mot);

            if (resultat==0) {
                return Dict[mil].getDefinition();
            } else if(resultat < 0) {
                deb= mil + 1;
            } else {
                fin=mil-1;
            }
        }

        return "pas de mot";
    }
    
    public int Nombre_synonyme(Mot_dict m) {
        int c=0;

        for (int i=0;i<nb_mots; i++) {
            if (!Dict[i].getMot().equals(m.getMot())
                    && Dict[i].getDefinition().equals(
                        m.getDefinition())) {
                c++;
            }
        }

        return c;
    }

    
}
