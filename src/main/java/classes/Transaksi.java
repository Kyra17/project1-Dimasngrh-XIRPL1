package classes;
import java.util.ArrayList;
public class Transaksi{
	private String noTransaksi;
	private String namaPemesan;
	private String tanggal;
	private String noMeja;
	private ArrayList<Pesanan> pesanan;
	private double uangBayar;
	private double pajak;
	private double totalBayar;
	public Transaksi(String no_transaksi, String nm_pemesan, String tanggal, String no_meja) {}
	public void tambahPesanan(Pesanan pesanan) {}
	public Pesanan getPesanan() {return null;}
	public ArrayList<Pesanan> getSemuaPesanan() {return null;}
	public double hitungTotalBayar() {return 0;}
	public double Kembalian() {return 0;}
	public void cetakStruk() {}
}