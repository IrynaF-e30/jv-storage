package core.basesyntax;

public class Box {
    private final String name;
    private final String color;

    public Box() {
        this.name = "default";
        this.color = "gray";
    }

    public Box(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Box{name='" + name + "', color='" + color + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Box box = (Box) o;
        return name.equals(box.name) && color.equals(box.color);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 31 * color.hashCode();
    }
}


