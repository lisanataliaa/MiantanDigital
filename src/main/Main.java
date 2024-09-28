package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.Mie;

public class Main {

	// SCANNER = INPUT
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();

	public Main() {
		int chooseMenu = -1; // harus lebih kecil dari nomor menu
		// tapi kalo disoal pilihan 0 itu exit berarti = -1

		do {
			System.out.println("Miantan Digital");
			System.out.println("===============");
			System.out.println("1. Tambah Mie");
			System.out.println("2. Cek Menu");
			System.out.println("3. Beli Mie");
			System.out.println("4. Edit Mie");
			System.out.println("5. EXIT");
			System.out.print(">>"); // MINTA INPUT

			do { // minta input chooseMenu

				try {
					chooseMenu = sc.nextInt();
					sc.nextLine();
				} catch (Exception e) {
					System.out.println("Input HARUS ANGKA!");
					sc.nextLine();
				}
			} while (chooseMenu < 1 || chooseMenu > 5);

			// SELECTION --> bisa IF ELSE / SWITCH CASE (lebih enak buat menu)
			switch (chooseMenu) {
			case 1:
				tambahMie();
				break;
			case 2:
				cekMenu();
				System.out.println("Tekan enter untuk lanjut");
				sc.nextLine();
				break;
			case 3:
				beliMie();
				System.out.println("Tekan enter untuk lanjut");
				sc.nextLine();
				break;
			case 4:
				editMie();
				System.out.println("Tekan enter untuk lanjut");
				sc.nextLine();
				break;
			case 5:
				exit();
				break;
			default:
				break;
			}

		} while (chooseMenu != 5);
		System.out.println("Thankyou BYE BYE!");
	}

	// JAVA COLLECTION --> array list
	ArrayList<Mie> mieList = new ArrayList<>();
	ArrayList<String> idMie = new ArrayList<>();
	ArrayList<String> namaMie = new ArrayList<>();
	ArrayList<String> rasaMie = new ArrayList<>();
	ArrayList<Integer> hargaMie = new ArrayList<>();
	ArrayList<String> tipeMie = new ArrayList<>();
	ArrayList<Integer> jumPentol = new ArrayList<>();

	private void tambahMie() {
		// INISIALISASI VARIABEL yg nanti dimasukin ke atribut ("")
		String nama = "";
		String rasa = "";
		int harga = 0;
		int jumlahPentol = 0;
		String id = "";
		String tipe = "";

		do {
			System.out.println("Berikan input nama [6-12]: ");
			System.out.print(">>");
			nama = sc.nextLine();
		} while (nama.length() < 6 || nama.length() > 12);

		do {
			System.out.println("Berikan rasa (Pedas, Asin, Manis) [case insensitive]: ");
			System.out.print(">>");
			rasa = sc.nextLine();
		} while (!(rasa.equalsIgnoreCase("Pedas") || rasa.equalsIgnoreCase("Asin") || rasa.equalsIgnoreCase("Manis")));

		do {
			System.out.print("Berikan harga >>");
			try {
				harga = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("Harga harus INTEGER");
				sc.nextLine();
			}
		} while (harga < 10000 || harga > 15000);

		do {
			System.out.print("Pilih tipe bakmi (ayam, sapi) [case sensitive] >> ");
			tipe = sc.nextLine();
		} while (!(tipe.equals("ayam") || tipe.equals("sapi")));

		do {
			System.out.print("Berapa jumlah pentol [1-3] >>");
			try {
				jumlahPentol = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("HARUS 1-3");
				sc.nextLine();
			}
		} while (jumlahPentol < 1 || jumlahPentol > 3);

		char a = (char) (rd.nextInt(26) + 65);
		char b = (char) (rd.nextInt(26) + 65);

		id = "" + a + b + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);

		namaMie.add(nama);
		rasaMie.add(rasa);
		hargaMie.add(harga);
		tipeMie.add(tipe);
		jumPentol.add(jumlahPentol);

		System.out.println("");
		System.out.println("============================================");
		System.out.println("Berhasil membuat satu menu mie dengan data");
		System.out.println("ID: " + id);
		cekMenu();

	}

	private void cekMenu() {

		if (namaMie.isEmpty()) {
			System.out.println("No Data!");
		} else {
			for (int i = 0; i < namaMie.size(); i++) {
				System.out.println("[Menu no. " + (i + 1) + "]");
				System.out.println("Mie " + tipeMie.get(i) + " yang memiliki " + jumPentol.get(i) + " pentolan");
				System.out.println("Nama mie: " + namaMie.get(i));
				System.out.println("Rasa mie: " + rasaMie.get(i));
				System.out.println("Harga mie: " + hargaMie.get(i));
				System.out.println();

			}
		}
	}

	private void beliMie() {
		cekMenu();
		if (namaMie.isEmpty()) {
			System.out.println("Gerobak masih kosong!");
		} else {
			for (int i = 0; i < namaMie.size(); i++) {
				int nomorMie = 0;
				do {
					System.out.println("Pilih nomor mie yang ingin dibeli");
					System.out.print("Pilih mienya bang [1-2]: ");
					nomorMie = sc.nextInt();
				} while (nomorMie < 1 || nomorMie > 2);

				int jumlahMie = 0;
				do {
					System.out.println("Berapa banyak belinya: ");
					jumlahMie = sc.nextInt();
				} while (jumlahMie < 1);

				System.out.println("Kamu telah membeli: ");
				System.out.println("Nama mie: " + namaMie.get(i));
				System.out.println("Rasa mie: " + rasaMie.get(i));
				System.out.println("Harga mie: " + hargaMie.get(i) * jumlahMie);

			}
		}
	}

	private void editMie() {
		String nama;
		cekMenu();

//				int id = 0;
//					System.out.print("Pilih id mie [AAXXX]: ");
//					id = sc.nextInt(); sc.nextLine();
//					
//				String nama;
//				do {
//					System.out.println("Berikan input nama [6-12]: ");
//					System.out.print(">>");
//					nama = sc.nextLine();
//				} while (nama.length() < 6 || nama.length() > 12);
//				
//			
//				int up = 0 ;
//				namaMie.set(up -1, nama);
//				System.out.println("Nama mie berhasil diedit!");	

//		int edit;
//		String done = null;
//		while(true) {
//			System.out.print("Pilih id mie [R...]: ");
//			edit = sc.nextInt(); sc.nextLine();
//			
//			boolean cekDel = true;
//			int count= 0, index= -1;
//			if(mieList.size() != 0) {
//				for (int i = 0; i < mieList.size(); i++) {
//					if(mieList.get(i).getId().equals(edit)) {
//						index = i;
//						System.out.println("Delete success!");
//					} else if (!mieList.get(i).getId().equals(edit)) {
//						count++;
//					}
//				}
//
//			}
//			
//			do {
//				System.out.println("Berikan input nama [6-12]: ");
//				System.out.print(">>");
//				nama = sc.nextLine();
//			} while (nama.length() < 6 || nama.length() > 12);
//		}
//
//		
//		String string = namaMie.set(edit-1, nama);

	}

	private void exit() {
		System.out.println("Terima kasih sudah datang ke miantan!");

	}

	public static void main(String[] args) {
		new Main();

	}

}
