package com.fersoft.cucumber.stepdefs;

import com.fersoft.MeubolsoApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MeubolsoApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
