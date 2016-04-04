package ifpb.dac.dood.services;

import ifpb.dac.dood.model.Aluno;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ifpb.dac.dood.ServiceAluno;

/**
 *
 * @author Ricardo Job
 */
@Stateless
@Remote(ServiceAluno.class)
public class ServiceAlunoImpl implements ServiceAluno {

    @PersistenceContext(unitName = "DoodExemplo")
    private EntityManager em;

    @Override
    public void salvar(Aluno pessoa) {
        em.persist(pessoa);
    }

}
