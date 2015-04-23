package mapping;

import javax.persistence.*;

/**
 * Created by zaldana on 04-23-15.
 */
@Entity
@Table(name = "Especialidad", schema = "", catalog = "ISSS")
public class EspecialidadEntity {
    private int idEspecialidad;
    private String especialidad;

    @Id
    @Column(name = "idEspecialidad")
    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    @Basic
    @Column(name = "Especialidad")
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EspecialidadEntity that = (EspecialidadEntity) o;

        if (idEspecialidad != that.idEspecialidad) return false;
        if (especialidad != null ? !especialidad.equals(that.especialidad) : that.especialidad != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEspecialidad;
        result = 31 * result + (especialidad != null ? especialidad.hashCode() : 0);
        return result;
    }
}
