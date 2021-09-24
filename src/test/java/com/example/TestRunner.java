package com.example;


import org.testng.annotations.Test;
import org.junit.Test;
import com.codeborne.selenide.*;
import static com.codeborne.selenide.Selenide.open;



public class TestRunner {


    public void userCanSearchKeywordWithGoogle(){
        open("https://www.google.com/");
    }

}
