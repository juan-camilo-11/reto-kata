import java.util.ArrayList;
public class challenge2 {
    public static void main(String[] args) throws Exception {
        int number = 7;
        int[] entrada = { -2, 10};
        
        ArrayList<Integer> numeros = convertir(entrada, number);
        if(numeros.size() == 0){
            System.out.println("No hay resultado");
        }
        for (int numero : numeros) {
            System.out.print("["+numero+"]");
        }
        
    }

    public static ArrayList<Integer> convertir(int[] numeros, int number) {
        String numberDuplicadoText = Integer.toString(number) + Integer.toString(number); // Concatenamos el numero 
        number = Integer.parseInt(numberDuplicadoText);
        ArrayList<Integer> resultados = new ArrayList<Integer>();
        if (numeros.length == 0) {
            return null;
        }
        for (int i = 0; i < numeros.length; i++) {
            int temp = (int) Math.pow(numeros[i], 2);
            if(temp < number) {
                resultados.add(temp);
            }
        }
        return resultados;
    }
}
