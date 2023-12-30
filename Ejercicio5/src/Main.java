import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrayPalabras = List.of("First", "Second", "Third", "Fourth", "Fifth", "Sixth"
                , "Seventh   asf" , "Eighth  af", "Ninth  asdasd" , "Tenth");
        if (esValido(arrayPalabras)) {
            minuscula(arrayPalabras);
        } else {
            System.out.println("array con mas de 11 elementos");
        }
    }

    public static boolean esValido(List<String> arrayPalabras){
        if (arrayPalabras.size() > 10)  {
            return false;
        }
        for (String palabra : arrayPalabras) {
            if (!palabra.matches("[a-zA-Z ]+")) {
                return false;
            }
        }
        return true;
    }

    public static void minuscula(List<String> arrayPalabras) {
        String resultado = String.join(" ",arrayPalabras).toLowerCase();
        System.out.println(resultado);
    }
}
