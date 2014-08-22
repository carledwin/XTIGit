package br.com.lista;

public class Lista implements Comparable<Object> {
	private String informacao;
	private String dataAlteracao;
	private String preso;
	private String descricaoItemAlterado;
	private String descricaoItemAnterior;
	
	public Lista(String informacao, String dataAlteracao,	String preso, String descricaoItemAlterado,	String descricaoItemAnterior) {
	this.informacao = informacao;
	this.dataAlteracao = dataAlteracao;
	this.preso = preso;
	this.descricaoItemAlterado = descricaoItemAlterado;
	this.descricaoItemAnterior = descricaoItemAnterior;
	}
	
	public int compareTo(Object o){
		Lista c = (Lista) o;
		int ultimaComparacao = informacao.compareTo(c.informacao);
		return (ultimaComparacao != 0 ? ultimaComparacao : c.dataAlteracao.compareTo(dataAlteracao));
		
	}
	
	public String getInformacao() {
		return informacao;
	}
	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}
	public String getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(String dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	public String getPreso() {
		return preso;
	}
	public void setPreso(String preso) {
		this.preso = preso;
	}
	public String getDescricaoItemAlterado() {
		return descricaoItemAlterado;
	}
	public void setDescricaoItemAlterado(String descricaoItemAlterado) {
		this.descricaoItemAlterado = descricaoItemAlterado;
	}
	public String getDescricaoItemAnterior() {
		return descricaoItemAnterior;
	}
	public void setDescricaoItemAnterior(String descricaoItemAnterior) {
		this.descricaoItemAnterior = descricaoItemAnterior;
	}
	
	
}
