package Utils;

import io.restassured.RestAssured;

public class APIConstants {
    public static final String baseURI = RestAssured.baseURI = "http://...";
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_CONTENT_TYPE_VALUE = "application/json";
    public static final String HEADER_AUTHORIZATION = "Authorization";

    // the following values are based on Syntax Website
    public static final String GENERATE_TOKEN_URI = baseURI +"/generateToken.php";
    public static final String GET_ONE_EMPLOYEE_URI = baseURI +"/getOneEmployee.php";
    public static final String UPDATE_EMPLOYEE_URI = baseURI +"/updateEmployee.php";
    public static final String GET_ALL_EMPLOYEE_URI = baseURI +"/getAllEmployee.php";
    public static final String DELETE_EMPLOYEE_URI = baseURI +"/deleteEmployee.php";
    public static final String UPDATE_PARTIAL_EMPLOYEE_URI = baseURI+"/updatePartialEmployee.php";
    public static final String GET_EMPLOYEE_STATUS_URI = baseURI+"/employeeStatus.php";

}
