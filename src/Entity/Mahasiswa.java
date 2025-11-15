package Entity;

public class Mahasiswa {
    
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    /*
     * SETTER
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    /*
     * GETTER
     */
    public String getNama() {
        return nama;
    }
    
    public String getNim() {
        return nim;
    }

}
