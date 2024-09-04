package mx.ulsa.modelo;

public class Usuario {
	
	private String username, password, email;
	
	
	
	public Usuario(String email, String password) {
		super();
		//this.username = username;
		this.password = password;
		this.email = email; 
		
		
	} 

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public boolean isValido() {
		return "eugenio".equals(username) && "cortes".equals(password);
	}
	
	public boolean isValidoEmail() {
		
		return "eugenio@gmail.com".equals(email) && "eugenio".equals(password);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
