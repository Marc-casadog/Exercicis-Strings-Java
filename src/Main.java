public class Main {
    public static void main(String[] args) {
        double d = 858.48;
        String s = String.valueOf(d);
        int dot = s.indexOf('.');
        System.out.println(dot+" digits before decimal point");
        System.out.println((s.length()-dot-1)+" digits after decimal point");
    }
}


/* Sortida consola:
 3 digits before decimal point
 2 digits after decimal point

En el codi apareixen 3 mètodes de classe String que són:
 1. valueOf() és estàtic. Converteix un valor a String. Retorna un objecte String. Paràmetre d'entrada és un double
 2. indexOf() és una instancia. Busca la posició d'un caràcter o text dins d'un String. Retorna un número enter (int). El paràmetre d'entrada és un char. 
 amb la seva posició.
 3. length() és una instància. Retorna la quantitat de caràxcters d'un String. Retorna un número enter (int)-. No té paràmetre d'entrada. 
 */