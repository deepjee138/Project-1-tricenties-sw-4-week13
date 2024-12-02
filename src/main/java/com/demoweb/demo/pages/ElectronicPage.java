package com.demoweb.demo.pages;

import com.demoweb.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicPage extends Utility {
    By mouseHoverOnElectronicTab=By.xpath("//ul[@class='top-menu']//a[normalize-space()='Electronics']");
    By cellPhone = By.xpath("//div [@class = 'header-menu']/ul[1]/li[3]/ul/li[2]/a");

    By cellPhonesText = By.xpath("//h1[normalize-space()='Cell phones']");
    By smartPhoneLink = By.xpath("//a[contains(text(),'Smartphone')]");
    By smartphoneText = By.xpath("//h1[contains(text(),'Smartphone')]");
    By priceText = By.xpath("//span[contains(text(),'100.00')]");
    By changeQty = By.xpath("//input[@id='addtocart_43_EnteredQuantity']");
    By addToCart = By.xpath("//input[@id='add-to-cart-button-43']");

    By messageFoeVerifyText = By.xpath("//p[@class='content']");
    By crossButton = By.xpath("//span[@title='Close']");
    By mouseHoverClick = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart = By.xpath("//h1[normalize-space()='Shopping cart']");
    By changeQty2 = By.xpath("//td[@class='qty nobr']/input");
    By updateTheCart = By.xpath("//input[@name='updatecart']");
    By termsOfService = By.xpath("//input[@id='termsofservice']");
    By checkOutTab = By.id("checkout");
    By welcomeText = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By registerClick = By.xpath("//body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/input[2]");
    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By maleRadioButton = By.xpath("//input[@id='gender-male']");
    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By emailField = By.xpath("//input[@id='Email']");
    By passwordField = By.xpath("//input[@id='Password']");
    By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton = By.xpath("//input[@id='register-button']");
    By registrationText = By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueButton = By.xpath("//body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/input[1]");
    By shoppingText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By clickOnCheckBox = By.xpath("//input[@id='termsofservice']");
    By checkoutButton = By.xpath("//button[@id='checkout']");
    By countrySelect = By.id("BillingNewAddress_CountryId");
    By citySelect = By.id("BillingNewAddress_City");
    By addressSelect = By.id("BillingNewAddress_Address1");
    By zipCodeSelect = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberSelect = By.id("BillingNewAddress_PhoneNumber");
    By tabContinueButton = By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/input[1]");
    By continueButton2 = By.xpath("//input[@onclick='Shipping.save()']");
    By radioButton = By.id("shippingoption_2");
    By continueAgain = By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/input[1]");
    By creditCard = By.xpath("//input[@id='paymentmethod_2']");
    By continueAgain2 = By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/input[1]");
    By masterCard = By.id("CreditCardType");
    By cardholderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expirationDate = By.xpath("//select[@id='ExpireMonth']");
    By year=By.xpath("//select[@id='ExpireYear']");
    By enterCode = By.id("CardCode");
    By continueB = By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/input[1]");
    By paymentMethod = By.xpath("//li[@class='payment-method']");
    By shippingMethod = By.xpath("//li[@class='shipping-method']");
    By confirmButton = By.xpath("//input[@value='Confirm']");
    By thankYouText = By.xpath("//h1[normalize-space()='Thank you']");
    By processedMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueFinal = By.xpath("//input[@value='Continue']");
    By getWelcomeStoreText = By.xpath("//h2[normalize-space()='Welcome to our store']");
    By logOutLink = By.xpath("//a[normalize-space()='Log out']");

    public void mouseHoverOnElectronicTab(){
        mouseHoverToElement(mouseHoverOnElectronicTab);
    }
    public void mouseHoverOnCellPhone(){
        mouseHoverToElementAndClick(cellPhone);
    }

    public String verifyTheTextOfCellPhones(){
        return getTextFromElement(cellPhonesText);
    }
    public void clickOnProductNameSmartPhoneLink(){
        clickOnElement(smartPhoneLink);
    }
    public String verifyTextSmartPhone(){
        return getTextFromElement(smartphoneText);
    }
    public String verifyThePrice(){
        return  getTextFromElement(priceText);
    }
    public void changeTheQty(){
        driver.findElement(changeQty).clear();
    }
    public void changeTheQtyy(){
        sendTextToElement(changeQty,"2");
    }
    public void addToCartButton(){
        clickOnElement(addToCart);
    }
    public String verifyTheMessage(){
        return getTextFromElement(messageFoeVerifyText);
    }
    public void clickOnCrossButton(){
        clickOnElement(crossButton);
    }
    public void mouseHoveOnShoppingCartAndClick(){
        mouseHoverToElementAndClick(mouseHoverClick);
    }
    public String verifyTheShoppingCart(){
        return getTextFromElement(goToCart);
    }
    public void changeTheQuan(){
        driver.findElement(changeQty2).clear();
        sendTextToElement(changeQty2,"2");
    }
    public void clickOnUpdateShoppingCart(){
        clickOnElement(updateTheCart);
    }
    public void clickOnTheCheckbox(){
        clickOnElement(termsOfService);
    }
    public void clickOnCheckOut(){
        clickOnElement(checkOutTab);
    }
    public String verifyTheWelcomeText(){
        return getTextFromElement(welcomeText);
    }
    public void clickOnRegisterTab(){
        clickOnElement(registerClick);
    }
    public String verifyTheTextRegister(){
        return getTextFromElement(registerText);
    }
    public void selectOnMenButton(){
     clickOnElement(maleRadioButton);
    }
    public void enterName(){
        sendTextToElement(firstName,"jenny");
    }
    public void enterLastName(){
        sendTextToElement(lastName,"Patel");
    }
    public void enterEmail(){
        sendTextToElement(emailField,"Jeeaalii@gmail.com");
    }
    public void enterPassword(){
        sendTextToElement(passwordField,"Jenny2109");
    }
    public void enterConfirmPassword(){
        sendTextToElement(confirmPassword,"Jenny2109");
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String verifyTheMessageRegister(){
        return getTextFromElement(registrationText);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public String verifyTheShoppingCardText(){
        return getTextFromElement(shoppingText);
    }
    public void clickOnCheckBox(){
        clickOnElement(clickOnCheckBox);
    }
    public void clickOnCheckOutButton(){
       clickOnElement(checkoutButton);
    }
    public void selectCountryUnitedKing(){
        selectByVisibleTextFromDropDown(countrySelect,"United Kingdom");
    }
    public void enterCity(){
        sendTextToElement(citySelect,"Leicester");
    }
    public void enterAddress(){
        sendTextToElement(addressSelect,"Le99 7np");
    }
    public void enterZip(){
        sendTextToElement(zipCodeSelect,"03366");
    }
    public void enterPhoneNumber(){
        sendTextToElement(phoneNumberSelect,"7767555643");
    }
    public void clickOnContinueButton1(){
        clickOnElement(tabContinueButton);
    }
    public void clickOnContinueButton2(){
        clickOnElement(continueButton2);
    }
    public void clickOnRadioButton(){
        clickOnElement(radioButton);
    }
    public void clickOnContinueButton3(){
        clickOnElement(continueAgain);
    }
    public void selectOnRadioButtonCreditCard(){
        clickOnElement(creditCard);
    }
    public void clickOnContinue(){
        clickOnElement(continueAgain2);
    }
    public void selectTheMasterCard(){
        selectByVisibleTextFromDropDown(masterCard,"Master card");
    }
    public void enterTheCardHoldersName(){
        sendTextToElement(cardholderName,"jenny");
    }
    public void enterCardNumber(){
        sendTextToElement(cardNumber,"5561 0917 1184 1220");
    }
    public void selectExpirationDate(){
            sendTextToElement(expirationDate,"03");
            sendTextToElement(year,"2022");
    }
    public void enterTheCode(){
        sendTextToElement(enterCode,"365035");
    }
    public void clickOnContinueButton4(){
        clickOnElement(continueB);
    }
    public String verifyTheMethodOfPayment(){
        return getTextFromElement(paymentMethod);
    }
    public String verifyTheShoppingMethod(){
        return getTextFromElement(shippingMethod);
    }
    public void clickOnConfirmButton(){
        clickOnElement(confirmButton);
    }
    public String verifyTextThanYou(){
        return getTextFromElement(thankYouText);
    }
    public String verifyTheProcessMessage(){
        return getTextFromElement(processedMessage);
    }
    public void clickOnContinueButton6(){
        clickOnElement(continueFinal);
    }
    public String verifyTheWelComeStore(){
        return getTextFromElement(getWelcomeStoreText);
    }
    public void clickOnLoginLink(){
        clickOnElement(logOutLink);
    }
}