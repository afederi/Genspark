package getworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.google.gson.Gson;
/**
 * Handler for requests to Lambda function.
 */
public class App implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    public APIGatewayProxyResponseEvent handleRequest(final APIGatewayProxyRequestEvent input, final Context context) {

//        String requestBody = input.getBody();
//        Gson gson = new Gson();
//
//        Map<String, String> userDetails = gson.fromJson(requestBody, Map.class);
//
//        userDetails.put("userID", UUID.randomUUID().toString());
//
//        Map returnValue = new HashMap();
//        returnValue.put("Name", userDetails.get("userID"));
//
//        APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent();
//        response.withStatusCode(200);
//        response.withBody(gson.toJson(returnValue,Map.class));
//
//        Map responseHeader = new HashMap();
//        .put("Content-type", "application/json");
//        response.withHeaders(responseHeader);
//        return response;

//sam local invoke -e ./events/event.json
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("X-Custom-Header", "application/json");



        String requestBody = input.getBody();
        Gson gson = new Gson();

        //This two lines of code is making the get request not work. Something in the gson method is making not work
        Map<String , String> userDetails = gson.fromJson(requestBody, Map.class);
//        userDetails.put("userId", UUID.randomUUID().toString());
        //Map<String , String> userDetails = gson.fromJson(requestBody, Map.class);


        Map returnValue = new HashMap();
        returnValue.put("Method", "getMethod");
        returnValue.put("userID", UUID.randomUUID().toString());




        APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent()
                .withHeaders(headers);
//        try {
//            final String pageContents = this.getPageContents("https://checkip.amazonaws.com");
//            String output = String.format("{ \"message\": \"hello world\" }", pageContents);
            return response
                    .withStatusCode(200)
                    .withBody(gson.toJson(returnValue,Map.class));
//        } catch (IOException e) {
//            return response
//                    .withBody("{}")
//                    .withStatusCode(500);
//        }
    }


//    private String getPageContents(String address) throws IOException{
//        URL url = new URL(address);
//        try(BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {
//            return br.lines().collect(Collectors.joining(System.lineSeparator()));
//        }
//    }
}

