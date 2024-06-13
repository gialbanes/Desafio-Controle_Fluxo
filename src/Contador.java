import java.util.Scanner;
public class Contador{
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois); // Chama o método da contagem das ocorrências - "contar"
        }catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage()); // A mensagem "O segundo parâmetro deve ser maior que o primeiro" é impressa
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{ // O método contar possui uma exceção
        // O método contar foi criado para conter a contagem da quantidade de ocorrências entre os números digitados 

        // Validação
        if(parametroUm>=parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;
        // Estabelecer o for para que as ocorrências entre os parâmetros digitados sejam impressas
        for(int i = 1; i<=contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}