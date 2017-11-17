package dao.produto;

import java.util.List;
import modelo.produto.Categoria;

public interface ICategoriaDAO {
   public void salvar (Categoria user);    
   public void excluir (Categoria user);    
   public List<Categoria> listar ();    
   public Categoria procurar(String descricao);    
   public Categoria procurar(long id); 
}
