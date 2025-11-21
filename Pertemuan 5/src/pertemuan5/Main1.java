package pertemuan5;

public class Main1 {
    public static void main(String[] args) {
        AlatMusik a = new AlatMusik();
        Gitar g = new Gitar();

        System.out.println("Output AlatMusik:");
        a.bunyi();

        System.out.println("\nOutput Gitar:");
        g.bunyi(); // overriding
    }
}
