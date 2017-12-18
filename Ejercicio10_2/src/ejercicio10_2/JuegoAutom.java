package ejercicio10_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class JuegoAutom{

    private int nSecreto, adivinar, nInt, cont, diferencia;
    private String repetir;

    public JuegoAutom(){

    }

    public void jugar(){
        JOptionPane.showMessageDialog(null, "Vamos a jugar a un nuego");
        do{
            nSecreto=(int) (Math.random()*(51-1)+1);
            do{
                String intentos=JOptionPane.showInputDialog("Ingrese el numero de intentos que quiere para adivinar");
                nInt=Integer.parseInt(intentos);
            }while(nInt<=0);
            cont=0;
            do{
                String guessString=JOptionPane.showInputDialog("Trata de adivinar el numero");
                adivinar=Integer.parseInt(guessString);
                cont++;
                diferencia=Math.abs(nSecreto-adivinar);

                if(diferencia>20){
                    JOptionPane.showMessageDialog(null, "Estás muy lejos!");
                }else if(diferencia<=20&&diferencia>=10){
                    JOptionPane.showMessageDialog(null, "Estás lejos!");
                }else if(diferencia<10&&diferencia>5){
                    JOptionPane.showMessageDialog(null, "Estás cerca!");
                }else if(diferencia<=5){
                    JOptionPane.showMessageDialog(null, "Estás muy cerca!");
                }

            }while(adivinar!=nSecreto&&cont<nInt);
            if(cont==nInt&&adivinar!=nSecreto){
                JOptionPane.showMessageDialog(null, "No te quedan mas intentos");
                JOptionPane.showMessageDialog(null, "El número era "+nSecreto);
            }
            repetir=JOptionPane.showInputDialog("¿Quieres volver a jugar? (y/n): ");

        }while(repetir.equals("y"));

    }
}
