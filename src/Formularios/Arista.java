/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import javax.swing.JOptionPane;

/**
 *
 * @author Chuy
 */
public class Arista {
    int origen;
        int destino;
        int peso;
        int tipo;
        
        public void llenaArista(int ori, int des, int pes, int tip)
        {
            origen = ori;
            destino = des;
            peso = Integer.parseInt(JOptionPane.showInputDialog("Cual es el peso de la Arista?"));
            tipo = tip;
        }
        
         public int getOrigen()
        {
            return origen;
        }

        public int getDestino()
        {
            return destino;
        }

        public int getPeso()
        {

            return peso;
        }

        public int getTipo()
        {
            return tipo;
        }
}
