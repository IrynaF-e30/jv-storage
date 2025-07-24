package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Storage<Integer, Box> storage = new StorageImpl<>();
        Box box = new Box();
        storage.put(22, box);

        Box value = storage.get(22);
        System.out.println(value); // має вивести Box@...

        System.out.println(storage.size()); // має вивести 1
    }
}

