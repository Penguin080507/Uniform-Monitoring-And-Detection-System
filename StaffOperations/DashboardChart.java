package StaffOperations;

import StudentOperation.StudentData;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;

import javax.swing.*;
import java.awt.*;

public class DashboardChart extends JPanel {

    public DashboardChart() {
        // Create chart
        JFreeChart chart = ChartFactory.createAreaChart(
                "Student Enrollment Trend", "Date", "Total Students",
                StudentData.getDataset()
        );

        CategoryPlot plot = chart.getCategoryPlot();

        // Set background and gridlines
        plot.setBackgroundPaint(new Color(240, 240, 240));
        plot.setRangeGridlinePaint(Color.LIGHT_GRAY);
        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.LIGHT_GRAY);

        // Area renderer with fill color
        AreaRenderer renderer = new AreaRenderer();
        renderer.setSeriesPaint(0, new Color(30, 144, 255));
        renderer.setSeriesFillPaint(0, new Color(30, 144, 255, 80));
        plot.setRenderer(renderer);

        // Rotate X-axis labels
        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
                org.jfree.chart.axis.CategoryLabelPositions.UP_45
        );

        // Y-axis as integers
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // Add chart to JPanel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(600, 400));
        setLayout(new BorderLayout());
        add(chartPanel, BorderLayout.CENTER);
    }
}
