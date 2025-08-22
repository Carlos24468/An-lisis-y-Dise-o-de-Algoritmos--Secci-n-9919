
package tienda;
import java.util.Scanner;
public class Clientes {
    String cl;
    String clr[]={"Ana", "Juan", "Pedro"};
    int agregar=clr.length;
    String []clxr= new String[agregar];
    boolean clrr=false;
    public Clientes(String cl){
        this.cl=cl;      
    }
    public void registro(String re){
        for (int i=0;i<clr.length;i++){
            
        if(re.equalsIgnoreCase(clr[i])){
                clrr=true;
                break;
            }
        }
            if(clrr){
                System.out.println("El cliente ya esta registrago");
                
            }
            else{
                System.out.println("ingrese el nombre del cliente a registrar");
                
                
            }
        
    }
}
