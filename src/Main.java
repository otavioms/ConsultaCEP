import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ConsultaCep consultaCEP = new ConsultaCep();

        System.out.println("Digite o CEP que dejesa procurar: ");
        var cep = leitor.nextLine();

        try {
            Endereco novoEndereco = consultaCEP.buscaEndereco(cep);
            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.geraJson(novoEndereco);
            System.out.println(novoEndereco);
        }catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicacao.");
        }
    }
}