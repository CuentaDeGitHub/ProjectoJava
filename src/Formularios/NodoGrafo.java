/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.util.List;

/**
 *
 * @author Chuy
 */
public class NodoGrafo {
    List<Arista> aristas;
     int posx;
        int posy;
        int nombre;

        public void llenaNodo(int x, int y)
        {
            posx = x;
            posy = y;
        }
        public void llenanombre(int nomb)
        {
            nombre = nomb;
        }
        public int getnombre()
        {
            return nombre;
        }
        public int getX()
        {
            return posx;
        }

        public int getY()
        {
            return posy;
        }

        public void llenararista(Arista ar)
        {
            aristas.add(ar);
        }
}
