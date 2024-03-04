package fr.mutation.kata2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercice {
    
    public Map<Integer, String> f1(int numerochoisi, List<Integer> listeEntiers) {
        HashMap<Integer, String> resultat = new HashMap<Integer, String>();
        int compteur = 0;
        StringBuilder resultatstring = new StringBuilder();
        for (int occurence = 0; occurence < listeEntiers.size() && occurence < numerochoisi; occurence++) {
            int valeuroccurence = listeEntiers.get(occurence);
            if (valeuroccurence >= 0 && (valeuroccurence-1) < 20) {
                resultatstring.append(valeuroccurence).append(" ");
            } else {
                compteur++;
            }
        }
        resultatstring.append("\n");
        resultat.put(compteur, resultatstring.toString());
        return resultat;
    }
}