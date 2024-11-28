//Exercício para estudar exceções.

package application;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try{
            // Criação de um vetor de strings para causar e testar exceções em execução.
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position");
        } 

        catch(InputMismatchException e){
            System.out.println("Input error");
        }

        System.out.println("End for program");

        sc.close();
    }
}