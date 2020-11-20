/*
 * Kadaster - BRK-Bevragen API
 * D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie. 
 *
 * The version of the OpenAPI document: 1.3.0
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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.HalLink;
import org.openapitools.client.model.HalLink2;

/**
 * PrivaatrechtelijkeBeperkingLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-20T11:20:18.957Z[Etc/UTC]")
public class PrivaatrechtelijkeBeperkingLinks {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private HalLink self;

  public static final String SERIALIZED_NAME_STUKKEN = "stukken";
  @SerializedName(SERIALIZED_NAME_STUKKEN)
  private List<HalLink2> stukken = null;

  public static final String SERIALIZED_NAME_IS_GEBASEERD_OP_STUKDEEL = "isGebaseerdOpStukdeel";
  @SerializedName(SERIALIZED_NAME_IS_GEBASEERD_OP_STUKDEEL)
  private HalLink2 isGebaseerdOpStukdeel;

  public static final String SERIALIZED_NAME_IS_VERMELD_IN_STUKDELEN = "isVermeldInStukdelen";
  @SerializedName(SERIALIZED_NAME_IS_VERMELD_IN_STUKDELEN)
  private List<HalLink2> isVermeldInStukdelen = null;


  public PrivaatrechtelijkeBeperkingLinks self(HalLink self) {
    
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


  public PrivaatrechtelijkeBeperkingLinks stukken(List<HalLink2> stukken) {
    
    this.stukken = stukken;
    return this;
  }

  public PrivaatrechtelijkeBeperkingLinks addStukkenItem(HalLink2 stukkenItem) {
    if (this.stukken == null) {
      this.stukken = new ArrayList<>();
    }
    this.stukken.add(stukkenItem);
    return this;
  }

   /**
   * Get stukken
   * @return stukken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HalLink2> getStukken() {
    return stukken;
  }


  public void setStukken(List<HalLink2> stukken) {
    this.stukken = stukken;
  }


  public PrivaatrechtelijkeBeperkingLinks isGebaseerdOpStukdeel(HalLink2 isGebaseerdOpStukdeel) {
    
    this.isGebaseerdOpStukdeel = isGebaseerdOpStukdeel;
    return this;
  }

   /**
   * Get isGebaseerdOpStukdeel
   * @return isGebaseerdOpStukdeel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HalLink2 getIsGebaseerdOpStukdeel() {
    return isGebaseerdOpStukdeel;
  }


  public void setIsGebaseerdOpStukdeel(HalLink2 isGebaseerdOpStukdeel) {
    this.isGebaseerdOpStukdeel = isGebaseerdOpStukdeel;
  }


  public PrivaatrechtelijkeBeperkingLinks isVermeldInStukdelen(List<HalLink2> isVermeldInStukdelen) {
    
    this.isVermeldInStukdelen = isVermeldInStukdelen;
    return this;
  }

  public PrivaatrechtelijkeBeperkingLinks addIsVermeldInStukdelenItem(HalLink2 isVermeldInStukdelenItem) {
    if (this.isVermeldInStukdelen == null) {
      this.isVermeldInStukdelen = new ArrayList<>();
    }
    this.isVermeldInStukdelen.add(isVermeldInStukdelenItem);
    return this;
  }

   /**
   * Get isVermeldInStukdelen
   * @return isVermeldInStukdelen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HalLink2> getIsVermeldInStukdelen() {
    return isVermeldInStukdelen;
  }


  public void setIsVermeldInStukdelen(List<HalLink2> isVermeldInStukdelen) {
    this.isVermeldInStukdelen = isVermeldInStukdelen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivaatrechtelijkeBeperkingLinks privaatrechtelijkeBeperkingLinks = (PrivaatrechtelijkeBeperkingLinks) o;
    return Objects.equals(this.self, privaatrechtelijkeBeperkingLinks.self) &&
        Objects.equals(this.stukken, privaatrechtelijkeBeperkingLinks.stukken) &&
        Objects.equals(this.isGebaseerdOpStukdeel, privaatrechtelijkeBeperkingLinks.isGebaseerdOpStukdeel) &&
        Objects.equals(this.isVermeldInStukdelen, privaatrechtelijkeBeperkingLinks.isVermeldInStukdelen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, stukken, isGebaseerdOpStukdeel, isVermeldInStukdelen);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivaatrechtelijkeBeperkingLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    stukken: ").append(toIndentedString(stukken)).append("\n");
    sb.append("    isGebaseerdOpStukdeel: ").append(toIndentedString(isGebaseerdOpStukdeel)).append("\n");
    sb.append("    isVermeldInStukdelen: ").append(toIndentedString(isVermeldInStukdelen)).append("\n");
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

