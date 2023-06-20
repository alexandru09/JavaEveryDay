package structural_patterns.decorator;

import structural_patterns.decorator.decorators.CompressionDecorator;
import structural_patterns.decorator.decorators.DataSource;
import structural_patterns.decorator.decorators.DataSourceDecorator;
import structural_patterns.decorator.decorators.EncryptionDecorator;
import structural_patterns.decorator.decorators.FileDataSource;

public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteve Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
