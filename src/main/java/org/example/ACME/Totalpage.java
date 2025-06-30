package org.example.ACME;

import org.example.base.CommonToAllPage;
import org.openqa.selenium.By;

import static org.example.driver.DriverManager.getDriver;

public class Totalpage  extends CommonToAllPage {
    private By tb_row = By.xpath("//table[@class='table table-padded']/tbody/tr");

    public void totaltable() {
        int row = tablesize(tb_row);

        String first = "//table[@class='table table-padded']/tbody/tr[";
        String second = "]/td[";
        String third = "5]";

//        login.totaltable();
        double total_final = 0;
        for (int i = 1; i <= row; i++) {
            String final_ = first + i + second + third;
            String data = getDriver().findElement(By.xpath(final_)).getText();
            String total = data.replace("USD", "").trim();
            String cleaned = total.replace("+", "")
                    .replace(",", "")
                    .replaceAll("-\\s+", "-")
                    .trim();

            double value = Double.parseDouble(cleaned);

            total_final += value;

        }
        System.out.println(total_final);
    }
}
