
package fr.mom.arkeo.soap;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-04-07T08:09:17.381+02:00
 * Generated source version: 3.1.6
 * 
 */
public final class Login_LoginPort_Client {

    private static final QName SERVICE_NAME = new QName("http://soap.arkeo.mom.fr/", "LoginService");

    private Login_LoginPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = LoginService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        LoginService ss = new LoginService(wsdlURL, SERVICE_NAME);
        Login port = ss.getLoginPort();  
        
        {
        System.out.println("Invoking authentification...");
        java.lang.String _authentification_arg0 = "_authentification_arg0-940379492";
        java.lang.String _authentification_arg1 = "_authentification_arg11647110738";
        java.lang.String _authentification_arg2 = "_authentification_arg2-24860473";
        fr.mom.arkeo.soap.Account _authentification__return = port.authentification(_authentification_arg0, _authentification_arg1, _authentification_arg2);
        System.out.println("authentification.result=" + _authentification__return);


        }

        System.exit(0);
    }

}
