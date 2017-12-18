package ejercicio10_1;

import javax.swing.JOptionPane;

/*
 * @author Arturo
 */
public class Juego{

    private int nSecreto, adivinar, nInt, cont;
    private String repetir;

    public Juego(){

    }

    public void jugar(){
        JOptionPane.showMessageDialog(null, "Vamos a jugar a un nuego");
        do{
            do{
                String secreto=JOptionPane.showInputDialog("Ingrese el numero entre 1 y 50 a adivinar");
                nSecreto=Integer.parseInt(secreto);
            }while(nSecreto<0||nSecreto>=50);
            do{
                String intentos=JOptionPane.showInputDialog("Ingrese el numero de intentos");
                nInt=Integer.parseInt(intentos);
            }while(nInt<=0);
            cont=0;
            do{
                String guessString=JOptionPane.showInputDialog("Trata de adivinar el numero");
                adivinar=Integer.parseInt(guessString);
                cont++;
                if(adivinar<nSecreto&&cont!=nInt){
                    JOptionPane.showMessageDialog(null, "El numero que buscas es mayor");
                }
                if(adivinar>nSecreto&&cont!=nInt){
                    JOptionPane.showMessageDialog(null, "El numero que buscas es menor");
                }
                if(adivinar==nSecreto){
                    JOptionPane.showMessageDialog(null, "Has acertado!!!");
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
