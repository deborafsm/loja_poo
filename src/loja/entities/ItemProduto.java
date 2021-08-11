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
    public void compra(Usuario usuario, Produto produto) {
		System.out.println("Resumo da Compra \nNome:"+usuario.getNome() + "\nCPF:"+usuario.getCpf() +""
                        + "\nE-mail"+usuario.getEmail()+"\nCompras\nNome do Produto:"+produto.getNome()+"\nPreço :"+produto.getPreco()+"Quantidate"+produto.getQuantidade());
	}
}
