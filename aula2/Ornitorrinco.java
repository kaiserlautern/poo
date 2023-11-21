package aula2;

public class Ornitorrinco implements Mamifero, Oviparo{

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void poeOvos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mamar() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		Mamifero m1 = new Ornitorrinco();
		m1.mamar();
		//m1.poeOvos();
		Oviparo o1 = (Oviparo)m1;
		Ornitorrinco or1 = (Ornitorrinco)o1;
		
	}
}
