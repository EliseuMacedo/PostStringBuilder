package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagem {
	// apenas uma copia do objeto abaixo para a aplicação inteira
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date momentoPostagem;
	private String titulo;
	private String conteudo;
	private Integer likes;
	// um para muitos lista vazia
	private List<Commentario> comentarios = new ArrayList<>();

	public Postagem() {
	}

	public Postagem(Date momentoPostagem, String titulo, String conteudo, Integer likes) {
		this.momentoPostagem = momentoPostagem;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
	}

	public Date getMomentoPostagem() {
		return momentoPostagem;
	}

	public void setMomentoPostagem(Date momentoPostagem) {
		this.momentoPostagem = momentoPostagem;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Commentario> getComentario() {
		return comentarios;
	}

	public void addComentario(Commentario comentario) {
		comentarios.add(comentario);
	}

	public void removeComentario(Commentario comentario) {
		comentarios.remove(comentario);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		sb.append(titulo + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(momentoPostagem) + "\n");
		sb.append(conteudo + "\n");
		sb.append("comentarios:\n");
		for(Commentario c:comentarios) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}

}
