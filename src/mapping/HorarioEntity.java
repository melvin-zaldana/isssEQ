package mapping;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by zaldana on 04-23-15.
 */
@Entity
@Table(name = "Horario", schema = "", catalog = "ISSS")
public class HorarioEntity {
    private int idHorario;
    private Time entrada;
    private Time salida;

    @Id
    @Column(name = "idHorario")
    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    @Basic
    @Column(name = "Entrada")
    public Time getEntrada() {
        return entrada;
    }

    public void setEntrada(Time entrada) {
        this.entrada = entrada;
    }

    @Basic
    @Column(name = "Salida")
    public Time getSalida() {
        return salida;
    }

    public void setSalida(Time salida) {
        this.salida = salida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HorarioEntity that = (HorarioEntity) o;

        if (idHorario != that.idHorario) return false;
        if (entrada != null ? !entrada.equals(that.entrada) : that.entrada != null) return false;
        if (salida != null ? !salida.equals(that.salida) : that.salida != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idHorario;
        result = 31 * result + (entrada != null ? entrada.hashCode() : 0);
        result = 31 * result + (salida != null ? salida.hashCode() : 0);
        return result;
    }
}
