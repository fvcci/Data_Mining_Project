package view;

import model.MyDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import util.Category;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;
import java.util.Map;

public class HousingTrendGUI extends Tool {
    
    private static final HashMap<String, Integer> stringToInteger = new HashMap<>() {{
        put("ONE", 1);
        put("TWO", 2);
        put("THREE", 3);
        put("FOUR", 4);
        put("FIVE", 5);
        put("SIX", 6);
        put("SEVEN", 7);
        put("EIGHT", 8);
        put("NINE", 9);
        put("ZERO", 0);
        put("NO", 0);
    }};
    
    private JLabel housingTrendTitle = new JLabel("img/title/housingTrendTitle.png");
    private JLabel selectLocation = new JLabel("Select Location");
    private JLabel selectVariable = new JLabel("Select Variable");
    private JComboBox location;
    private JComboBox variable;
    private ChartPanel chartPanel;
    private JFreeChart scatterPlotChart;
    private XYSeriesCollection displayedData;
    
    public HousingTrendGUI () {
        
        housingTrendTitle.setBounds(0, 0, 100, 50);
        add(housingTrendTitle);
        
<<<<<<< HEAD
        selectLocation.setBounds(200, 100, 100, 50);
        add(selectLocation);
        String locationName[] = { "Vaughan", "Richmond Hill", "Markham", "East Gwillimbury", "Newmarket", "Georgina", "King" };
        location = new JComboBox(locationName);
        
        location.setBounds(200, 200, 100, 100);
        add(location);
    
        selectVariable.setBounds(200, 400, 100, 50);
        add(selectVariable);
        String variableName[] = { "room", "bed", "maintainer" };
        variable = new JComboBox(variableName);
        
        variable.setBounds(200, 500, 100, 100);
=======
        selectLocation.setBounds(200,100,100,30);
        add(selectLocation);
        String locationName[]={"Vaughan","Richmond Hill","Markham","East Gwillimbury","Newmarket","Georgina","King"};
        location= new JComboBox(locationName);
        location.setBounds(200,150,100,30);
        add(location);

        selectVariable.setBounds(200,400,100,30);
        add(selectVariable);
        String variableName[]={"room","bed","maintainer"};
        variable= new JComboBox(variableName);
        variable.setBounds(200,450,100,30);
>>>>>>> 990cfc2b62a3f9dcc7c7c1afbb578d8d6052d864
        add(variable);
        
        displayedData = new XYSeriesCollection();
        
        setVisible(true);
        
    }
    
    @Override
    public void initializeDataToDisplay (MyDataset[] dataset) {
        
        String groupName = getValidGroups(1).get(0);
        setDataGroup(dataset[1].getDataset().get(groupName));
        createDisplayedData(MyDataset.getCities()[0]);
    
        scatterPlotChart = ChartFactory.createScatterPlot(
                "Number of House vs "+groupName,
                groupName,
                "Number Of House",
                displayedData
        );
        scatterPlotChart.setBackgroundPaint(BACKGROUND_COLOUR);
        chartPanel = new ChartPanel(scatterPlotChart);
        chartPanel.setBounds(400, 150, MainFrame.WIDTH/2, MainFrame.HEIGHT/2);
        add(chartPanel);
        
    }
    
    public void createDisplayedData (String cityName) {
<<<<<<< HEAD
    
        displayedData.removeAllSeries();// TODO clear any data from before
=======

        displayedData.removeAllSeries(); // TODO clear any data from before
>>>>>>> 990cfc2b62a3f9dcc7c7c1afbb578d8d6052d864
        XYSeries city = new XYSeries(cityName);
    
        for (Category category : getDataGroup()) {
        
            // TODO resolve 1-4 since there are 2 numbers there
            for (Map.Entry<String, Integer> identifiers : stringToInteger.entrySet()) {
                if (category.getCategoryName().contains(identifiers.getKey())) {
                    city.add(identifiers.getValue(), category.getCities().get(cityName));
                    break;
                }
            }
        
        }
        displayedData.addSeries(city);
<<<<<<< HEAD
    
    }
    //    public JComboBox getLocation1 () {
    //        return location;
    //    }
    //    public JComboBox getVariable() {
    //        return variable;
    //    }
}
=======
        
    }

    public JComboBox getLocation1() {
        return location;
    }

    public JComboBox getVariable() {
        return variable;
    }
}
>>>>>>> 990cfc2b62a3f9dcc7c7c1afbb578d8d6052d864
