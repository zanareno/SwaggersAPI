package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Discount;

/**
 * Repeating Node  0 to Many  A charge to be associated with the saleable product.
 */
@ApiModel(description = "Repeating Node  0 to Many  A charge to be associated with the saleable product.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-02T16:46:15.664Z")
public class Charge {
  @SerializedName("chargeCode")
  private String chargeCode = null;

  @SerializedName("discount")
  private Discount discount = null;

  public Charge chargeCode(String chargeCode) {
    this.chargeCode = chargeCode;
    return this;
  }

   /**
   * The charge code. These are defined on Cerillion.  For example One Off O1 = Non-recurring Charge O2 = NRC Zero Charge O3 = 12 Mnth Contract Subsidised Equipment Charge O4 = 18 Mnth Contract Subsidised Equipment Charge O5 = 24 Mnth Contract Subsidised Equipment Charge O6 = 36 Mnth Contract Subsidised Equipment Charge  Rental / Subscription R1 = Monthly Charge R2 = Zero Charge R3 = 12 Month Contract Charge R4 = 18 Month Contract Charge R5 = 24 Month Contract Charge R6 = 36 Month Contract Charge R7 = 12 Month Contract Subsidised Equipment Charge R8 = 18 Month Contract Subsidised Equipment Charge R9 = 24 Month Contract Subsidised Equipment Charge RA = 36 Month Contract Subsidised Equipment Charge RP = Package Charge (Zero) 
   * @return chargeCode
  **/
  @ApiModelProperty(required = true, value = "The charge code. These are defined on Cerillion.  For example One Off O1 = Non-recurring Charge O2 = NRC Zero Charge O3 = 12 Mnth Contract Subsidised Equipment Charge O4 = 18 Mnth Contract Subsidised Equipment Charge O5 = 24 Mnth Contract Subsidised Equipment Charge O6 = 36 Mnth Contract Subsidised Equipment Charge  Rental / Subscription R1 = Monthly Charge R2 = Zero Charge R3 = 12 Month Contract Charge R4 = 18 Month Contract Charge R5 = 24 Month Contract Charge R6 = 36 Month Contract Charge R7 = 12 Month Contract Subsidised Equipment Charge R8 = 18 Month Contract Subsidised Equipment Charge R9 = 24 Month Contract Subsidised Equipment Charge RA = 36 Month Contract Subsidised Equipment Charge RP = Package Charge (Zero) ")
  public String getChargeCode() {
    return chargeCode;
  }

  public void setChargeCode(String chargeCode) {
    this.chargeCode = chargeCode;
  }

  public Charge discount(Discount discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @ApiModelProperty(value = "")
  public Discount getDiscount() {
    return discount;
  }

  public void setDiscount(Discount discount) {
    this.discount = discount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Charge charge = (Charge) o;
    return Objects.equals(this.chargeCode, charge.chargeCode) &&
        Objects.equals(this.discount, charge.discount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeCode, discount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Charge {\n");
    
    sb.append("    chargeCode: ").append(toIndentedString(chargeCode)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
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

