import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class RestAssuredClass {

    @Test
    public void swaggerStoreGet(){
        when().
                get("https://petstore.swagger.io/#/store/getOrderById")
                .then().statusCode(200)
                .body("id",equalTo("0"))
                .time(lessThan(1000L));
    }

    @Test
    public void swaggerStorePost(){
        when().
                post("https://petstore.swagger.io/#/store/placeOrder")
                .then().statusCode(200)
                .body("id",equalTo("0"))
                .time(lessThan(1000L));
    }

    @Test
    public void swaggerStoreDelete(){
        when().
                post("https://petstore.swagger.io/#/store/deleteOrder")
                .then().statusCode(400)
                .body("id",equalTo("0"))
                .time(lessThan(1000L));
    }

}
