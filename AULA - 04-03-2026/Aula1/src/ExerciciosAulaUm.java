import java.util.Scanner;

public class ExerciciosAulaUm {
    public static void main() {
        Scanner Leitor = new Scanner(System.in);

        int i = 10;
        int j = 2;
        int x = 0;
        int y = 0;
        j++;
        ++i;
        x = i++ + j;
        y = ++j + ++i;

        System.out.println("X = 14");
        System.out.println("Y = 17");
        System.out.println("J = 13");
        System.out.println("I = 4");

        int media = 0;

        System.out.println("Digite a nota do aluno 1:");
        int notaAluno1 = Leitor.nextInt();

        System.out.println("Digite a nota do aluno 2:");
        int notaAluno2 = Leitor.nextInt();

        System.out.println("Digite a nota do aluno 3:");
        int notaAluno3 = Leitor.nextInt();

        media = (notaAluno1 + notaAluno2 + notaAluno3) / 3;

        System.out.println("Media é igual a " + media);

        int a = 10;
        int b = 5;
        int c = 2;
        int d = 3;
        int e = 1;
        int f = 5;
        int g = 7;
        int h = 2;
        int i2 = 2;

        System.out.println(" - " + (a / b ^ c ^ d - e + f - g * h + i));

        System.out.println("=== Triangulo ===");
        System.out.println("Digite o valor do primeiro lado de um triangulo:");
        int primeiroLado = Leitor.nextInt();

        System.out.println("Digite o valor do segundo lado de um triangulo:");
        int segundoLado = Leitor.nextInt();

        System.out.println("Digite o valor do terceiro lado de um triangulo:");
        int terceiroLado = Leitor.nextInt();

        if ((primeiroLado > Math.abs(segundoLado - terceiroLado) && primeiroLado < segundoLado + terceiroLado)
                && (segundoLado > Math.abs(primeiroLado - terceiroLado) && segundoLado < primeiroLado + terceiroLado)
                && (terceiroLado > Math.abs(primeiroLado - segundoLado) && terceiroLado < primeiroLado + segundoLado)) {
            System.out.println("Não é possível formar um triangulo!");
        } else {
            if (primeiroLado == segundoLado && segundoLado == terceiroLado) {
                System.out.println("Triangulo Equilátero;");
            } else if (primeiroLado == segundoLado || primeiroLado == terceiroLado || segundoLado == terceiroLado) {
                System.out.println("Triangulo Isósceles;");
            } else if (primeiroLado != segundoLado && primeiroLado != terceiroLado && segundoLado != terceiroLado) {
                System.out.println("Triangulo Escaleno;");
            }
        }


    }
}