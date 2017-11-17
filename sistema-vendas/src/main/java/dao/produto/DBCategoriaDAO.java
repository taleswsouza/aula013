package dao.produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import modelo.produto.Categoria;

public class DBCategoriaDAO implements ICategoriaDAO {

    @Override
    public void salvar(Categoria categoria) {
        try {
            Connection conexao = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/sample", "app", "app");

            conexao.
            
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM APP.CATEGORIA  where id=" + id);

            // executa um select
            ResultSet rs = stmt.executeQuery();

            rs.next();
            categoriaARetornar = new Categoria();
            categoriaARetornar.setId(rs.getLong("ID"));
            categoriaARetornar.setDescricao(rs.getString("DESCRICAO"));
            rs.close();
            stmt.close();

            conexao.close();
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    @Override
    public void excluir(Categoria user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categoria> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Categoria procurar(String descricao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Categoria procurar(long id) {
        Categoria categoriaARetornar = null;
        try {
            Connection conexao = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/sample", "app", "app");
//            System.out.println("Conectado!");

            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM APP.CATEGORIA  where id=" + id);

            // executa um select
            ResultSet rs = stmt.executeQuery();

            rs.next();
            categoriaARetornar = new Categoria();
            categoriaARetornar.setId(rs.getLong("ID"));
            categoriaARetornar.setDescricao(rs.getString("DESCRICAO"));
            rs.close();
            stmt.close();

            conexao.close();
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
            ex.printStackTrace();
        }
        return categoriaARetornar;
    }

}
