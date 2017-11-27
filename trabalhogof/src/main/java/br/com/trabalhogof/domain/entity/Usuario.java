package br.com.trabalhogof.domain.entity;

import java.util.List;

import br.com.trabalhogof.domain.UsuarioHandler;
import br.com.trabalhogof.domain.to.UsuarioTO;

public class Usuario extends UsuarioHandler {
	
	private Long id;
	private String nome;
	private String login;
	private String senha;
	private Perfil perfil;
	private TipoUsuario tipo;
	private List<Reserva> reservas;
	private List<Emprestimo> emprestimos;
	
	public Usuario(UsuarioHandler proximoUsuarioHandler) {
		super(proximoUsuarioHandler);
	}
	
	public static Usuario newUsuario(UsuarioTO usuarioTO) {
		Usuario usuario = new Usuario(null);
		usuario.setId(usuarioTO.getId());
		usuario.setNome(usuarioTO.getNome());
		usuario.setLogin(usuarioTO.getLogin());
		usuario.setSenha(usuarioTO.getSenha());
		return usuario;
	}
	
	public boolean podeReservar() {
		return tipo.podeReservar(reservas);
	}
	
	@Override
	public boolean podeTomarEmprestimo() {
		return false;
	}

	public boolean addReserva(Reserva reserva) {
		return reservas.add(reserva);
	}
	
	/*
	 * Getters e Setters
	 */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}
	
}