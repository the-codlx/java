package duplamente;

import dados.ItemChar;

public class ListaDuplaChar {
	private NoDuplaChar prim;
	private NoDuplaChar ult;
	private int quantNos;

	public ListaDuplaChar(){
		this.prim = null;
		this.ult = null;
		this.quantNos = 0;
	}
	public int getQuantNos(){
		return this.quantNos;
	}
	public NoDuplaChar getPrim(){
		return this.prim;
	}
	public NoDuplaChar getUlt(){
		return this.ult;
	}
	public void setQuantNos(int valorNovo){
		 this.quantNos = valorNovo;
	}
	public void setPrim(NoDuplaChar novoNo){
		this.prim = novoNo;
	}
	public void setUlt(NoDuplaChar novoNo){
		this.ult = novoNo;
	}
	public boolean eVazia (){
		return (this.prim == null);
	}
	//insere um novo nó no final da lista ou se a lista estiver vazia, insere
    // o primeiro nó na lista
	public void inserirUltimo (ItemChar elem){
		NoDuplaChar novoNo = new NoDuplaChar (elem);
		if (this.eVazia())
			this.prim = novoNo;
		else { 
			novoNo.setAnt(this.ult);
			this.ult.setProx(novoNo);
		}	
		this.ult = novoNo;
		this.quantNos++;
	}
	//retorna o endereço do nó que está contendo o valor a ser procurado.
	public NoDuplaChar pesquisarNo (char chave){
		NoDuplaChar atual = this.prim;
		while ((atual != null) && (atual.getInfo().getChave() != chave))
			atual = atual.getProx();
		return atual;
	}





public String toString(){
		String msg="";
		NoDuplaChar atual = this.prim;
		while (atual != null){
			msg += atual.getInfo().getChave()+"\n";
			atual = atual.getProx();
		}
		return msg;
	}

	
	
	
	
	
	
}
