import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
            String[] nomes = new String[10];
            for (int i = 0; i < 10 && sc.hasNextLine(); i++)
                nomes[i] = sc.nextLine();
            
            System.out.println(nomes[2]);
            System.out.println(nomes[6]);
            System.out.println(nomes[8]);
        }
        
        sc.close();
    }
}
