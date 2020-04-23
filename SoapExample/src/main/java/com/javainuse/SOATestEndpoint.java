package com.javainuse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-04-23T11:46:24.026-05:00
 * Generated source version: 3.3.6
 *
 */
@WebService(targetNamespace = "http://javainuse.com", name = "SOATestEndpoint")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SOATestEndpoint {

    @WebMethod(operationName = "SOATest", action = "http://javainuse.com")
    @WebResult(name = "outputSOATest", targetNamespace = "http://javainuse.com", partName = "out")
    public OutputSOATest soaTest(

        @WebParam(partName = "in", name = "inputSOATest", targetNamespace = "http://javainuse.com")
        InputSOATest in
    );
}
