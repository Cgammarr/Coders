package coder.navidad.gestioncoder.repositories;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
    @Table(name = "coders")
    public class Coder implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nombre;
        private String apellido;
        private String edad;
        private String domicilio;
        private String nacionalidad;
        private String conocimiento;
        private String promocion;
        public Coder() {

        }

        public Coder(String nombre, String apellido, String edad, String domicilio, String nacionalidad, String conocimiento, String promocion) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.domicilio = domicilio;
            this.nacionalidad = nacionalidad;
            this.conocimiento = conocimiento;
            this.promocion = promocion;
        }

        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }

        public String getNombre()
        {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }


        @Override
        public String toString() {
            return "Coder{" +
                    "id=" + id +
                    ", nombre='" + nombre + '\'' +
                    ", apellido='" + apellido + '\'' +
                    ", edad='" + edad + '\'' +
                    ", domicilio='" + domicilio + '\'' +
                    ", nacionalidad='" + nacionalidad + '\'' +
                    ", conocimiento='" + conocimiento + '\'' +
                    ", promocion='" + promocion + '\'' +
                    '}';
        }

        public String getApellido()
        {
            return apellido;
        }
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getEdad()
        {
            return edad;
        }
        public void setEdad(String edad) {
            this.edad = edad;
        }

        public String getDomicilio()
        {
            return domicilio;
        }
        public void setDomicilio(String domicilio) {
            this.domicilio = domicilio;
        }

        public String getNacionalidad()
        {
            return nacionalidad;
        }
        public void setNacionalidad(String nacionalidad) {
            this.nacionalidad = nacionalidad;
        }

        public String getConocimiento()
        {
            return conocimiento;
        }
        public void setConocimiento(String conocimiento) {
            this.conocimiento = conocimiento;

        }
        public String getPromocion ()
        {
        return promocion;
        }
        public void setPromocion (String promocion) {
            this.promocion = promocion;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coder coder = (Coder) o;
        return Objects.equals(id, coder.id) && Objects.equals(nombre, coder.nombre) && Objects.equals(apellido, coder.apellido) && Objects.equals(edad, coder.edad) && Objects.equals(domicilio, coder.domicilio)
                && Objects.equals(nacionalidad, coder.nacionalidad) && Objects.equals(conocimiento, coder.conocimiento) && Objects.equals(promocion, coder.promocion);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre,apellido,edad,domicilio,nacionalidad,conocimiento,promocion);
    }
}
