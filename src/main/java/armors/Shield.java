package armors;

public class Shield implements Armor{
    @Override
    public int protect() {
        return 1;
    }

    @Override
    public String toString() {
        return String.format("Shield: %d", protect());
    }
}
