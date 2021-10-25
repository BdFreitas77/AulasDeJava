package com.bandtec.exercicios.relacionamento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego brito
 */
public class Carrinho {

    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    /*
        Deve retornar a quantidade total de produtos;
     */
    public Integer getQuantidade() {
        return produtos.size();
    }

    /*
        Deve adicionar um produto, não deve permitir duplicidade (nome),
        se for o caso, não faça nada;
     */
    public void adicionar(Produto produto) {
        if (produto != null) {
            if (existsPorNome(produto.getNome())) {
                return;
            }

            produtos.add(produto);

        }
    }

    /*
        Deve verificar se existe um objeto com o nome informado, caso nao tenha
        deve retornar false;
     */
    public Boolean existsPorNome(String nome) {
        for (Produto produto : produtos) {
            if (nome.equalsIgnoreCase(produto.getNome())) {
                return true;
            }
        }
        return false;
    }

    /*
        Deve retornar a quantidade existente a partir da categoria informada;
     */
    public Integer getQuantidadePorCategoria(String categoria) {
        Integer quantidadePorCategoria = 0;
        for (Produto produto : produtos) {
            if (produto.getCategoria().equalsIgnoreCase(categoria)) {
                quantidadePorCategoria++;
            }
        }
        return quantidadePorCategoria;
    }

    /*
        Deve limpar a lista(remover todos os elementos);
     */
    public void limpar() {
        produtos.removeAll(produtos);
    }

    /*
        Deve remover um produto, caso nao exista, não faça nada.
     */
    public void removerPorNome(String nome) {
        if (nome != null) {
            if (existsPorNome(nome)) {
                for (int i = 0; i < produtos.size(); i++) {
                    if (produtos.get(i).getNome().equalsIgnoreCase(nome)) {
                        produtos.remove(i + 1);
                    }
                }
            }

        }
    }

    /*
        Deve recuperar um produto, caso nao exista, retorne null.
     */
    public Produto getPorNome(String nome) {
        if (existsPorNome(nome)) {
            for (int i = 0; i < produtos.size(); i++) {
                if (nome.equalsIgnoreCase(produtos.get(i).getNome())) {
                    return produtos.get(i);
                }
            }
        }
        return null;
    }

    /*
        Deve retornar o valor total do produtos contidos no carrinho, caso lista
        esteja vazia, retorne 0;
     */
    public Double getValorTotal() {
        if (produtos.isEmpty()) {
            return 0.0;
        }
        Double valorTotalCarrinho = 0.0;
        for (Produto produto : produtos) {
            valorTotalCarrinho += produto.getPreco();
        }
        return valorTotalCarrinho;
    }

}
