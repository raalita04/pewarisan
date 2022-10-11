
public class Linked_List {
    Simpul pertama = null, posisi, pendahulu;

    public void isiData(String nim, String nama, int nilai){
        Simpul ptrBaru = new Simpul(nim,nama,nilai);
        ptrBaru.berikutnya = pertama;
        pertama = ptrBaru;
    }

    public void Tampilkan(){
        System.out.println("Isi Linked List");
        Simpul penunjuk = pertama;
        while(penunjuk != null){
            penunjuk.infoData();
            System.out.println(penunjuk.berikutnya);
            penunjuk = penunjuk.berikutnya;
        }
    }

    public boolean findData(String x){
        posisi = pertama;
        pendahulu = null;
        boolean ditemukan = false;

        while(posisi !=null){
            String nama = posisi.nama;
            if(nama.compareTo(x) == 0){
                ditemukan = true;
                break;
            }
        pendahulu = posisi;
        posisi = posisi.berikutnya;
        }   
        return ditemukan;
    }

    public boolean hapusData(String x){
        pendahulu = null;
        posisi = null;
        boolean ditemukan = findData(x);
        if(!ditemukan){
            System.out.println("Data yang akan dihapus tidak ditemukan");
            return false;
        }
        
        if(pendahulu==null){
            pertama = pertama.berikutnya;
        }
        else{
            pendahulu.berikutnya = posisi.berikutnya;
        }
        return true;
    }

    public static void main(String[] args) {
        Linked_List mahasiswa = new Linked_List();

        mahasiswa.isiData("20210040091", "Athanasia", 90);
        mahasiswa.isiData("20210040098", "Izkiel", 85);
        mahasiswa.isiData("20210040087", "Lucas", 100);
        mahasiswa.hapusData("Izkiel");
        mahasiswa.Tampilkan();
    }
    
}
