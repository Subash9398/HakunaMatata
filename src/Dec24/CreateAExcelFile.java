package Dec24;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.hssf.usermodel.HSSFRow;

/*Output
Enter the name
subash
Departmnet name cse mech civil
cse
Enter Maths Marks
56
Enter English Marks
54
Enter computer programming Marks
55
If you want to continue y or n
n
0. Roll No	Student Name	Department Name	Maths	English	Computer Programming	Engineering Drawings	Digital Electronics	Total		Average	
1. 1.0		subash		     cse		     56	      54	         	55			                -				-           165	    55.00000000000001	
Your excel file has been generated!*/

public class CreateAExcelFile {
	static Scanner scannerObject = new Scanner(System.in);

	// These methods are used to total and average calculation

	static String average(String english, String maths, String computer) {
		double a = Integer.parseInt(english) + Integer.parseInt(maths) + Integer.parseInt(computer);
		double b = (a / 300) * 100;
		String avg = String.valueOf(b);
		return avg;
	}

	static String total(String english, String maths, String computer) {
		int a = Integer.parseInt(english) + Integer.parseInt(maths) + Integer.parseInt(computer);
		String tot = String.valueOf(a);
		return tot;
	}

	static String average(String english, String maths, String computer, String drawing) {
		double a = Integer.parseInt(english) + Integer.parseInt(maths) + Integer.parseInt(computer)
				+ Integer.parseInt(drawing);
		double b = (a / 400) * 100;
		String avg = String.valueOf(b);
		return avg;
	}

	static String total(String english, String maths, String computer, String drawing) {
		double a = Integer.parseInt(english) + Integer.parseInt(maths) + Integer.parseInt(computer)
				+ Integer.parseInt(drawing);
		String tot = String.valueOf(a);
		return tot;
	}

	static String average(String english, String maths, String computer, String drawing, String digital) {
		double a = Integer.parseInt(english) + Integer.parseInt(maths) + Integer.parseInt(computer)
				+ Integer.parseInt(drawing) + Integer.parseInt(digital);
		double b = (a / 500) * 100;
		String avg = String.valueOf(b);
		return avg;
	}

	static String total(String english, String maths, String computer, String drawing, String digital) {
		int a = Integer.parseInt(english) + Integer.parseInt(maths) + Integer.parseInt(computer)
				+ Integer.parseInt(drawing) + Integer.parseInt(digital);
		String tot = String.valueOf(a);
		return tot;
	}

	// this method is used to invalid input correction

	static String department(String dept) {
		if (dept.equalsIgnoreCase("cse"))
			return dept;
		else if (dept.equalsIgnoreCase("mech"))
			return dept;
		else if (dept.equalsIgnoreCase("civil"))
			return dept;
		else {
			System.out.println("Department name invalid enter again");
			System.out.println("Enter the department cse / mech / civil");
			dept = scannerObject.next();
		}
		return dept;

	}

	public static void main(String[] args) {

		try {
			String filename = "/home/hmspl/Desktop/excelfile.xls";
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FirstSheet");
			FormulaEvaluator objFormulaEvaluator = new HSSFFormulaEvaluator((HSSFWorkbook) workbook);
			HSSFFont font1 = workbook.createFont();
			font1.setBold(true);
			HSSFFont font2 = workbook.createFont();
			font2.setColor((short) 10);
			HSSFCellStyle cellStyle = workbook.createCellStyle();
			cellStyle.setFont(font1);
			HSSFCellStyle cellStyle1 = workbook.createCellStyle();
			cellStyle1.setFont(font2);
			String[] headings = { "Roll No", "Student Name", "Department Name", "Maths", "English",
					"Computer Programming", "Engineering Drawings", "Digital Electronics", "Total", "Average" };
			HSSFRow rowhead = sheet.createRow((short) 0);
			for (int i = 0; i < headings.length; i++) {
				rowhead.createCell(i).setCellStyle(cellStyle);
				rowhead.getCell(i).setCellValue(headings[i]);
			}

			int i = 1, j = 2;
			do {

				HSSFRow row = sheet.createRow((short) i);
				HSSFCell cell = row.createCell((short) 8);
				row.createCell(0).setCellValue(i);
				System.out.println("Enter the name");
				row.createCell(1).setCellValue(scannerObject.next());
				System.out.println("Departmnet name cse mech civil");
				String dept = department(scannerObject.next());

				// CSE Department

				if (dept.equalsIgnoreCase("cse")) {
					row.createCell(2).setCellValue(dept);
					String cse[] = { "maths", "english", "computer" };
					for (int k = 0, m = 3; k < cse.length; k++, m++) {
						System.out.println("Enter " + cse[k] + " Marks");
						cse[k] = scannerObject.next();
						if ((int) Integer.parseInt(cse[k]) < 40) {
							row.createCell(m).setCellStyle(cellStyle1);
							row.getCell(m).setCellValue(cse[k]);
						} else
							row.createCell(m).setCellValue(cse[k]);
					}
					row.createCell(6).setCellValue("-");
					row.createCell(7).setCellValue("-");
					row.createCell(8).setCellValue(total(cse[0], cse[1], cse[2]));
					row.createCell(9).setCellValue(total(cse[0], cse[1], cse[2]));
				}

				// Mechanical Department

				if (dept.equalsIgnoreCase("mech")) {
					row.createCell(2).setCellValue(dept);
					String mechanical[] = { "maths", "english", "computer", "Engineering Drawings" };
					for (int k = 0, m = 3; k < mechanical.length; k++, m++) {
						System.out.println("Enter " + mechanical[k] + " Marks");
						mechanical[k] = scannerObject.next();
						if ((int) Integer.parseInt(mechanical[k]) < 40) {
							row.createCell(m).setCellStyle(cellStyle1);
							row.getCell(m).setCellValue(mechanical[k]);
						} else
							row.createCell(m).setCellValue(mechanical[k]);
					}
					row.createCell(7).setCellValue("-");
					row.createCell(8).setCellValue(total(mechanical[0], mechanical[1], mechanical[2], mechanical[3]));
					row.createCell(9).setCellValue(average(mechanical[0], mechanical[1], mechanical[2], mechanical[3]));
				}

				// Civil Department

				if (dept.equalsIgnoreCase("civil")) {
					row.createCell(2).setCellValue(dept);
					String civil[] = { "maths", "english", "computer", "Engineering Drawings", "digital" };
					for (int k = 0, m = 3; k < civil.length; k++, m++) {
						System.out.println("Enter " + civil[k] + " Marks");
						civil[k] = scannerObject.next();
						if ((int) Integer.parseInt(civil[k]) < 40) {
							row.createCell(m).setCellStyle(cellStyle1);
							row.getCell(m).setCellValue(civil[k]);
						} else
							row.createCell(m).setCellValue(civil[k]);
					}
					row.createCell(8).setCellValue(total(civil[0], civil[1], civil[2], civil[3], civil[4]));
					row.createCell(9).setCellValue(average(civil[0], civil[1], civil[2], civil[3], civil[4]));
				}
				i++;
				System.out.println("If you want to continue y or n");
			} while (scannerObject.next().equals("y"));

			// Print the excel in console

			FileInputStream excelInputStream = new FileInputStream(new File(filename));
			Workbook workbook1 = new HSSFWorkbook(excelInputStream);
			org.apache.poi.ss.usermodel.Sheet sheet1 = workbook.getSheetAt(0);
			Iterator<Row> rowItr = sheet1.iterator();
			int rowNum = 0, count = 0;
			while (rowItr.hasNext()) {
				Row row = rowItr.next();
				Iterator<Cell> cellItr = row.iterator();
				System.out.print(rowNum + ". ");
				int col = 0;
				while (cellItr.hasNext()) {
					Cell cell = cellItr.next();
					if (cell.getCellTypeEnum() == CellType.STRING) {
						System.out.print(cell.getStringCellValue() + "\t");
					} else if (cell.getCellTypeEnum() == CellType.NUMERIC) {
						System.out.print(cell.getNumericCellValue() + "\t\t");
					}
					col++;
					if (count == 0 && col == 9)
						System.out.print("\t");
					else if (count > 0) {
						if (col == 2 || col == 3)
							System.out.print("\t");
						else if (col == 5)
							System.out.print("\t");
						else if (col == 6)
							System.out.print("\t\t");
						else if (col == 7)
							System.out.print("\t\t\t");
					}
				}
				count++;
				System.out.println();
				rowNum++;
			}
			FileOutputStream fileOut = new FileOutputStream(filename);
			workbook.write(fileOut);
			fileOut.close();
			workbook.close();
			System.out.println("Your excel file has been generated!");

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}