package mapping;

import javax.persistence.*;

/**
 * Created by zaldana on 04-23-15.
 */
@Entity
@Table(name = "Riesgo", schema = "", catalog = "ISSS")
public class RiesgoEntity {
    private int idRiesgo;
    private String nombre;

    @Id
    @Column(name = "idRiesgo")
    public int getIdRiesgo() {
        return idRiesgo;
    }

    public void setIdRiesgo(int idRiesgo) {
        this.idRiesgo = idRiesgo;
    }

    @Basic
    @Column(name = "Nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RiesgoEntity that = (RiesgoEntity) o;

        if (idRiesgo != that.idRiesgo) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRiesgo;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }
}
