package br.com.bean;

import br.com.compator.ChaveComparador;

public class ObjetoDaListaBean {

	private ChaveComparador chaveComparador;
	
	private Object objetoItem;

	public ChaveComparador getChaveComparador() {return chaveComparador;}

	public void setChaveComparador(ChaveComparador chaveComparador) {this.chaveComparador = chaveComparador;}

	public Object getObjetoItem() {return objetoItem;}

	public void setObjetoItem(Object objetoItem) {this.objetoItem = objetoItem;}
	
}
