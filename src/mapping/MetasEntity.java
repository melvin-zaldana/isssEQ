package mapping;

import javax.persistence.*;

/**
 * Created by zaldana on 04-23-15.
 */
@Entity
@Table(name = "Metas", schema = "", catalog = "ISSS")
public class MetasEntity {
    private int idMetas;
    private int mes;
    private int meta;
    private int fkCirujano;

    @Id
    @Column(name = "idMetas")
    public int getIdMetas() {
        return idMetas;
    }

    public void setIdMetas(int idMetas) {
        this.idMetas = idMetas;
    }

    @Basic
    @Column(name = "Mes")
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    @Basic
    @Column(name = "Meta")
    public int getMeta() {
        return meta;
    }

    public void setMeta(int meta) {
        this.meta = meta;
    }

    @Basic
    @Column(name = "fk_Cirujano")
    public int getFkCirujano() {
        return fkCirujano;
    }

    public void setFkCirujano(int fkCirujano) {
        this.fkCirujano = fkCirujano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MetasEntity that = (MetasEntity) o;

        if (idMetas != that.idMetas) return false;
        if (mes != that.mes) return false;
        if (meta != that.meta) return false;
        if (fkCirujano != that.fkCirujano) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMetas;
        result = 31 * result + mes;
        result = 31 * result + meta;
        result = 31 * result + fkCirujano;
        return result;
    }
}
