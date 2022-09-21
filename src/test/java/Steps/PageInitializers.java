package Steps;

import Pages.LoginPage;
//import pages.AddEmployeePage;
//import pages.DashboardPage;
//import pages.LoginPage;
//import pages.SearchEmployeePage;

public class PageInitializers {
    public static LoginPage loginPage;
//    public static SearchEmployeePage searchEmployeePage;
//    public static AddEmployeePage addEmployeePage;
//    public static DashboardPage dashboardPage;dashboardPage

    public static void initializePageObjects(){
        loginPage = new LoginPage();
//        dashboardPage = new DashboardPage();
//        searchEmployeePage = new SearchEmployeePage();
//        addEmployeePage = new AddEmployeePage();AddEmployeePage
    }
}
