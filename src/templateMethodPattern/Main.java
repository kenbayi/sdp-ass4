package templateMethodPattern;

public class Main {
    public static void main(String[] args) {
        ReportGenerator pdfReport = new PDFReportGenerator();
        ReportGenerator htmlReport = new HTMLReportGenerator();

        System.out.println("Generating PDF report:");
        pdfReport.generateReport();

        System.out.println("\nGenerating HTML report:");
        htmlReport.generateReport();
    }
}
