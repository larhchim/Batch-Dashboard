package Configuration;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.FillPatternType;

import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.lowagie.text.Document;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
@SuppressWarnings("deprecation")
@ManagedBean(name = "motif")
@SessionScoped

public class MotifBean implements Serializable{
	
	private static final long serialVersionUID = 1L;

    private List<ReadAllreasons> tableOfMotifs;
	private ReadAllreasons selectedmotif;
	private int rowkey;
	

    @PostConstruct
    public void init()  {
       try {
		tableOfMotifs=ReadAllreasons.AllElements();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }

	public List<ReadAllreasons> getTableOfMotifs() {
		return tableOfMotifs;
	}

	public ReadAllreasons getSelectedmotif() {
		return selectedmotif;
	}

	public void setSelectedmotif(ReadAllreasons selectedmotif) {
		this.selectedmotif = selectedmotif;
	}

	public int getRowkey() {
		 return this.hashCode(); 
	}

	public void setRowkey(int rowkey) {
		this.rowkey = rowkey;
	}
    
    
	 public void postProcessXLS(Object document) {
	        HSSFWorkbook wb = (HSSFWorkbook) document;
	        HSSFSheet sheet = wb.getSheetAt(0);
	        HSSFRow header = sheet.getRow(0);
	         
	        HSSFCellStyle cellStyle = wb.createCellStyle();  
	        cellStyle.setFillForegroundColor(HSSFColor.HSSFColorPredefined.GREEN.getIndex());
	        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	         
	        for(int i=0; i < header.getPhysicalNumberOfCells();i++) {
	            HSSFCell cell = header.getCell(i);
	             
	            cell.setCellStyle(cellStyle);
	        }
	    }
	     
	 public void preProcessPDF(Object document) throws Exception {
	        Document pdf = (Document) document;
	        pdf.open();
	        
	     
	   
	 
	    }
	
	
		

}
