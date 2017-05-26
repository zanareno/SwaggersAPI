package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.AccountsData;
import io.swagger.client.model.ContactsData;
import io.swagger.client.model.CustomAtribute;
import io.swagger.client.model.CustomersData;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EsbOrdersApi
 */
public class EsbOrdersApiTest {

    private final EsbOrdersApi api = new EsbOrdersApi();

    
    /**
     * adds an inventory item
     *
     * Adds an item to the system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changeMsisdnTest() throws ApiException {
        CustomAtribute inventoryItem = null;
        // api.changeMsisdn(inventoryItem);

        // TODO: test validations
    }
    
    /**
     * adds an inventory item
     *
     * Adds an item to the system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newAccountTest() throws ApiException {
        AccountsData inventoryItem = null;
        // api.newAccount(inventoryItem);

        // TODO: test validations
    }
    
    /**
     * adds an inventory item
     *
     * Adds an item to the system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newAccountRelationshipTest() throws ApiException {
        CustomAtribute inventoryItem = null;
        // api.newAccountRelationship(inventoryItem);

        // TODO: test validations
    }
    
    /**
     * Creates new contact
     *
     * A contact is created on Cerillion for each element present in the submission. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newContactTest() throws ApiException {
        ContactsData contactsData = null;
        // api.newContact(contactsData);

        // TODO: test validations
    }
    
    /**
     * Create new customer
     *
     * A customer is created on Cerillion for each element present in the submission. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newCustomerTest() throws ApiException {
        CustomersData customersData = null;
        // api.newCustomer(customersData);

        // TODO: test validations
    }
    
    /**
     * adds an inventory item
     *
     * Adds an item to the system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void provideOrderTest() throws ApiException {
        CustomAtribute inventoryItem = null;
        // api.provideOrder(inventoryItem);

        // TODO: test validations
    }
    
    /**
     * adds an inventory item
     *
     * Adds an item to the system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void terminateAditionalServiceTest() throws ApiException {
        CustomAtribute inventoryItem = null;
        // api.terminateAditionalService(inventoryItem);

        // TODO: test validations
    }
    
}
