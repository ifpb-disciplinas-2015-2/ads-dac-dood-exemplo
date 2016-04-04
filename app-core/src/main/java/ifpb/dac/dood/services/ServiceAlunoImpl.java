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
import java.util.List;

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

    @Override
    public List<Aluno> listar() {
        return em.createQuery("Select a From Aluno a", Aluno.class).
                getResultList();
    }

}
