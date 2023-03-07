package n1in2totsExercicis;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MetodesAmbLambdas {
    private List<String> llistaDeNoms;
    private List<String> llistaDeMesos;
    private List<String> llistaEntersiStrings;
    private String stringToBeReversed;
    private List<Integer> llistaEnters;
    private float f1;
    private float f2;

    /* Constructor */
    public MetodesAmbLambdas() {
        this.llistaDeNoms = new ArrayList<>();
        this.llistaDeMesos = new ArrayList<>();
        this.llistaEntersiStrings = new ArrayList<>();
        this.stringToBeReversed="Toni";
        this.llistaEnters = new ArrayList<>();
        this.f1 = 9.81F;
        this.f2 = 11.31F;
    }

    /* Getters and setters */
    public List<String> getLlistaDeNoms() {
        return llistaDeNoms;
    }

    public void setLlistaDeNoms(List<String> llistaDeNoms) {
        this.llistaDeNoms = llistaDeNoms;
    }

    public List<String> getLlistaDeMesos() {
        return llistaDeMesos;
    }

    public void setLlistaDeMesos(List<String> llistaDeMesos) {
        this.llistaDeMesos = llistaDeMesos;
    }

    public List<String> getLlistaEntersiStrings() {
        return llistaEntersiStrings;
    }

    public void setLlistaEntersiStrings(List<String> llistaEntersiStrings) {
        this.llistaEntersiStrings = llistaEntersiStrings;
    }

    public String getStringToBeReversed() {
        return stringToBeReversed;
    }

    public List<Integer> getLlistaEnters() {
        return llistaEnters;
    }

    public float getF1() {
        return f1;
    }

    public float getF2() {
        return f2;
    }

    /* Initializing lists */
    public void omplirLlistaDeNoms() {
        llistaDeNoms.add("Toni");
        llistaDeNoms.add("Laura");
        llistaDeNoms.add("Jordi");
        llistaDeNoms.add("Ernest");
        llistaDeNoms.add("Antoni");
        llistaDeNoms.add("Ana");
        llistaDeNoms.add("Eva");
    }

    public void omplirLlistaDeMesos() {
        llistaDeMesos.add("Gener");  //Adding elements to list
        llistaDeMesos.add("Febrer");
        llistaDeMesos.add("Març");
        llistaDeMesos.add("Abril");
        llistaDeMesos.add("Maig");
        llistaDeMesos.add("Juny");
        llistaDeMesos.add("Juliol");
        llistaDeMesos.add("Agost");
        llistaDeMesos.add("Setembre");
        llistaDeMesos.add("Octubre");
        llistaDeMesos.add("Novembre");
        llistaDeMesos.add("Desembre");
    }

    public void omplirLlistaDeEntersIStrings() {
        llistaEntersiStrings.add("12");  //Adding elements to list
        llistaEntersiStrings.add("5");
        llistaEntersiStrings.add("Toni");
        llistaEntersiStrings.add("Gerard");
        llistaEntersiStrings.add("7");
    }
    
    public void omplirLlistaDeEnters() {
        llistaEnters.add(3);
        llistaEnters.add(8);
        llistaEnters.add(10);
        llistaEnters.add(47);
    }

    public void omplirLlistaIntegers() {
        llistaEnters.add(3);
        llistaEnters.add(8);
        llistaEnters.add(10);
        llistaEnters.add(47);
    }

    /* Exercici 1 nivell 1 */
    public List<String> llistaAmbO(List<String> list) {
        return list.stream()
                .filter(s -> s.contains("o"))
                .peek(s -> System.out.println(s))
                .collect(Collectors.toList());

    }

    /* Exercici 2 nivell 1 */
    public List<String> llistaAmbOIMesde5(List<String> list) {
        return list.stream()
                .filter(s -> s.contains("o")&&s.length()>5)
                .peek(s -> System.out.println(s))
                .collect(Collectors.toList());
    }

    /* Exercici 3 nivell 1 */
    public void imprimirMesos(List<String> list) {
        list.stream()
                .forEach(s->System.out.println(s));  //Printing elements with lambdas
    }

    /* Exercici 4 nivell 1 */
    public void imprimirMesosAmbReference(List<String> list) {
        list.stream()
                .forEach(System.out::println);  //Printing elements with method reference
    }

    /* Exercici 5 nivell 1 */
    public double getPiValue(GetDouble getDouble) {
        double pi=getDouble.getPiValue();
        System.out.printf("Value of pi is %.2f\n",pi);
        return pi;
    }

    /* Exercici 6 nivell 1 */
    public void ordenarPerLongitudCurtaALlarga(List<String> list) {
        list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }

    /* Exercici 7 nivell 1 */
    public void ordenarPerLongitudLlargaACurta(List<String> list) {
        list.stream()
                .sorted((s,t)->t.length()-s.length())
                .forEach(System.out::println);
    }

    /* Exercici 8 nivell 1 */
    public String reversinString(Reverse reverse, String s) {
        String returnedString=reverse.reverse(s);
        System.out.println(returnedString);
        return returnedString;
    }

    /* Exercici 1 nivell 2 */
    public List<String> començaAmbA3Lletres(List<String> list) {
        return list.stream()
                .filter(s->s.startsWith("A")&&s.length()==3)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    /* Exercici 2 nivell 2 */
    public String parellsOImparells(List<Integer> list) {
        String returnedString = list.stream()
                .map(s->s%2==0?"e"+s:"o"+s)
                .collect(Collectors.toList()).toString();
        System.out.println(returnedString);
        return returnedString;
    }

    /* Exercici 3 nivell 2 */
    public float operacioFloat(FloatInterface floatInterface) {
        float f=floatInterface.retornaFloat(getF1(),getF2());
        System.out.printf("%.2f",f);
        return f;
    }

    /* Exercici 4 nivell 2 */
    public List<String> ordenarAlfabetic(List<String> list) {
        return  list.stream()
                .sorted(Comparator.comparingInt(s -> s.charAt(0)))
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    /* Exercici 4 nivell 2 */
    public List<String> lesEPrimer(List<String> list) {
        return list.stream()
                .sorted((s,t)-> s.contains("E")&&!t.contains("E")? -1 : ((t.contains("E")&&!s.contains("E")? 1: s.compareTo(t))))
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    /* Exercici 4 nivell 2 */
    public List<String> aPer4(List<String> list) {
        return  list.stream()
                .map(s->s.contains("a")?s.replace("a","4"):s)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    /* Exercici 4 nivell 2 */
    public List<String> nomesNombres(List<String> list) {
        return list.stream()
                .filter(s->s.matches("^[0-9]+"))
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

}