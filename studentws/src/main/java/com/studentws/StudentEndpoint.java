package com.studentws;

import com.studentws.soap.GetStudentRequest;
import com.studentws.soap.GetStudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by Ufuk on 16-07-15.
 */
@Endpoint // Indicates an annotated class for web service end point
public class StudentEndpoint {

    private static final String NAMESPACE_URI = "http://studentws.com/soap";

    @Autowired
    private StudentUtility studentUtility;

    // @PayloadRoot marks an endpoint method as the handler for incoming request
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getStudentRequest")
    @ResponsePayload // Bounds the method return type to the response payload
    public GetStudentResponse getStudent(@RequestPayload // Bounds the method parameter to the request payload
                                                 GetStudentRequest request) {
        GetStudentResponse response = new GetStudentResponse();
        response.setStudent(studentUtility.getStudent(request.getStudentId()));
        return response;
    }
}
