package org.billpreview;

import static io.restassured.RestAssured.given;
import static org.billpreview.Constants.BASE_URL;
import static org.billpreview.Constants.xlspath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Utils {
	public static String requestId;
	public static String HNode_HPID;
	public static String BANode_HPID;

	public static void main(String args[]) {
		Utils u = new Utils();
		u.getData();
	}

	String testCaseName = "eligibility_check_API";
	Xls_Reader xls;

	public static RequestSpecification requestspecification() {
		Map<String, String> headers = new HashMap<>();
		headers.put("X-UserId", "ra8586");
		headers.put("Content-Type", "application/json");
		headers.put("Authorization", "Basic dms3NTB2OmFzaGlrQDEwNA==");
		headers.put("env-selector", "st");

		// System.out.println(headers);
		RequestSpecification requestSpecification = new RequestSpecBuilder().setBaseUri(BASE_URL)
				.setContentType(ContentType.JSON).log(LogDetail.ALL).build();
		return given(requestSpecification).auth().preemptive().basic("ra8586", "Feb@2019").headers(headers);

	}

	public static String generateStringforjson(String filename) throws IOException {
		String filePath = System.getProperty("user.dir") + "\\src\\main\\java\\org\\billpreview\\" + filename;
		return new String(Files.readAllBytes(Paths.get(filePath)));

	}
	/* @DataProvider */

	public Object[][] getData() {

		xls = new Xls_Reader(xlspath);
		return DataUtil.getTestData(xls, testCaseName);
	}
}
