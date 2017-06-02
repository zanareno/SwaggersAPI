package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CustomAtribute;

/**
 * ProvideOrder
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-02T14:53:07.373Z")
public class ProvideOrder {
  @SerializedName("orderAttribute")
  private CustomAtribute orderAttribute = null;

  public ProvideOrder orderAttribute(CustomAtribute orderAttribute) {
    this.orderAttribute = orderAttribute;
    return this;
  }

   /**
   * Get orderAttribute
   * @return orderAttribute
  **/
  @ApiModelProperty(required = true, value = "")
  public CustomAtribute getOrderAttribute() {
    return orderAttribute;
  }

  public void setOrderAttribute(CustomAtribute orderAttribute) {
    this.orderAttribute = orderAttribute;
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
    return Objects.equals(this.orderAttribute, provideOrder.orderAttribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderAttribute);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvideOrder {\n");
    
    sb.append("    orderAttribute: ").append(toIndentedString(orderAttribute)).append("\n");
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

