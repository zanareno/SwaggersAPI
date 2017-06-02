package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Charge;
import io.swagger.client.model.ContactAssociation;
import io.swagger.client.model.CustomAttribute;
import io.swagger.client.model.SubOrderItems;

/**
 * OrdersItem
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-02T16:35:38.145Z")
public class OrdersItem {
  @SerializedName("orderItemIndex")
  private String orderItemIndex = null;

  @SerializedName("relatedOrderItemIndex")
  private String relatedOrderItemIndex = null;

  @SerializedName("clientOrderItemId")
  private String clientOrderItemId = null;

  @SerializedName("productType")
  private String productType = null;

  @SerializedName("productCode")
  private String productCode = null;

  @SerializedName("creditProfileCode")
  private String creditProfileCode = null;

  @SerializedName("dispatchMethod")
  private String dispatchMethod = null;

  @SerializedName("msisdnType")
  private String msisdnType = null;

  @SerializedName("productAttribute")
  private CustomAttribute productAttribute = null;

  @SerializedName("contactAssiociation")
  private ContactAssociation contactAssiociation = null;

  @SerializedName("charge")
  private Charge charge = null;

  @SerializedName("subOrderItems")
  private SubOrderItems subOrderItems = null;

  public OrdersItem orderItemIndex(String orderItemIndex) {
    this.orderItemIndex = orderItemIndex;
    return this;
  }

   /**
   * An index uniquely identifying the order item within the submission. Only required if there is a need to link one order item to another. 
   * @return orderItemIndex
  **/
  @ApiModelProperty(value = "An index uniquely identifying the order item within the submission. Only required if there is a need to link one order item to another. ")
  public String getOrderItemIndex() {
    return orderItemIndex;
  }

  public void setOrderItemIndex(String orderItemIndex) {
    this.orderItemIndex = orderItemIndex;
  }

  public OrdersItem relatedOrderItemIndex(String relatedOrderItemIndex) {
    this.relatedOrderItemIndex = relatedOrderItemIndex;
    return this;
  }

   /**
   * The order item that this order item is related to. This mechanism is used to link an account bundle to a package. 
   * @return relatedOrderItemIndex
  **/
  @ApiModelProperty(value = "The order item that this order item is related to. This mechanism is used to link an account bundle to a package. ")
  public String getRelatedOrderItemIndex() {
    return relatedOrderItemIndex;
  }

  public void setRelatedOrderItemIndex(String relatedOrderItemIndex) {
    this.relatedOrderItemIndex = relatedOrderItemIndex;
  }

  public OrdersItem clientOrderItemId(String clientOrderItemId) {
    this.clientOrderItemId = clientOrderItemId;
    return this;
  }

   /**
   * Get clientOrderItemId
   * @return clientOrderItemId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getClientOrderItemId() {
    return clientOrderItemId;
  }

  public void setClientOrderItemId(String clientOrderItemId) {
    this.clientOrderItemId = clientOrderItemId;
  }

  public OrdersItem productType(String productType) {
    this.productType = productType;
    return this;
  }

   /**
   * The type of product being ordered. One of; -PACKAGE;A package such as Elite 500 -ACCOUNT;An Account level product not related to a Subscription. -SUBSCRIPTION;An account level product related to a subscription. Only one PACKAGE is permitted in an Order Item 
   * @return productType
  **/
  @ApiModelProperty(required = true, value = "The type of product being ordered. One of; -PACKAGE;A package such as Elite 500 -ACCOUNT;An Account level product not related to a Subscription. -SUBSCRIPTION;An account level product related to a subscription. Only one PACKAGE is permitted in an Order Item ")
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public OrdersItem productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

   /**
   * The unique code of the saleable product being ordered.
   * @return productCode
  **/
  @ApiModelProperty(required = true, value = "The unique code of the saleable product being ordered.")
  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public OrdersItem creditProfileCode(String creditProfileCode) {
    this.creditProfileCode = creditProfileCode;
    return this;
  }

   /**
   * The code of the credit profile assigned to the service. The credit profile record defines various credit limits and bar settings.   This setting is only required for the PACKAGE Product Type 
   * @return creditProfileCode
  **/
  @ApiModelProperty(value = "The code of the credit profile assigned to the service. The credit profile record defines various credit limits and bar settings.   This setting is only required for the PACKAGE Product Type ")
  public String getCreditProfileCode() {
    return creditProfileCode;
  }

  public void setCreditProfileCode(String creditProfileCode) {
    this.creditProfileCode = creditProfileCode;
  }

  public OrdersItem dispatchMethod(String dispatchMethod) {
    this.dispatchMethod = dispatchMethod;
    return this;
  }

   /**
   * The method of dispatch.Allowable values are= INTERNAL, EXTERNAL This field is used to choose the work order on Cerillion  This setting is only required the PACKAGE product type 
   * @return dispatchMethod
  **/
  @ApiModelProperty(value = "The method of dispatch.Allowable values are= INTERNAL, EXTERNAL This field is used to choose the work order on Cerillion  This setting is only required the PACKAGE product type ")
  public String getDispatchMethod() {
    return dispatchMethod;
  }

  public void setDispatchMethod(String dispatchMethod) {
    this.dispatchMethod = dispatchMethod;
  }

  public OrdersItem msisdnType(String msisdnType) {
    this.msisdnType = msisdnType;
    return this;
  }

   /**
   * The type of MSISDN to assign to the user’s services. One of STANDARD;  GOLDEN;  PORTED_IN; This setting is only required the PACKAGE product type 
   * @return msisdnType
  **/
  @ApiModelProperty(value = "The type of MSISDN to assign to the user’s services. One of STANDARD;  GOLDEN;  PORTED_IN; This setting is only required the PACKAGE product type ")
  public String getMsisdnType() {
    return msisdnType;
  }

  public void setMsisdnType(String msisdnType) {
    this.msisdnType = msisdnType;
  }

  public OrdersItem productAttribute(CustomAttribute productAttribute) {
    this.productAttribute = productAttribute;
    return this;
  }

   /**
   * Get productAttribute
   * @return productAttribute
  **/
  @ApiModelProperty(value = "")
  public CustomAttribute getProductAttribute() {
    return productAttribute;
  }

  public void setProductAttribute(CustomAttribute productAttribute) {
    this.productAttribute = productAttribute;
  }

  public OrdersItem contactAssiociation(ContactAssociation contactAssiociation) {
    this.contactAssiociation = contactAssiociation;
    return this;
  }

   /**
   * Get contactAssiociation
   * @return contactAssiociation
  **/
  @ApiModelProperty(value = "")
  public ContactAssociation getContactAssiociation() {
    return contactAssiociation;
  }

  public void setContactAssiociation(ContactAssociation contactAssiociation) {
    this.contactAssiociation = contactAssiociation;
  }

  public OrdersItem charge(Charge charge) {
    this.charge = charge;
    return this;
  }

   /**
   * Get charge
   * @return charge
  **/
  @ApiModelProperty(value = "")
  public Charge getCharge() {
    return charge;
  }

  public void setCharge(Charge charge) {
    this.charge = charge;
  }

  public OrdersItem subOrderItems(SubOrderItems subOrderItems) {
    this.subOrderItems = subOrderItems;
    return this;
  }

   /**
   * Get subOrderItems
   * @return subOrderItems
  **/
  @ApiModelProperty(value = "")
  public SubOrderItems getSubOrderItems() {
    return subOrderItems;
  }

  public void setSubOrderItems(SubOrderItems subOrderItems) {
    this.subOrderItems = subOrderItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdersItem ordersItem = (OrdersItem) o;
    return Objects.equals(this.orderItemIndex, ordersItem.orderItemIndex) &&
        Objects.equals(this.relatedOrderItemIndex, ordersItem.relatedOrderItemIndex) &&
        Objects.equals(this.clientOrderItemId, ordersItem.clientOrderItemId) &&
        Objects.equals(this.productType, ordersItem.productType) &&
        Objects.equals(this.productCode, ordersItem.productCode) &&
        Objects.equals(this.creditProfileCode, ordersItem.creditProfileCode) &&
        Objects.equals(this.dispatchMethod, ordersItem.dispatchMethod) &&
        Objects.equals(this.msisdnType, ordersItem.msisdnType) &&
        Objects.equals(this.productAttribute, ordersItem.productAttribute) &&
        Objects.equals(this.contactAssiociation, ordersItem.contactAssiociation) &&
        Objects.equals(this.charge, ordersItem.charge) &&
        Objects.equals(this.subOrderItems, ordersItem.subOrderItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItemIndex, relatedOrderItemIndex, clientOrderItemId, productType, productCode, creditProfileCode, dispatchMethod, msisdnType, productAttribute, contactAssiociation, charge, subOrderItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersItem {\n");
    
    sb.append("    orderItemIndex: ").append(toIndentedString(orderItemIndex)).append("\n");
    sb.append("    relatedOrderItemIndex: ").append(toIndentedString(relatedOrderItemIndex)).append("\n");
    sb.append("    clientOrderItemId: ").append(toIndentedString(clientOrderItemId)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    creditProfileCode: ").append(toIndentedString(creditProfileCode)).append("\n");
    sb.append("    dispatchMethod: ").append(toIndentedString(dispatchMethod)).append("\n");
    sb.append("    msisdnType: ").append(toIndentedString(msisdnType)).append("\n");
    sb.append("    productAttribute: ").append(toIndentedString(productAttribute)).append("\n");
    sb.append("    contactAssiociation: ").append(toIndentedString(contactAssiociation)).append("\n");
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
    sb.append("    subOrderItems: ").append(toIndentedString(subOrderItems)).append("\n");
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

