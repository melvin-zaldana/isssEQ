package mapping;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by zaldana on 04-23-15.
 */
@Entity
@Table(name = "Cirujia", schema = "", catalog = "ISSS")
public class CirujiaEntity {
    private int idCirujia;
    private Timestamp fecha;
    private int fkPaciente;
    private int fkCie9;
    private String diagnosticoPostoperatorio;
    private String region;
    private String tipoAnestecia;
    private String anestesista;
    private int fkQuirofano;
    private int fkCirujano;
    private int emergencia;
    private int fkRiesgo;

    @Id
    @Column(name = "idCirujia")
    public int getIdCirujia() {
        return idCirujia;
    }

    public void setIdCirujia(int idCirujia) {
        this.idCirujia = idCirujia;
    }

    @Basic
    @Column(name = "Fecha")
    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    @Basic
    @Column(name = "fk_Paciente")
    public int getFkPaciente() {
        return fkPaciente;
    }

    public void setFkPaciente(int fkPaciente) {
        this.fkPaciente = fkPaciente;
    }

    @Basic
    @Column(name = "fk_Cie9")
    public int getFkCie9() {
        return fkCie9;
    }

    public void setFkCie9(int fkCie9) {
        this.fkCie9 = fkCie9;
    }

    @Basic
    @Column(name = "DiagnosticoPostoperatorio")
    public String getDiagnosticoPostoperatorio() {
        return diagnosticoPostoperatorio;
    }

    public void setDiagnosticoPostoperatorio(String diagnosticoPostoperatorio) {
        this.diagnosticoPostoperatorio = diagnosticoPostoperatorio;
    }

    @Basic
    @Column(name = "Region")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "TipoAnestecia")
    public String getTipoAnestecia() {
        return tipoAnestecia;
    }

    public void setTipoAnestecia(String tipoAnestecia) {
        this.tipoAnestecia = tipoAnestecia;
    }

    @Basic
    @Column(name = "Anestesista")
    public String getAnestesista() {
        return anestesista;
    }

    public void setAnestesista(String anestesista) {
        this.anestesista = anestesista;
    }

    @Basic
    @Column(name = "fk_Quirofano")
    public int getFkQuirofano() {
        return fkQuirofano;
    }

    public void setFkQuirofano(int fkQuirofano) {
        this.fkQuirofano = fkQuirofano;
    }

    @Basic
    @Column(name = "fk_Cirujano")
    public int getFkCirujano() {
        return fkCirujano;
    }

    public void setFkCirujano(int fkCirujano) {
        this.fkCirujano = fkCirujano;
    }

    @Basic
    @Column(name = "Emergencia")
    public int getEmergencia() {
        return emergencia;
    }

    public void setEmergencia(int emergencia) {
        this.emergencia = emergencia;
    }

    @Basic
    @Column(name = "fk_Riesgo")
    public int getFkRiesgo() {
        return fkRiesgo;
    }

    public void setFkRiesgo(int fkRiesgo) {
        this.fkRiesgo = fkRiesgo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CirujiaEntity that = (CirujiaEntity) o;

        if (idCirujia != that.idCirujia) return false;
        if (fkPaciente != that.fkPaciente) return false;
        if (fkCie9 != that.fkCie9) return false;
        if (fkQuirofano != that.fkQuirofano) return false;
        if (fkCirujano != that.fkCirujano) return false;
        if (emergencia != that.emergencia) return false;
        if (fkRiesgo != that.fkRiesgo) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;
        if (diagnosticoPostoperatorio != null ? !diagnosticoPostoperatorio.equals(that.diagnosticoPostoperatorio) : that.diagnosticoPostoperatorio != null)
            return false;
        if (region != null ? !region.equals(that.region) : that.region != null) return false;
        if (tipoAnestecia != null ? !tipoAnestecia.equals(that.tipoAnestecia) : that.tipoAnestecia != null)
            return false;
        if (anestesista != null ? !anestesista.equals(that.anestesista) : that.anestesista != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCirujia;
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + fkPaciente;
        result = 31 * result + fkCie9;
        result = 31 * result + (diagnosticoPostoperatorio != null ? diagnosticoPostoperatorio.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (tipoAnestecia != null ? tipoAnestecia.hashCode() : 0);
        result = 31 * result + (anestesista != null ? anestesista.hashCode() : 0);
        result = 31 * result + fkQuirofano;
        result = 31 * result + fkCirujano;
        result = 31 * result + emergencia;
        result = 31 * result + fkRiesgo;
        return result;
    }
}
