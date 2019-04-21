package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import entidades.Commentario;
import entidades.Postagem;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Postagem post1 = new Postagem(sdf1.parse("21/06/2018 13:05:44"), "Viagem para Nova Zelândia", "Amo visitar esse lindo país", 12);
		Commentario c1= new Commentario("Tenha uma boa viagem");
		Commentario c2= new Commentario("Uao que legal");
		
		post1.addComentario(c1);
		post1.addComentario(c2);	
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Postagem post2 = new Postagem(sdf2.parse("28/07/2018 23:14:19"), "Boa noite amigos", "Vejo vocês amanhã", 5);
		Commentario c3 = new Commentario("Boa noite");
		Commentario c4 = new Commentario("Que a força esteja com você");
		
		post2.addComentario(c3);
		post2.addComentario(c4);
		
		System.out.println(post1);
		System.out.println(post2);
	}

}
