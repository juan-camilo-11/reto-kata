import java.util.*;
public class challenge1 {
    public static void main(String[] args) throws Exception {
        int number = 7; // Numero selecionado
        int[] numeros ={70, 6, 5, 4, 3, 2, 7, 79, 29, 1}; 
        ArrayList<Integer> resultados = new ArrayList<>();
        for(int numero: numeros){
            String temp = eliminarDigito(Integer.toString(numero),number);
            if (!temp.isEmpty()) {
                numero = Integer.parseInt(temp);
                if(numero < number){
                    resultados.add(numero);
                }
            }
            
        }
        for(int resultado: resultados){
            System.out.print("["+resultado+"]");
        }
    }
     public static String eliminarDigito(String cadena, int digito) {
        String digitoStr = Integer.toString(digito);// Convertir en String
        String resultado = cadena.replaceAll(digitoStr, "");// Remplazar lo igual por vacio
        return resultado;
    }
}