public class Hewan {
    string nama;
    string spesies;
    int usia;
    public void suarahewan () {
    system.out.println("suara hewan")
    }
}

class ayam extend Hewan {
    Hewan ayam ("ayam", "Herbivora", "1")
    public void suarahewan () {
        system.out.println("kongkorongok...")
    }
}

class main {
    public static void main (string [] args){
        Hewan baruhewan = new hewan ()
        Hewan baruayam = new ayam ()
        baruhewan.suarahewan ()
        baruayam.suarahewan ()
    }
}