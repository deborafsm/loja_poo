/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import loja.entities.ItemProduto;
import loja.entities.Produto;
import loja.entities.Usuario;

/**
 *
 * @author Code
 */
public class Venda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instancia da Classe e preenchimento dos atributos
        Usuario usuario = new Usuario("Débora Freire","123.123.123-12","debora.freire@gmail.com");
        Usuario usuario1 = new Usuario("Gustavo Freitas","234.234.234.23","gustavo.freitas@gmail.com");
        Produto produto = new Produto("Tv",10.000,1);
        Produto produto1 = new Produto("Geladeira",3.300,2);
        ItemProduto itemproduto = new ItemProduto();
        ItemProduto compras = new ItemProduto();
        //Metodo compra
        compras.compra(usuario, produto1);
    }
    
}
