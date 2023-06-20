package structural_patterns.decorator.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}
