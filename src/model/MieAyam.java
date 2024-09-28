package model;

public class MieAyam extends Mie{
	private String jenisAyam; // yg jadi pembeda
	
	public MieAyam(String nama, int harga, String rasa, String id, String jenisAyam) {
		super(nama, harga, rasa, id);
		this.jenisAyam = jenisAyam;
	}

	@Override
	public void printDeskripsi() {
		System.out.println("Mie ayam dengan daging ayam " + this.jenisAyam);
		
	}

	public String getJenisAyam() {
		return jenisAyam;
	}

	public void setJenisAyam(String jenisAyam) {
		this.jenisAyam = jenisAyam;
	}

	
}
