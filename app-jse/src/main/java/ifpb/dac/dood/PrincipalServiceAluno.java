package ifpb.dac.dood;

import ifpb.dac.dood.model.Aluno;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 04/04/2016, 14:24:58
 */
public class PrincipalServiceAluno {
    public static void main(String[] args) {
        String nome = "java:global/dood-exemplo-core/ServiceAlunoImpl";
        
        Aluno pessoa = new Aluno("Job");
        ServiceAluno service = new ServiceLocator().
                lookup(nome, ServiceAluno.class);
        
        service.salvar(pessoa);
        

    }
}
