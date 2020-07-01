package com.mezonworks.solid.srp.employee_architecture;

public class ReportFormatter {
    String formattedOutput;

    public ReportFormatter(Object o, FormatType formatType){
        switch (formatType) {
            case XML -> formattedOutput = convertObjectToXML(o);
            case CSV -> formattedOutput = convertObjectToCSV(o);
        }
    }

    private String convertObjectToXML(Object o){
        return  "Converted to XML " + o.toString();
    }

    private String convertObjectToCSV(Object o){
        return  "Converted to CSV " + o.toString();
    }
}
