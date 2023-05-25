package putfunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import java.lang.String;

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


//sam local invoke -e ./events/event.json
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("X-Custom-Header", "application/json");

        Map returnValue = new HashMap();
        returnValue.put("Method", "put Request");
        returnValue.put("userID", UUID.randomUUID().toString());

        String requestBody = input.getBody();
        Gson gson = new Gson();
        Map<String, String> userDetail = gson.fromJson(requestBody, Map.class);

        returnValue.put("Method",userDetail.get("Method"));
//        if(!(String.IsNullOrEmpty(userDetail.get("userID")))){
//            returnValue.put("userID", userDetail.get("userID"));
//        }


        Map<String , String> userDetails = gson.fromJson(requestBody, Map.class);







        APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent()
                .withHeaders(headers);
            return response
                    .withStatusCode(200)
                    .withBody(gson.toJson(returnValue,Map.class));

    }


}

