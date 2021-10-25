package com.bandtec.projeto.lista.desafio;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {
        this.inteiros = new ArrayList<>();
    }

    public void add(Integer inteiro)
    {
        if(inteiro != null){
            inteiros.add(inteiro);
        }
    }
    
    public void remove(Integer inteiro)
    {
        if(inteiro != null){
            inteiros.remove(inteiro);
        }
    }
    
    public Integer count()
    {
        return inteiros.size();
    }
    
    public Integer countPares()
    {
        if (inteiros.isEmpty()) {
            return 0;
        } 
        Integer quantidadeInteiros = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i) % 2 == 0) {
                quantidadeInteiros++;
            }
        }
        return quantidadeInteiros;
    }
    
    public Integer countImpares()
    {
        if (inteiros.isEmpty()) {
            return 0;
        } 
        Integer quantidadeInteiros = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i) % 2 != 0) {
                quantidadeInteiros++;
            }
        }
        return quantidadeInteiros;
    }
    
    public Integer somar()
    {
        if (inteiros.isEmpty()) {
            return 0;
        }
        Integer soma = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            soma += inteiros.get(i);
        }
        return soma;
    }
    
    public Integer getMaior()
    {
        if (inteiros.isEmpty()) {
            return 0;
        }
        Integer numeroMaior = inteiros.get(0);
        Integer numero;
        for (int i = 0; i < inteiros.size(); i++) {
            numero = inteiros.get(i);
            if (numero > numeroMaior) {
                numeroMaior = numero;
            }
        }
        return numeroMaior;
    }
    
    public Integer getMenor()
    {
        if (inteiros.isEmpty()) {
            return 0;
        }
        Integer numeroMenor = inteiros.get(0);
        Integer numero;
        for (int i = 0; i < inteiros.size(); i++) {
            numero = inteiros.get(i);
            if (numero < numeroMenor) {
                numeroMenor = numero;
            }
        }
        return numeroMenor;
    }
    
    public boolean hasDuplicidade()
    {
        for (int i = 0; i < inteiros.size(); i++) {
            Integer numeroATestar = inteiros.get(i);
            for (int j = 0; j < inteiros.size(); j++) {
                if (i == j) {
                } else if (Objects.equals(numeroATestar, inteiros.get(j))) {
                    return true;
                }
                
            }
        }
        return false;
    }
}
