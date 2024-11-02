public class Main {
    public static void main(String[] args) {
        System.out.println();

        Manager manager = new Manager("Heisenberg", 7000000, 2000000);
        manager.cetakInfo();
        System.out.println();

        Programmer programmer = new Programmer("Yoga", 6000000, 1500000);
        programmer.cetakInfo();
        System.out.println();
    }
}