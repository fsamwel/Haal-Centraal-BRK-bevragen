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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Een aanduiding die aangeeft of het een natuurlijk dan wel niet-natuurlijk persoon betreft en of de persoon ingeschreven is in het BRP of Handelsregister (KvK), dan wel vastgelegd is bij het Kadaster. 
 */
@JsonAdapter(PersoonTypeEnum.Adapter.class)
public enum PersoonTypeEnum {
  
  INGESCHREVEN_NATUURLIJK_PERSOON("ingeschreven_natuurlijk_persoon"),
  
  KADASTER_NATUURLIJK_PERSOON("kadaster_natuurlijk_persoon"),
  
  INGESCHREVEN_NIET_NATUURLIJK_PERSOON("ingeschreven_niet_natuurlijk_persoon"),
  
  KADASTER_NIET_NATUURLIJK_PERSOON("kadaster_niet_natuurlijk_persoon");

  private String value;

  PersoonTypeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PersoonTypeEnum fromValue(String value) {
    for (PersoonTypeEnum b : PersoonTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PersoonTypeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final PersoonTypeEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PersoonTypeEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PersoonTypeEnum.fromValue(value);
    }
  }
}

