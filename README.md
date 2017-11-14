# Aula 013 - Projeto sistema-vendas acessando BD

## Unindo as aulas 10 (sistema-vendas) e 12 (acessando BD)

### Preparando o terreno

Para nós criarmos um sistema que acesse o banco de dados, precisamos entender:

Segundo SILVEIRA, Paulo [et al.], 2012:
- "... desenhar pequenas classes que, juntas, realizam uma tarefa maior, o programador ganha em simplicidade e modularidade".
- "Para realizar alterações com facilidade em um sistema, queremos que mudanças em uma parte dele não impliquem mais mudanças em outras."
- "Partes de um sistema são podem ser chamadas de **componentes**. Classes individuais, conjuntos de classes, um pacote ou até mesmo uma biblioteca contida em um arquivo jar são exemplos de componentes.
- "**Acomplamento** é o quanto dois elementos estão amarrados entre si e quanto as alterações no comportamento de um afetam o outro"
- "... uma importante e boa prática é garantir que ele [componente de um sistema] tenha **alta coesão**. o que significa garantir que suas responsabilidades sejam relacionadas e façam sentido juntas, ou seja, que não haja responsabilidades desconexas dentro de um mesmo componente"
- "Um conceito ainda mais amplo e difundido como excelente prática arquitetural é o da **separação de responsabilidades** [...]. Para diminuir o acoplamento, aumentar a coesão, promover flexibilidade e garantir responsabilidades únicas, é preciso saber separar responsabilidades."

### Padrão DAO

![Diagrama de classe - DAO](http://www.oracle.com/ocom/groups/public/@otn/documents/digitalasset/146804.jpg)

```java
public class User {  
   private String name, password;    
  // Construtores e sets / gets omitidos    
}
```

```java
public interface UserDao {   
   public void save (User user);    
   public void delete (User user);    
   public List<User> list ();    
   public User find(String name);    
   public User find(long id);    
} 
```

```java
public class JDBCUserDao implements UserDao {...}
```

![Diagrama de sequência - DAO](http://www.oracle.com/ocom/groups/public/@otn/documents/digitalasset/145996.jpg)


### Categoria Classe vs Tabela, 

Vamos trabalhar, vamos aplicar o padrão DAO na classe Categoria do nosso sistema de vendas.
Para isso, vamos criar a tabela CATEGORIA no banco de exemplos da aula passada.

Vamos trabalhar.

________________

Bons estudos.

## Links

Os seguintes links abaixo serão úteis para você estudar sobre o tema de acesso ao BD

 - [Bancos de dados e JDBC](https://www.caelum.com.br/apostila-java-web/bancos-de-dados-e-jdbc/)
 - [Core J2EE Patterns - Data Access Object](http://www.oracle.com/technetwork/java/dataaccessobject-138824.html)
 - [Introdução ao pattern DAO](http://javafree.uol.com.br/artigo/871452/Introducao-ao-pattern-DAO.html)
 
