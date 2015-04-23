package mapping;

import javax.persistence.*;

/**
 * Created by zaldana on 04-23-15.
 */
@Entity
@Table(name = "Quirofano", schema = "", catalog = "ISSS")
public class QuirofanoEntity {
    private int idQuirofano;
    private String descripcion;

    @Id
    @Column(name = "idQuirofano")
    public int getIdQuirofano() {
        return idQuirofano;
    }

    public void setIdQuirofano(int idQuirofano) {
        this.idQuirofano = idQuirofano;
    }

    @Basic
    @Column(name = "Descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuirofanoEntity that = (QuirofanoEntity) o;

        if (idQuirofano != that.idQuirofano) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idQuirofano;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
