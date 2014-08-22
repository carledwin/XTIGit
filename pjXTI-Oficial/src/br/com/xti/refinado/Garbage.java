package br.com.xti.refinado;

import java.util.ArrayList;
import java.util.List;

public class Garbage {

	
	//carrega na memoria varios elementos
	public static long carregarMemoria(){
		//esta lista é uma variavel local e pode ser descartada ao sair dometodo
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 100_000; i++) {
			list.add(i);
		}
		//total livre de memoria
//		.freeMemory retorna estimativa de espaço, bytes libre na memoria
		return Runtime.getRuntime().freeMemory();
	}
	
	
	public static void main(String[] args) {
		
		//Recuperar os metodos do garbage collector
		Runtime rt = Runtime.getRuntime();
		
		
		

//		.runFinalization() para rinalizar objetos inalcançaveis

//		.totalMemory - retorna o total de bytes do sistema

		
		
		
//		.maxMemory retorna o maximo/total de memoria em bytes que a JVM tentará disponível para  utilizar
		double total = rt.maxMemory();
		
	//	transformar em megabytes
		int MB = 1_048_576; // total de bytes em 1MB
		
		//total de memoria no inicio
		double inicio = total -(carregarMemoria()/MB);
				
		//total de megabytes disponiveis
		double total_disponivel_em_mb =  total/MB;
		System.out.println(total_disponivel_em_mb);
		
		//metodos de limpeza, finalizar tudo possível
		rt.runFinalization();
		
		//força a execução do garbage colector
//		.gc() para reciclar objetos não mais utilizados
		rt.gc();
		
		
		//calcular novamente o total de memoria disponivel
		double fim = total - (rt.freeMemory()/MB);
		
		System.out.println("Inicio: " + inicio + " Fim: " + fim);
		
	}
}
