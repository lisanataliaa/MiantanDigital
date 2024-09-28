package model;

public abstract class Mie {
	
	// ENCAPSULATION
//	1. Attribut dijadiin PRIVATE
//	2. Pakein GETTER SETTER
	
	private String nama;
	private int harga;
	private String rasa;
	private String id;
	
	
	// CONSTRUCTOR --> setelah buat atribut
	// ALT + SHIFT + S + O --> constructor using fields
	public Mie(String nama, int harga, String rasa, String id) {
		super();
		this.nama = nama;
		this.harga = harga;
		this.rasa = rasa;
		this.id = id;
	}

	
	// GETTER SETTER 
	// ALTF + SHIFT + S + R
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	public String getRasa() {
		return rasa;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	// ABSTRACK METHOD --> WAJIB OVERRIDE
//		Cek digambar soal yg isinya sm dan yg ada bedanya itu yg 
//		bakal jadi abstrack
	public abstract void printDeskripsi();
	
	
	// OVERLOADING --> method sama, beda di parameter + isi
	// biasa di total harga(?)
	public void printMie() {
		System.out.println("Nama mie : " + this.nama);
		System.out.println("Rasa mie : " + this.rasa);
		System.out.println("Harga mie : " + this.harga);
	}
	
	public void printMie(int jumlah) { // bedanya dikurungnya
		System.out.println("Nama mie : " + this.nama);
		System.out.println("Rasa mie : " + this.rasa);
		System.out.println("Harga Total : " + this.harga); // bedanya disini		
	}
	
	
}
