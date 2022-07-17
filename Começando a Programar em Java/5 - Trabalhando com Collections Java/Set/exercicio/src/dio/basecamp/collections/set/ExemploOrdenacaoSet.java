package dio.basecamp.collections.set;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--"); // Ordem aleatória = hashset
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Dark", "Suspense", 60));
            add(new Serie("Vikings", "Ação", 45));
            add(new Serie("B99", "Sitcom", 23));
        }};
        // for each:
        for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem de inserção\t--"); // aqui usamos o linkedhashset, respeita a ordem de inserção.
        Set<Serie> minhasSeries1 = new HashSet<>(){{
            add(new Serie("Dark", "Suspense", 60));
            add(new Serie("Vikings", "Ação", 45));
            add(new Serie("B99", "Sitcom", 23));
        }};
        // for each:
        for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem natural (TempoEpisodio)\t--"); // Usamos aqui  treeset
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio()); // criar classe ComparatorNomeGeneroTempoEpisodio() lá no fim
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

    }


}

// Primeiro passo: criar uma classe para colocar os atributos
class Serie implements Comparable <Serie>{ //implements foi feito depois para comparar e poder ordenar no treeset
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio='" + tempoEpisodio + '\'' +
                '}';
    }

    // alt+ins -> equals and hashcode, IMPORTANTE USAR QUANDO TEMOS IMPLEMENTÇÕES COM NOME HASH
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        return Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
    }

    // Como o Set não admite duplicações, se houver dados iguais, como por exemplo o tempo de episódio, seria feito assim:
    /*
        public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareTo(serie.getGenero());
        } FARÁ A COMPARAÇÃO POR GENÊRO SE O TEMPO FOR IGUAL
     */

}

/*
Comparando Nome, Gênero e tempo de ep,
se os nomes forem diferentes vai ser comparado por nome, se for igual desempata por gênero
e se o gênero tb for igual será comparado por tempo de ep,
se tudo for igual a série é a mesma.
 */
class ComparatorNomeGeneroTempoEpisodio implements Comparator <Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

    }
}