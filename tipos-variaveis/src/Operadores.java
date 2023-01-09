public class Operadores {
    public static void main(String[] args) {
        //Atribuição
        //O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável.

        //Aritméticos
        //O operador aritmético, é utilizado para realizar operações matemáticas entre valores numéricos.
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.print(nomeCompleto);

        //O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        //Unários
        //Esses operadores, são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.
        // +, -, ++, --, !
        int numero = 5;

        numero = - numero;
        System.out.println(numero);

        int numero3 = 5;

        numero3 = numero3 * -1;
        System.out.println(numero3);

        numero++;
        //numero = numero + 1;
        System.out.println(numero);

        numero--;
        System.out.println(numero);

        Boolean variavel = false;
        System.out.println(!variavel);
        //a variável boolean terá o valor invertido para true, somente no print.

        variavel = !variavel;
        System.out.println(variavel);
        //dessa forma, variavel, se torna fixamente true.

        //Ternários
        // ? e :
        int a, b;

        a = 5;
        b = 6;
        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        */

        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);
        
        //Relacionais
        // ==, !=, <, >, <=, >=.

        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");
        
        Boolean simNao = numero1 == numero2;
            System.out.println("O número 2 é igual o número 1?" + simNao);


        String nome1 = "JAVA";
        String nome2 = "JAVA";
            
        System.out.println(nome1 == nome2); //true
    
        String nome3 = new String("JAVA");
            
        System.out.println(nome1 == nome3); //false
        //o equals confere se há igualdade nos valores, e seve ser usado para objetos.
        System.out.println(nome1.equals(nome2)); //true
        System.out.println(nome2.equals(nome3)); //true

        //Lógicos
        // &&, para "e"
        // ||, para "ou"

        Boolean condicao1 = true;
        Boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("as duas são verdadeiras");
        } //não vai rodar o sysout

        if (condicao1 || condicao2) {
            System.out.println("uma das condições é verdadeira");
        }
        
        System.out.println("fim");

    }
}
