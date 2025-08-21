
package tienda;
import java.util.Scanner;
public class Tienda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d;
        System.out.println("Ingrese el nombre de alguno de los propirtarios");
        d=sc.nextLine();
        cliente pr =new cliente(d);
        pr.propietarios(d);
       
        
    }
    
}
