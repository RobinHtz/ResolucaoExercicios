package exercicio_12.resolucao2.dominio;

public enum FormaPagamento {
    Dinheiro_Pix {
        @Override
        public double calcularDesconto(double valor){
            valor = valor-(valor*0.15);
            return valor;
        }
    },
    Credito_1x {
        @Override
        public double calcularDesconto(double valor){
            valor = valor-(valor*0.10);
            return valor;
        }
    },
    Credito_2x {
        @Override
        public double calcularDesconto(double valor){
            return valor;
        }
    },
    Credito_3x {
        @Override
        public double calcularDesconto(double valor){
            valor = valor+(valor*0.10);
            return valor;
        }
    };

    public abstract double calcularDesconto(double valor);

}
