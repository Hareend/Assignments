package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String d = ExcelCode.getStringData(1,0);
		System.out.print(d);
		String e= ExcelCode.getIntegerData(1, 1);
		System.out.print(e);
	}

}
