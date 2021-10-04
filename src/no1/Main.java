package no1;

public class Main {
    public static void main(String args [] ) {
        Barang brg1 = new Barang( "BRG-001","Tas Gucci");brg1.setHarga(1200);
        Barang brg2 = new Barang("BRG-002","Printer Epson L355");brg2.setHarga(200);
        Barang brg3 = new Barang("BRG-003","Koper",150);
        Barang brg4 = new Barang("BRG-004","Helm",20);

        System.out.println("===> DATA BARANG ===>");
        System.out.println("Barang 1 = "+brg1.getIdProduk()+" "+brg1.getNama()+" "+brg1.getHarga());
        System.out.println("Barang 2 = "+brg2.getIdProduk()+" "+brg2.getNama()+" "+brg2.getHarga());
        System.out.println("Barang 3 = "+brg3.getIdProduk()+" "+brg3.getNama()+" "+brg3.getHarga());
        System.out.println("Barang 4 = "+brg4.getIdProduk()+" "+brg4.getNama()+" "+brg4.getHarga());

        System.out.println("/nTampilkan total harga dari BRG-001, BRG-003, dan BRG-004 :");
        System.out.println(brg1.getHarga() +brg3.getHarga()+brg4.getHarga());
    }
}
