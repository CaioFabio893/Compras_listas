import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        List<String> historicoCompras = new LinkedList<>();

        System.out.println("Digite seu saldo:");
        double saldo = leitura.nextDouble();
        leitura.nextLine();


        double valorSapato = 300.0;
        double valorCamisa = 250.50;
        double valorcalca = 350.0;

        while(true){
            System.out.println(""" 
                    
                    *******************************
                    
                    Qual intem vc quer comprar?
                    
                    Digite 1 para comprar o sapato.( 300 R$)
                    
                    Digite 2 para comprar a camisa.(250.50 R$)
                 
                    Digite 3 para compar a calça.(350 R$)
                   
                    Digite 4 para finalizar as compras.
                    
                    *******************************
                    """);

            int intem = leitura.nextInt();

            if (intem == 1) {
                if (saldo >= valorSapato){
                    saldo -= valorSapato;
                    historicoCompras.add("Comprou um sapato por " + valorSapato + ". \nSeu saldo restante foi: " + saldo + " Reais");
                    System.out.println("Você comprou um sapato , seu saldo é: " + saldo);
                } else {
                    System.out.println("Você não tem saldo suficiente");
                    break;
                }

            } else if (intem == 2) {
                if (saldo >= valorCamisa){
                    saldo -= valorCamisa;
                    historicoCompras.add("Comprou uma camisa por " + valorCamisa + ". \nSeu saldo restante foi: " + saldo + " Reais");
                    System.out.println("Você comprou uma 800camisa, seu saldo é: " + saldo);
                }else {
                    System.out.println("Você não tem saldo suficiente");
                    break;
                }

            } else if (intem == 3) {
                if (saldo >= valorcalca){
                    saldo -= valorcalca;
                    historicoCompras.add("Comprou uma calça por " + valorcalca + ". \nSeu saldo restante foi: " + saldo + " Reais");
                    System.out.println("Você comprou um calça, seu saldo é: " + saldo);
                }else {
                    System.out.println("Você não tem saldo suficiente");
                    break;
                }
            } else if (intem == 4) {
                System.out.println("compras finalizada!");
                break;
            } else {
                System.out.println("Comando invalidado");
            }

        }

        System.out.println("\nHistórico de compras:");
        for (String compra : historicoCompras) {
            System.out.println(compra);
        }


    }
}
