package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        Product apple = new Product("Apple");

        Item item1 = new Item(new BigDecimal(2.0), 6,new BigDecimal(12.0));
        item1.setProduct(apple);
        apple.getItems().add(item1);


        Invoice invoice = new Invoice("FV 002/08/2020");
        item1.setInvoice(invoice);

        invoice.getItems().add(item1);


        invoiceDao.save(invoice);
    }
}
