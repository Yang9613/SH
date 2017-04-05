package example.vo;

import javax.persistence.*;

/**
 * Created by MOMO on 2017/2/8.
 */
@Entity
@Table(name = "son", schema = "test", catalog = "")
public class SonEntity {
    private int sid;
    private String sname;
    private FatherEntity father;

    @Id
    @Column(name = "sid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "sname", nullable = true, length = 20)
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SonEntity sonEntity = (SonEntity) o;

        if (sid != sonEntity.sid) return false;
        if (sname != null ? !sname.equals(sonEntity.sname) : sonEntity.sname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "fid", referencedColumnName = "id")
    public FatherEntity getFather() {
        return father;
    }

    public void setFather(FatherEntity father) {
        this.father = father;
    }
}
