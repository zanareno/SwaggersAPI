package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;

/**
 * Charge
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-02T15:49:45.727Z")
public class Charge {
  @SerializedName("chargeCode")
  private String chargeCode = null;

  @SerializedName("discountValue")
  private Double discountValue = null;

  @SerializedName("originalValue")
  private Double originalValue = null;

  @SerializedName("discountStartDate")
  private LocalDate discountStartDate = null;

  @SerializedName("discountEndDate")
  private LocalDate discountEndDate = null;

  public Charge chargeCode(String chargeCode) {
    this.chargeCode = chargeCode;
    return this;
  }

   /**
   * Get chargeCode
   * @return chargeCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getChargeCode() {
    return chargeCode;
  }

  public void setChargeCode(String chargeCode) {
    this.chargeCode = chargeCode;
  }

  public Charge discountValue(Double discountValue) {
    this.discountValue = discountValue;
    return this;
  }

   /**
   * Get discountValue
   * @return discountValue
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getDiscountValue() {
    return discountValue;
  }

  public void setDiscountValue(Double discountValue) {
    this.discountValue = discountValue;
  }

  public Charge originalValue(Double originalValue) {
    this.originalValue = originalValue;
    return this;
  }

   /**
   * Get originalValue
   * @return originalValue
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getOriginalValue() {
    return originalValue;
  }

  public void setOriginalValue(Double originalValue) {
    this.originalValue = originalValue;
  }

  public Charge discountStartDate(LocalDate discountStartDate) {
    this.discountStartDate = discountStartDate;
    return this;
  }

   /**
   * Get discountStartDate
   * @return discountStartDate
  **/
  @ApiModelProperty(required = true, value = "")
  public LocalDate getDiscountStartDate() {
    return discountStartDate;
  }

  public void setDiscountStartDate(LocalDate discountStartDate) {
    this.discountStartDate = discountStartDate;
  }

  public Charge discountEndDate(LocalDate discountEndDate) {
    this.discountEndDate = discountEndDate;
    return this;
  }

   /**
   * Get discountEndDate
   * @return discountEndDate
  **/
  @ApiModelProperty(required = true, value = "")
  public LocalDate getDiscountEndDate() {
    return discountEndDate;
  }

  public void setDiscountEndDate(LocalDate discountEndDate) {
    this.discountEndDate = discountEndDate;
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
        Objects.equals(this.discountValue, charge.discountValue) &&
        Objects.equals(this.originalValue, charge.originalValue) &&
        Objects.equals(this.discountStartDate, charge.discountStartDate) &&
        Objects.equals(this.discountEndDate, charge.discountEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeCode, discountValue, originalValue, discountStartDate, discountEndDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Charge {\n");
    
    sb.append("    chargeCode: ").append(toIndentedString(chargeCode)).append("\n");
    sb.append("    discountValue: ").append(toIndentedString(discountValue)).append("\n");
    sb.append("    originalValue: ").append(toIndentedString(originalValue)).append("\n");
    sb.append("    discountStartDate: ").append(toIndentedString(discountStartDate)).append("\n");
    sb.append("    discountEndDate: ").append(toIndentedString(discountEndDate)).append("\n");
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

