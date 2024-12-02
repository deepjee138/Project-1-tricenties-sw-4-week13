package com.demoweb.demo.testsuit;

import com.demoweb.demo.pages.ComputerPage;
import com.demoweb.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {
    ComputerPage computerPage=new ComputerPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){

       // 1.1 Click on the COMPUTERS Menu.
        computerPage.clickOnComputerTab();

       // 1.2 Click on Desktop
        computerPage.clickOnDesktop();

       // 1.3 Select Sort By position "Name: Z to A"
        computerPage.selectTheSortByPosition();

       // 1.4 Verify the Product will be arranged in Descending order
        computerPage.areProductsSortedDescendingOrder();

    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessfully(){

        //Click on the COMPUTERS Menu.
        computerPage.clickOnComputerTab();

        //Click on Desktop
        computerPage.clickOnDesktop();

        //Select Sort By position "Name: Z to A"
        computerPage.selectTheSortByPosition();

        //Click on the "Add To Cart" button of the product name ‘Build your own computer’
        computerPage.clickOnAddToCart();

        //Verify the Text "Build your own computer"
        String expectedMessage = "Build your own computer";
        String actualMessage = computerPage.getTextBuildComputer();
        Assert.assertEquals(actualMessage, expectedMessage, "Wrong message display");

        //Select "2.2 GHz Intel Pentium Dual-Core E2200" using the Select class
        computerPage.selectIntelPentiumDualCore();

        //Select "8GB [+$60.00]" using the Select class.
        computerPage.selectGBText();

        //Select HDD radio button "400 GB [+$100.00]"
        computerPage.selectRadioButton();

        //Select the OS radio button "Windows 10 [+$60.00]"
        computerPage.selectOSRadioButton();

        //Check Two Checkboxes "Microsoft Office [+$50.00]" and "Total Commander
        //[+$5.00]"
        computerPage.clickOnCheckBoxFirst();

        //Check Two Checkboxes "Microsoft Office [+$50.00]" and "Total Commander
        //[+$5.00]"
        computerPage.clickOnCheckBoxSecond();

        //Verify the price "1200.00"
        String expectedPrice = "1200.00";
        String actualPrice = computerPage.verifyThePrice();
        Assert.assertEquals(actualPrice, expectedPrice, "Wrong message display");

        //Click on the "Add to card" Button.
        computerPage.clickOnButton();

        //Verify the Message "The product has been added to your shopping cart" on theTop green Bar
        String expectedMessageDisplay = "The product has been added to your shopping cart";
        String actualMessageDisplay = computerPage.getTextMessageCart();
        Assert.assertEquals(actualMessageDisplay, expectedMessageDisplay, "Wrong message display");

        //After that close the bar by clicking on the cross button.
        computerPage.clickOnCrossButton();

        //Then MouseHover on "Shopping cart" and click on the "Go to cart" button.
        computerPage.mouseHoverAndClickOn();

        //Verify the message "Shopping cart"
        String expectedMessageCart = "Shopping cart";
        String actualMessageCart = computerPage.shoppingCartMessage();
        Assert.assertEquals(actualMessageCart, expectedMessageCart, "Wrong message display");

        //Change the Qty to "2" and Click on "Update shopping cart"
        computerPage.enterTheQuantity(2);

        computerPage.clickOnUpdateShoppingCart();

        //Verify the Total "2,950.00"
//        String expectedPriceTotal = "2950.00";
//        String actualPriceTotal = computerPage.verifyTotalPrice();
//        Assert.assertEquals(actualPriceTotal, expectedPriceTotal, "Wrong message display");

        //click on the checkbox “I agree with the terms of service”
        computerPage.clickOnBox();

        //Click on “Checkout”
        computerPage.clickOnFinalCheckOut();

        //Verify the Text “Welcome, Please Sign In!”
        String expectedWelcomeMessage = "Welcome, Please Sign In!";
        String actualWelcomeMessage = computerPage.getWelcomeSignIn();
        Assert.assertEquals(actualWelcomeMessage, expectedWelcomeMessage, "Wrong message display");

        //Click on the “Checkout as Guest” Tab
        computerPage.clickOnCheckOutGuest();

        //Enter the First name
        computerPage.enterFirstName("jennaa");

        //Enter the Last name
        computerPage.enterLastName("Patel");

        //Enter the email
        computerPage.enterEmail("jenaaaaPatel@gamil.com");

        //Select the Country “United Kingdom” using the select class
        computerPage.countryUsingSelectClass("United Kingdom");

        //Enter the city
        computerPage.enterCity("London");

        //Enter the Address1
        computerPage.enterAddress1("82 Epsom");

        //Enter the Zip/Postal code
        computerPage.enterZipCode("kt1 8pe");

        //Enter the Phone number
        computerPage.enterPhoneNumber("+447986738281");

        //Click on the “Continue” button
        computerPage.clickOnContinue();

        //Click on the “Continue” button
        computerPage.clickOnContinueOneMoreTime();

        //Click on the Radio Button “Next Day Air($0.00)”
        computerPage.clickOnNextDay();

        //Click on the “Continue” button
        computerPage.clickOnContinueAgain();

        //Select the Radio Button “Credit Card”
        computerPage.clickOnRadioButtonForCard();

        //Click on the “Continue” button
        computerPage.clickOnContinueAnotherTime();

        //Select “Master card” From the Select credit card dropdown using the Select class
        computerPage.selectMasterCard();

        //Enter the Cardholder's name
        computerPage.enterCardholderName("jennaa");

        //Enter the Card number
        computerPage.enterCardNumber("5283604144086333");

        //Select the Expiration date using the select class
        computerPage.selectDate();

        //Enter the code
        computerPage.enterCardCode("690");

        //Click on the “Continue” button
        computerPage.clickOnContinueTab();

        //Verify the “Payment Method” is “Credit Card”
        String expectedPaymentMessage = "Credit Card";
        String actualPaymentMessage = computerPage.getPaymentMethod();
        Assert.assertEquals(actualPaymentMessage, expectedPaymentMessage, "Wrong message display");

        //Verify “Shipping Method” is “Next Day Air”
        String expectedShippingMessage = "Next Day Air";
        String actualShippingMessage = computerPage.getShippingMethod();
        Assert.assertEquals(actualShippingMessage, expectedShippingMessage, "Wrong message display");


        //Click on the “Confirm” button
        computerPage.clickOnConfirm();

        //Verify the Text “Thank You”
        String expectedThankYouMessage = "Thank you";
        String actualThankYouMessage = computerPage.getThankYouText();
        Assert.assertEquals(actualThankYouMessage, expectedThankYouMessage, "Wrong message display");

        //Verify the message “Your order has been successfully processed!”
        String expectedProcessedMessage = "Your order has been successfully processed!";
        String actualProcessedMessage = computerPage.getSuccessfullyProcessedText();
        Assert.assertEquals(actualProcessedMessage, expectedProcessedMessage, "Wrong message display");


        //Click on the “Continue” button
        computerPage.clickOnFinalContinue();

        //Verify the text “Welcome to our Store”
        String expectedStoreMessage = "Welcome to our store";
        String actualStoreMessage = computerPage.getStoreText();
        Assert.assertEquals(actualStoreMessage, expectedStoreMessage, "Wrong message display");



    }


    }

