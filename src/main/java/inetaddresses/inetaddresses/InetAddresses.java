/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package inetaddresses.inetaddresses;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetAddresses {

    public static void main(String[] args) {
        
        String filePath = "C:\\Users\\hp\\Desktop\\USIU\\Assignments_and_notes\\Programming with Networks\\input.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
               resolveAndPrintAddresses(line); 
            }
        } catch (Exception e) {
            e.printStackTrace();
    }
}
    
private static void resolveAndPrintAddresses(String url) {
    try {
        InetAddress [] addresses = InetAddress.getAllByName(url);
        
        System.out.println("IP Addresses for " + url + ":");
        for (InetAddress address : addresses) {
            System.out.println(address.getHostAddress());
    } 
        System.out.println();
} catch (UnknownHostException e) {
    System.err.println("Unable to resolve host: " + url);
    e.printStackTrace();
}
}
}
    

    
