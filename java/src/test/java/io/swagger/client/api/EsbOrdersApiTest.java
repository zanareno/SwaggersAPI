package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.AccountsData;
import io.swagger.client.model.ChangeMsisdn;
import io.swagger.client.model.ContactsData;
import io.swagger.client.model.CustomersData;
import io.swagger.client.model.NewAccountRelationship;
import io.swagger.client.model.ProvideOrder;
import io.swagger.client.model.TerminateAdditionalService;
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
     * Update Msisdn
     *
     * Update Msisdn
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changeMsisdnTest() throws ApiException {
        ChangeMsisdn changeMsisdn = null;
        // api.changeMsisdn(changeMsisdn);

        // TODO: test validations
    }
    
    /**
     * Delete Additional Service
     *
     * Terminate an additional service associationed with a subscription. Does not support terminating the primary service. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAdditionalServiceTest() throws ApiException {
        TerminateAdditionalService deleteAdditionalService = null;
        // api.deleteAdditionalService(deleteAdditionalService);

        // TODO: test validations
    }
    
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
     * Creates new AccountRelationship. A new account to account relationship.
     *
     * A relationship is created on Cerillion for each element present in the submission.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newAccountRelationshipTest() throws ApiException {
        NewAccountRelationship newAccountRelationship = null;
        // api.newAccountRelationship(newAccountRelationship);

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
     * Creates new order. An order applies to a single account.
     *
     * A basket is created on Cerillion for each element present in the submission.
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
    
    /**
     * Terminate Additional Service
     *
     * Terminate an additional service associationed with a subscription. Does not support terminating the primary service. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void terminateAdditionalServiceTest() throws ApiException {
        TerminateAdditionalService terminateAdditionalService = null;
        // api.terminateAdditionalService(terminateAdditionalService);

        // TODO: test validations
    }
    
}
