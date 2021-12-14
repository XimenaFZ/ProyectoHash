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
}
