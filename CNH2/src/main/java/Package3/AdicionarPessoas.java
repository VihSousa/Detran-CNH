
package Package3;

import Package2.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class AdicionarPessoas {

    static ArrayList<Pessoa> lista = new ArrayList<>();

    public boolean salvar(Pessoa p1) {
        if (p1 != null) {
            lista.add(p1);
        
            return true;
        } else {
            return false;

        }
    }

    public static void listarpessoas() {
        for (Pessoa p : lista) {
            System.out.print(p.getNome());
        }
    }

    public static ArrayList<Pessoa> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Pessoa> lista) {
        this.lista = lista;
    }

}

/*private ArrayList<Pessoa> Pessoas = new ArrayList<>();
    
    public boolean salvar(Pessoa pessoaa){
        if(pessoaa != null){
            Pessoas.add(pessoaa);
            return true;
        }else{
            return false;
        }
    }
    public ArrayList<Pessoa> retornarTodos(){
        return Pessoas;
        }

    public ArrayList<Pessoa> getPessoas() {
        return Pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> Pessoas) {
        this.Pessoas = Pessoas;
    }*/
