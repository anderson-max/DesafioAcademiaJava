package com.desafio;

import java.util.Scanner;

/**
 *
 * @author wanghley
 */
public class Atividade_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nteste;
        Scanner in = new Scanner(System.in);
        do
        {
            nteste = in.nextInt();
        }while(nteste<1 || nteste>10);
        String strings[] = new String[nteste];
        int valpteste[] = new int[nteste];
        for(int c = 0; c<nteste;c++)
        {
            do
            {
                strings[c] = in.next();
            }while(strings[c].length()<2 || strings[c].length()>100);
        }
        int somaLetra, multi,fatLetra[] = new int[100],denominador = 1,numerador=1, ValorFinal[] = new int[nteste];
        
        for(int c = 0; c<nteste;c++)//seleciona a palavra no vetorr
        {
            for(int d = 0;d<strings[c].length();d++)//seleciona a letra que servir� como par�metro
            {
                somaLetra = 1;
                multi = 1;
                for(int e = d+1;e<strings[c].length();d++)//seleciona as outras letras para compara��o
                {
                    if(strings[c].charAt(d)==strings[c].charAt(e))//verifica se letra par�metro == letra compara��o
                    {
                        somaLetra+=1;
                    }
                }
                for(int f = somaLetra;f>1;f--)//faz a fatora��o do valor SomaLetra
                {
                    multi *= f;
                }
                fatLetra[d] = multi;//retorna o valor da fatora��o para o vetor de fatora��o
            }
            for(int g = 0;g<fatLetra.length;g++)//multiplica os valores da fatora��o
            {
                denominador *= fatLetra[g];
            }
            for(int h = strings[c].length();h>1;h--)////faz a fatora��o da quantidade de letras
            {
                numerador *= h;
            }
            ValorFinal[c] = numerador/(numerador/denominador);
        }
        for(int i = 0;i<ValorFinal.length;i++)
        {
            System.out.println(ValorFinal[i]);
        }
    }
    
}