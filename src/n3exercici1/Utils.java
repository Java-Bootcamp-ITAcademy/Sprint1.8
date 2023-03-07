package n3exercici1;

import java.util.List;
import java.util.Scanner;

public class Utils {
    public static void menu(MetodesAmbLambdas metodesAmbLambdas, List<Alumne> alumnes) {  //Menu
        Scanner sc = new Scanner(System.in);
        boolean seguirMenu=true;
        do {
            System.out.println("Triï una opció");
            System.out.println("1: Llistar alumnes");
            System.out.println("2: Llistar alumnes que comencin per A");
            System.out.println("3: Llistar alumnes aprovats");
            System.out.println("4: Llistar alumnes aprovats que no són de PHP");
            System.out.println("5: Llistar alumnes de JAVA majors d'edat");
            System.out.println("0: Sortir");
            String opcio=sc.nextLine();
            switch(opcio) {
                case "1": {
                    metodesAmbLambdas.mostrarAlumnes(alumnes);
                    break;
                }
                case "3": {
                    metodesAmbLambdas.alumnesAprovats(alumnes);
                    break;
                }
                case "2": {
                    metodesAmbLambdas.alumnesPerA(alumnes);
                    break;
                }
                case "4":  {
                    metodesAmbLambdas.alumnesAprovatsINoPHP(alumnes);
                    break;
                }
                case "5": {
                    metodesAmbLambdas.alumnesJavaMajors(alumnes);
                    break;
                }
                case "0": {
                    seguirMenu=false;
                    sc.close();
                }
            }

        }
        while(seguirMenu);
    }
}
