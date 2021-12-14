package Pruebas;

import Clases.HASH;
import javax.swing.JOptionPane;

public class TestHash {

    public static void main(String[] args) {
        try {
            int i, n, resp;
            int m = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el número de clientes."));
                                
            HASH[] h = new HASH[m];
            for (i = 0; i < m; i++) {
                h[i] = new HASH();
                h[i].estado = 0;
            }
            do {
                resp = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Menú Principal \n" + "Presiona el número dependiendo la opción que usted desee.\n\n"
                        + "Agregar cliente: (1)\nBuscar Cliente (2)\nEliminar Cliente (3)\nConsultar Lista (4)\n Salir (5)\n"));
                switch (resp) {
                    
                    case 1:
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente que desea agregar.");          
                        int saldo = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el saldo del cliente que desea agregar."));           
                    
                        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el número de cuenta que desea agregar."));
                        HASH.agregarCliente(h, m, n, nombre, saldo);
                        break;
                   
                    case 2:
                        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el número de cuenta que se desea buscar."));
                        i = HASH.consultarPersona(h, m, n);
                        if (i == -1) {
                            javax.swing.JOptionPane.showMessageDialog(null, "Número de cuenta no encontrado.");
                        } else {
                            javax.swing.JOptionPane.showMessageDialog(null, "Número de cuenta encontrado.");
                        }
                        break;
                    
                    case 3:
                        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el número de cuenta que desea eliminar."));
                        i = HASH.eliminarPersona(h, m, n);
                        if (i == -1) {
                            javax.swing.JOptionPane.showMessageDialog(null, "Número de cuenta no encontrado.");
                        } else {
                            
                            
                            javax.swing.JOptionPane.showMessageDialog(null, "Número de cuenta eliminado con éxito.");
                        }
                        break;
                        
                    case 4:
                        
                        break;
                        
                    case 5:
                        System.exit(0);
                    default:
                }
            } while (resp != 4);
        } catch (NumberFormatException nfe) {
            javax.swing.JOptionPane.showMessageDialog(null, "Está saliendo de la plataforma.");
        } catch (OutOfMemoryError ome) {
            javax.swing.JOptionPane.showMessageDialog(null, "No Hay Espacio.");
        }
    }   
}
