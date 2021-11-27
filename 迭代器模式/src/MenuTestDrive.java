public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouse pancakeHouse = new PancakeHouse();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouse, dinerMenu, cafeMenu);

        waitress.printMenu();
    }
}
