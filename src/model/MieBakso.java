package model;

public class MieBakso extends Mie{
	private int jumlahPentol;
	
	public MieBakso(String nama, int harga, String rasa, String id, int jumlahPentol) {
		super(nama, harga, rasa, id);
		this.jumlahPentol = jumlahPentol;
	}

	@Override
	public void printDeskripsi() {
		System.out.println("Mie bakso yang memiliki " + this.jumlahPentol + " pentolan");
		
	}

	public int getJumlahPentol() {
		return jumlahPentol;
	}

	public void setJumlahPentol(int jumlahPentol) {
		this.jumlahPentol = jumlahPentol;
	}

	
}
