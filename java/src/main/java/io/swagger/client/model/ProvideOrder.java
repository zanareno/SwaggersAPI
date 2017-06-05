package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CustomAttribute;
import io.swagger.client.model.OrdersItem;
import org.joda.time.LocalDate;

/**
 * ProvideOrder
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-05T14:58:16.387Z")
public class ProvideOrder {
  @SerializedName("clientProvideOrderId")
  private String clientProvideOrderId = null;

  @SerializedName("accountIndex")
  private String accountIndex = null;

  @SerializedName("accountUid")
  private Integer accountUid = null;

  @SerializedName("accountCurrencyId")
  private Integer accountCurrencyId = null;

  @SerializedName("requestedStartDate")
  private LocalDate requestedStartDate = null;

  @SerializedName("orderAttribute")
  private CustomAttribute orderAttribute = null;

  @SerializedName("orderItem")
  private OrdersItem orderItem = null;

  public ProvideOrder clientProvideOrderId(String clientProvideOrderId) {
    this.clientProvideOrderId = clientProvideOrderId;
    return this;
  }

   /**
   * Client's unique identifier for the Provide Order 
   * @return clientProvideOrderId
  **/
  @ApiModelProperty(value = "Client's unique identifier for the Provide Order ")
  public String getClientProvideOrderId() {
    return clientProvideOrderId;
  }

  public void setClientProvideOrderId(String clientProvideOrderId) {
    this.clientProvideOrderId = clientProvideOrderId;
  }

  public ProvideOrder accountIndex(String accountIndex) {
    this.accountIndex = accountIndex;
    return this;
  }

   /**
   * The account against which the order is to be raised.  This can be defined in one of two ways 1) AccountIndex element to point to a new account in the submission. 2) Use the AccountUid to point to an exisiting account on Cerillion. 
   * @return accountIndex
  **/
  @ApiModelProperty(value = "The account against which the order is to be raised.  This can be defined in one of two ways 1) AccountIndex element to point to a new account in the submission. 2) Use the AccountUid to point to an exisiting account on Cerillion. ")
  public String getAccountIndex() {
    return accountIndex;
  }

  public void setAccountIndex(String accountIndex) {
    this.accountIndex = accountIndex;
  }

  public ProvideOrder accountUid(Integer accountUid) {
    this.accountUid = accountUid;
    return this;
  }

   /**
   * Get accountUid
   * @return accountUid
  **/
  @ApiModelProperty(value = "")
  public Integer getAccountUid() {
    return accountUid;
  }

  public void setAccountUid(Integer accountUid) {
    this.accountUid = accountUid;
  }

  public ProvideOrder accountCurrencyId(Integer accountCurrencyId) {
    this.accountCurrencyId = accountCurrencyId;
    return this;
  }

   /**
   * The Cerillion id of the currency that the override price, if specified is in. Only required if override values are being provided. The values supported by Cerillion are=  0  AUD;1 EUR;2  GBP;3  HKD;4  USD; Note, the full set of values can be obtained from Cerillion via the getCurrencyList function  
   * @return accountCurrencyId
  **/
  @ApiModelProperty(value = "The Cerillion id of the currency that the override price, if specified is in. Only required if override values are being provided. The values supported by Cerillion are=  0  AUD;1 EUR;2  GBP;3  HKD;4  USD; Note, the full set of values can be obtained from Cerillion via the getCurrencyList function  ")
  public Integer getAccountCurrencyId() {
    return accountCurrencyId;
  }

  public void setAccountCurrencyId(Integer accountCurrencyId) {
    this.accountCurrencyId = accountCurrencyId;
  }

  public ProvideOrder requestedStartDate(LocalDate requestedStartDate) {
    this.requestedStartDate = requestedStartDate;
    return this;
  }

   /**
   * The date requested by the customer for the ordered items to take effect.
   * @return requestedStartDate
  **/
  @ApiModelProperty(value = "The date requested by the customer for the ordered items to take effect.")
  public LocalDate getRequestedStartDate() {
    return requestedStartDate;
  }

  public void setRequestedStartDate(LocalDate requestedStartDate) {
    this.requestedStartDate = requestedStartDate;
  }

  public ProvideOrder orderAttribute(CustomAttribute orderAttribute) {
    this.orderAttribute = orderAttribute;
    return this;
  }

   /**
   * Get orderAttribute
   * @return orderAttribute
  **/
  @ApiModelProperty(required = true, value = "")
  public CustomAttribute getOrderAttribute() {
    return orderAttribute;
  }

  public void setOrderAttribute(CustomAttribute orderAttribute) {
    this.orderAttribute = orderAttribute;
  }

  public ProvideOrder orderItem(OrdersItem orderItem) {
    this.orderItem = orderItem;
    return this;
  }

   /**
   * Get orderItem
   * @return orderItem
  **/
  @ApiModelProperty(required = true, value = "")
  public OrdersItem getOrderItem() {
    return orderItem;
  }

  public void setOrderItem(OrdersItem orderItem) {
    this.orderItem = orderItem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvideOrder provideOrder = (ProvideOrder) o;
    return Objects.equals(this.clientProvideOrderId, provideOrder.clientProvideOrderId) &&
        Objects.equals(this.accountIndex, provideOrder.accountIndex) &&
        Objects.equals(this.accountUid, provideOrder.accountUid) &&
        Objects.equals(this.accountCurrencyId, provideOrder.accountCurrencyId) &&
        Objects.equals(this.requestedStartDate, provideOrder.requestedStartDate) &&
        Objects.equals(this.orderAttribute, provideOrder.orderAttribute) &&
        Objects.equals(this.orderItem, provideOrder.orderItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientProvideOrderId, accountIndex, accountUid, accountCurrencyId, requestedStartDate, orderAttribute, orderItem);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvideOrder {\n");
    
    sb.append("    clientProvideOrderId: ").append(toIndentedString(clientProvideOrderId)).append("\n");
    sb.append("    accountIndex: ").append(toIndentedString(accountIndex)).append("\n");
    sb.append("    accountUid: ").append(toIndentedString(accountUid)).append("\n");
    sb.append("    accountCurrencyId: ").append(toIndentedString(accountCurrencyId)).append("\n");
    sb.append("    requestedStartDate: ").append(toIndentedString(requestedStartDate)).append("\n");
    sb.append("    orderAttribute: ").append(toIndentedString(orderAttribute)).append("\n");
    sb.append("    orderItem: ").append(toIndentedString(orderItem)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

