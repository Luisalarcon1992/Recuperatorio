import java.util.Scanner;

public class Operaciones {


    private int valor;


    public Operaciones() {
        Scanner leerValor = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        this.valor = leerValor.nextInt();
    }


    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }





}
