package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenPage extends Utility {
   private static final Logger log = LogManager.getLogger(WomenPage.class.getName());

   public WomenPage() {
      PageFactory.initElements(driver, this);
   }
   @FindBy(id = "sorter")
   WebElement selectByFilter;
   @FindBy(xpath = "//strong[@class='product name product-item-name']")
   List<WebElement> listLink;
   @FindBy(xpath = "//span[@class='price-wrapper ']//span")
   List<WebElement> productLink;


   public void selectFilterFromDropDownList() throws InterruptedException {
      Thread.sleep(500);
      selectByVisibleTextFromDropDown(selectByFilter,
              "Product Name");
      log.info("Select from : " + selectByFilter.toString());
   }
   public  void setSelectByFilterPrice() throws InterruptedException {
      Thread.sleep(500);
      selectByValueFromDropDown(selectByFilter,"price");
      log.info("Select from : " + selectByFilter.toString());
   }
   public List getList() throws InterruptedException {
      Thread.sleep(500);
      List<WebElement> list=getListOfElements(listLink);
      List<String> orignalList= new ArrayList<>();
      for(WebElement e:list){
         orignalList.add(e.getText());
      }
      log.info("Getting list : " + listLink.toString());
      return orignalList;
   }
   public boolean isSorted() throws InterruptedException {
      List<String> sortedList= getList();
      Collections.sort(sortedList);
      return getList().equals(sortedList);
   }
   public List getPriceList() throws InterruptedException {
      Thread.sleep(500);
      List<WebElement> products = getListOfElements(productLink);
      List<Double> originalProductsPrice = new ArrayList<>();
      for (WebElement e : products) {
         originalProductsPrice.add(Double.valueOf(e.getText().replace("$", "")));
      }
      log.info("Getting list : " + productLink.toString());
      return originalProductsPrice;
   }
   public boolean isSortedByPrice() throws InterruptedException {
      List<String> sortedList= getPriceList();
      Collections.sort(sortedList);
      return getPriceList().equals(sortedList);
   }
}