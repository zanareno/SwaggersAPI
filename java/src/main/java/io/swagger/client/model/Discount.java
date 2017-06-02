package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;

/**
 * Discount
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-02T16:12:57.581Z")
public class Discount {
  @SerializedName("discountValue")
  private Double discountValue = null;

  @SerializedName("originalValue")
  private Double originalValue = null;

  @SerializedName("discountStartDate")
  private LocalDate discountStartDate = null;

  @SerializedName("discountEndDate")
  private LocalDate discountEndDate = null;

  public Discount discountValue(Double discountValue) {
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

  public Discount originalValue(Double originalValue) {
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

  public Discount discountStartDate(LocalDate discountStartDate) {
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

  public Discount discountEndDate(LocalDate discountEndDate) {
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
    Discount discount = (Discount) o;
    return Objects.equals(this.discountValue, discount.discountValue) &&
        Objects.equals(this.originalValue, discount.originalValue) &&
        Objects.equals(this.discountStartDate, discount.discountStartDate) &&
        Objects.equals(this.discountEndDate, discount.discountEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountValue, originalValue, discountStartDate, discountEndDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Discount {\n");
    
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

