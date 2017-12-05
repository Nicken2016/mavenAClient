/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavenaclient;

/**
 *
 * @author Nicken
 */
public class MavenAClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(testDb("RSalary", "<PERSON><NAME>Mike</NAME><POSITION>Manager</POSITION></PERSON>"));
    }

    private static String testDb(java.lang.String rType, java.lang.String rXml) {
        kz.mycompany.maventest.TestWS_Service service = new kz.mycompany.maventest.TestWS_Service();
        kz.mycompany.maventest.TestWS port = service.getTestWSPort();
        return port.testDb(rType, rXml);
    }
    
}
