package easycoding.ch06.collections;

public class KittyCat extends Cat {
    public KittyCat(String name, float weight) {
        super(name, weight);
    }

    @Override
    public String getType() {
        return "KittyCat";
    }
}
