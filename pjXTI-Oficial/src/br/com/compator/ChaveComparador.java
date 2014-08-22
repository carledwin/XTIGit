package br.com.compator;

public class ChaveComparador implements Comparable<Object>{

	private Integer id;
	private Integer seq;
	
	
	@Override
	public int compareTo(Object object) {
		return 0;
	}

	
	public Integer getId() {return id;}

	public void setId(Integer id) {this.id = id;}

	public Integer getSeq() {return seq;}

	public void setSeq(Integer seq) {this.seq = seq;}




}
