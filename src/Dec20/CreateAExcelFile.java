package Dec20;


	import java.awt.Color;
	import java.awt.Font;
	import  java.io.*;
	import java.util.Iterator;
	import java.util.Scanner;

	import  org.apache.poi.hssf.usermodel.HSSFSheet;
	import  org.apache.poi.hssf.usermodel.HSSFWorkbook;
	import org.apache.poi.hssf.util.HSSFColor;
	import org.apache.poi.sl.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.CellType;
	import org.apache.poi.ss.usermodel.FormulaEvaluator;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFCellStyle;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.apache.poi.hssf.usermodel.HSSFCell;
	import org.apache.poi.hssf.usermodel.HSSFCellStyle;
	import org.apache.poi.hssf.usermodel.HSSFFont;
	import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
	import  org.apache.poi.hssf.usermodel.HSSFRow;

	public class CreateAExcelFile {
		static String average(String english,String maths,String computer)
		{
			double a=Integer.parseInt(english)+Integer.parseInt(maths)+Integer.parseInt(computer);
			double b=(a/300)*100;
			String avg=String.valueOf(b);
			return avg;
		}
		static String total(String english,String maths,String computer)
		{int a=Integer.parseInt(english)+Integer.parseInt(maths)+Integer.parseInt(computer);
		String tot=String.valueOf(a);
			return tot;
		}
		static String average(String english,String maths,String computer,String drawing)
		{
			double a=Integer.parseInt(english)+Integer.parseInt(maths)+Integer.parseInt(computer)+Integer.parseInt(drawing);
			double b=(a/400)*100;
			String avg=String.valueOf(b);
			return avg;
		}
		static String total(String english,String maths,String computer,String drawing)
		{double a=Integer.parseInt(english)+Integer.parseInt(maths)+Integer.parseInt(computer)+Integer.parseInt(drawing);
		String tot=String.valueOf(a);
			return tot;
		}
		static String average(String english,String maths,String computer,String drawing,String digital)
		{
			double a=Integer.parseInt(english)+Integer.parseInt(maths)+Integer.parseInt(computer)+Integer.parseInt(drawing)+Integer.parseInt(digital);
			double b=(a/500)*100;
			String avg=String.valueOf(b);
			return avg;
		}
		static String total(String english,String maths,String computer,String drawing,String digital)
		{int a=Integer.parseInt(english)+Integer.parseInt(maths)+Integer.parseInt(computer)+Integer.parseInt(drawing)+Integer.parseInt(digital);
		String tot=String.valueOf(a);
			return tot;
		}
		    public static void main(String[]args) {
		    	Scanner scannerObject=new Scanner(System.in);
		        try {
		            String filename = "/home/hmspl/Desktop/excelfile.xls" ;
		            HSSFWorkbook workbook = new HSSFWorkbook();
		            HSSFSheet sheet = workbook.createSheet("FirstSheet"); 
		            FormulaEvaluator objFormulaEvaluator = new HSSFFormulaEvaluator((HSSFWorkbook) workbook);
		            HSSFFont font1 = workbook.createFont();
		            font1.setBold(true);
		            HSSFFont font2 = workbook.createFont();
		            font2.setColor((short) 10);
		            HSSFCellStyle cellStyle=workbook.createCellStyle();
		            cellStyle.setFont(font1);
		            HSSFCellStyle cellStyle1=workbook.createCellStyle();
		            cellStyle1.setFont(font2);
		            
		            HSSFRow rowhead = sheet.createRow((short)0);
		            rowhead.createCell(0).setCellStyle(cellStyle);
		            rowhead.getCell(0).setCellValue("Roll No");
		            rowhead.createCell(1).setCellStyle(cellStyle);
		            rowhead.getCell(1).setCellValue("Student Name");
		            rowhead.createCell(2).setCellStyle(cellStyle);
		            rowhead.getCell(2).setCellValue("Department Name");
		            rowhead.createCell(3).setCellStyle(cellStyle);
		            rowhead.getCell(3).setCellValue("Maths");
		            rowhead.createCell(4).setCellStyle(cellStyle);
		            rowhead.getCell(4).setCellValue("English");
		            rowhead.createCell(5).setCellStyle(cellStyle);
		            rowhead.getCell(5).setCellValue("Computer Programming");
		            rowhead.createCell(6).setCellStyle(cellStyle);
		            rowhead.getCell(6).setCellValue("Engineering Drawings");
		            rowhead.createCell(7).setCellStyle(cellStyle);
		            rowhead.getCell(7).setCellValue("Digital Electronics");
		            rowhead.createCell(8).setCellStyle(cellStyle);
		            rowhead.getCell(8).setCellValue("Total");
		            rowhead.createCell(9).setCellStyle(cellStyle);
		            rowhead.getCell(9).setCellValue("Average");
	int i=1,j=2;
		            do {
		            	
		            HSSFRow row = sheet.createRow((short)i);
		            HSSFCell cell = row.createCell((short)8);
		            row.createCell(0).setCellValue(i);
		           System.out.println("Enter the name");
		            row.createCell(1).setCellValue(scannerObject.next());
		            System.out.println("Departmnet name cse mech civil");
		            String dept=scannerObject.next();
		            
		            //CSE Department 
		            
		            if(dept.equals("cse"))
		            {row.createCell(2).setCellValue(dept);
		            System.out.println("Enter Maths Marks");
		            String maths=scannerObject.next();
		            if((int)Integer.parseInt(maths)<40)
		            {row.createCell(3).setCellStyle(cellStyle1);
		            row.getCell(3).setCellValue(maths);}
		            else
		            	row.createCell(3).setCellValue(maths);	     
		            System.out.println("Enter English Marks");
		            String english=scannerObject.next();
		            if((int)Integer.parseInt(english)<40)
		            {row.createCell(4).setCellStyle(cellStyle1);
		            row.getCell(4).setCellValue(english);}
		            else
		            	row.createCell(4).setCellValue(english);
		            System.out.println("Enter computer programming Marks");
		            String computer=scannerObject.next();
		            if((int)Integer.parseInt(computer)<40)
		            {row.createCell(5).setCellStyle(cellStyle1);
		            row.getCell(5).setCellValue(computer);}
		            else
		            row.createCell(5).setCellValue(computer);
		            row.createCell(6).setCellValue("-");
		            row.createCell(7).setCellValue("-");
		            row.createCell(8).setCellValue(total(maths,english,computer));
		            row.createCell(9).setCellValue(average(maths,english,computer));
		            }
		            
		            //Mechanical Department
		            
		            if(dept.equals("mech"))
		            {row.createCell(2).setCellValue(dept);
		            System.out.println("Enter Maths Marks");
		            String maths=scannerObject.next();
		            if((int)Integer.parseInt(maths)<40)
		            {row.createCell(3).setCellStyle(cellStyle1);
		            row.getCell(3).setCellValue(maths);}
		            else
		            	row.createCell(3).setCellValue(maths);	
		            System.out.println("Enter English Marks");
		            String english=scannerObject.next();
		            if((int)Integer.parseInt(english)<40)
		            {row.createCell(4).setCellStyle(cellStyle1);
		            row.getCell(4).setCellValue(english);}
		            else
		            	row.createCell(4).setCellValue(english);
		            System.out.println("Enter computer programming Marks");
		            String computer=scannerObject.next();
		            if((int)Integer.parseInt(computer)<40)
		            {row.createCell(5).setCellStyle(cellStyle1);
		            row.getCell(5).setCellValue(computer);}
		            else
		            row.createCell(5).setCellValue(computer);
		            System.out.println("Enter Engineering Drawings Marks");
		            String drawing=scannerObject.next();
		            if((int)Integer.parseInt(drawing)<40)
		            {row.createCell(6).setCellStyle(cellStyle1);
		            row.getCell(6).setCellValue(drawing);}
		            else
		            row.createCell(6).setCellValue(drawing);
		            row.createCell(7).setCellValue("-");
		            row.createCell(8).setCellValue(total(maths,english,computer,drawing));
		            row.createCell(9).setCellValue(average(maths,english,computer,drawing));}
		            
		            //Civil Department
		            
		            if(dept.equals("civil"))
		            {row.createCell(2).setCellValue(dept);
		            System.out.println("Enter Maths Marks");
		            String maths=scannerObject.next();
		            if((int)Integer.parseInt(maths)<40)
		            {row.createCell(3).setCellStyle(cellStyle1);
		            row.getCell(3).setCellValue(maths);}
		            else
		            	row.createCell(3).setCellValue(maths);	
		            System.out.println("Enter English Marks");
		            String english=scannerObject.next();
		            if((int)Integer.parseInt(english)<40)
		            {row.createCell(4).setCellStyle(cellStyle1);
		            row.getCell(4).setCellValue(english);}
		            else
		            	row.createCell(4).setCellValue(english);
		            System.out.println("Enter computer programming Marks");
		            String computer=scannerObject.next();
		            if((int)Integer.parseInt(computer)<40)
		            {row.createCell(5).setCellStyle(cellStyle1);
		            row.getCell(5).setCellValue(computer);}
		            else
		            row.createCell(5).setCellValue(computer);
		            System.out.println("Enter Engineering Drawings Marks");
		            String drawing=scannerObject.next();
		            if((int)Integer.parseInt(drawing)<40)
		            {row.createCell(6).setCellStyle(cellStyle1);
		            row.getCell(6).setCellValue(drawing);}
		            else
		            row.createCell(6).setCellValue(drawing);
		            System.out.println("Enter Engineering Digital Electronics Marks");
		            String digital=scannerObject.next();
		            if((int)Integer.parseInt(digital)<40)
		            {row.createCell(7).setCellStyle(cellStyle1);
		            row.getCell(7).setCellValue(digital);}
		            else
		            row.createCell(7).setCellValue(digital);
		            row.createCell(8).setCellValue(total(maths,english,computer,drawing,digital));
		            row.createCell(9).setCellValue(average(maths,english,computer,drawing,digital));
		            }
		            i++;
		            System.out.println("If you want to continue");
		            }while(scannerObject.next().equals("y"));
		            
		            FileOutputStream fileOut = new FileOutputStream(filename);
		            workbook.write(fileOut);
		            fileOut.close();
		            workbook.close();
		            System.out.println("Your excel file has been generated!");

		        } catch ( Exception ex ) {
		            System.out.println(ex);
		        }
		    }
		}