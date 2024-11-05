package com.mycompany.aps.poo;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    protected List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getQuantidade() * produto.getValorUnitario();
        }
        return total;
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome() + ", Quantidade: " + produto.getQuantidade() + ", Valor Unitário: " + produto.getValorUnitario());
        }
    }
}

