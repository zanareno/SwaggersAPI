package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TerminateAdditionalService
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-05T16:13:00.367Z")
public class TerminateAdditionalService {
  @SerializedName("msisdn")
  private String msisdn = null;

  public TerminateAdditionalService msisdn(String msisdn) {
    this.msisdn = msisdn;
    return this;
  }

   /**
   * The MSISDN of the additional service to be terminated. This must be an additional MSISDN. It does not support supplying the primary MSISDN to terminate the Subscription. 
   * @return msisdn
  **/
  @ApiModelProperty(example = "66123456789", required = true, value = "The MSISDN of the additional service to be terminated. This must be an additional MSISDN. It does not support supplying the primary MSISDN to terminate the Subscription. ")
  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminateAdditionalService terminateAdditionalService = (TerminateAdditionalService) o;
    return Objects.equals(this.msisdn, terminateAdditionalService.msisdn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msisdn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminateAdditionalService {\n");
    
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
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

