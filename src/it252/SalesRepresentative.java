/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it252;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Truth
 */
public class SalesRepresentative
{
    
    String repId;
    String repFirstName;
    String repLastName;
    Double supplieSales;
    Double bookSales;
    Double paperSales;
    Double totalSales;
    String salesDist;
    String contactMeth;
    ArrayList<String> salesInfo = new ArrayList<>();
    
    //Getters and setters
    void setRepId (String repId)
    {
        this.repId = repId;
        salesInfo.add(repId);
    }
    
    public String getRepId()
    {
        return repId;
    }
    
    void setRepFirstName (String repFirstName)
    {
        this.repFirstName = repFirstName;
        salesInfo.add(repFirstName);
    }
    
    public String getRepFirstName()
    {
        return repFirstName;
    }
    
    void setRepLastName(String repLastName)
    {
        this.repLastName = repLastName;
        salesInfo.add(repLastName);
    }
    
    public String getRepLastName()
    {
        return repLastName;
    }
    
    void setSuppliesSales(Double supplieSales)
    {
        this.supplieSales = supplieSales;
        salesInfo.add(String.valueOf(supplieSales));
    }
    
    public Double getSupplieSales()
    {
        return supplieSales;
    }

    void setBookSales(Double bookSales)
    {
        this.bookSales = bookSales;
        salesInfo.add(String.valueOf(bookSales));
    }
    
    public Double getBookSales()
    {
        return bookSales;
    }

    void setPaperSales (Double paperSales)
    {
        this.paperSales = paperSales;
        salesInfo.add(String.valueOf(paperSales));
    }
    
    public Double getPaperSales()
    {
        return paperSales;
    }

    void setTotalSales (Double totalSales)
    {
        this.totalSales = totalSales;
        salesInfo.add(String.valueOf(totalSales));
    }
    public Double getTotalSales()
    {
        return totalSales;
    }

    void setSalesDist (String salesDist)
    {
        this.salesDist = salesDist;
        salesInfo.add(salesDist);
    }
    
    public String getSalesDist()
    {
        return salesDist;
    }
    
    void setContactMeth(String contactMeth)
    {
        this.contactMeth = contactMeth;
        salesInfo.add(contactMeth);
    }
    
    public String getContactMeth()
    {
        return contactMeth;
    }
    
    //Constructor
    SalesRepresentative(String repId, String repFirstName, String repLastName, 
            Double supplieSales, Double bookSales, Double paperSales,
            Double totalSales, String salesDist, String contactMeth)
    {
        this.repId = repId;
        this.repFirstName= repFirstName;
        this.repLastName= repLastName;
        this.supplieSales= supplieSales;
        this.bookSales = bookSales;
        this.paperSales = paperSales;
        this.totalSales = totalSales;
        this.salesDist= salesDist;
        this.contactMeth = contactMeth;
    }
    
    public ArrayList getRepArray()
    {
        return salesInfo;
    }
    
    @Override
    public String toString()
    {
        //Turns array to string and formats for printing
        String formattedArray = String.format("%s %s \n%s %s \n%s %s \n%s %s "
                + "\n%s\n%s", repId, repFirstName, "Supplies: ", supplieSales,
                "Books: ", bookSales, "Paper: ", paperSales, salesDist, 
                contactMeth+"\n\n" );
        
        return formattedArray;
    }
}