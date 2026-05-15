package academy.devdojo.maratonajava.javacore.Kenums.domain;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.9;
        }
    }, CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 1.05;
        }
    };

    public abstract double calcularDesconto(double valor);
}
