package MainFunctions;

import java.util.Scanner;

public class GUICreator {
	
	public static void main(String[] args) {


        char[] alphabet = new char[26];

        //mit Buchstaben füllen
        int i = 0;
        for (char c = 'A'; (i <= alphabet.length - 1); c++, i++) {
            alphabet[i] = c;
        }

        System.out.println("Chiffre eingeben:");
        Scanner in = new Scanner(System.in);

        String chiffre = in.next().toUpperCase();
        in.close();
        int k = chiffre.length();

        char[] chiffreArray = new char[k];

        for (int n = 0; n < 25; n++) {
            for (int j = 0; j <= chiffre.length() - 1; j++) {
                char charAt = chiffre.charAt(j);
                charAt = (char) (charAt + n);


                if (charAt > 90) {
                    charAt = (char) (charAt - 26);
                }


                chiffreArray[j] = charAt;



            }
            
            
            System.out.println(chiffreArray);
        
        
        }






    }
	
}
