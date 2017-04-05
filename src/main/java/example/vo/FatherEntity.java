package example.vo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by MOMO on 2017/2/8.
 */
@Entity
@Table(name = "father", schema = "test", catalog = "")
public class FatherEntity {
    private int id;
    private String name;
    private Set<SonEntity> sons=new HashSet<SonEntity>();

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FatherEntity that = (FatherEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "father",cascade = CascadeType.ALL)
    public Set<SonEntity> getSons() {
        return sons;
    }

    public void setSons(Set<SonEntity> sons) {
        this.sons = sons;
    }
}
