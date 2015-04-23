package mapping;

import javax.persistence.*;

/**
 * Created by zaldana on 04-23-15.
 */
@Entity
@Table(name = "Paciente", schema = "", catalog = "ISSS")
public class PacienteEntity {
    private int idPaciente;
    private String nombres;
    private String apellidos;
    private int edad;
    private String sexo;
    private String estadoCivil;
    private String calidadAsegurado;

    @Id
    @Column(name = "idPaciente")
    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
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
    @Column(name = "Edad")
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Basic
    @Column(name = "Sexo")
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Basic
    @Column(name = "Estado Civil")
    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Basic
    @Column(name = "Calidad Asegurado")
    public String getCalidadAsegurado() {
        return calidadAsegurado;
    }

    public void setCalidadAsegurado(String calidadAsegurado) {
        this.calidadAsegurado = calidadAsegurado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PacienteEntity that = (PacienteEntity) o;

        if (idPaciente != that.idPaciente) return false;
        if (edad != that.edad) return false;
        if (nombres != null ? !nombres.equals(that.nombres) : that.nombres != null) return false;
        if (apellidos != null ? !apellidos.equals(that.apellidos) : that.apellidos != null) return false;
        if (sexo != null ? !sexo.equals(that.sexo) : that.sexo != null) return false;
        if (estadoCivil != null ? !estadoCivil.equals(that.estadoCivil) : that.estadoCivil != null) return false;
        if (calidadAsegurado != null ? !calidadAsegurado.equals(that.calidadAsegurado) : that.calidadAsegurado != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPaciente;
        result = 31 * result + (nombres != null ? nombres.hashCode() : 0);
        result = 31 * result + (apellidos != null ? apellidos.hashCode() : 0);
        result = 31 * result + edad;
        result = 31 * result + (sexo != null ? sexo.hashCode() : 0);
        result = 31 * result + (estadoCivil != null ? estadoCivil.hashCode() : 0);
        result = 31 * result + (calidadAsegurado != null ? calidadAsegurado.hashCode() : 0);
        return result;
    }
}
