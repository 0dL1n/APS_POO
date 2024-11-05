package com.mycompany.aps.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar produto ao carrinho");
            System.out.println("2. Remover produto do carrinho");
            System.out.println("3. Listar produtos no carrinho");
            System.out.println("4. Calcular total do carrinho");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            if (opcao == 1) {
                System.out.print("Nome do produto: ");
                String nome = scanner.nextLine();
                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();
                System.out.print("Valor unitário: ");
                double valorUnitario = scanner.nextDouble();
                scanner.nextLine(); // Consumir nova linha

                Produto produto = new Produto(nome, quantidade, valorUnitario);
                carrinho.adicionarProduto(produto);
                System.out.println("Produto adicionado com sucesso!");

            } else if (opcao == 2) {
                System.out.print("Nome do produto a remover: ");
                String nome = scanner.nextLine();
                Produto produtoParaRemover = null;

                for (Produto produto : carrinho.produtos) {
                    if (produto.getNome().equals(nome)) {
                        produtoParaRemover = produto;
                        break;
                    }
                }

                if (produtoParaRemover != null) {
                    carrinho.removerProduto(produtoParaRemover);
                    System.out.println("Produto removido com sucesso!");
                } else {
                    System.out.println("Produto não encontrado no carrinho.");
                }

            } else if (opcao == 3) {
                carrinho.listarProdutos();

            } else if (opcao == 4) {
                System.out.println("Total do carrinho: " + carrinho.calcularTotal());

            } else if (opcao == 5) {
                break;

            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}

