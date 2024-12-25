package in.co.gorest.userinfo;

import in.co.gorest.testbase.TestBase;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UserDeleteTest extends TestBase {

    @Test
    public void VerifyUserDeleteSuccessfully() {
        given().log().ifValidationFails()
                .pathParam("id",7599479)
                .header("Authorization", "Bearer dc23b522e8dbe26f0dacc4096b68200394cfa30302b9c1b5a7e3b6b9fe9d7ad9")
                .when()
                .delete("/users/{id}")
                .then().log().all()
                .statusCode(404);

    }
}
