public class ObjectCreation {
    String type1, type2, type3;
    public static void main(String[] args) {
        ObjectCreation myFruits = new ObjectCreation();
        myFruits.type1 = "Apple";
        myFruits.type2 = "Orange";
        myFruits.type3 = "Grapes";
        System.out.println("Fruit 1: " + myFruits.type1);
        System.out.println("Fruit 2: " + myFruits.type2);
        System.out.println("Fruit 3: " + myFruits.type3);
    }
}
