package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Storage<Integer, Box> storage = new StorageImpl<>();

        Box box1 = new Box("Myrchyk", "white");
        Box box2 = new Box("Barsyk", "black");
        Box box3 = new Box(); // використання конструктора без аргументів

        storage.put(1, box1);
        storage.put(2, box2);
        storage.put(3, box3);

        System.out.println(storage.get(1)); // Box{name='Myrchyk', color='white'}
        System.out.println(storage.get(2)); // Box{name='Barsyk', color='black'}
        System.out.println(storage.get(3)); // Box{name='default', color='gray'}
        System.out.println("Size: " + storage.size()); // 3
    }
}

