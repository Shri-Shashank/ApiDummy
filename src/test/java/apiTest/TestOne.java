package apiTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class TestOne {
	
@Test
public void test1(){
	given().get("http://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22")
	.then().statusCode(200);
	
}

}
