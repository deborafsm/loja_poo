/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.entities;

/**
 *
 * @author Code
 */
public class ItemProduto {
    public double compra(Usuario usuario, Produto produto) {
        double total;
        total = produto.getPreco()*produto.getQuantidade();
        System.out.printf("Resumo da Compra \nNome:"+usuario.getNome() + "\nCPF:"+usuario.getCpf() +""
                        + "\nE-mail"+usuario.getEmail()+"\nCompras\nNome do Produto:"+produto.getNome()+"\nPreço :"+produto.getPreco()+"\nQuantidade"+produto.getQuantidade()+"\nTotal:%.3f",total,"\n");
        return 0;
        
                
	}
    
}
