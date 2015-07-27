package com.studentws;

import com.studentws.wsdl.GetStudentRequest;
import com.studentws.wsdl.GetStudentResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

/**
 * Created by Ufuk on 18-07-15.
 */
public class StudentClient extends WebServiceGatewaySupport {

    public GetStudentResponse getStudentById(int studentId) {
        GetStudentRequest request = new GetStudentRequest();
        request.setStudentId(studentId);
        GetStudentResponse response = (GetStudentResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback("http://localhost:8080/soapws/getStudentResponse"));
        return response;
    }
}