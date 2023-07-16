public class Main {
    public static void main(String[] args) {
        System.out.println("Este é o Screen Match"); // nome geral do site
        System.out.println("Filme: Top Gun: Maverick"); // filme escolhido

        // ano de lançamento do filme escolhido
        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true; // nem todos os filmes aparecerão neste plano
        double notaDoFilme = 8.1; // ?

        // média das notas dadas ao filme
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        // sinopse do filme escolhido
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80.
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        // classificação em estrelas [metade da nota (0 a 10)]
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}