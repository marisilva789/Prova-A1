import java.util.Scanner;
public class provaAUmMariana {
    public static void main(String[] args) {
        String funcionarioDaACME;
        double pesoAtualDoFuncionario, aguaIngeridaDuranteODia, quantidadeIdealDeAgua, quantidadeAIngerir;

        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Insira o seu nome: ");
        funcionarioDaACME = scanner.next();
       
        System.out.println("Informe o seu peso atual (em Kg): ");
        pesoAtualDoFuncionario = scanner.nextDouble();
       
        System.out.println("Agora informe a quantidade de água ingerida durante o dia (em litros):  ");
        aguaIngeridaDuranteODia = scanner.nextDouble();
        
        quantidadeIdealDeAgua = Math.ceil((pesoAtualDoFuncionario * 35)/1000);
        quantidadeAIngerir = quantidadeIdealDeAgua - aguaIngeridaDuranteODia;
        
        System.out.println("\nNome: " + (funcionarioDaACME));
        System.out.printf("Seu peso atual é: %.0f Kg", (pesoAtualDoFuncionario));
        System.out.println("\nA quantidade de água ingerida no dia foi de: " + (aguaIngeridaDuranteODia) + " Litros");
        System.out.println("A quantidade ideal a ser ingerida por dia é: " + (quantidadeIdealDeAgua) + " Litros");
        
        if (quantidadeAIngerir <= 0)
        System.out.println("Parabéns, você atingiu a meta de hidratação diária!.");
        else
        System.out.println("Continue focado em se hidratar por hoje! Ainda faltam " + quantidadeAIngerir + " Litros");
        scanner.close();
    }
}