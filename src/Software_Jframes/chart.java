/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Software_Jframes;

import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.util.Vector;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Asbar Ali
 */
public class chart {
    
   // VIEW PROJECT STATUS
    public void piechart(JDesktopPane jDesktopPane1,String pid ){
       
      DefaultPieDataset piedataset = new DefaultPieDataset();
       try {
            ResultSet rs= db.statement().executeQuery("select name,cost from project_level_payment where projectid='"+pid+"' ");
            while(rs.next()){
                String cost= rs.getString("cost");
                int cost_int1= Integer.parseInt(cost);
             
                String name = rs.getString("name"); 
                
                piedataset.setValue(name,new Integer(cost_int1));
     }
       } catch (Exception e) {
           e.printStackTrace();
       }
        JFreeChart chart = ChartFactory.createPieChart("Costs for Project",piedataset,true,true,true);
        PiePlot p = (PiePlot) chart.getPlot();
        p.setBackgroundPaint(Color.white);
        ChartPanel panel = new ChartPanel(chart);
        jDesktopPane1.add(panel).setSize(440,300);
    }
   public void piechart_customer(JDesktopPane jDesktopPane1,String pid ){
       
      DefaultPieDataset piedataset = new DefaultPieDataset();
      int cost_total=0;
       try {
            ResultSet rs= db.statement().executeQuery("select * from cus_payment where Project_id='"+pid+"' ");
            while(rs.next()){
                String cost= rs.getString("Amount");
                int cost_int1= Integer.parseInt(cost);
                cost_total = cost_total+cost_int1;
                
                
               
     }
       } catch (Exception e) {
           e.printStackTrace();
       }
        piedataset.setValue("Amount Received", cost_total);
        piedataset.setValue("Amount to be Received", 7854);
        
        JFreeChart chart = ChartFactory.createPieChart("Costs for Project",piedataset,true,true,true);
        PiePlot p = (PiePlot) chart.getPlot();
        p.setBackgroundPaint(Color.white);
        ChartPanel panel = new ChartPanel(chart);
        jDesktopPane1.add(panel).setSize(500,230);
    }
   
    public void barchart(JDesktopPane jdesktop){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try {
             ResultSet rs= db.statement().executeQuery("select date,name,amount from other_exp");
             while(rs.next()){
                 String date = rs.getString("date");
                 String name = rs.getString("name");
                 String amnt = rs.getString("Amount");
                 int amount = Integer.parseInt(amnt);
                 dataset.setValue(amount, name, date);
             }
        } catch (Exception e) {
        }
      
        JFreeChart chart =ChartFactory.createBarChart("Other Expenses for Last week","Date","Expense", dataset,PlotOrientation.VERTICAL,false,true,false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setBackgroundPaint(Color.WHITE);
        p.setRangeGridlinePaint(Color.black);
        ChartPanel panel = new ChartPanel(chart);
        jdesktop.add(panel).setSize(550,230);
    }

    void auto_print(JTable jTable5) {
      try {
            MessageFormat header = new MessageFormat("Report Print");

            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            jTable5.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cannot Print" + e);
        } }

    void print_excel_report(JTable jTable5) {
        Access ac = new Access();
    try {
       String filename= ac.chooseFile();
      
        WritableWorkbook wworkbook;
        wworkbook = Workbook.createWorkbook(new File(filename+".xls"));
        WritableSheet wsheet = wworkbook.createSheet("First Sheet", 0);

        DefaultTableModel dtm = (DefaultTableModel) jTable5.getModel();
        Vector v = new Vector();
        int count_row=dtm.getRowCount();
        int count_col = dtm.getColumnCount();
        
        jxl.write.Label label1 = new jxl.write.Label(0, 0,"Good Name");
        wsheet.addCell(label1);
        jxl.write.Label label2 = new jxl.write.Label(1,0 ,"Project Name");
        wsheet.addCell(label2);
        jxl.write.Label label3 = new jxl.write.Label(2,0 ,"Cost");
        wsheet.addCell(label3);
                                
        int i=0;
        int j=0;
        
        for(i=0;i<count_row;i++){
            for(j=0;j<count_col;j++){
                  int temp_i=i+2;
                               jxl.write.Label label = new jxl.write.Label(j, temp_i,dtm.getValueAt(i, j)+"");
                                wsheet.addCell(label);
            }
        }
      wworkbook.write();
      wworkbook.close();
      JOptionPane.showMessageDialog(null,"Successfully Create a excel file");
    
        } catch (Exception e) {
            e.printStackTrace();
        }
          }

    void print_pdf_report(JTable jTable5) {
        Access ac = new Access();
    try {
        String filename= ac.chooseFile();
      
        com.itextpdf.text.Document document=new com.itextpdf.text.Document(); 
        PdfWriter.getInstance(document,new FileOutputStream(filename+".pdf"));
        
        document.open();
        document.add(new Paragraph(""));
       
        Image image1 = Image.getInstance("src/images/ROPA_Logo_without_claim.jpg");
        document.add(new Paragraph(""));
        image1.scaleAbsolute(80,50);
        image1.setAbsolutePosition(50, 800);
        
        document.add(image1);
       PdfPTable table = new PdfPTable(3); // 3 columns.

       
        DefaultTableModel dtm = (DefaultTableModel) jTable5.getModel();
        Vector v = new Vector();
        int count_row=dtm.getRowCount();
        int count_col = dtm.getColumnCount();
        
        for(int i=0;i<count_row;i++){
            for(int j=0;j<count_col;j++){
                              
                
                table.addCell(new PdfPCell(new Paragraph(dtm.getValueAt(i, j)+"")));
     
            }
        }
        table.setWidthPercentage(100);
        float[] columnWidths = {2f, 1f, 1f};

        table.setWidths(columnWidths);
        
        document.add(table);
        document.close();
        JOptionPane.showMessageDialog(null,"Successfully Created.");
       
        } catch (Exception e) {
           e.printStackTrace();
        } }
    
    
      
}
