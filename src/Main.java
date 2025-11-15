import java.util.Scanner;

import Data.KRS;
import Entity.Matkul;
import Entity.Mahasiswa;
import utils.CodeGenerator;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = in.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        String NIM = in.next();
        Mahasiswa mhs = new Mahasiswa(nama, NIM);

        System.out.print("Berapa banyak matkulmu? ");
        int n = in.nextInt();

        KRS krs = new KRS(mhs);
        for (int i = 0; i < n; i++) {
            in.nextLine();
            System.out.print("Nama Matkul - " + (i+1) + ": ");
            String nama_mk = in.nextLine();
            System.out.print("SKS Matkul - " + (i+1) + ": ");
            int sks = in.nextInt();
            Matkul mk = new Matkul(CodeGenerator.generateMK(), nama_mk, sks);
            krs.addMatkul(mk);
        }

        System.out.println("==================== KARTU RENCANA STUDI ====================");
        System.out.println("Nama Mahasiswa: " + krs.getOwner().getNama());
        System.out.println("NIM Mahasiswa: " + krs.getOwner().getNim());
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-15s %-30s %-5s\n", "KODE MK", "NAMA MK", "SKS");
        for (Matkul m : krs.getAllData()) {
            System.out.printf("%-15s %-30s %-5d\n", m.getKode_mk(), m.getNama_mk(), m.getSks());
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Total SKS: " + krs.getAllSKS());
        System.out.println("==============================================================");
        System.out.printf("%62s\n", "Tanda Tangan Mahasiswa");
        System.out.println();
        System.out.printf("%62s\n", krs.getOwner().getNama());
        in.close();


    }

}
