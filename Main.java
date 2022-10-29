import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner sc1 = new Scanner (System.in);
    double valorTotal, porcentagem;

    System.out.println("Sua compra saí pelo total de R$ 985,00");
    System.out.println("");
    System.out.println("Qual a forma de pagamento desejada? [1] Crédito [2] Á vista: ");
    int pagamentoInt = sc1.nextInt(); 
    String pagamento = "";

       if (pagamentoInt == 1) {
        pagamento = "Crédito";
         System.out.println("Compra finalizada no valor de R$985,00! Obrigada =D");
    } else if (pagamentoInt == 2) {
         valorTotal = 985;
         porcentagem = (0.43*valorTotal);
         pagamento = "Crédito";
         System.out.println("Possui desconto de 43%. Totalizando R$" + ( valorTotal - porcentagem) + " Obrigada pela compra :D" );
    }

  }
}