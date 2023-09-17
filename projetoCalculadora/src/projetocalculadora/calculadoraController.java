/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocalculadora;

/**
 *
 * @author USER
 */

//memoria da calculadora
public class calculadoraController {
    private double total;
    
    public calculadoraController(){
        total = 0.0;
    }
    
    public Double relizaOperacao(enumOperacao operacao, Double valor){
        if (operacao.equals(enumOperacao.SOMA)) {
            total += valor;
        }else if (operacao.equals(enumOperacao.SUBTRACAO)){
            total -= valor;
        }else if (operacao.equals(enumOperacao.MULTIPLICACAO)){
            total *= valor;
        }else if (operacao.equals(enumOperacao.DIVISAO)){
            total /= valor;
        }
        return total;
    }
    
    public Double getTotal(){
        return this.total;
    }
    
    public void zerar(){
        total = 0.0;
    }
}
