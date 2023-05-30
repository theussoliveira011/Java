package matheus.tbm.maratonaJava.javacore.Jenum.domains;

public enum TypePayment{
        CREDITO{
            @Override
            public double getDiscount(double valor) {
                return valor * .1;
            }
        },
        DEBITO{
            @Override
            public double getDiscount(double valor) {
                return valor * .05;
            }
        },
        DINHEIRO{
            @Override
            public double getDiscount(double valor) {
                return valor * .07;
            }
        };

        public abstract double getDiscount(double valor);
    }