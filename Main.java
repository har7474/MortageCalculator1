import com.sun.xml.internal.ws.wsdl.writer.document.StartWithExtensionsType;

import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte m=12;
        byte per=100;
        System.out.println("Enter the principal amount:");
        int p=sc.nextInt();
        System.out.println("Enter the AnnualIntrest rate :");
        float annual_rate=sc.nextFloat();
        float monthly_rate=annual_rate/per/m;
        System.out.println("Enter the Time Period(Year):");
        int t= sc.nextInt();
        int number_of_payments=t*m;
        double mortage=p*(monthly_rate*Math.pow(1+monthly_rate,number_of_payments))/(Math.pow(1+monthly_rate,number_of_payments)-1);
        String mortage_formatted= NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage:"+mortage_formatted);



    }
}