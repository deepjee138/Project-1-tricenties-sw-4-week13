package com.demoweb.demo.pages;

import com.demoweb.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ComputerPage extends Utility {


    By computersTab = By.xpath("//ul[@class='top-menu']//a[normalize-space()='Computers']");
    By desktopTab = By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']");
    By sortByPosition = By.name("products-orderby");
    By productNames = By.xpath("//body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]");
    By addToCartButton = By.xpath("//div[5]//div[1]//div[2]//div[3]//div[2]//input[1]");
    By buildComputerText = By.xpath("//h1[normalize-space()='Build your own computer']");
    By ghzIntelPentiumText = By.id("product_attribute_16_5_4");
    By gbText = By.id("product_attribute_16_6_5");
    By radioButton = By.xpath("//input[@id='product_attribute_16_3_6_19']");
    By osRadioButton = By.id("product_attribute_16_4_7_21");
    By checkBoxOne = By.id("product_attribute_16_8_8_22");
    By getCheckBoxTwo = By.id("product_attribute_16_8_8_24");
    By priceVerify = By.xpath("//span[contains(text(),'1200.00')]");
    By addToAnotherCardButton = By.id("add-to-cart-button-16");
    By verifyMessageAddedInCart = By.xpath("//p[@class='content']");
    By crossButton = By.xpath("//span[@title='Close']");
    By shoppingCartButton = By.xpath("//span[contains(text(),'Shopping cart')]");
    By messageShoppingCart = By.xpath("//h1[normalize-space()='Shopping cart']");
    By changeTheQuantity = By.xpath("//td[@class='qty nobr']/input");
    By updateShoppingCart = By.xpath("//input[@name='updatecart']");
    By verifyTotalPrice = By.xpath("//span[@class='product-subtotal']");
    By clickOnCheckBox = By.xpath("//input[@id='termsofservice']");
    By finalCheckoutButton = By.id("checkout");
    By welcomeSignText = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By guestCheckOut = By.xpath("//input[@value='Checkout as Guest']");
    By firstName = By.id("BillingNewAddress_FirstName");
    By lastName = By.id("BillingNewAddress_LastName");
    By emailField = By.id("BillingNewAddress_Email");
    By countrySelect = By.id("BillingNewAddress_CountryId");
    By citySelect = By.id("BillingNewAddress_City");
    By addressSelect = By.id("BillingNewAddress_Address1");
    By zipCodeSelect = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberSelect = By.id("BillingNewAddress_PhoneNumber");
    By continueButton = By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/input[1]");
    By continueButton2 = By.xpath("//input[@onclick='Shipping.save()']");
    By nextDayAir = By.id("shippingoption_1");
    By continueAgain = By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/input[1]");
    By creditCard = By.xpath("//input[@id='paymentmethod_2']");
    By continueAgain2 = By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/input[1]");
    By masterCard = By.id("CreditCardType");
    By cardholderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expirationDate = By.xpath("//select[@id='ExpireMonth']");
    By enterCode = By.id("CardCode");
    By continueB = By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/input[1]");
    By paymentMethod = By.xpath("//li[@class='payment-method']");
    By shippingMethod = By.xpath("//li[@class='shipping-method']");
    By confirmButton = By.xpath("//input[@value='Confirm']");
    By thankYouText = By.xpath("//h1[normalize-space()='Thank you']");
    By processedMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueFinal = By.xpath("//input[@value='Continue']");
    By ourStoreText = By.xpath("//h2[normalize-space()='Welcome to our store']");


    public void clickOnComputerTab() {
        clickOnElement(computersTab);
    }

    public void clickOnDesktop() {
        clickOnElement(desktopTab);
    }

    public void selectTheSortByPosition() {
        WebElement dropDown = driver.findElement(sortByPosition);
        Select select = new Select(dropDown);
        select.selectByVisibleText("Name: Z to A");
    }

    public List<WebElement> getProductNames() {
        return driver.findElements(productNames);
    }


    public boolean areProductsSortedDescendingOrder() {
        List<WebElement> products = getProductNames();
        for (int i = 0; i < products.size() - 1; i++) {
            String currentProduct = products.get(i).getText();
            String nextProduct = products.get(i + 1).getText();
            if (currentProduct.compareToIgnoreCase(nextProduct) < 0) {
                return false;
            }
        }
        return true;
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCartButton);
    }

    public String getTextBuildComputer() {
        return getTextFromElement(buildComputerText);
    }

    public void selectIntelPentiumDualCore() {
        WebElement intelPentium = driver.findElement(ghzIntelPentiumText);
        Select select = new Select(intelPentium);
        select.selectByVisibleText("2.2 GHz Intel Pentium Dual-Core E2200");
    }

    public void selectGBText() {
        WebElement gBNumber = driver.findElement(gbText);
        Select select = new Select(gBNumber);
        select.selectByVisibleText("8GB [+60.00]");

    }

    public void selectRadioButton() {
        clickOnElement(radioButton);
    }

    public void selectOSRadioButton() {
        clickOnElement(osRadioButton);
    }

    public void clickOnCheckBoxFirst() {
        clickOnElement(checkBoxOne);

    }

    public void clickOnCheckBoxSecond() {
        clickOnElement(getCheckBoxTwo);

    }

    public String verifyThePrice() {
        return getTextFromElement(priceVerify);

    }

    public void clickOnButton() {
        clickOnElement(addToAnotherCardButton);
    }

    public String getTextMessageCart() {
        return getTextFromElement(verifyMessageAddedInCart);
    }

    public void clickOnCrossButton() {
        clickOnElement(crossButton);
    }

    public void mouseHoverAndClickOn() {
        mouseHoverToElementAndClick(shoppingCartButton);
    }

    public String shoppingCartMessage() {
        return getTextFromElement(messageShoppingCart);
    }

    public void enterTheQuantity(int number) {
        sendTextToElement(changeTheQuantity, String.valueOf(number));

    }

    public void clickOnUpdateShoppingCart() {
        clickOnElement(updateShoppingCart);
    }

    public String verifyTotalPrice() {
        return getTextFromElement(verifyTotalPrice);
    }

    public void clickOnBox() {
        clickOnElement(clickOnCheckBox);
    }

    public void clickOnFinalCheckOut() {
        clickOnElement(finalCheckoutButton);
    }

    public String getWelcomeSignIn() {
        return getTextFromElement(welcomeSignText);
    }

    public void clickOnCheckOutGuest() {
        clickOnElement(guestCheckOut);
    }

    public void enterFirstName(String first) {
        sendTextToElement(firstName, first);

    }

    public void enterLastName(String last) {
        sendTextToElement(lastName, last);

    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);

    }

    public void countryUsingSelectClass(String country) {
        sendTextToElement(countrySelect, country);

    }

    public void enterCity(String city) {
        sendTextToElement(citySelect, city);

    }

    public void enterAddress1(String address) {
        sendTextToElement(addressSelect, address);

    }

    public void enterZipCode(String code) {
        sendTextToElement(zipCodeSelect, code);

    }

    public void enterPhoneNumber(String Phone) {
        sendTextToElement(phoneNumberSelect, Phone);

    }

    public void clickOnContinue() {
        clickOnElement(continueButton);
    }

    public void clickOnContinueOneMoreTime() {
        clickOnElement(continueButton2);
    }

    public void clickOnNextDay() {
        clickOnElement(nextDayAir);
    }

    public void clickOnContinueAgain() {
        clickOnElement(continueAgain);
    }

    public void clickOnRadioButtonForCard() {
        clickOnElement(creditCard);
    }

    public void clickOnContinueAnotherTime() {
        clickOnElement(continueAgain2);
    }

    public void selectMasterCard() {
        WebElement masterCardNumber = driver.findElement(masterCard);
        Select select = new Select(masterCardNumber);
        select.selectByVisibleText("Master card");
    }

    public void enterCardholderName(String name) {
        sendTextToElement(cardholderName, name);

    }

    public void enterCardNumber(String number) {
        sendTextToElement(cardNumber, number);

    }

    public void selectDate() {
        WebElement dateInCard = driver.findElement(expirationDate);
        Select select = new Select(dateInCard);
        select.selectByIndex(11);
    }

    public void enterCardCode(String code) {
        sendTextToElement(enterCode, code);

    }

    public void clickOnContinueTab() {
        clickOnElement(continueB);
    }

    public String getPaymentMethod() {
        return getTextFromElement(paymentMethod);
    }

    public String getShippingMethod() {
        return getTextFromElement(shippingMethod);
    }

    public void clickOnConfirm() {
        clickOnElement(confirmButton);
    }

    public String getThankYouText() {
        return getTextFromElement(thankYouText);
    }

    public String getSuccessfullyProcessedText() {
        return getTextFromElement(processedMessage);
    }

    public void clickOnFinalContinue() {
        clickOnElement(continueFinal);
    }


    public String getStoreText() {
        return getTextFromElement(ourStoreText);
    }

    public void selectTheSortByPosition1() {
        WebElement dropDown = driver.findElement(sortByPosition);
        Select select = new Select(dropDown);
        select.selectByVisibleText("Name: A to Z");


    }
}
