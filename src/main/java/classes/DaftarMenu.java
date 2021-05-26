package classes;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DaftarMenu{
	private ArrayList<Menu> daftarMenu;
	public DaftarMenu() {
            daftarMenu = new ArrayList<>();
        }
	public void tambahMenu(Menu menu) {
            daftarMenu.add(menu);
        }
	public void getMenuByKategori(String kategori) {
            System.out.println("--------"+kategori+"--------");
            for (int i = 0; i<daftarMenu.size(); i++){
                Menu m = daftarMenu.get(i);
                if(m.getKategori().equals(kategori)) {
                    System.out.println((i+1)+". "+m.getNama_menu()+"\t"+m.getHarga());
                }
            }
        }
	public void tampilDaftarMenu() {
            System.out.println("======== ALDEBARAMEN ========");
            getMenuByKategori("Ramen");
            getMenuByKategori("Kuah");
            getMenuByKategori("Toping");
            getMenuByKategori("Minuman");
        }
        public Menu pilihMenu(){
            try{
                Scanner input = new Scanner(System.in);
                
                System.out.print("Nomor Menu yang dipesan : ");
                int no_menu = input.nextInt();
                
                Menu m = daftarMenu.get(no_menu-1);
                
                if(!m.getKategori().equalsIgnoreCase("Kuah")){
                    return m;
                }
                else{
                    System.out.println("[Err] Pesan dulu menu ramen");
                    return pilihMenu();
                }
            }
            catch(IndexOutOfBoundsException err){
                System.out.println("[Err] Pesanan tidak tersedia");
                return pilihMenu();
            }
            catch(InputMismatchException err){
                System.out.println("[Err] Mohon masukkan nomor menu");
                return pilihMenu();
            }
        }

   