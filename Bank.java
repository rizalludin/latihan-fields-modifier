
public class Bank {
    public static void main(String[] args) {
        final String namaBank=" Bank A";
        System.out.println(" Nama Bank = " + namaBank);
        System.out.println();
        SiNasabah nasabah1 = new SiNasabah();
        nasabah1.dataNasabah("Rizalludin");
        nasabah1.tabungan(5000000);
        nasabah1.tarikUang(200000);
        nasabah1.tarikUang(500000,"Keperluan Dadakan");

        System.out.println(nasabah1.getSaldo());
        System.out.println(nasabah1.getSaldo() + "  " + nasabah1.getPesan());

        System.out.println();
        SiNasabah nasabah2 = new SiNasabah();
        nasabah2.dataNasabah("Pandu");
        nasabah2.tabungan(1800000);
        nasabah2.tarikUang(300000);
        nasabah2.tarikUang(2000000,"Kepeluan UKT");
        
        System.out.println("\n Jumlah Nasabah Tarik Uang : " + nasabah1.noUrut+" Orang");
        
    }
    
}
