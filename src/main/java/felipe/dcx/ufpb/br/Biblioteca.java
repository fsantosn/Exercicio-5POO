package felipe.dcx.ufpb.br;

import java.util.Collection;

public interface Biblioteca {

    boolean cadastrarUsuario(Usuario usuario);
    boolean cadastrarLivro(Livro livro) throws LivroJaExisteException;
    boolean registrarEmprestismo(Emprestimo emprestimo) throws LivroJaEmprestadoException;
    Collection<Usuario> pesquisarUsuariosPorLivro(Livro livro);
    void removerLivro(Livro livro) throws LivroJaExisteException;
}
