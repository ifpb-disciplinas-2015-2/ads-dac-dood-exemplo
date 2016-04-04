package ifpb.dac.dood.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
    @Basic(fetch = FetchType.EAGER)
    @OneToMany(cascade = CascadeType.ALL)
    private List<Disciplina> disc;

    public Aluno(int id, String nome) {
        this();
        this.id = id;
        this.nome = nome;
    }

    public Aluno(String nome) {
        this();
        this.nome = nome;
    }

    public Aluno() {
        this.disc = new ArrayList<Disciplina>();
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

    public List<Disciplina> getDisc() {
        return disc;
    }

    public void setDisc(List<Disciplina> disc) {
        this.disc = disc;
    }

    public void add(Disciplina disciplina) {
        this.disc.add(disciplina);
    }

}
