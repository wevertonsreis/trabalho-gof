package br.com.trabalhogof.domain.to;

public class ExemplarTO {

	private Long id;
	private Long idLivro;

	public ExemplarTO() {
		super();
	}

	public ExemplarTO(Long id, Long idLivro) {
		super();
		this.id = id;
		this.idLivro = idLivro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(Long idLivro) {
		this.idLivro = idLivro;
	}

}
