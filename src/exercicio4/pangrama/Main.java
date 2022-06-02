package exercicio4.pangrama;

/*
Pangrama ou pantograma (do grego, pan ou pantós = todos, + grama Pangrama,
ou pantograma, (do grego, pan ou pantós = todos, + grama = letra) é uma frase
em que são usadas todas as letras do alfabeto de determinada língua.
Crie um programa que receba uma frase que possui palavras válidas numa
linguagem específica e identifique se a frase é um pangrama da linguagem.
Exemplo de Entrada:
Zebras caolhas de Java querem passar fax para moças gigantes de New York
Saída: É pangrama.
Exemplo de Entrada:
Jane quer LP, fax, CD, giz, TV e bom whisky
Saída: É pangrama.
Exemplo de Entrada:
Cheguei aqui
Saída: Não é pangrama.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l','m', 'n', 'o', 'p', 'q', 'r','s',
              't','u','v','w','x','y', 'z'};
        String oracao = entrada.nextLine();
        int tamanhoOracao = oracao.length();
        int qtdIdentificadas = 0;

        while (!oracao.equals("^")) {
            for (int i = 0; i < alfabeto.length; i++) {
                for (int a = 0; a < tamanhoOracao; a++) {
                    if (alfabeto[i] == oracao.charAt(a)) {
                        qtdIdentificadas++;
                        break;
                    }
                }
                if (qtdIdentificadas != 1) {
                    break;
                }
            }
            if (qtdIdentificadas == 26) {
                System.out.println("É um pangrama");
            } else {
                System.out.println("Não é um pangrama");
            }

            oracao = entrada.nextLine();
            tamanhoOracao = oracao.length();
            qtdIdentificadas = 0;
        }

        }


    }

