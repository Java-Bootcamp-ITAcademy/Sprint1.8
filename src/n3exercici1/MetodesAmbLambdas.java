package n3exercici1;

import java.util.List;
import java.util.stream.Collectors;

public class MetodesAmbLambdas {
    public void mostrarAlumnes(List<Alumne> alumnes) {  //Printing students
        alumnes.stream()
                .forEach(System.out::println);
    }
    public List<Alumne> alumnesPerA(List<Alumne> alumnes) {  //Printing students whose name starts with "A"
        return alumnes.stream()
                .filter(s -> s.getNom().startsWith("A"))
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    public void alumnesAprovats(List<Alumne> alumnes) {  //Printing students who passed the course
        alumnes.stream()
                .filter(s -> s.getNota() >= 5)
                .forEach(System.out::println);
    }

    public void alumnesAprovatsINoPHP(List<Alumne> alumnes) {  //Printing students who passed the course (NO PHP)
        alumnes.stream()
                .filter(s -> s.getNota() >= 5 && !s.getCurs().equals("PHP"))
                .forEach(System.out::println);
    }

    public void alumnesJavaMajors(List<Alumne> alumnes) {  //Printing Java over 18 students
        alumnes.stream()
                .filter(s -> s.getEdat() >= 18 && s.getCurs().equals("JAVA"))
                .forEach(System.out::println);
    }
}
