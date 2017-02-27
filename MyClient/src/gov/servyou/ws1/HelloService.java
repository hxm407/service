
package gov.servyou.ws1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloService", targetNamespace = "http://ws1.servyou.gov/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://ws1.servyou.gov/", className = "gov.servyou.ws1.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://ws1.servyou.gov/", className = "gov.servyou.ws1.SayHelloResponse")
    @Action(input = "http://ws1.servyou.gov/HelloService/sayHelloRequest", output = "http://ws1.servyou.gov/HelloService/sayHelloResponse")
    public String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
