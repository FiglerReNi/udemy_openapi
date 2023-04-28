/*
 * OpenApi Course
 * Specification for OpenApi Course
 *
 * OpenAPI spec version: 1.0
 * Contact: example@example.hu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.BeerOrder;
import io.swagger.client.model.Customer;
import io.swagger.client.model.CustomerPagedList;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CustomersApi
 */
@Ignore
public class CustomersApiTest {

    private final CustomersApi api = new CustomersApi();

    /**
     * New Customer
     *
     * Create a new **Customer** Object
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createCustomerTest() throws Exception {
        Customer body = null;
        api.createCustomer(body);

        // TODO: test validations
    }
    /**
     * Place Order
     *
     * Place Order By Customer
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createOrderByCustomerTest() throws Exception {
        BeerOrder body = null;
        UUID customerId = null;
        api.createOrderByCustomer(body, customerId);

        // TODO: test validations
    }
    /**
     * Delete Customer by Id
     *
     * Delete **Customer** by Id
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteCustomerByIdTest() throws Exception {
        UUID customerId = null;
        api.deleteCustomerById(customerId);

        // TODO: test validations
    }
    /**
     * Customer by Id
     *
     * Get details of **Customer** by Id
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCustomerByIdTest() throws Exception {
        UUID customerId = null;
        Customer response = api.getCustomerById(customerId);

        // TODO: test validations
    }
    /**
     * List of Customers
     *
     * Get a list of **Customers** in the system
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getListOfCustomersTest() throws Exception {
        Integer pageNumber = null;
        Integer pageSize = null;
        CustomerPagedList response = api.getListOfCustomers(pageNumber, pageSize);

        // TODO: test validations
    }
    /**
     * Modify of Customer
     *
     * Modify **Customer** by Id
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void modifyCustomerByIdTest() throws Exception {
        Customer body = null;
        UUID customerId = null;
        api.modifyCustomerById(body, customerId);

        // TODO: test validations
    }
    /**
     * Modify of Customers
     *
     * Modify *all* **Customers** at the same time
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void modifyListOfCustomersTest() throws Exception {
        api.modifyListOfCustomers();

        // TODO: test validations
    }
}
