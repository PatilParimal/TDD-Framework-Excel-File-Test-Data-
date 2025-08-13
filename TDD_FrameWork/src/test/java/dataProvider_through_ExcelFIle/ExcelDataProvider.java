package dataProvider_through_ExcelFIle;

public class ExcelDataProvider {
	
	public static void main(String[] args) {
		String excelPath = "C:\\Users\\parim\\eclipse-workspace\\TDD_FrameWork\\Test_Data\\Book1.xlsx";
		testData(excelPath,"Sheet1");
	}
	
	public static Object[][] testData(String excelPath,String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=1; i<rowCount; i++) {
			for(int j = 0; j<colCount; j++ ) {
				
				String cellData = excel.getCellDataString(i, j);
					
				data[i-1][j] = cellData;
			}
		}
		return data;
	}

}
