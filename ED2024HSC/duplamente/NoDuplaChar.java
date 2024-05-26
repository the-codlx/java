package duplamente;

import dados.*;

public class NoDuplaChar {
	private ItemChar info;	// o tipo Item está declarado no capitulo 1
	private NoDuplaChar prox;
	private NoDuplaChar ant;

	public NoDuplaChar (ItemChar elem){
		this.info = elem;
		this.prox = null;
		this.ant = null;
	}
	public ItemChar getInfo (){
		return this.info;
	}
	public NoDuplaChar getProx(){
		return this.prox;
	}
	public NoDuplaChar getAnt(){
		return this.ant;
	}
	public void setProx(NoDuplaChar novoNo){
		this.prox = novoNo;
	}
	public void setAnt(NoDuplaChar novoNo){
		this.ant = novoNo;
	}
}
