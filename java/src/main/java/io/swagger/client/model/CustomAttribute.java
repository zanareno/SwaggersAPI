package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CustomAttribute
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-02T16:35:38.145Z")
public class CustomAttribute {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private Integer type = null;

  @SerializedName("value")
  private String value = null;

  public CustomAttribute name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "ACME Corporation", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomAttribute type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Allowable values are= 1 = string, 2 = integer, 3 = double, 4 = date, 5 = boolean, 6 = currency 
   * @return type
  **/
  @ApiModelProperty(example = "1", required = true, value = "Allowable values are= 1 = string, 2 = integer, 3 = double, 4 = date, 5 = boolean, 6 = currency ")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public CustomAttribute value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the attribute
   * @return value
  **/
  @ApiModelProperty(example = "408-867-5309", required = true, value = "The value of the attribute")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAttribute customAttribute = (CustomAttribute) o;
    return Objects.equals(this.name, customAttribute.name) &&
        Objects.equals(this.type, customAttribute.type) &&
        Objects.equals(this.value, customAttribute.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAttribute {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

