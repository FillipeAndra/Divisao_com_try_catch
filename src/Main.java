import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor =  new Scanner(System.in);
        System.out.println("Digite o primeiro número ");
        double numero1 = leitor.nextDouble();
        System.out.println("Digite o segunto número ");
        double numero2 = leitor.nextDouble();
        if(numero2 ==0){
            throw new zeroException("por favor não digite zero como divizor," +
                    "pois é impossível dividir por zero");
        }
        try{
            double dividido = numero1/numero2;
            System.out.println("O resultado da divisão era é: "+ dividido);
        }catch (zeroException e){
            System.out.println(e.getMessage());
        }





    }
}