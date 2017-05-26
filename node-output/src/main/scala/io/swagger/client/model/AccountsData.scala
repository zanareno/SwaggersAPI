/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime

case class AccountsData (
  customerIndex: String,
  clientCustomerUid: String,
  contactsName: NameSchema,
  phoneNumberHome: Option[String],
  phoneNumberBusiness: Option[String],
  phoneNumberFax: Option[String],
  phoneNumberMobile: Option[String],
  customerImportanceReason: Option[String],
  correspondenceAddress: Address,
  contactAssociation: Option[ContactAssociation]
) extends ApiModel


