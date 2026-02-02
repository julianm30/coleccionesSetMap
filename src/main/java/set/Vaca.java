package set;

public class Vaca {
    int id;
    int fechaNacimimento;
    String descripcion;

    public Vaca(int id, int fechaNacimimento, String descripcion) {
        this.id = id;
        this.fechaNacimimento = fechaNacimimento;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFechaNacimimento() {
        return fechaNacimimento;
    }

    public void setFechaNacimimento(int fechaNacimimento) {
        this.fechaNacimimento = fechaNacimimento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String toString() {
        return "Vaca [id=" + id + ", fechaNacimimento=" + fechaNacimimento + ", descripcion=" + descripcion + "]";
    }


    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + fechaNacimimento;
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
        return result;
    }


    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vaca other = (Vaca) obj;
        if (id != other.id)
            return false;
        if (fechaNacimimento != other.fechaNacimimento)
            return false;
        if (descripcion == null) {
            if (other.descripcion != null)
                return false;
        } else if (!descripcion.equals(other.descripcion))
            return false;
        return true;
    }

}
