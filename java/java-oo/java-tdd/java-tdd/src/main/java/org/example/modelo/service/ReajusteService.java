package org.example.modelo.service;

import org.example.modelo.Desempenho;
import org.example.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void corcederReajuste(Funcionario funcionario, Desempenho desempenho) {
        if(desempenho.equals(Desempenho.A_DESEJAR)){
           funcionario.reajustarSalario(desempenho.percentualReajuste());
        }
    }
}
