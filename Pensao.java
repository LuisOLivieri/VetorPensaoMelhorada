import java.util.Locale;
import java.util.Scanner;
import entities.Rent;

public class Pensao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10]; //Criar na memória 10 vetores

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for(int i = 1; i < n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name  = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            Rent rent = new Rent(name, email); //Instanciou os dados passados na memória. 
            vect[roomNumber] = rent;
        }
        System.out.println();
        System.out.println("Busy Rooms: ");
        for (int i = 0; i < 10; i++){
            if(vect[i] != null){ //Vect for diferente de nulo. 
                System.out.println(i +": " +vect[i]);
            }

        }

        sc.close();
    }
}
