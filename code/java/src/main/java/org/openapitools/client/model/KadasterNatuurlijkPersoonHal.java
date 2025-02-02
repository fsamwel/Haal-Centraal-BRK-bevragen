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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.AdresUitgebreid;
import org.openapitools.client.model.Geboorte;
import org.openapitools.client.model.GeslachtEnum;
import org.openapitools.client.model.HeeftPartnerschap;
import org.openapitools.client.model.KadasterNatuurlijkPersoon;
import org.openapitools.client.model.KadasterNatuurlijkPersoonHalAllOf;
import org.openapitools.client.model.KadasterPersoonLinks;
import org.openapitools.client.model.NaamPersoon;
import org.openapitools.client.model.Overlijden;
import org.openapitools.client.model.Postadres;
import org.openapitools.client.model.Waardelijst;

/**
 * KadasterNatuurlijkPersoonHal
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-22T09:44:54.145Z[Etc/UTC]")
public class KadasterNatuurlijkPersoonHal {
  public static final String SERIALIZED_NAME_IDENTIFICATIE = "identificatie";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATIE)
  private String identificatie;

  public static final String SERIALIZED_NAME_OMSCHRIJVING = "omschrijving";
  @SerializedName(SERIALIZED_NAME_OMSCHRIJVING)
  private String omschrijving;

  public static final String SERIALIZED_NAME_DOMEIN = "domein";
  @SerializedName(SERIALIZED_NAME_DOMEIN)
  private String domein;

  public static final String SERIALIZED_NAME_INDICATIE_NIET_TOONBARE_DIAKRIET = "indicatieNietToonbareDiakriet";
  @SerializedName(SERIALIZED_NAME_INDICATIE_NIET_TOONBARE_DIAKRIET)
  private Boolean indicatieNietToonbareDiakriet;

  public static final String SERIALIZED_NAME_BESCHIKKINGSBEVOEGDHEID = "beschikkingsbevoegdheid";
  @SerializedName(SERIALIZED_NAME_BESCHIKKINGSBEVOEGDHEID)
  private Waardelijst beschikkingsbevoegdheid;

  public static final String SERIALIZED_NAME_WOONADRES = "woonadres";
  @SerializedName(SERIALIZED_NAME_WOONADRES)
  private AdresUitgebreid woonadres = null;

  public static final String SERIALIZED_NAME_POSTADRES = "postadres";
  @SerializedName(SERIALIZED_NAME_POSTADRES)
  private Postadres postadres = null;

  public static final String SERIALIZED_NAME_KADASTRAAL_ONROERENDE_ZAAK_IDENTIFICATIES = "kadastraalOnroerendeZaakIdentificaties";
  @SerializedName(SERIALIZED_NAME_KADASTRAAL_ONROERENDE_ZAAK_IDENTIFICATIES)
  private List<String> kadastraalOnroerendeZaakIdentificaties = null;

  public static final String SERIALIZED_NAME_GEHEIMHOUDING_PERSOONSGEGEVENS = "geheimhoudingPersoonsgegevens";
  @SerializedName(SERIALIZED_NAME_GEHEIMHOUDING_PERSOONSGEGEVENS)
  private Boolean geheimhoudingPersoonsgegevens;

  public static final String SERIALIZED_NAME_LAND_WAARNAAR_VERTROKKEN = "landWaarnaarVertrokken";
  @SerializedName(SERIALIZED_NAME_LAND_WAARNAAR_VERTROKKEN)
  private Waardelijst landWaarnaarVertrokken;

  public static final String SERIALIZED_NAME_GESLACHTSAANDUIDING = "geslachtsaanduiding";
  @SerializedName(SERIALIZED_NAME_GESLACHTSAANDUIDING)
  private GeslachtEnum geslachtsaanduiding;

  public static final String SERIALIZED_NAME_HEEFT_PARTNERSCHAP = "heeftPartnerschap";
  @SerializedName(SERIALIZED_NAME_HEEFT_PARTNERSCHAP)
  private List<HeeftPartnerschap> heeftPartnerschap = null;

  public static final String SERIALIZED_NAME_NAAM = "naam";
  @SerializedName(SERIALIZED_NAME_NAAM)
  private NaamPersoon naam = null;

  public static final String SERIALIZED_NAME_GEBOORTE = "geboorte";
  @SerializedName(SERIALIZED_NAME_GEBOORTE)
  private Geboorte geboorte;

  public static final String SERIALIZED_NAME_OVERLIJDEN = "overlijden";
  @SerializedName(SERIALIZED_NAME_OVERLIJDEN)
  private Overlijden overlijden;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private KadasterPersoonLinks links;


  public KadasterNatuurlijkPersoonHal identificatie(String identificatie) {
    
    this.identificatie = identificatie;
    return this;
  }

   /**
   * Unieke identificatie voor de persoon. Voor een Kadasterpersoon is dit de identificatie zoals die door het Kadaster is vastgesteld. Voor een ingeschreven natuurlijk persoon is dit het burgerservicenummer. Voor een ingeschreven niet-natuurlijk persoon is dit het RSIN. Of de waarde in identificatie een burgerservicenummer, een RSIN of een kadasterpersoonidentificatie is kan worden afgeleid uit het type persoon. 
   * @return identificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unieke identificatie voor de persoon. Voor een Kadasterpersoon is dit de identificatie zoals die door het Kadaster is vastgesteld. Voor een ingeschreven natuurlijk persoon is dit het burgerservicenummer. Voor een ingeschreven niet-natuurlijk persoon is dit het RSIN. Of de waarde in identificatie een burgerservicenummer, een RSIN of een kadasterpersoonidentificatie is kan worden afgeleid uit het type persoon. ")

  public String getIdentificatie() {
    return identificatie;
  }


  public void setIdentificatie(String identificatie) {
    this.identificatie = identificatie;
  }


  public KadasterNatuurlijkPersoonHal omschrijving(String omschrijving) {
    
    this.omschrijving = omschrijving;
    return this;
  }

   /**
   * Voor mensen leesbare, herkenbare en identificerende omschrijving van de persoon (met bijvoorbeeld de naam). 
   * @return omschrijving
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Voor mensen leesbare, herkenbare en identificerende omschrijving van de persoon (met bijvoorbeeld de naam). ")

  public String getOmschrijving() {
    return omschrijving;
  }


  public void setOmschrijving(String omschrijving) {
    this.omschrijving = omschrijving;
  }


  public KadasterNatuurlijkPersoonHal domein(String domein) {
    
    this.domein = domein;
    return this;
  }

   /**
   * Het domein waartoe de identificatie behoort. 
   * @return domein
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Het domein waartoe de identificatie behoort. ")

  public String getDomein() {
    return domein;
  }


  public void setDomein(String domein) {
    this.domein = domein;
  }


  public KadasterNatuurlijkPersoonHal indicatieNietToonbareDiakriet(Boolean indicatieNietToonbareDiakriet) {
    
    this.indicatieNietToonbareDiakriet = indicatieNietToonbareDiakriet;
    return this;
  }

   /**
   * Get indicatieNietToonbareDiakriet
   * @return indicatieNietToonbareDiakriet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIndicatieNietToonbareDiakriet() {
    return indicatieNietToonbareDiakriet;
  }


  public void setIndicatieNietToonbareDiakriet(Boolean indicatieNietToonbareDiakriet) {
    this.indicatieNietToonbareDiakriet = indicatieNietToonbareDiakriet;
  }


  public KadasterNatuurlijkPersoonHal beschikkingsbevoegdheid(Waardelijst beschikkingsbevoegdheid) {
    
    this.beschikkingsbevoegdheid = beschikkingsbevoegdheid;
    return this;
  }

   /**
   * Get beschikkingsbevoegdheid
   * @return beschikkingsbevoegdheid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardelijst getBeschikkingsbevoegdheid() {
    return beschikkingsbevoegdheid;
  }


  public void setBeschikkingsbevoegdheid(Waardelijst beschikkingsbevoegdheid) {
    this.beschikkingsbevoegdheid = beschikkingsbevoegdheid;
  }


  public KadasterNatuurlijkPersoonHal woonadres(AdresUitgebreid woonadres) {
    
    this.woonadres = woonadres;
    return this;
  }

   /**
   * Get woonadres
   * @return woonadres
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdresUitgebreid getWoonadres() {
    return woonadres;
  }


  public void setWoonadres(AdresUitgebreid woonadres) {
    this.woonadres = woonadres;
  }


  public KadasterNatuurlijkPersoonHal postadres(Postadres postadres) {
    
    this.postadres = postadres;
    return this;
  }

   /**
   * Get postadres
   * @return postadres
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Postadres getPostadres() {
    return postadres;
  }


  public void setPostadres(Postadres postadres) {
    this.postadres = postadres;
  }


  public KadasterNatuurlijkPersoonHal kadastraalOnroerendeZaakIdentificaties(List<String> kadastraalOnroerendeZaakIdentificaties) {
    
    this.kadastraalOnroerendeZaakIdentificaties = kadastraalOnroerendeZaakIdentificaties;
    return this;
  }

  public KadasterNatuurlijkPersoonHal addKadastraalOnroerendeZaakIdentificatiesItem(String kadastraalOnroerendeZaakIdentificatiesItem) {
    if (this.kadastraalOnroerendeZaakIdentificaties == null) {
      this.kadastraalOnroerendeZaakIdentificaties = new ArrayList<>();
    }
    this.kadastraalOnroerendeZaakIdentificaties.add(kadastraalOnroerendeZaakIdentificatiesItem);
    return this;
  }

   /**
   * Get kadastraalOnroerendeZaakIdentificaties
   * @return kadastraalOnroerendeZaakIdentificaties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getKadastraalOnroerendeZaakIdentificaties() {
    return kadastraalOnroerendeZaakIdentificaties;
  }


  public void setKadastraalOnroerendeZaakIdentificaties(List<String> kadastraalOnroerendeZaakIdentificaties) {
    this.kadastraalOnroerendeZaakIdentificaties = kadastraalOnroerendeZaakIdentificaties;
  }


  public KadasterNatuurlijkPersoonHal geheimhoudingPersoonsgegevens(Boolean geheimhoudingPersoonsgegevens) {
    
    this.geheimhoudingPersoonsgegevens = geheimhoudingPersoonsgegevens;
    return this;
  }

   /**
   * Aanduiding die aangeeft dat gegevens van een persoon wel of niet verstrekt mogen worden. 
   * @return geheimhoudingPersoonsgegevens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Aanduiding die aangeeft dat gegevens van een persoon wel of niet verstrekt mogen worden. ")

  public Boolean getGeheimhoudingPersoonsgegevens() {
    return geheimhoudingPersoonsgegevens;
  }


  public void setGeheimhoudingPersoonsgegevens(Boolean geheimhoudingPersoonsgegevens) {
    this.geheimhoudingPersoonsgegevens = geheimhoudingPersoonsgegevens;
  }


  public KadasterNatuurlijkPersoonHal landWaarnaarVertrokken(Waardelijst landWaarnaarVertrokken) {
    
    this.landWaarnaarVertrokken = landWaarnaarVertrokken;
    return this;
  }

   /**
   * Get landWaarnaarVertrokken
   * @return landWaarnaarVertrokken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardelijst getLandWaarnaarVertrokken() {
    return landWaarnaarVertrokken;
  }


  public void setLandWaarnaarVertrokken(Waardelijst landWaarnaarVertrokken) {
    this.landWaarnaarVertrokken = landWaarnaarVertrokken;
  }


  public KadasterNatuurlijkPersoonHal geslachtsaanduiding(GeslachtEnum geslachtsaanduiding) {
    
    this.geslachtsaanduiding = geslachtsaanduiding;
    return this;
  }

   /**
   * Get geslachtsaanduiding
   * @return geslachtsaanduiding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GeslachtEnum getGeslachtsaanduiding() {
    return geslachtsaanduiding;
  }


  public void setGeslachtsaanduiding(GeslachtEnum geslachtsaanduiding) {
    this.geslachtsaanduiding = geslachtsaanduiding;
  }


  public KadasterNatuurlijkPersoonHal heeftPartnerschap(List<HeeftPartnerschap> heeftPartnerschap) {
    
    this.heeftPartnerschap = heeftPartnerschap;
    return this;
  }

  public KadasterNatuurlijkPersoonHal addHeeftPartnerschapItem(HeeftPartnerschap heeftPartnerschapItem) {
    if (this.heeftPartnerschap == null) {
      this.heeftPartnerschap = new ArrayList<>();
    }
    this.heeftPartnerschap.add(heeftPartnerschapItem);
    return this;
  }

   /**
   * Get heeftPartnerschap
   * @return heeftPartnerschap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HeeftPartnerschap> getHeeftPartnerschap() {
    return heeftPartnerschap;
  }


  public void setHeeftPartnerschap(List<HeeftPartnerschap> heeftPartnerschap) {
    this.heeftPartnerschap = heeftPartnerschap;
  }


  public KadasterNatuurlijkPersoonHal naam(NaamPersoon naam) {
    
    this.naam = naam;
    return this;
  }

   /**
   * Get naam
   * @return naam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NaamPersoon getNaam() {
    return naam;
  }


  public void setNaam(NaamPersoon naam) {
    this.naam = naam;
  }


  public KadasterNatuurlijkPersoonHal geboorte(Geboorte geboorte) {
    
    this.geboorte = geboorte;
    return this;
  }

   /**
   * Get geboorte
   * @return geboorte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Geboorte getGeboorte() {
    return geboorte;
  }


  public void setGeboorte(Geboorte geboorte) {
    this.geboorte = geboorte;
  }


  public KadasterNatuurlijkPersoonHal overlijden(Overlijden overlijden) {
    
    this.overlijden = overlijden;
    return this;
  }

   /**
   * Get overlijden
   * @return overlijden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Overlijden getOverlijden() {
    return overlijden;
  }


  public void setOverlijden(Overlijden overlijden) {
    this.overlijden = overlijden;
  }


  public KadasterNatuurlijkPersoonHal links(KadasterPersoonLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KadasterPersoonLinks getLinks() {
    return links;
  }


  public void setLinks(KadasterPersoonLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KadasterNatuurlijkPersoonHal kadasterNatuurlijkPersoonHal = (KadasterNatuurlijkPersoonHal) o;
    return Objects.equals(this.identificatie, kadasterNatuurlijkPersoonHal.identificatie) &&
        Objects.equals(this.omschrijving, kadasterNatuurlijkPersoonHal.omschrijving) &&
        Objects.equals(this.domein, kadasterNatuurlijkPersoonHal.domein) &&
        Objects.equals(this.indicatieNietToonbareDiakriet, kadasterNatuurlijkPersoonHal.indicatieNietToonbareDiakriet) &&
        Objects.equals(this.beschikkingsbevoegdheid, kadasterNatuurlijkPersoonHal.beschikkingsbevoegdheid) &&
        Objects.equals(this.woonadres, kadasterNatuurlijkPersoonHal.woonadres) &&
        Objects.equals(this.postadres, kadasterNatuurlijkPersoonHal.postadres) &&
        Objects.equals(this.kadastraalOnroerendeZaakIdentificaties, kadasterNatuurlijkPersoonHal.kadastraalOnroerendeZaakIdentificaties) &&
        Objects.equals(this.geheimhoudingPersoonsgegevens, kadasterNatuurlijkPersoonHal.geheimhoudingPersoonsgegevens) &&
        Objects.equals(this.landWaarnaarVertrokken, kadasterNatuurlijkPersoonHal.landWaarnaarVertrokken) &&
        Objects.equals(this.geslachtsaanduiding, kadasterNatuurlijkPersoonHal.geslachtsaanduiding) &&
        Objects.equals(this.heeftPartnerschap, kadasterNatuurlijkPersoonHal.heeftPartnerschap) &&
        Objects.equals(this.naam, kadasterNatuurlijkPersoonHal.naam) &&
        Objects.equals(this.geboorte, kadasterNatuurlijkPersoonHal.geboorte) &&
        Objects.equals(this.overlijden, kadasterNatuurlijkPersoonHal.overlijden) &&
        Objects.equals(this.links, kadasterNatuurlijkPersoonHal.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificatie, omschrijving, domein, indicatieNietToonbareDiakriet, beschikkingsbevoegdheid, woonadres, postadres, kadastraalOnroerendeZaakIdentificaties, geheimhoudingPersoonsgegevens, landWaarnaarVertrokken, geslachtsaanduiding, heeftPartnerschap, naam, geboorte, overlijden, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KadasterNatuurlijkPersoonHal {\n");
    sb.append("    identificatie: ").append(toIndentedString(identificatie)).append("\n");
    sb.append("    omschrijving: ").append(toIndentedString(omschrijving)).append("\n");
    sb.append("    domein: ").append(toIndentedString(domein)).append("\n");
    sb.append("    indicatieNietToonbareDiakriet: ").append(toIndentedString(indicatieNietToonbareDiakriet)).append("\n");
    sb.append("    beschikkingsbevoegdheid: ").append(toIndentedString(beschikkingsbevoegdheid)).append("\n");
    sb.append("    woonadres: ").append(toIndentedString(woonadres)).append("\n");
    sb.append("    postadres: ").append(toIndentedString(postadres)).append("\n");
    sb.append("    kadastraalOnroerendeZaakIdentificaties: ").append(toIndentedString(kadastraalOnroerendeZaakIdentificaties)).append("\n");
    sb.append("    geheimhoudingPersoonsgegevens: ").append(toIndentedString(geheimhoudingPersoonsgegevens)).append("\n");
    sb.append("    landWaarnaarVertrokken: ").append(toIndentedString(landWaarnaarVertrokken)).append("\n");
    sb.append("    geslachtsaanduiding: ").append(toIndentedString(geslachtsaanduiding)).append("\n");
    sb.append("    heeftPartnerschap: ").append(toIndentedString(heeftPartnerschap)).append("\n");
    sb.append("    naam: ").append(toIndentedString(naam)).append("\n");
    sb.append("    geboorte: ").append(toIndentedString(geboorte)).append("\n");
    sb.append("    overlijden: ").append(toIndentedString(overlijden)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

