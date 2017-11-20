package EJERCIOSWITCH;

public class Switch {
  public void SWITCH1(){
 int sw=0;
      for (int a=1;a<=6;a++){
    if (sw==0){
        System.out.println("hola");
        sw=1;
    }
    else if (sw==1){
        System.out.println("adiós");
        sw=0;
    }
}
  }
        

    

    public static void main(String[] args) {
       Switch a=new Switch();
       a.SWITCH1();
        // TODO code application logic here
        
    }
    

    }


/**Facer programa que escriba seis veces alternativamente a palabra "hola" y "adiós",
 * Estructura repetitiva.
 */