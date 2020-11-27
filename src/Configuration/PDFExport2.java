package Configuration;

import java.io.IOException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.io.font.FontProgram;
import com.itextpdf.io.font.FontProgramFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;



@WebServlet( "/pdfexport2" )
public class PDFExport2 extends HttpServlet {

   private static final long serialVersionUID = 7609134248482865644L;

   
   @Override
   protected void doGet( HttpServletRequest request, HttpServletResponse response )
           throws ServletException, IOException {
       
     
     
       String masterPath = request.getServletContext().getRealPath( "./WEB-INF/mypdf.pdf" );
       response.setContentType( "application/pdf" );
       
       try ( PdfReader reader = new PdfReader( masterPath );
             PdfWriter writer = new PdfWriter( response.getOutputStream() );
             PdfDocument document = new PdfDocument( reader, writer ) ) {
           
           PdfPage page = document.getPage( 1 );
           PdfCanvas canvas = new PdfCanvas( page );
           
           FontProgram fontProgram = FontProgramFactory.createFont();
           PdfFont font = PdfFontFactory.createFont( fontProgram, "utf-8", true );
           canvas.setFontAndSize( font, 12 );
           
           canvas.beginText();

           
           canvas.setTextMatrix( 470, 760 );
           DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
           Calendar calendar = Calendar.getInstance();
           canvas.showText(  format.format(calendar.getTime()) );
 int top =600;
     
	ArrayList<LibAno> cat=ReadAllRejectionshis.FuncOp();
	ArrayList<LibAno> cat2=ReadAllRejectionshis.FuncOp2();
    canvas.setTextMatrix( 15, 630 );
    canvas.showText( "Detail des rejets par type de Transaction:");


  for (int i = 0; i <cat.size(); i++) {
	  
	  
      canvas.setTextMatrix(15, top );
      canvas.showText( "-Nombre de  "+cat.get(i).getLibelle()+" est :"+cat.get(i).getNbre());
      
      top=top-15;
	
}
  top=400;
  canvas.setTextMatrix( 15, 430 );
  canvas.showText( "Detail des rejets par type de Fon-Tie:");

  for (int i = 0; i <cat2.size(); i++) {
	  
	  
      canvas.setTextMatrix(15, top );
      canvas.showText( "-"+cat2.get(i).getLibelle()+":"+cat2.get(i).getNbre()+" fois");
      
      top=top-15;
	
}

           
       
           
           canvas.endText();
           
       } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
   }
   
}