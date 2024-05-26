package pilha;

import dados.Item;

public class PilhaContig {
	private Item [] info;
	private int topo;

	public PilhaContig(int qte){
		this.topo = 0;
		this.info = new Item [qte];
	}
	public Item getInfo(){
		return this.info[this.topo-1];
	}
	public int getTopo(){
		return this.topo;
	}
	public boolean eVazia(){
		return (this.topo == 0);
	}
	public boolean eCheia(){
		return (this.topo == this.info.length);
	}
	//inserir um novo dado no topo da pilha.
	public boolean empilhar (Item elem){
		if (this.eCheia()) 
			return false;
		else {
			this.info[this.topo]= elem;
			this.topo++;
			return true;
		}	
	}
	//remove o dado que est� no topo da pilha (somente um dado). 
	public Item desempilhar(){
		if (this.eVazia())
			return null;
		else{
			this.topo--;
			return this.info[this.topo];
		}
	}	

	//atividade 05 - questao 02
	public void retirarMaiores10() {
		PilhaContig aux = new PilhaContig(this.topo);
		Item item;
		while (!this.eVazia()) {
			item = this.desempilhar();
			if (item.getChave() <= 10) {
				aux.empilhar(item);
			}
		}
		while (!aux.eVazia()) {
			this.empilhar(aux.desempilhar());
		}
	}
	//atividade 06 - questao 03
	public int verificarIdenticas(PilhaContig pilha2) {
		if (this.eVazia() && pilha2.eVazia()) {
			return 1;
		}else {
			if (this.topo != pilha2.getTopo()) {
				return 0;
			}else {
				PilhaContig aux = new PilhaContig(this.topo);
				PilhaContig aux2 = new PilhaContig(this.topo);
				Item item, item2;
				boolean igual = true;
				while (!this.eVazia() && igual) {
					item = this.desempilhar();
					item2 = pilha2.desempilhar();
					if (item.getChave() != item2.getChave()) {
						igual = false;
					}else {
						aux.empilhar(item);
						aux2.empilhar(item2);
					}
				}
				while (!aux.eVazia()) {
					this.empilhar(aux.desempilhar());
					pilha2.empilhar(aux2.desempilhar());
				}
				if (igual) {
					return 1;
				}else {
					return 0;
				}
			}
		}
	}
	
}
