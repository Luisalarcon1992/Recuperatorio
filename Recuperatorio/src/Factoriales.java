
public class Factoriales extends Operaciones implements CalcFactorial {

    @Override
    public int factorial(Operaciones valor) {
            if (valor == 0)
                return 1;
            return valor * factorial(valor- 1);
        }

}

