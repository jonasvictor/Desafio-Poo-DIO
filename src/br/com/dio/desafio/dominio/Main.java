package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo(" curso java");
		curso1.setDescricao(" descri��o curso java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo(" curso js");
		curso2.setDescricao(" descri��o curso js");
		curso2.setCargaHoraria(8);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo(" mentoria de java");
		mentoria.setDescricao(" descri��o mentoria java");
		mentoria.setData(LocalDate.now());

		/*
		 * System.out.println(curso1); System.out.println(curso2);
		 * System.out.println(mentoria);
		 */

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome(" Bootcamp Java Developer");
		bootcamp.setDescricao(" Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devJonas = new Dev();
		devJonas.setNome("Jonas");
		devJonas.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos de Jonas: " + devJonas.getConteudosInscritos());
		devJonas.progredir();
		System.out.println("-");
		System.out.println("Conte�dos Inscritos de Jonas: " + devJonas.getConteudosInscritos());
		System.out.println("Conte�dos Concluidos de Jonas: " + devJonas.getConteudosConcluidos());
		System.out.println("XP: " + devJonas.calcularTotalXp());
		
		System.out.println("--------------------");

		
		Dev devLaynne = new Dev();
		devLaynne.setNome("Laynne");
		devLaynne.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos de Laynne: " + devLaynne.getConteudosInscritos());
		devLaynne.progredir();
		System.out.println("-");
		System.out.println("Conte�dos Inscritos de Laynne: " + devLaynne.getConteudosInscritos());
		System.out.println("Conte�dos Concluidos de Laynne: " + devJonas.getConteudosConcluidos());
		System.out.println("XP: " + devLaynne.calcularTotalXp());

	}

}
