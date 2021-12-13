package com.orangehrmlive.demo.cucumber.steps;

import com.orangehrmlive.demo.pages.HomePage;
import cucumber.api.java.en.And;

public class HomePageStep {
    @And("^I click on admin tab$")
    public void iClickOnAdminTab() {
        new HomePage().setAdmin();
    }
}
