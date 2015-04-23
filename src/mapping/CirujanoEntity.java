package mapping;

import javax.persistence.*;

/**
 * Created by zaldana on 04-23-15.
 */
@Entity
@Table(name = "Cirujano", schema = "", catalog = "ISSS")
public class CirujanoEntity {
    private int idCirujano;
    private String nombres;
    private String apellidos;
    private int fkEspeciadlidades;
    private int fkHorarios;
    private int meta;
    private int realizadas;
    private int suspendidas;
    private int activo;

    @Id
    @Column(name = "idCirujano")
    public int getIdCirujano() {
        return idCirujano;
    }

    public void setIdCirujano(int idCirujano) {
        this.idCirujano = idCirujano;
    }

    @Basic
    @Column(name = "Nombres")
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Basic
    @Column(name = "Apellidos")
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Basic
    @Column(name = "fk_Especiadlidades")
    public int getFkEspeciadlidades() {
        return fkEspeciadlidades;
    }

    public void setFkEspeciadlidades(int fkEspeciadlidades) {
        this.fkEspeciadlidades = fkEspeciadlidades;
    }

    @Basic
    @Column(name = "fk_Horarios")
    public int getFkHorarios() {
        return fkHorarios;
    }

    public void setFkHorarios(int fkHorarios) {
        this.fkHorarios = fkHorarios;
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
    @Column(name = "Realizadas")
    public int getRealizadas() {
        return realizadas;
    }

    public void setRealizadas(int realizadas) {
        this.realizadas = realizadas;
    }

    @Basic
    @Column(name = "Suspendidas")
    public int getSuspendidas() {
        return suspendidas;
    }

    public void setSuspendidas(int suspendidas) {
        this.suspendidas = suspendidas;
    }

    @Basic
    @Column(name = "Activo")
    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CirujanoEntity that = (CirujanoEntity) o;

        if (idCirujano != that.idCirujano) return false;
        if (fkEspeciadlidades != that.fkEspeciadlidades) return false;
        if (fkHorarios != that.fkHorarios) return false;
        if (meta != that.meta) return false;
        if (realizadas != that.realizadas) return false;
        if (suspendidas != that.suspendidas) return false;
        if (activo != that.activo) return false;
        if (nombres != null ? !nombres.equals(that.nombres) : that.nombres != null) return false;
        if (apellidos != null ? !apellidos.equals(that.apellidos) : that.apellidos != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCirujano;
        result = 31 * result + (nombres != null ? nombres.hashCode() : 0);
        result = 31 * result + (apellidos != null ? apellidos.hashCode() : 0);
        result = 31 * result + fkEspeciadlidades;
        result = 31 * result + fkHorarios;
        result = 31 * result + meta;
        result = 31 * result + realizadas;
        result = 31 * result + suspendidas;
        result = 31 * result + activo;
        return result;
    }
}
