package lab5.ch1;

public class Currency {

    private String name;
    private float value;

    public Currency() {
    }

    protected Currency(String name, float value) {
        this.value = value;
        this.name = name;
    }

    public void setValue(float value) {
        this.value = value;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public float getValue() {
        return value;
    }
}
