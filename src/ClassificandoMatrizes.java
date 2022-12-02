
import java.util.*;
import java.util.Scanner;
import static java.lang.System.*;
public class ClassificandoMatrizes {

       public static void main(String[] args) {
// Mover todos os inteiros pares para o inicio do array, seguido por todos os números ímpares no final do Array

           // Criando o objeto scanner:
           Scanner scan = new Scanner(in);

           out.println("Digite o tamanho do Array:");
           int tamanhoArray = scan.nextInt();
           int [] nums = new int[tamanhoArray];
           int primeiroDoIndex = 0;

           out.println("Digite os números do Array: ");
           // Gerando o array inicial:
           for (int i = 0; i < tamanhoArray; i++) nums[i] = scan.nextInt();

           // Estrutura de Repetição que ordena o array:
           for(int i = 0; i < tamanhoArray; i++) {
               if(nums[i] % 2 == 0) {
                   int varAuxiliar = nums[primeiroDoIndex];
                   nums[primeiroDoIndex] = nums[i];
                   nums[i] = varAuxiliar;
                   primeiroDoIndex++;
               }
           }

           // Resultado:
           for(int numero : nums) out.println(numero);
       }
}


