package util;

import model.Livro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LeitorCSV {

    public List<Livro> lerArquivo(String caminho) {

        List<Livro> livros = new ArrayList<>();

        try (
                BufferedReader br = new BufferedReader(
                        new FileReader(caminho))
        ) {

            String linha;

            while ((linha = br.readLine()) != null) {

                if (linha.trim().isEmpty()) {
                    continue;
                }

                String[] dados = linha.split(",");

                Livro livro = new Livro(
                        Integer.parseInt(dados[0]),
                        dados[1],
                        dados[2],
                        Integer.parseInt(dados[3]),
                        dados[4]
                );

                livros.add(livro);
            }

        } catch (Exception e) {

            System.out.println(
                    "Erro ao ler CSV: "
                            + e.getMessage()
            );

        }

        return livros;
    }
}