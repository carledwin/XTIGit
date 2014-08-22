package br.com.xti.colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {

	public static void main(String[] args) {
		
		//Associa chave a valor
		
		//interface Map 
		
		//mapa tipo e valor
		Map<String, String> pais = new HashMap<>();

		pais.put("BR", "Brasil");
		pais.put("RU", "Rússia");
		pais.put("IN", "Índia");
		pais.put("CN", "China");
		
		System.out.println(pais);
		
		//descobrir se uma chave existe no mapa
		System.out.println(pais.containsKey("BR"));
		System.out.println(pais.containsKey("US"));
		
		//verificar se um valor está presente no mapa
		System.out.println(pais.containsValue("Brasil"));
		
		//recuperar um conteudo pela chave
		System.out.println(pais.get("CN"));
		
		//remover o conteudo do mapa
		pais.remove("RU");
		
		System.out.println(pais);
		
		//recuperar todas as chaves do mapa - retorna uma coleção do tipo Set
		//onde nenhuma chave pode estar duplicada
		Set<String> keys = pais.keySet();
		
		for (String key : keys) {
			System.out.println(key);//exibe chave
			System.out.println(pais.get(key)); //retorna o valor
		}
		
		
	}

}
