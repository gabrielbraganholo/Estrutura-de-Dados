package trabalho_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Clima> lista = new ArrayList<>();
        String nomeBase = "C:\\arquivos github\\Estrutura-de-Dados\\trabalhos\\trabalho_01\\base.csv";

        // O try-with-resources já fecha o arquivo automaticamente (igual ao 'with' do Python)
        try (BufferedReader leitor = new BufferedReader(
                new FileReader(nomeBase, StandardCharsets.UTF_8))) {

            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] dadosLinha = linha.split(",");

                Clima objClima = new Clima(dadosLinha[0],dadosLinha[1],dadosLinha[2], dadosLinha[3]);

                // Requer que o metodo equals() esteja implementado na classe Clima
                if (!lista.contains(objClima)) {
                    lista.add(objClima);
                }
            }

            for (Clima item : lista) {
                System.out.println(item);
            }

            ArrayList<String> resultadoMeses = Clima.mesMaisQuente(lista);
            System.out.println("Meses mais quentes: ");
            System.out.println(resultadoMeses);

            ArrayList<String> resultadoAnosQuentes = Clima.anoMaisQuente(lista);
            System.out.println("Anos mais quentes: ");
            System.out.println(resultadoAnosQuentes);

            ArrayList<String> resultadoAnosChuvosos = Clima.anoMaisChoveu(lista);
            System.out.println("Anos mais chuvosos: ");
            System.out.println(resultadoAnosChuvosos);

        } catch (Exception e) {
            System.err.println("Ocorreu algum erro... " + e.getMessage());
        }

    }
}
