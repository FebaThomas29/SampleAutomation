package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
	String s=ExcelCode.readIntegerData(0, 0);
	System.out.println(s);
	String a=ExcelCode.readStringData(0, 1);
	System.out.println(a);
		

	}

}
