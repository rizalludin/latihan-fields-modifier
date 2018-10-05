
public class SiNasabah {
    private int saldo;
    private String pesan;
    private String nameNasabah;
    int noUrut=0;
    
    public void dataNasabah(String name){
        nameNasabah=name;
        System.out.println(" Nama Nasabah = " + nameNasabah);
    }
    public int tabungan(int jmlh){
        return saldo=saldo+jmlh;
    }
     public int getSaldo(){
        return saldo;
    }
     public String getPesan(){
         return pesan;
     }
    public int tarikUang(int money){
        if(saldo- money < 50 ){
            System.out.println(" Saldo tidak mencukupi.");
            return saldo;
        }else{
            System.out.println(" Penarikan = " + money);
            noUrut++;
           return saldo-=money;
        }
        
    }
     public int tarikUang(int money, String isi){
        if(saldo - money < 50 ){
            System.out.println(" Saldo tidak mencukupi.");
            return saldo;
        }else{
            System.out.println(" Penarikan  = " + money);
            noUrut++;
            pesan=isi;
           return saldo-=money;
           
        }
        
    }
   
}
