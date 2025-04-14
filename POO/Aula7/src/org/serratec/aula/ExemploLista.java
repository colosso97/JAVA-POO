package org.serratec.aula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExemploLista {
public static void main(String[] args) {
		List<String> times = new ArrayList<>();

		times.add("Botafogo");
		times.add("Vasco");
		times.add("Fluminense");
		times.add("Flamengo");
		// System.out.println(times.size());
		times.set(3, "Bangu");
		System.out.println("A lista está vazia:" + (times.isEmpty() ? "Sim" : "Não"));
		System.out.println("A lista tem Flamengo?" + (times.contains("Botafogo") ? "Sim" : "Não"));

		// Collections.sort(times);
//		Collections.shuffle(times);
//		for (String time : times) {
//			System.out.println(time);
//		}

		Aluno a1 = new Aluno("Adriana", "a@gmail.com", 33);
		Aluno a2 = new Aluno("Adriano", "ad@gmail.com", 31);
		Aluno a3 = new Aluno("José", "j@gmail.com", 18);
		
		List<Aluno> alunos = Arrays.asList(a1, a2);
		alunos.set(0, a3);
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}

		System.out.println("*****************OF*************");
		List<Aluno> alunosOf = List.of(a1,a2);
		alunosOf.set(0, a3);
		System.out.println(alunosOf);
		
	}
}
