package ifpb.dac.dood;

import ifpb.dac.dood.model.Aluno;
import ifpb.dac.dood.model.Disciplina;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 04/04/2016, 14:24:58
 */
public class PrincipalServiceAluno {
    public static void main(String[] args) {
        String nome = "java:global/dood-exemplo-core/ServiceAlunoImpl";
        
        Aluno pessoa = new Aluno("Kiko");
        pessoa.add(new Disciplina("DAC, a mais legal de todas "));
        
        ServiceAluno service = new ServiceLocator().
                lookup(nome, ServiceAluno.class);
        
        service.salvar(pessoa);
        
        List<Aluno> lista = service.listar();
        
        for (Aluno aluno : lista) {
            System.out.print(aluno.getId());
            System.out.print(" - "+aluno.getNome());
            System.out.println(" - "+aluno.getDisc().size());
        }
        

    }
}
