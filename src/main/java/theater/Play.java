package theater;

/**
 * Represents a theatrical play.
 *
 * @null neither {@code name} nor {@code type} may be {@code null}
 */
public class Play {

    private final String name;
    private final String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
