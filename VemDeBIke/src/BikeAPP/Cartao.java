/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BikeAPP;

/**
 *
 * @author GUIGAS
 */
public class Cartao {
    private String titular;
    private String Numero;
    private String validade;
    private String cvc;
    
    public Cartao(String titular, String Numero, String validade, String cvc){
        this.titular = titular;
        this.Numero = Numero;
        this.validade = validade;
        this.cvc = cvc;
   
    }
    
    public void FinalCartao() {
        // Verifica se o número tem pelo menos 3 dígitos
        if (Numero.length() >= 3) {
            // Pega os últimos 3 caracteres do número do cartão
            String ultimosTres = Numero.substring(Numero.length() - 3);
            System.out.println( ultimosTres);
        } 
    }
    
    public String getFinalCartao(){
        return Numero;
    }
}
