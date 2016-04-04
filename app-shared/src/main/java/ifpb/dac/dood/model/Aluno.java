package ifpb.dac.dood.model;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 04/04/2016, 13:06:33
 */
@Entity
public class Aluno implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String nome;

    public Aluno(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Aluno(String nome) {

        this.nome = nome;
    }

    public Aluno() {
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
