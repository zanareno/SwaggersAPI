package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NameSchema
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-26T12:09:43.399Z")
public class NameSchema {
  @SerializedName("title")
  private String title = null;

  @SerializedName("foreNameInitials")
  private String foreNameInitials = null;

  @SerializedName("middleName")
  private String middleName = null;

  @SerializedName("surname")
  private String surname = null;

  @SerializedName("honours")
  private String honours = null;

  public NameSchema title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "Mr./Mrs./Miss", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public NameSchema foreNameInitials(String foreNameInitials) {
    this.foreNameInitials = foreNameInitials;
    return this;
  }

   /**
   * Get foreNameInitials
   * @return foreNameInitials
  **/
  @ApiModelProperty(example = "Evan", required = true, value = "")
  public String getForeNameInitials() {
    return foreNameInitials;
  }

  public void setForeNameInitials(String foreNameInitials) {
    this.foreNameInitials = foreNameInitials;
  }

  public NameSchema middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @ApiModelProperty(example = "Even", value = "")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public NameSchema surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * Get surname
   * @return surname
  **/
  @ApiModelProperty(example = "Almighty", required = true, value = "")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public NameSchema honours(String honours) {
    this.honours = honours;
    return this;
  }

   /**
   * Get honours
   * @return honours
  **/
  @ApiModelProperty(example = "MBE", value = "")
  public String getHonours() {
    return honours;
  }

  public void setHonours(String honours) {
    this.honours = honours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameSchema nameSchema = (NameSchema) o;
    return Objects.equals(this.title, nameSchema.title) &&
        Objects.equals(this.foreNameInitials, nameSchema.foreNameInitials) &&
        Objects.equals(this.middleName, nameSchema.middleName) &&
        Objects.equals(this.surname, nameSchema.surname) &&
        Objects.equals(this.honours, nameSchema.honours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, foreNameInitials, middleName, surname, honours);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameSchema {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    foreNameInitials: ").append(toIndentedString(foreNameInitials)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    honours: ").append(toIndentedString(honours)).append("\n");
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

