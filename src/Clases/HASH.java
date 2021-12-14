package Clases;

import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class HASH {
    String nombre;
    int nc;
    int saldo;
    
    public int estado; 

    static int funcion(int n, int m) {
        return ((n + 1) % m);
    }

    public static void agregarCliente(HASH[] h, int m, int n, String nombre, int saldo) {
        boolean i = false;
        int j = funcion(n, m);
        do {
            if (h[j].estado == 0 || h[j].estado == 1) {
                h[j].nc = n;
                h[j].saldo = saldo;
                h[j].nombre = nombre;
                h[j].estado = 2;
                i = true;
            } else {
                j++;
            }
        } while (j < m && !i);
        if (i) {
            javax.swing.JOptionPane.showMessageDialog(null, "¡Elemento insertado con éxito!");
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "¡Tabla llena!");
        }
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static int consultarPersona(HASH[] h, int m, int n) {
        int j = funcion(n, m);
        while (j < m) {
            if (h[j].estado == 0) {
                return -1;
            } else if (h[j].nc == n) {
                if (h[j].estado == 1) {
                    return -1;
                } else {
                    return j;
                }
            } else {
                j++;
            }
        }
        return -1;
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static int eliminarPersona(HASH[] h, int m, int n) {
        int i = consultarPersona(h, m, n);
        if (i == -1) {
            return -1;
        } else {
            h[i].estado = 1;
            return 1;
            
        }
    }
}
