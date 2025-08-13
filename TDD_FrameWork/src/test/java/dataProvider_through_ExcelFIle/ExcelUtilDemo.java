package dataProvider_through_ExcelFIle;

public class ExcelUtilDemo {
	public static void main(String[] args) {
		
		String projectpath = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(projectpath+"/Test_Data/Book1.xlsx", "Sheet1");
		
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
	}

}
