package main;
import classes.*;
import java.util.Scanner;
public class Main{
        public DaftarMenu daftarMenu;
	public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Main app = new Main();
            app.generateDaftarMenu();
	}
	public void generateDaftarMenu() {
            daftarMenu = new DaftarMenu();
            daftarMenu.tambahMenu(new Ramen("Ramen Seafood", 25000));
            daftarMenu.tambahMenu(new Ramen("Ramen Original", 18000));
            daftarMenu.tambahMenu(new Ramen("Ramen Vegetarian", 22000));
            daftarMenu.tambahMenu(new Ramen("Ramen Karnivor", 28000));
            daftarMenu.tambahMenu(new Kuah("Kuah Original"));
            daftarMenu.tambahMenu(new Kuah("Kuah Internasional"));
            daftarMenu.tambahMenu(new Kuah("Kuah Spicy"));
            daftarMenu.tambahMenu(new Kuah("Kuah Soto Padang"));
            daftarMenu.tambahMenu(new Toping("Crab Stick Bakar", 6000));
            daftarMenu.tambahMenu(new Toping("Chicken Katsu", 8000));
            daftarMenu.tambahMenu(new Toping("Gyoza Goreng", 4000));
            daftarMenu.tambahMenu(new Toping("Bakso Goreng", 7000));
            daftarMenu.tambahMenu(new Toping("Enoki Goreng", 5000));
            daftarMenu.tambahMenu(new Minuman("Jus Alpukan", 10000));
            daftarMenu.tambahMenu(new Minuman("Jus Strobery", 11000));
            daftarMenu.tambahMenu(new Minuman("Capucino Coffee", 15000));
            daftarMenu.tambahMenu(new Minuman("Vietnam Dripp", 14000));
            
            daftarMenu.tampilDaftarMenu();
        }
}
