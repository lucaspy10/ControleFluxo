package ControleFluxo;

import java.util.Scanner;
import exception.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();
        terminal.close();
        try {
            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosException exception) {
        	
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
        	ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        	
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + (parametroUm + i));
        }
    }

	private static void ParametrosInvalidosException(String message) {
		System.out.println(message);
	}
   
}
