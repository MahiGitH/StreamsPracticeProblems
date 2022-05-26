package Weighting;

public class Main {
    public static void main(String[] args) {
        Item shoe = new Item("flat", 10);
        Item shop = new Item("Dove", 2);
        Suitcase suitcase1 = new Suitcase(20);
        Suitcase suitcase2 = new Suitcase(15);
        suitcase1.addItem(shoe);
        suitcase2.addItem(shop);
        Hold hold = new Hold(100);
        hold.addSuitcase(suitcase1);
        hold.addSuitcase(suitcase2);
        System.out.println("Suitcase One");
        suitcase1.printItems();
        System.out.println("Weight: " + suitcase1.totalWeight());
        System.out.println("");
        System.out.println("Suitcase Two");
        suitcase2.printItems();
        System.out.println("Weight: " + suitcase2.totalWeight());
        System.out.println("");
        System.out.println("The Contents and total Weight of Suitcases: ");
        hold.printItems();
        System.out.println("Total Weight: " + hold.totalWeight());
    }
}
