package br.com.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import br.com.bean.ObjetoDaListaBean;
import br.com.compator.ChaveComparador;
import br.com.compator.OrdenadorAsc;
import br.com.model.Transferencia;

public class ComparacaoTest {

	Collection<ObjetoDaListaBean> listaPrincipal = new ArrayList<>();
	
	public static void main(String[] args) {
	
		(new ComparacaoTest()).execute();	
		
	}
	
	private void execute(){
		
		//Container chave + valor
		ObjetoDaListaBean objetoAntBean = null;
		ObjetoDaListaBean objetoAtuBean = null;

		//Chava de classificação dos itens na listaPrincipal
		ChaveComparador chaveAnt = null;
		ChaveComparador chaveAtu = null;
		
		List<Transferencia> listaTransfAnterior = new ArrayList<>();
		
		Transferencia tf01Ant = new Transferencia(1, "Um", null); 
		Transferencia tf05Ant = new Transferencia(5, "Cinco", null); 
		Transferencia tf06Ant = new Transferencia(6, "Seis", null); 
		Transferencia tf07Ant = new Transferencia(7, "Sete", null); 
		Transferencia tf09Ant = new Transferencia(9, "Nove", null); 
			listaTransfAnterior.add(tf07Ant);
			listaTransfAnterior.add(tf06Ant);
			listaTransfAnterior.add(tf05Ant);
			listaTransfAnterior.add(tf01Ant);
			listaTransfAnterior.add(tf09Ant);
			
		Collections.sort(listaTransfAnterior, new OrdenadorAsc());
		
		List<Transferencia> listaTransfAtual = new ArrayList<>();
		Transferencia tf01Atu = new Transferencia(1, "Um", tf01Ant); 
		Transferencia tf03Atu = new Transferencia(3, "Três", null); 
		Transferencia tf06Atu = new Transferencia(6, "Seis", tf06Ant); 
		Transferencia tf07Atu = new Transferencia(7, "Sete", tf07Ant); 
		Transferencia tf08Atu = new Transferencia(8, "Oito", null); 
		Transferencia tf11Atu = new Transferencia(11, "Onze", null); 
		Transferencia tf12Atu = new Transferencia(12, "Doze", null); 
			listaTransfAtual.add(tf03Atu);
			listaTransfAtual.add(tf11Atu);
			listaTransfAtual.add(tf06Atu);
			listaTransfAtual.add(tf12Atu);
			listaTransfAtual.add(tf07Atu);
			listaTransfAtual.add(tf08Atu);
			listaTransfAtual.add(tf01Atu);
		
		Collections.sort(listaTransfAtual, new OrdenadorAsc());
		
			Collection<ObjetoDaListaBean> listaTodosAnterior = new ArrayList<>();
			
		for (Transferencia transfAnt : listaTransfAnterior) {
			
			chaveAnt = new ChaveComparador();
			objetoAntBean = new ObjetoDaListaBean();
			
			chaveAnt.setId(transfAnt.getId());
			
			objetoAntBean.setChaveComparador(chaveAnt);
			objetoAntBean.setObjetoItem(transfAnt);
			
			listaTodosAnterior.add(objetoAntBean);
		}
			
		Collection<ObjetoDaListaBean> listaTodosAtual = new ArrayList<>();
		
		for (Transferencia transfAtu : listaTransfAtual) {
			
			chaveAtu = new ChaveComparador();
			objetoAtuBean = new ObjetoDaListaBean();
			
			chaveAtu.setId(transfAtu.getId());
			
			objetoAtuBean.setChaveComparador(chaveAtu);
			objetoAtuBean.setObjetoItem(transfAtu);
			
			listaTodosAtual.add(objetoAtuBean);
		}
			
		
	}
	

}
