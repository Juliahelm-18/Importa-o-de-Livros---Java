package service;

import dao.LivroDAO;
import model.Livro;
import util.LeitorCSV;

import java.util.List;

public class Importador {

    public void importar(String caminho) {

        LeitorCSV leitor = new LeitorCSV();
        LivroDAO dao = new LivroDAO();

        List<Livro> livros = leitor.lerArquivo(caminho);

        for (Livro livro : livros) {
            dao.inserir(livro);
        }

        System.out.println(
                "\nTotal importado: "
                        + livros.size()
                        + " registros."
        );
    }
}