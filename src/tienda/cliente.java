
package tienda;

public class cliente {
    String []du={"ENRIQUE","CARLOS","JOSE"};
    String p;
    boolean encontrado = false;
    public cliente(String p){
        this.p=p;
    }
    public void propietarios(String d){
        for(int i=0;i<3;i++){
            if(d.equalsIgnoreCase(du[i])){
                encontrado=true;
                break;
            }
        }
            if(encontrado){
                System.out.println("Bienvenido");
                
            }
            else{
                System.out.println("intentelo de nuevo");
            }
        
    }
}
