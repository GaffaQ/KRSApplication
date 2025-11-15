package Entity;

public class Matkul {
    
    private String kode_mk, nama_mk;
    private int sks;

    public Matkul(String kode_mk, String nama_mk, int sks) {
        this.kode_mk = kode_mk;
        this.nama_mk = nama_mk;
        this.sks = sks;
    }

    /*
     * SETTER
     */
    public void setKode_mk(String kode_mk) {
        this.kode_mk = kode_mk;
    }
    public void setNama_mk(String nama_mk) {
        this.nama_mk = nama_mk;
    }
    public void setSks(int sks) {
        this.sks = sks;
    }

    /*
     * GETTER
     */

    public String getKode_mk() {
        return kode_mk;
    }
    public String getNama_mk() {
        return nama_mk;
    }
    public int getSks() {
        return sks;
    }

}
