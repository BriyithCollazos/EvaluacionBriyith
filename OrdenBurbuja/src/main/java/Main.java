import java.util.SimpleTimeZone;

public class Main {
    public static void main(String [] args){
        int num[] = {10,-2,8,30,1,30};
        int temp ;
        for (int j=0; j < num.length-1;j++){
            for (int i=0; i < num.length-1;i++) {
                //System.out.println(i);
                //System.out.println("el valor actual es: "+num[i]+" y el valor Siguiente es: "+num[i+1]);
                if (num[i] > num[i + 1]) {
                    temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                }
            }
        }
        System.out.println(num[0]+" "+ num[1] +" "+num[2]+" "+num[3]+" "+num[4]+" "+num[5]);
        System.out.println("hola mundo");// desde equipo
        System.out.println("cambio desde interfaz web primer archivo del main".); // Editado desde la GITHUB web primer archivo del main
    }
}
