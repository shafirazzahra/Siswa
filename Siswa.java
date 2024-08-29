//Objec class
public class Siswa {
    private int id;
    private String nama;
    private double ipk;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return this.ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    /*Contructor nama sama dgn nama Class*/
    public Siswa() {
        id = 0;
        nama = "";
        ipk = 0;
    }
    //Contractor Parameter
    public Siswa(int id, String nama, double ipk) {
       this. id = id;
       this. nama = nama;
       this.ipk = ipk;
    }

      //Setter-->mengubah nilai-->void
    public void setID(int id) {
        this.id = id;
    } 
    public void setNama() {
        this.nama = nama;
    
    }   
    public void setIpk() {
        this.ipk = ipk;
    }

    //method tdk menghasilkan value
    public void print(){
        System.out.println("Ini Data dari Siswa" + nama);
        System.out.println("ID :" + id);
        System.out.println("Nama : " + nama);
        System.out.println("IPK :" + ipk);
    }

    //method yang menghasilkan value

}

