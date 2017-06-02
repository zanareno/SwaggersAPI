package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.AccountsData;
import io.swagger.client.model.ContactsData;
import io.swagger.client.model.CustomersData;
import io.swagger.client.model.ProvideOrder;
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
     * Creates new account
     *
     * An account is created on Cerillion for each element present in the submission.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newAccountTest() throws ApiException {
        AccountsData accountData = null;
        // api.newAccount(accountData);

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
     * Provide an order
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void provideOrderTest() throws ApiException {
        ProvideOrder provideOrder = null;
        // api.provideOrder(provideOrder);

        // TODO: test validations
    }
    
}
