import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Xls {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream xlsx = new FileInputStream("Student.xlsx");

		System.out.println("Hi");

	}
}
