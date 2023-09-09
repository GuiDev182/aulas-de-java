package edu.pacote.teste;
/**
 * minhaclasse
 */
public class minhaclasse {

  public static void main(String[] args) {
    String primeiroNome = "Guilherme";
    String segundoNome = "lima";

    String nomeCompleto= nomeCompleto(primeiroNome, segundoNome);
    System.out.printf(nomeCompleto);
  } 


  public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "resultado do metodo:" + primeiroNome.concat(" ").concat(segundoNome);
  }
 
    
}
