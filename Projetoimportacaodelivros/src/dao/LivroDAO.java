package dao;

import database.Conexao;
import model.Livro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LivroDAO {

    public void criarTabela() {

        String sql = """
                CREATE TABLE IF NOT EXISTS livros(
                id INTEGER PRIMARY KEY,
                titulo TEXT,
                autor TEXT,
                ano_publicacao INTEGER,
                genero TEXT
                )
                """;

        try (
                Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            stmt.execute();

        } catch (Exception e) {

            System.out.println("Erro ao criar tabela: " + e.getMessage());

        }
    }

    public void inserir(Livro livro) {

        String sql = """
                INSERT INTO livros
                (id, titulo, autor, ano_publicacao, genero)
                VALUES (?, ?, ?, ?, ?)
                """;

        try (
                Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            stmt.setInt(1, livro.getId());
            stmt.setString(2, livro.getTitulo());
            stmt.setString(3, livro.getAutor());
            stmt.setInt(4, livro.getAnoPublicacao());
            stmt.setString(5, livro.getGenero());

            stmt.executeUpdate();

        } catch (Exception e) {

            System.out.println("Erro ao inserir: " + e.getMessage());

        }
    }

    public void listarPorTitulo() {

        String sql = "SELECT * FROM livros ORDER BY titulo";

        try (
                Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()
        ) {

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("titulo") + " | " +
                        rs.getString("autor") + " | " +
                        rs.getInt("ano_publicacao") + " | " +
                        rs.getString("genero")
                );
            }

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }

    public void listarPorAno() {

        String sql = "SELECT * FROM livros ORDER BY ano_publicacao";

        try (
                Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()
        ) {

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("titulo") + " | " +
                        rs.getString("autor") + " | " +
                        rs.getInt("ano_publicacao") + " | " +
                        rs.getString("genero")
                );
            }

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }
}