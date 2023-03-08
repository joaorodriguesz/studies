package org.example.modelo;

import java.math.BigDecimal;

public enum Desempenho {
    A_DESEJAR {
       @Override
       public BigDecimal percentualReajuste(){
           return new BigDecimal("0.03");
       }
    };

    public abstract BigDecimal percentualReajuste();
}
