package asp.modelo;

import java.util.Objects;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Persona {

	@NotNull(message = "El ID es obligatorio")
	@Min(value = 1, message = "El ID debe ser mayor a 0")
	private long id_p;
	
	@NotBlank(message = "El nombre es obligatorio")
    @Pattern(regexp = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$", message = "Los nombres solo deben contener letras")
	private String nombres;
	
	@NotBlank(message = "El apellido es obligatorio")
    @Pattern(regexp = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$", message = "Los apellidos solo deben contener letras")
	private String apellidos;
	
	@NotBlank(message = "El teléfono es obligatorio")
	@Pattern(regexp = "^\\d+$", message = "El teléfono debe tener solo números")
	@Size(min = 7, max = 15, message = "El teléfono debe tener entre 7 y 15 dígitos")
	private String telefono;
	
	@NotBlank(message = "El correo es obligatorio")
    @Email(message = "Debe ingresar un correo electrónico válido")
	private String correo;
	
	public Persona() {

	}

	public Persona(long id_p, String nombres, String apellidos, String telefono, String correo) {
		this.id_p = id_p;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correo = correo;
	}

	public long getId_p() {
		return id_p;
	}

	public void setId_p(long id_p) {
		this.id_p = id_p;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, correo, id_p, nombres, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(correo, other.correo) && id_p == other.id_p
				&& Objects.equals(nombres, other.nombres) && Objects.equals(telefono, other.telefono);
	}
	
	
	
	
	
	
}
