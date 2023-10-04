import java.util.Arrays;
public class challenge3 {
    public static void main(String[] args) throws Exception {
        int[] numeros = {2,5,2,2,3,10,15,20,100};
        Arrays.sort(numeros);
        System.out.println(cambioMinimo(numeros));
    }
    public static int cambioMinimo(int[] array) {
        if(array[0] != 1){
            return 0;
        }
        int aux = 1;
        int resultado = 0;
        for (int i = 1; i < array.length; i++) {
            if(aux >= array[i] || aux == (array[i]-1)){
                aux += array[i];
                resultado = aux;
            }
        }
        return resultado+1;
    }
}
