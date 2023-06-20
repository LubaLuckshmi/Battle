package armors;

public class Hauberk implements Armor{
    @Override
    public int protect() {
        return 2;
    }

    @Override
    public String toString() {
        return String.format("Hauberk: %d", protect());
    }
}
