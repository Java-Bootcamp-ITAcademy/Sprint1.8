package n1in2totsExercicis;

public class Main {

    public static void main(String[] args) {
        GetDouble getDouble= ()->Math.PI;  //Implementing interfaces
        Reverse reverse= s->new StringBuilder(s).reverse().toString();
        FloatInterface floatInterfaceSuma=(s, t) -> s + t;
        FloatInterface floatInterfaceResta=(s, t) -> s - t;
        FloatInterface floatInterfaceProducte=(s, t) -> s * t;
        FloatInterface floatInterfaceQuocient=(s, t) -> s / t;

        MetodesAmbLambdas metodesAmbLambdas=new MetodesAmbLambdas();  //Instantiating MetodesAmbLambdas
        metodesAmbLambdas.omplirLlistaDeNoms();  //Filling lists
        metodesAmbLambdas.omplirLlistaDeMesos();
        metodesAmbLambdas.omplirLlistaDeEntersIStrings();
        metodesAmbLambdas.omplirLlistaDeEnters();

        metodesAmbLambdas.llistaAmbO(metodesAmbLambdas.getLlistaDeNoms());  //Calling methods
        System.out.println("");
        metodesAmbLambdas.llistaAmbOIMesde5(metodesAmbLambdas.getLlistaDeNoms());
        System.out.println("");
        metodesAmbLambdas.imprimirMesos(metodesAmbLambdas.getLlistaDeMesos());
        System.out.println("");
        metodesAmbLambdas.imprimirMesosAmbReference(metodesAmbLambdas.getLlistaDeMesos());
        System.out.println("");
        metodesAmbLambdas.getPiValue(getDouble);
        System.out.println("");
        metodesAmbLambdas.ordenarPerLongitudCurtaALlarga(metodesAmbLambdas.getLlistaEntersiStrings());
        System.out.println("");
        metodesAmbLambdas.ordenarPerLongitudLlargaACurta(metodesAmbLambdas.getLlistaEntersiStrings());
        System.out.println("");
        metodesAmbLambdas.reversinString(reverse,metodesAmbLambdas.getStringToBeReversed());
        System.out.println("");
        metodesAmbLambdas.començaAmbA3Lletres(metodesAmbLambdas.getLlistaDeNoms());
        System.out.println("");
        metodesAmbLambdas.parellsOImparells(metodesAmbLambdas.getLlistaEnters());
        System.out.println("");
        metodesAmbLambdas.operacioFloat(floatInterfaceSuma);
        System.out.println("");
        metodesAmbLambdas.operacioFloat(floatInterfaceResta);
        System.out.println("");
        metodesAmbLambdas.operacioFloat(floatInterfaceProducte);
        System.out.println("");
        metodesAmbLambdas.operacioFloat(floatInterfaceQuocient);
        System.out.println("");
        metodesAmbLambdas.ordenarAlfabetic(metodesAmbLambdas.getLlistaDeNoms());
        System.out.println("");
        metodesAmbLambdas.lesEPrimer(metodesAmbLambdas.getLlistaDeNoms());
        System.out.println("");
        metodesAmbLambdas.aPer4(metodesAmbLambdas.getLlistaDeNoms());
        System.out.println("");
        metodesAmbLambdas.nomesNombres(metodesAmbLambdas.getLlistaEntersiStrings());
    }
}
