package n3exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static List<Alumne> alumnes=new ArrayList<>();
    public static void main(String[] args) {
        alumnes.add(new Alumne("Toni Llombart", 39, "JAVA", 9.7));  //Adding elements to list
        alumnes.add(new Alumne("Laura Ager", 35, "JAVA", 9.2));
        alumnes.add(new Alumne("Jordi Mateu", 43, "PHP", 4.7));
        alumnes.add(new Alumne("Mònica Llombart", 39, "JAVA", 7.3));
        alumnes.add(new Alumne("Magí Llombart", 23, "PHP", 5.7));
        alumnes.add(new Alumne("Andreu Llorens", 15, "PHP", 3.8));
        alumnes.add(new Alumne("Víctor Alzina", 19, "JAVA", 5.7));
        alumnes.add(new Alumne("Anna Visa", 26, "PHP", 5.5));
        alumnes.add(new Alumne("Martí Pons", 17, "JAVA", 3.8));
        alumnes.add(new Alumne("Júlia Santacana", 28, "JAVA", 8.1));
        alumnes.add(new Alumne("Nassim Fresno", 16, "PHP", 6.9));

        MetodesAmbLambdas metodesAmbLambdas = new MetodesAmbLambdas();  //Instantiating Metodes amb Lambdas

        Utils.menu(metodesAmbLambdas,alumnes);  //Executing menu
    }

}
