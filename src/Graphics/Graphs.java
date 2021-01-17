/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;
import DB.dbConnect;
import classes.Payment;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
/**
 *
 * @author Lasith
 */
public class Graphs {
    
    
    private static void populate(DefaultPieDataset pieDataset,LocalDate date, String key) throws  SQLException{
        ResultSet rt = Payment.PieChartData(date);
        rt.next();
        if(rt.getString("Amount")!=null){
            pieDataset.setValue(key, Double.valueOf(rt.getString("Amount")));
        }
    }
    
    
    
    public static void Plot(JPanel daily,JPanel monthly , JPanel yearly) throws SQLException{
        Date today = new Date();
        SimpleDateFormat formatter; 
        formatter = new SimpleDateFormat("yyyy-MM"); 
        LocalDate currentDate = LocalDate.now();
        LocalDate monday = currentDate;
        String days[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        while (monday.getDayOfWeek() != DayOfWeek.MONDAY) {
          monday = monday.minusDays(1);
        }
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        for (int i=0; i<7; i++){
            populate(pieDataset, monday, days[i]);
            monday = monday.plusDays(1);
        }
        JFreeChart pieChart = ChartFactory.createPieChart("Weekly Sales", pieDataset);
        
        JDBCCategoryDataset Monthlydataset = Payment.MonthlyDataset( formatter.format(today));
        
        formatter = new SimpleDateFormat("yyyy");
        //creating the sql connection to create dataset
        //JDBCCategoryDataset dataset = new JDBCCategoryDataset(dbConnect.getConnection(),monthlySql);
        
        JDBCCategoryDataset YearlyDataset = Payment.YearlyDataset( formatter.format(today) );
        //creating a line chart 
        //JFreeChart linechart = ChartFactory.createBarChart("Sales Income","Today","Income",dataset, PlotOrientation.VERTICAL,true,false,true);
        JFreeChart monthlyChart = ChartFactory.createBarChart("Daily Sales", "Date", "Sales", Monthlydataset,PlotOrientation.VERTICAL,true,false,true);
        JFreeChart yearlyChart = ChartFactory.createBarChart("Monthly Sales", "Month", "Sales", YearlyDataset,PlotOrientation.VERTICAL,true,false,true);


        //getting the line chart plot
        //CategoryPlot linechrt = linechart.getCategoryPlot();
        CategoryPlot monthlyChrt = monthlyChart.getCategoryPlot();
        CategoryPlot yearlyChrt = yearlyChart.getCategoryPlot();


        BarRenderer renderM = (BarRenderer) monthlyChrt.getRenderer();
        renderM.setMaximumBarWidth(0.1);
        renderM.setDrawBarOutline(false);
        renderM.setSeriesPaint(0, Color.green);
        renderM.setBarPainter(new StandardBarPainter());

        BarRenderer renderY = (BarRenderer) yearlyChrt.getRenderer();
        renderY.setSeriesPaint(0, Color.green);
        renderY.setBarPainter(new StandardBarPainter());
        renderY.setMaximumBarWidth(0.06);
        renderY.setDrawBarOutline(false);

        ChartPanel linePanel2 = new ChartPanel(monthlyChart);
        ChartPanel linePanel3 = new ChartPanel(yearlyChart);
        ChartPanel linePanel = new ChartPanel(pieChart);
        //removing the previous panel
        daily.removeAll();
        monthly.removeAll();
        yearly.removeAll();
        //adding a new line chart to the panel
        //daily.add(linePanel,BorderLayout.CENTER);
        daily.add(linePanel,BorderLayout.CENTER);
        monthly.add(linePanel2,BorderLayout.CENTER);
        yearly.add(linePanel3,BorderLayout.CENTER);
    }
}
