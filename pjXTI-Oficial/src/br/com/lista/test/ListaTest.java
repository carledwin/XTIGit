package br.com.lista.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import br.com.lista.Lista;

public class ListaTest {

	
		
	public static void main(String[] args) {
		
		List<Lista> clpreso = new ArrayList<>();

		clpreso.add(new Lista("Origem", "23/07/2014", "Preso 2", "Americana", "Lindrina"));
		clpreso.add(new Lista("Destino", "24/07/2014", "Preso 1", "Jundiai", "Mococa"));
		clpreso.add(new Lista("Origem", "25/07/2014", "Preso 1", "Limeira", "Jau"));
		clpreso.add(new Lista("Destino", "15/07/2014", "Preso 2", "Santos", "Trembé"));
		clpreso.add(new Lista("Nome", "21/07/2014", "Preso 2", "Preso 2", "Preso 3"));
		clpreso.add(new Lista("Matricula", "10/07/2014", "Preso 1", "123", "789"));
		clpreso.add(new Lista("Nome", "28/07/2014", "Preso 1", "Preso 1", "Preso 4"));
		clpreso.add(new Lista("Matricula", "29/07/2014", "Preso 2", "963", "456"));

		System.out.println("=================== Desordenado ===================");
		
		
		for (Lista lista : clpreso) {
			System.out.println(lista.getInformacao() + " - " + lista.getDataAlteracao());
		}
		
		ordenarPorInformacao(clpreso);
		System.out.println("\n\n\n=================== Desordenado Por Nome===================\n\n");
		for (Lista lista : clpreso) {
			System.out.println(lista.getInformacao() + " - " + lista.getDataAlteracao());
		}
		
		
		
		ordenarPorData(clpreso);
		System.out.println("\n\n\n=================== Desordenado Por Data===================\n\n");
		for (Lista lista : clpreso) {
			System.out.println(lista.getInformacao() + " - " + lista.getDataAlteracao());
		}
	}
	
	private static void ordenarPorInformacao(List<Lista> lista){
		Collections.sort(lista, new Comparator<Lista>(){
			@Override
			public int compare(Lista c1, Lista c2){
				return c1.getInformacao().compareTo(c2.getInformacao());
			}
		});
	}

	private static void ordenarPorData(List<Lista> lista){
		Collections.sort(lista, new Comparator<Lista>(){
			@Override
			public int compare(Lista c1, Lista c2){
				int valor = 0;
				
				SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
				SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
				Date d1;
				Date d2;
				try {
					d1 = sdf1.parse(c1.getDataAlteracao());
					d2 = sdf2.parse(c2.getDataAlteracao());
				valor = d1.compareTo(d2);
				
				} catch (ParseException e) {
					e.printStackTrace();
				}
				return valor;
			}
		});
	}
}
