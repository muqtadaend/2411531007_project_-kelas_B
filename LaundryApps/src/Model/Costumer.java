package Model;

  public class Costumer {
    private String id;
    private String nama;
    private String alamat;
    private String noHp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

public class mer{
		public static void main(String[] args) {
			Costumer cos = new Costumer();
			cos.setId("1");
			cos.setNama("Ahmad");
			cos.setAlamat("Padang");
			cos.setNoHp("08123456789");

			System.out.println("Customer dengan ID = " + cos.getId() + 
                           " Nama = " + cos.getNama() + 
                           " Alamat = " + cos.getAlamat() + 
                           " No HP = " + cos.getNoHp());
    }
	}
}