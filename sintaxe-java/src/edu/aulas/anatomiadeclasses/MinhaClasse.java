package edu.aulas.anatomiadeclasses;
/*Todo arquivo .java deve começar com letra MAIÚSCULA. Se a palavra for composta, 
a segunda palavra deve também ser maiúscula e a classe deve possuir o mesmo nome do arquivo .java*/

public class MinhaClasse {
    
    //Método principal.
    public static void main (String[] args) {
       String primeiroNome = "Nicole";
       String segundoNome = "Morais";

       String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
       System.out.print(nomeCompleto);
       
    }

    //Método que retorna uma string com 2 parâmetros.
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
