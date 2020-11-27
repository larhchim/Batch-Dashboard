package Configuration;

import java.awt.Color;
import java.io.Serializable;
import java.util.Random;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.axes.cartesian.CartesianScales;
import org.primefaces.model.charts.axes.cartesian.linear.CartesianLinearAxes;
import org.primefaces.model.charts.axes.cartesian.linear.CartesianLinearTicks;
import org.primefaces.model.charts.bar.BarChartDataSet;
import org.primefaces.model.charts.bar.BarChartModel;
import org.primefaces.model.charts.bar.BarChartOptions;
import org.primefaces.model.charts.donut.DonutChartDataSet;
import org.primefaces.model.charts.donut.DonutChartModel;
import org.primefaces.model.charts.line.LineChartDataSet;
import org.primefaces.model.charts.line.LineChartModel;
import org.primefaces.model.charts.line.LineChartOptions;
import org.primefaces.model.charts.optionconfig.legend.Legend;
import org.primefaces.model.charts.optionconfig.legend.LegendLabel;
import org.primefaces.model.charts.optionconfig.title.Title;
import org.primefaces.model.charts.pie.PieChartDataSet;
import org.primefaces.model.charts.pie.PieChartModel;
import org.primefaces.model.charts.pie.PieChartOptions;


@ManagedBean(name="path")
@SessionScoped

public class ChartJsView implements Serializable {
     
     
     
     
     

     
    private PieChartModel pieModel;
    private PieChartModel pieModel2;


    


    @PostConstruct
    public void init() {

        try {
        	
			createPieModel2();
			createPieModel();
	      

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
    
    
   
     
    private void createPieModel() throws Exception {
        pieModel = new PieChartModel();
        ChartData data = new ChartData();
		ArrayList<LibAno> cat=ReadAllRejections.FuncOp();

         
        PieChartDataSet dataSet = new PieChartDataSet();
        List<Number> values = new ArrayList<>();
        
        int sum=0;
        for (int i = 0; i < cat.size(); i++) {
        	
        	sum=sum+cat.get(i).getNbre();
			
		}
        values.add((cat.get(0).getNbre()*100)/sum);
        values.add((cat.get(1).getNbre()*100)/sum);
        values.add((cat.get(2).getNbre()*100)/sum);
        dataSet.setData(values);
         
        List<String> bgColors = new ArrayList<>();
        bgColors.add("rgb(255, 99, 132)");
        bgColors.add("rgb(54, 162, 235)");
        bgColors.add("rgb(255, 205, 86)");
        dataSet.setBackgroundColor(bgColors);
         
        data.addChartDataSet(dataSet);
        List<String> labels = new ArrayList<>();
        
            labels.add("Mise à jour");

        
        
            labels.add("Suppression");

        
 
            labels.add("Création");

        
        
        
        
        data.setLabels(labels);
         
        pieModel.setData(data);
    }
    
    private void createPieModel2() throws Exception {
        pieModel2 = new PieChartModel();
        ChartData data = new ChartData();
		ArrayList<LibAno> cat=ReadAllRejections.FuncOp2();
		

         
        PieChartDataSet dataSet = new PieChartDataSet();
        List<Number> values = new ArrayList<>();
        List<String> bgColors = new ArrayList<>();
        List<String> labels = new ArrayList<>();

        bgColors.add("rgb(255, 99, 132)");
        bgColors.add("rgb(54, 162, 235)");
        bgColors.add("rgb(255, 205, 86)");

        bgColors.add("rgb(255,255,0)");

        bgColors.add("rgb(255,0,255)");

        bgColors.add("rgb(255,0,0)");
        bgColors.add("rgb(205,92,92)");
        bgColors.add("rgb(0,255,255)");
        bgColors.add("rgb(255,255,255)");

        int sum=0;
        for (int i = 0; i < cat.size(); i++) {
        	
        	sum=sum+cat.get(i).getNbre();
			
		}
        

        for (int i = 0; i < cat.size(); i++) {
        	

            values.add((cat.get(i).getNbre()*100)/sum);

            dataSet.setData(values);
            bgColors.add("rgb(255, 205, 86)");
            bgColors.add("rgb(54, 162, 235)");
            labels.add("A"+(i+1));
          

		}


      
         

        dataSet.setBackgroundColor(bgColors);
         
        data.addChartDataSet(dataSet);
        
        PieChartOptions a = new PieChartOptions();   
        Legend legend = new Legend();
        legend.setDisplay(true);
        legend.setPosition("top");
        LegendLabel legendLabels = new LegendLabel();
        legendLabels.setFontStyle("bold");
        legendLabels.setFontColor("#2980B9");
        legendLabels.setFontSize(24);
        legend.setLabels(legendLabels);
        
        a.setLegend(legend);
 
        pieModel2.setOptions(a);
        
        data.setLabels(labels);
         
        pieModel2.setData(data);
        
        
        
        
        
     
    }
    
    
   public PieChartModel getPieModel() {
       return pieModel;
   }

   public void setPieModel(PieChartModel pieModel) {
       this.pieModel = pieModel;
   }

	public PieChartModel getPieModel2() {
		return pieModel2;
	}
	
	
	public void setPieModel2(PieChartModel pieModel2) {
		this.pieModel2 = pieModel2;
	}
	    
	   
 

}