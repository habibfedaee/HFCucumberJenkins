package Utils;

import org.json.JSONObject;

public class APIPayloadConstants {

    // following payloads are based on syntax website api structure

    // manual payload
    public static String createEmployeePayload(){
        String createEmployee =         "{\n" +
                "  \"emp_firstname\": \"asel\",\n" +
                "  \"emp_lastname\": \"bk\",\n" +
                "  \"emp_middle_name\": \"MS\",\n" +
                "  \"emp_gender\": \"F\",\n" +
                "  \"emp_birthday\": \"2000-06-11\",\n" +
                "  \"emp_status\": \"Probation\",\n" +
                "  \"emp_job_title\": \"Lead\"\n" +
                "}";
        return createEmployee;
    }

    // passing the body from json object
    public static String createEmployeePayloadViaJSON(){
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", "any_value");
        obj.put("emp_lastname", "any_value");
        obj.put("emp_middle_name", "any_value");
        obj.put("emp_gender", "F/M");
        obj.put("emp_birthday", "any_date");
        obj.put("emp_status", "any_value");
        obj.put("emp_job_title", "any_value");
        return obj.toString();
    }

    // create employee dynamically
    public static String createEmployeeDynamic(String firstName, String lastName, String middleName,
                                               String gender, String dob, String status, String jobTitle){
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", firstName);
        obj.put("emp_lastname", lastName);
        obj.put("emp_middle_name", middleName);
        obj.put("emp_gender", gender);
        obj.put("emp_birthday", dob);
        obj.put("emp_status", status);
        obj.put("emp_job_title", jobTitle);
        return obj.toString();
    }




}
