package poo;

public class Usuario {
	String nome,permissao,usuario;
	int id;
	int senha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getPermissao() {
		return permissao;
	}
	public void setPermissao(String permissao) {
		this.permissao=permissao;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario=usuario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha=senha;
	}

}