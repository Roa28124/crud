public class validacion {
    public static String validarLetras(String str) throws IllegalArgumentException {
        if (!str.matches("^[\\p{L}]+$")){
            throw new IllegalArgumentException("Debe contener sólo letras, elija una opcion nuevamente desde el menu principal 😘👌");

        }

        return str;
    }
    public static float validarNota(float nota) throws IllegalArgumentException{
        if (nota <= 0 || nota > 20) {
            throw new IllegalArgumentException("Nota invalida. Rango: 1 - 20. 😉😉😉");
        }
        return nota;
    }

}
