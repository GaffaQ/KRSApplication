package Data;

import Entity.Matkul;
import java.util.ArrayList;
import Entity.Mahasiswa;

public class KRS {

    private ArrayList<Matkul> matkul;
    private Mahasiswa mhs;

    public KRS(Mahasiswa mhs) {
        this.matkul = new ArrayList<>();
        this.mhs = mhs;
    }

    /*
     * SETTER
     */
    public void addMatkul(Matkul mk){
        this.matkul.add(mk);
    }

    public void delMatkul(String kode_mk){
        for (Matkul c : this.matkul) {
            if (c.getKode_mk() == kode_mk) {
                this.matkul.remove(c);
            }
        }
    }

    /*
    * GETTER
    */
    public ArrayList<Matkul> getAllData(){
        return this.matkul;
    }

    public int getAllSKS () {
        int all = 0;
        for (Matkul m : this.matkul){
            all += m.getSks();
        }
        return all;
    }

    public Mahasiswa getOwner(){
        return this.mhs;
    }
    
}
