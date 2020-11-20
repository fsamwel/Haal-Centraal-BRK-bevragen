# coding: utf-8

"""
    Kadaster - BRK-Bevragen API

    D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie.   # noqa: E501

    The version of the OpenAPI document: 1.3.0
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from openapi_client.configuration import Configuration


class KadasterNatuurlijkPersoon(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'identificatie': 'str',
        'omschrijving': 'str',
        'domein': 'str',
        'indicatie_niet_toonbare_diakriet': 'bool',
        'beschikkingsbevoegdheid': 'Waardelijst',
        'woonadres': 'AdresUitgebreid',
        'postadres': 'Postadres',
        'kadastraal_onroerende_zaak_identificaties': 'list[str]',
        'geheimhouding_persoonsgegevens': 'bool',
        'land_waarnaar_vertrokken': 'Waardelijst',
        'geslachtsaanduiding': 'GeslachtEnum',
        'heeft_partnerschap': 'list[HeeftPartnerschap]',
        'naam': 'NaamPersoon',
        'geboorte': 'Geboorte',
        'overlijden': 'Overlijden'
    }

    attribute_map = {
        'identificatie': 'identificatie',
        'omschrijving': 'omschrijving',
        'domein': 'domein',
        'indicatie_niet_toonbare_diakriet': 'indicatieNietToonbareDiakriet',
        'beschikkingsbevoegdheid': 'beschikkingsbevoegdheid',
        'woonadres': 'woonadres',
        'postadres': 'postadres',
        'kadastraal_onroerende_zaak_identificaties': 'kadastraalOnroerendeZaakIdentificaties',
        'geheimhouding_persoonsgegevens': 'geheimhoudingPersoonsgegevens',
        'land_waarnaar_vertrokken': 'landWaarnaarVertrokken',
        'geslachtsaanduiding': 'geslachtsaanduiding',
        'heeft_partnerschap': 'heeftPartnerschap',
        'naam': 'naam',
        'geboorte': 'geboorte',
        'overlijden': 'overlijden'
    }

    def __init__(self, identificatie=None, omschrijving=None, domein=None, indicatie_niet_toonbare_diakriet=None, beschikkingsbevoegdheid=None, woonadres=None, postadres=None, kadastraal_onroerende_zaak_identificaties=None, geheimhouding_persoonsgegevens=None, land_waarnaar_vertrokken=None, geslachtsaanduiding=None, heeft_partnerschap=None, naam=None, geboorte=None, overlijden=None, local_vars_configuration=None):  # noqa: E501
        """KadasterNatuurlijkPersoon - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._identificatie = None
        self._omschrijving = None
        self._domein = None
        self._indicatie_niet_toonbare_diakriet = None
        self._beschikkingsbevoegdheid = None
        self._woonadres = None
        self._postadres = None
        self._kadastraal_onroerende_zaak_identificaties = None
        self._geheimhouding_persoonsgegevens = None
        self._land_waarnaar_vertrokken = None
        self._geslachtsaanduiding = None
        self._heeft_partnerschap = None
        self._naam = None
        self._geboorte = None
        self._overlijden = None
        self.discriminator = None

        if identificatie is not None:
            self.identificatie = identificatie
        if omschrijving is not None:
            self.omschrijving = omschrijving
        if domein is not None:
            self.domein = domein
        if indicatie_niet_toonbare_diakriet is not None:
            self.indicatie_niet_toonbare_diakriet = indicatie_niet_toonbare_diakriet
        if beschikkingsbevoegdheid is not None:
            self.beschikkingsbevoegdheid = beschikkingsbevoegdheid
        if woonadres is not None:
            self.woonadres = woonadres
        if postadres is not None:
            self.postadres = postadres
        if kadastraal_onroerende_zaak_identificaties is not None:
            self.kadastraal_onroerende_zaak_identificaties = kadastraal_onroerende_zaak_identificaties
        if geheimhouding_persoonsgegevens is not None:
            self.geheimhouding_persoonsgegevens = geheimhouding_persoonsgegevens
        if land_waarnaar_vertrokken is not None:
            self.land_waarnaar_vertrokken = land_waarnaar_vertrokken
        if geslachtsaanduiding is not None:
            self.geslachtsaanduiding = geslachtsaanduiding
        if heeft_partnerschap is not None:
            self.heeft_partnerschap = heeft_partnerschap
        if naam is not None:
            self.naam = naam
        if geboorte is not None:
            self.geboorte = geboorte
        if overlijden is not None:
            self.overlijden = overlijden

    @property
    def identificatie(self):
        """Gets the identificatie of this KadasterNatuurlijkPersoon.  # noqa: E501

        Unieke identificatie voor de persoon. Voor een Kadasterpersoon is dit de identificatie zoals die door het Kadaster is vastgesteld. Voor een ingeschreven natuurlijk persoon is dit het burgerservicenummer. Voor een ingeschreven niet-natuurlijk persoon is dit het RSIN. Of de waarde in identificatie een burgerservicenummer, een RSIN of een kadasterpersoonidentificatie is kan worden afgeleid uit het type persoon.   # noqa: E501

        :return: The identificatie of this KadasterNatuurlijkPersoon.  # noqa: E501
        :rtype: str
        """
        return self._identificatie

    @identificatie.setter
    def identificatie(self, identificatie):
        """Sets the identificatie of this KadasterNatuurlijkPersoon.

        Unieke identificatie voor de persoon. Voor een Kadasterpersoon is dit de identificatie zoals die door het Kadaster is vastgesteld. Voor een ingeschreven natuurlijk persoon is dit het burgerservicenummer. Voor een ingeschreven niet-natuurlijk persoon is dit het RSIN. Of de waarde in identificatie een burgerservicenummer, een RSIN of een kadasterpersoonidentificatie is kan worden afgeleid uit het type persoon.   # noqa: E501

        :param identificatie: The identificatie of this KadasterNatuurlijkPersoon.  # noqa: E501
        :type: str
        """

        self._identificatie = identificatie

    @property
    def omschrijving(self):
        """Gets the omschrijving of this KadasterNatuurlijkPersoon.  # noqa: E501

        Voor mensen leesbare, herkenbare en identificerende omschrijving van de persoon (met bijvoorbeeld de naam).   # noqa: E501

        :return: The omschrijving of this KadasterNatuurlijkPersoon.  # noqa: E501
        :rtype: str
        """
        return self._omschrijving

    @omschrijving.setter
    def omschrijving(self, omschrijving):
        """Sets the omschrijving of this KadasterNatuurlijkPersoon.

        Voor mensen leesbare, herkenbare en identificerende omschrijving van de persoon (met bijvoorbeeld de naam).   # noqa: E501

        :param omschrijving: The omschrijving of this KadasterNatuurlijkPersoon.  # noqa: E501
        :type: str
        """

        self._omschrijving = omschrijving

    @property
    def domein(self):
        """Gets the domein of this KadasterNatuurlijkPersoon.  # noqa: E501

        Het domein waartoe de identificatie behoort.   # noqa: E501

        :return: The domein of this KadasterNatuurlijkPersoon.  # noqa: E501
        :rtype: str
        """
        return self._domein

    @domein.setter
    def domein(self, domein):
        """Sets the domein of this KadasterNatuurlijkPersoon.

        Het domein waartoe de identificatie behoort.   # noqa: E501

        :param domein: The domein of this KadasterNatuurlijkPersoon.  # noqa: E501
        :type: str
        """

        self._domein = domein

    @property
    def indicatie_niet_toonbare_diakriet(self):
        """Gets the indicatie_niet_toonbare_diakriet of this KadasterNatuurlijkPersoon.  # noqa: E501


        :return: The indicatie_niet_toonbare_diakriet of this KadasterNatuurlijkPersoon.  # noqa: E501
        :rtype: bool
        """
        return self._indicatie_niet_toonbare_diakriet

    @indicatie_niet_toonbare_diakriet.setter
    def indicatie_niet_toonbare_diakriet(self, indicatie_niet_toonbare_diakriet):
        """Sets the indicatie_niet_toonbare_diakriet of this KadasterNatuurlijkPersoon.


        :param indicatie_niet_toonbare_diakriet: The indicatie_niet_toonbare_diakriet of this KadasterNatuurlijkPersoon.  # noqa: E501
        :type: bool
        """

        self._indicatie_niet_toonbare_diakriet = indicatie_niet_toonbare_diakriet

    @property
    def beschikkingsbevoegdheid(self):
        """Gets the beschikkingsbevoegdheid of this KadasterNatuurlijkPersoon.  # noqa: E501


        :return: The beschikkingsbevoegdheid of this KadasterNatuurlijkPersoon.  # noqa: E501
        :rtype: Waardelijst
        """
        return self._beschikkingsbevoegdheid

    @beschikkingsbevoegdheid.setter
    def beschikkingsbevoegdheid(self, beschikkingsbevoegdheid):
        """Sets the beschikkingsbevoegdheid of this KadasterNatuurlijkPersoon.


        :param beschikkingsbevoegdheid: The beschikkingsbevoegdheid of this KadasterNatuurlijkPersoon.  # noqa: E501
        :type: Waardelijst
        """

        self._beschikkingsbevoegdheid = beschikkingsbevoegdheid

    @property
    def woonadres(self):
        """Gets the woonadres of this KadasterNatuurlijkPersoon.  # noqa: E501


        :return: The woonadres of this KadasterNatuurlijkPersoon.  # noqa: E501
        :rtype: AdresUitgebreid
        """
        return self._woonadres

    @woonadres.setter
    def woonadres(self, woonadres):
        """Sets the woonadres of this KadasterNatuurlijkPersoon.


        :param woonadres: The woonadres of this KadasterNatuurlijkPersoon.  # noqa: E501
        :type: AdresUitgebreid
        """

        self._woonadres = woonadres

    @property
    def postadres(self):
        """Gets the postadres of this KadasterNatuurlijkPersoon.  # noqa: E501


        :return: The postadres of this KadasterNatuurlijkPersoon.  # noqa: E501
        :rtype: Postadres
        """
        return self._postadres

    @postadres.setter
    def postadres(self, postadres):
        """Sets the postadres of this KadasterNatuurlijkPersoon.


        :param postadres: The postadres of this KadasterNatuurlijkPersoon.  # noqa: E501
        :type: Postadres
        """

        self._postadres = postadres

    @property
    def kadastraal_onroerende_zaak_identificaties(self):
        """Gets the kadastraal_onroerende_zaak_identificaties of this KadasterNatuurlijkPersoon.  # noqa: E501


        :return: The kadastraal_onroerende_zaak_identificaties of this KadasterNatuurlijkPersoon.  # noqa: E501
        :rtype: list[str]
        """
        return self._kadastraal_onroerende_zaak_identificaties

    @kadastraal_onroerende_zaak_identificaties.setter
    def kadastraal_onroerende_zaak_identificaties(self, kadastraal_onroerende_zaak_identificaties):
        """Sets the kadastraal_onroerende_zaak_identificaties of this KadasterNatuurlijkPersoon.


        :param kadastraal_onroerende_zaak_identificaties: The kadastraal_onroerende_zaak_identificaties of this KadasterNatuurlijkPersoon.  # noqa: E501
        :type: list[str]
        """

        self._kadastraal_onroerende_zaak_identificaties = kadastraal_onroerende_zaak_identificaties

    @property
    def geheimhouding_persoonsgegevens(self):
        """Gets the geheimhouding_persoonsgegevens of this KadasterNatuurlijkPersoon.  # noqa: E501

        Aanduiding die aangeeft dat gegevens van een persoon wel of niet verstrekt mogen worden.   # noqa: E501

        :return: The geheimhouding_persoonsgegevens of this KadasterNatuurlijkPersoon.  # noqa: E501
        :rtype: bool
        """
        return self._geheimhouding_persoonsgegevens

    @geheimhouding_persoonsgegevens.setter
    def geheimhouding_persoonsgegevens(self, geheimhouding_persoonsgegevens):
        """Sets the geheimhouding_persoonsgegevens of this KadasterNatuurlijkPersoon.

        Aanduiding die aangeeft dat gegevens van een persoon wel of niet verstrekt mogen worden.   # noqa: E501

        :param geheimhouding_persoonsgegevens: The geheimhouding_persoonsgegevens of this KadasterNatuurlijkPersoon.  # noqa: E501
        :type: bool
        """

        self._geheimhouding_persoonsgegevens = geheimhouding_persoonsgegevens

    @property
    def land_waarnaar_vertrokken(self):
        """Gets the land_waarnaar_vertrokken of this KadasterNatuurlijkPersoon.  # noqa: E501


        :return: The land_waarnaar_vertrokken of this KadasterNatuurlijkPersoon.  # noqa: E501
        :rtype: Waardelijst
        """
        return self._land_waarnaar_vertrokken

    @land_waarnaar_vertrokken.setter
    def land_waarnaar_vertrokken(self, land_waarnaar_vertrokken):
        """Sets the land_waarnaar_vertrokken of this KadasterNatuurlijkPersoon.


        :param land_waarnaar_vertrokken: The land_waarnaar_vertrokken of this KadasterNatuurlijkPersoon.  # noqa: E501
        :type: Waardelijst
        """

        self._land_waarnaar_vertrokken = land_waarnaar_vertrokken

    @property
    def geslachtsaanduiding(self):
        """Gets the geslachtsaanduiding of this KadasterNatuurlijkPersoon.  # noqa: E501


        :return: The geslachtsaanduiding of this KadasterNatuurlijkPersoon.  # noqa: E501
        :rtype: GeslachtEnum
        """
        return self._geslachtsaanduiding

    @geslachtsaanduiding.setter
    def geslachtsaanduiding(self, geslachtsaanduiding):
        """Sets the geslachtsaanduiding of this KadasterNatuurlijkPersoon.


        :param geslachtsaanduiding: The geslachtsaanduiding of this KadasterNatuurlijkPersoon.  # noqa: E501
        :type: GeslachtEnum
        """

        self._geslachtsaanduiding = geslachtsaanduiding

    @property
    def heeft_partnerschap(self):
        """Gets the heeft_partnerschap of this KadasterNatuurlijkPersoon.  # noqa: E501


        :return: The heeft_partnerschap of this KadasterNatuurlijkPersoon.  # noqa: E501
        :rtype: list[HeeftPartnerschap]
        """
        return self._heeft_partnerschap

    @heeft_partnerschap.setter
    def heeft_partnerschap(self, heeft_partnerschap):
        """Sets the heeft_partnerschap of this KadasterNatuurlijkPersoon.


        :param heeft_partnerschap: The heeft_partnerschap of this KadasterNatuurlijkPersoon.  # noqa: E501
        :type: list[HeeftPartnerschap]
        """

        self._heeft_partnerschap = heeft_partnerschap

    @property
    def naam(self):
        """Gets the naam of this KadasterNatuurlijkPersoon.  # noqa: E501


        :return: The naam of this KadasterNatuurlijkPersoon.  # noqa: E501
        :rtype: NaamPersoon
        """
        return self._naam

    @naam.setter
    def naam(self, naam):
        """Sets the naam of this KadasterNatuurlijkPersoon.


        :param naam: The naam of this KadasterNatuurlijkPersoon.  # noqa: E501
        :type: NaamPersoon
        """

        self._naam = naam

    @property
    def geboorte(self):
        """Gets the geboorte of this KadasterNatuurlijkPersoon.  # noqa: E501


        :return: The geboorte of this KadasterNatuurlijkPersoon.  # noqa: E501
        :rtype: Geboorte
        """
        return self._geboorte

    @geboorte.setter
    def geboorte(self, geboorte):
        """Sets the geboorte of this KadasterNatuurlijkPersoon.


        :param geboorte: The geboorte of this KadasterNatuurlijkPersoon.  # noqa: E501
        :type: Geboorte
        """

        self._geboorte = geboorte

    @property
    def overlijden(self):
        """Gets the overlijden of this KadasterNatuurlijkPersoon.  # noqa: E501


        :return: The overlijden of this KadasterNatuurlijkPersoon.  # noqa: E501
        :rtype: Overlijden
        """
        return self._overlijden

    @overlijden.setter
    def overlijden(self, overlijden):
        """Sets the overlijden of this KadasterNatuurlijkPersoon.


        :param overlijden: The overlijden of this KadasterNatuurlijkPersoon.  # noqa: E501
        :type: Overlijden
        """

        self._overlijden = overlijden

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, KadasterNatuurlijkPersoon):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, KadasterNatuurlijkPersoon):
            return True

        return self.to_dict() != other.to_dict()
