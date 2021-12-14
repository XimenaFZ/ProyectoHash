package Clases;

public class Cliente {
    private String nombre;
    private int nc;
    private int saldo;
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String documento) {
        this.nombre = documento;
    }

    public int getNCuenta() {
        return nc;
    }

    public void setNCuenta(int nc) {
        this.nc = nc;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    } 
}
