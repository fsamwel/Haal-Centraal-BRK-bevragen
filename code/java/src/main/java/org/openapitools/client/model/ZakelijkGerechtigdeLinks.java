/*
 * Kadaster - BRK-Bevragen API
 * D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie. 
 *
 * The version of the OpenAPI document: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.HalLink;

/**
 * ZakelijkGerechtigdeLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-22T09:44:54.145Z[Etc/UTC]")
public class ZakelijkGerechtigdeLinks {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private HalLink self;

  public static final String SERIALIZED_NAME_PERSOON = "persoon";
  @SerializedName(SERIALIZED_NAME_PERSOON)
  private HalLink persoon;

  public static final String SERIALIZED_NAME_BETROKKEN_PARTNER = "betrokkenPartner";
  @SerializedName(SERIALIZED_NAME_BETROKKEN_PARTNER)
  private HalLink betrokkenPartner;

  public static final String SERIALIZED_NAME_BETROKKEN_SAMENWERKINGSVERBAND = "betrokkenSamenwerkingsverband";
  @SerializedName(SERIALIZED_NAME_BETROKKEN_SAMENWERKINGSVERBAND)
  private HalLink betrokkenSamenwerkingsverband;

  public static final String SERIALIZED_NAME_BETROKKEN_GORZEN_EN_AANWASSEN = "betrokkenGorzenEnAanwassen";
  @SerializedName(SERIALIZED_NAME_BETROKKEN_GORZEN_EN_AANWASSEN)
  private HalLink betrokkenGorzenEnAanwassen;


  public ZakelijkGerechtigdeLinks self(HalLink self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HalLink getSelf() {
    return self;
  }


  public void setSelf(HalLink self) {
    this.self = self;
  }


  public ZakelijkGerechtigdeLinks persoon(HalLink persoon) {
    
    this.persoon = persoon;
    return this;
  }

   /**
   * Get persoon
   * @return persoon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HalLink getPersoon() {
    return persoon;
  }


  public void setPersoon(HalLink persoon) {
    this.persoon = persoon;
  }


  public ZakelijkGerechtigdeLinks betrokkenPartner(HalLink betrokkenPartner) {
    
    this.betrokkenPartner = betrokkenPartner;
    return this;
  }

   /**
   * Get betrokkenPartner
   * @return betrokkenPartner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HalLink getBetrokkenPartner() {
    return betrokkenPartner;
  }


  public void setBetrokkenPartner(HalLink betrokkenPartner) {
    this.betrokkenPartner = betrokkenPartner;
  }


  public ZakelijkGerechtigdeLinks betrokkenSamenwerkingsverband(HalLink betrokkenSamenwerkingsverband) {
    
    this.betrokkenSamenwerkingsverband = betrokkenSamenwerkingsverband;
    return this;
  }

   /**
   * Get betrokkenSamenwerkingsverband
   * @return betrokkenSamenwerkingsverband
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HalLink getBetrokkenSamenwerkingsverband() {
    return betrokkenSamenwerkingsverband;
  }


  public void setBetrokkenSamenwerkingsverband(HalLink betrokkenSamenwerkingsverband) {
    this.betrokkenSamenwerkingsverband = betrokkenSamenwerkingsverband;
  }


  public ZakelijkGerechtigdeLinks betrokkenGorzenEnAanwassen(HalLink betrokkenGorzenEnAanwassen) {
    
    this.betrokkenGorzenEnAanwassen = betrokkenGorzenEnAanwassen;
    return this;
  }

   /**
   * Get betrokkenGorzenEnAanwassen
   * @return betrokkenGorzenEnAanwassen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HalLink getBetrokkenGorzenEnAanwassen() {
    return betrokkenGorzenEnAanwassen;
  }


  public void setBetrokkenGorzenEnAanwassen(HalLink betrokkenGorzenEnAanwassen) {
    this.betrokkenGorzenEnAanwassen = betrokkenGorzenEnAanwassen;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZakelijkGerechtigdeLinks zakelijkGerechtigdeLinks = (ZakelijkGerechtigdeLinks) o;
    return Objects.equals(this.self, zakelijkGerechtigdeLinks.self) &&
        Objects.equals(this.persoon, zakelijkGerechtigdeLinks.persoon) &&
        Objects.equals(this.betrokkenPartner, zakelijkGerechtigdeLinks.betrokkenPartner) &&
        Objects.equals(this.betrokkenSamenwerkingsverband, zakelijkGerechtigdeLinks.betrokkenSamenwerkingsverband) &&
        Objects.equals(this.betrokkenGorzenEnAanwassen, zakelijkGerechtigdeLinks.betrokkenGorzenEnAanwassen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, persoon, betrokkenPartner, betrokkenSamenwerkingsverband, betrokkenGorzenEnAanwassen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZakelijkGerechtigdeLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    persoon: ").append(toIndentedString(persoon)).append("\n");
    sb.append("    betrokkenPartner: ").append(toIndentedString(betrokkenPartner)).append("\n");
    sb.append("    betrokkenSamenwerkingsverband: ").append(toIndentedString(betrokkenSamenwerkingsverband)).append("\n");
    sb.append("    betrokkenGorzenEnAanwassen: ").append(toIndentedString(betrokkenGorzenEnAanwassen)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

