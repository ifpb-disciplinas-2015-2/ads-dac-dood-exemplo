package ifpb.dac.dood.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 04/04/2016, 16:54:27
 */
@Entity
public class Disciplina implements Serializable {

    private static final long serialVersionUID = 9125277018717732648L;

    @Id
    @GeneratedValue
    private int id;
    private String nome;

    public Disciplina(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public Disciplina() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
