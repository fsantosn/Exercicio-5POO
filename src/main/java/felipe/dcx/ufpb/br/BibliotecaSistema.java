package felipe.dcx.ufpb.br;
import java.util.*;

public class BibliotecaSistema {

    private Map<String,Livro> livroMap;
    private Map<String, Usuario> usuarioMap;
    private Map<String, Emprestimo> emprestimoMap;

    public BibliotecaSistema(){
        this.livroMap = new HashMap<>();
        this.usuarioMap = new HashMap<>();
        this.emprestimoMap = new HashMap<>();
    }

    public boolean cadastrarUsuario(Usuario usuario){

        if(!usuarioMap.containsKey(usuario.getCpf())){
            usuarioMap.put(usuario.getCpf(), usuario);
                return true;
        } return false;
    }

    public boolean cadastrarLivro(Livro livro) throws LivroJaExisteException{
        if (livroMap.containsKey(livro.getCodigo())){
            throw new LivroJaExisteException("Livro Já cadastrado");
        }livroMap.put(livro.getCodigo(), livro);
        return true;
    }

    public boolean registrarEmprestismo(Emprestimo emprestimo) throws LivroJaEmprestadoException{
        if (emprestimoMap.containsKey(emprestimo.getId())){
            throw new LivroJaEmprestadoException("Livro emprestado");
        } emprestimoMap.put(emprestimo.getId(), emprestimo);
        return true;
    }

    public Collection<Usuario> pesquisarUsuariosPorLivro(Livro livro){
        Collection<Usuario> n = new HashSet<>();
        for (Emprestimo c: emprestimoMap.values()){
            if (c.getLivro().getCodigo().equalsIgnoreCase(livro.getCodigo())){
                n.add(c.getUsuario());
            }
        }return n;
    }

    public void removerLivro(Livro livro) throws LivroInexistenteException {
        if (!livroMap.containsKey(livro.getCodigo())){
            throw new LivroInexistenteException("Livro inesxistente");
        } livroMap.remove(livro.getCodigo());
    }

    public Collection<Livro> pesquisarLivro(Livro livro){
        Collection<Livro> n = new HashSet<>();
        for (Emprestimo c: emprestimoMap.values()){
            if (c.getLivro().getCodigo().equalsIgnoreCase(livro.getCodigo())){
                n.add(c.getLivro());
            }
        }return n;
    }
}
