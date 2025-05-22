package dam.primero.modelos;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Usuario {
	private int contadorId = 0;
	private int id;
	private String nombre;
	private String apellidos;
	private String email;
	private String contraseña;

	private Map<String,Usuario> listaUsuarios;

	public Usuario(int contadorId, int id, String nombre, String apellidos, String email, String contraseña,
			Map<String, Usuario> listaUsuarios) {
		super();
		this.contadorId = contadorId;
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.contraseña = contraseña;
		this.listaUsuarios = new HashMap();
	}

	public int getContadorId() {
		return contadorId;
	}

	public void setContadorId(int contadorId) {
		this.contadorId = contadorId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Map<String, Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(Map<String, Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Usuario [contadorId=" + contadorId + ", id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", email=" + email + ", contraseña=" + contraseña + ", listaUsuarios=" + listaUsuarios + "]";
	}
	
	
	public void altaUsuario() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu email");
		String emailUsuario = sc.nextLine();
		
		if (listaUsuarios.containsKey(emailUsuario)) {
			System.out.println("El email ya está registrado");
		} else {
			System.out.println("Email correcto");
			contadorId++;
			
			System.out.print("Introduce tu nombre: ");
			String nombreUsuario = sc.nextLine();
			
			System.out.print("Introduce tus apellidos: ");
			String apellidosUsuario = sc.nextLine();
			
			System.out.print("Introduce la contraseña: ");
			String contraseñaUsuario = sc.nextLine();
			
			Usuario nuevoUsuario = new Usuario(contadorId, contadorId, emailUsuario, nombreUsuario, apellidosUsuario, contraseñaUsuario, listaUsuarios);
			listaUsuarios.put(emailUsuario, nuevoUsuario);
			
			System.out.println("Taller añadido correctamente.");
		}
	
	}
	public void iniciarSesion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu email");
		String emailUsuario = sc.nextLine();
		System.out.println("Introduce tu contraseña");
		
		if (!listaUsuarios.containsKey(emailUsuario)) {
			System.out.println("No se encuentra el email. Registrese para poder utilizar la biblioteca virtual");
		
	}else {
		System.out.println("Inicio de sesión correcto");
	}
	}
}
