# coding: utf-8

"""
    Kadaster - BRK-Bevragen API

    D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie.   # noqa: E501

    The version of the OpenAPI document: 1.2.0
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from openapi_client.configuration import Configuration


class Hypotheek(object):
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
        'domein': 'str',
        'aandeel_in_betrokken_recht': 'TypeBreuk',
        'gedeeltelijke_bezwaring_oud_object': 'bool',
        'omschrijving_betrokken_recht': 'Waardelijst',
        'toelichting_bewaarder': 'str',
        'betreft_gedeelte_van_perceel': 'bool',
        'aantekeningen': 'list[AantekeningBasis]',
        'hypotheekhouders': 'list[PersoonBeperkt]',
        'bedrag_zekerheidsstelling': 'Bedrag'
    }

    attribute_map = {
        'identificatie': 'identificatie',
        'domein': 'domein',
        'aandeel_in_betrokken_recht': 'aandeelInBetrokkenRecht',
        'gedeeltelijke_bezwaring_oud_object': 'gedeeltelijkeBezwaringOudObject',
        'omschrijving_betrokken_recht': 'omschrijvingBetrokkenRecht',
        'toelichting_bewaarder': 'toelichtingBewaarder',
        'betreft_gedeelte_van_perceel': 'betreftGedeelteVanPerceel',
        'aantekeningen': 'aantekeningen',
        'hypotheekhouders': 'hypotheekhouders',
        'bedrag_zekerheidsstelling': 'bedragZekerheidsstelling'
    }

    def __init__(self, identificatie=None, domein=None, aandeel_in_betrokken_recht=None, gedeeltelijke_bezwaring_oud_object=None, omschrijving_betrokken_recht=None, toelichting_bewaarder=None, betreft_gedeelte_van_perceel=None, aantekeningen=None, hypotheekhouders=None, bedrag_zekerheidsstelling=None, local_vars_configuration=None):  # noqa: E501
        """Hypotheek - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._identificatie = None
        self._domein = None
        self._aandeel_in_betrokken_recht = None
        self._gedeeltelijke_bezwaring_oud_object = None
        self._omschrijving_betrokken_recht = None
        self._toelichting_bewaarder = None
        self._betreft_gedeelte_van_perceel = None
        self._aantekeningen = None
        self._hypotheekhouders = None
        self._bedrag_zekerheidsstelling = None
        self.discriminator = None

        if identificatie is not None:
            self.identificatie = identificatie
        if domein is not None:
            self.domein = domein
        if aandeel_in_betrokken_recht is not None:
            self.aandeel_in_betrokken_recht = aandeel_in_betrokken_recht
        if gedeeltelijke_bezwaring_oud_object is not None:
            self.gedeeltelijke_bezwaring_oud_object = gedeeltelijke_bezwaring_oud_object
        if omschrijving_betrokken_recht is not None:
            self.omschrijving_betrokken_recht = omschrijving_betrokken_recht
        if toelichting_bewaarder is not None:
            self.toelichting_bewaarder = toelichting_bewaarder
        if betreft_gedeelte_van_perceel is not None:
            self.betreft_gedeelte_van_perceel = betreft_gedeelte_van_perceel
        if aantekeningen is not None:
            self.aantekeningen = aantekeningen
        if hypotheekhouders is not None:
            self.hypotheekhouders = hypotheekhouders
        if bedrag_zekerheidsstelling is not None:
            self.bedrag_zekerheidsstelling = bedrag_zekerheidsstelling

    @property
    def identificatie(self):
        """Gets the identificatie of this Hypotheek.  # noqa: E501


        :return: The identificatie of this Hypotheek.  # noqa: E501
        :rtype: str
        """
        return self._identificatie

    @identificatie.setter
    def identificatie(self, identificatie):
        """Sets the identificatie of this Hypotheek.


        :param identificatie: The identificatie of this Hypotheek.  # noqa: E501
        :type: str
        """

        self._identificatie = identificatie

    @property
    def domein(self):
        """Gets the domein of this Hypotheek.  # noqa: E501

        Het domein waartoe de identificatie behoort.   # noqa: E501

        :return: The domein of this Hypotheek.  # noqa: E501
        :rtype: str
        """
        return self._domein

    @domein.setter
    def domein(self, domein):
        """Sets the domein of this Hypotheek.

        Het domein waartoe de identificatie behoort.   # noqa: E501

        :param domein: The domein of this Hypotheek.  # noqa: E501
        :type: str
        """

        self._domein = domein

    @property
    def aandeel_in_betrokken_recht(self):
        """Gets the aandeel_in_betrokken_recht of this Hypotheek.  # noqa: E501


        :return: The aandeel_in_betrokken_recht of this Hypotheek.  # noqa: E501
        :rtype: TypeBreuk
        """
        return self._aandeel_in_betrokken_recht

    @aandeel_in_betrokken_recht.setter
    def aandeel_in_betrokken_recht(self, aandeel_in_betrokken_recht):
        """Sets the aandeel_in_betrokken_recht of this Hypotheek.


        :param aandeel_in_betrokken_recht: The aandeel_in_betrokken_recht of this Hypotheek.  # noqa: E501
        :type: TypeBreuk
        """

        self._aandeel_in_betrokken_recht = aandeel_in_betrokken_recht

    @property
    def gedeeltelijke_bezwaring_oud_object(self):
        """Gets the gedeeltelijke_bezwaring_oud_object of this Hypotheek.  # noqa: E501


        :return: The gedeeltelijke_bezwaring_oud_object of this Hypotheek.  # noqa: E501
        :rtype: bool
        """
        return self._gedeeltelijke_bezwaring_oud_object

    @gedeeltelijke_bezwaring_oud_object.setter
    def gedeeltelijke_bezwaring_oud_object(self, gedeeltelijke_bezwaring_oud_object):
        """Sets the gedeeltelijke_bezwaring_oud_object of this Hypotheek.


        :param gedeeltelijke_bezwaring_oud_object: The gedeeltelijke_bezwaring_oud_object of this Hypotheek.  # noqa: E501
        :type: bool
        """

        self._gedeeltelijke_bezwaring_oud_object = gedeeltelijke_bezwaring_oud_object

    @property
    def omschrijving_betrokken_recht(self):
        """Gets the omschrijving_betrokken_recht of this Hypotheek.  # noqa: E501


        :return: The omschrijving_betrokken_recht of this Hypotheek.  # noqa: E501
        :rtype: Waardelijst
        """
        return self._omschrijving_betrokken_recht

    @omschrijving_betrokken_recht.setter
    def omschrijving_betrokken_recht(self, omschrijving_betrokken_recht):
        """Sets the omschrijving_betrokken_recht of this Hypotheek.


        :param omschrijving_betrokken_recht: The omschrijving_betrokken_recht of this Hypotheek.  # noqa: E501
        :type: Waardelijst
        """

        self._omschrijving_betrokken_recht = omschrijving_betrokken_recht

    @property
    def toelichting_bewaarder(self):
        """Gets the toelichting_bewaarder of this Hypotheek.  # noqa: E501

        Toelichtende tekst van de bewaarder. De bewaarder is iemand die bij het Kadaster werkt. Hij schrijft stukken in in de openbare registers en de basisregistratie Kadaster conform de Kadasterwet.   # noqa: E501

        :return: The toelichting_bewaarder of this Hypotheek.  # noqa: E501
        :rtype: str
        """
        return self._toelichting_bewaarder

    @toelichting_bewaarder.setter
    def toelichting_bewaarder(self, toelichting_bewaarder):
        """Sets the toelichting_bewaarder of this Hypotheek.

        Toelichtende tekst van de bewaarder. De bewaarder is iemand die bij het Kadaster werkt. Hij schrijft stukken in in de openbare registers en de basisregistratie Kadaster conform de Kadasterwet.   # noqa: E501

        :param toelichting_bewaarder: The toelichting_bewaarder of this Hypotheek.  # noqa: E501
        :type: str
        """

        self._toelichting_bewaarder = toelichting_bewaarder

    @property
    def betreft_gedeelte_van_perceel(self):
        """Gets the betreft_gedeelte_van_perceel of this Hypotheek.  # noqa: E501


        :return: The betreft_gedeelte_van_perceel of this Hypotheek.  # noqa: E501
        :rtype: bool
        """
        return self._betreft_gedeelte_van_perceel

    @betreft_gedeelte_van_perceel.setter
    def betreft_gedeelte_van_perceel(self, betreft_gedeelte_van_perceel):
        """Sets the betreft_gedeelte_van_perceel of this Hypotheek.


        :param betreft_gedeelte_van_perceel: The betreft_gedeelte_van_perceel of this Hypotheek.  # noqa: E501
        :type: bool
        """

        self._betreft_gedeelte_van_perceel = betreft_gedeelte_van_perceel

    @property
    def aantekeningen(self):
        """Gets the aantekeningen of this Hypotheek.  # noqa: E501


        :return: The aantekeningen of this Hypotheek.  # noqa: E501
        :rtype: list[AantekeningBasis]
        """
        return self._aantekeningen

    @aantekeningen.setter
    def aantekeningen(self, aantekeningen):
        """Sets the aantekeningen of this Hypotheek.


        :param aantekeningen: The aantekeningen of this Hypotheek.  # noqa: E501
        :type: list[AantekeningBasis]
        """

        self._aantekeningen = aantekeningen

    @property
    def hypotheekhouders(self):
        """Gets the hypotheekhouders of this Hypotheek.  # noqa: E501

        Een hypotheekhouder vestigt als geldverstrekker een recht van hypotheek als zekerheid voor de lening.   # noqa: E501

        :return: The hypotheekhouders of this Hypotheek.  # noqa: E501
        :rtype: list[PersoonBeperkt]
        """
        return self._hypotheekhouders

    @hypotheekhouders.setter
    def hypotheekhouders(self, hypotheekhouders):
        """Sets the hypotheekhouders of this Hypotheek.

        Een hypotheekhouder vestigt als geldverstrekker een recht van hypotheek als zekerheid voor de lening.   # noqa: E501

        :param hypotheekhouders: The hypotheekhouders of this Hypotheek.  # noqa: E501
        :type: list[PersoonBeperkt]
        """

        self._hypotheekhouders = hypotheekhouders

    @property
    def bedrag_zekerheidsstelling(self):
        """Gets the bedrag_zekerheidsstelling of this Hypotheek.  # noqa: E501


        :return: The bedrag_zekerheidsstelling of this Hypotheek.  # noqa: E501
        :rtype: Bedrag
        """
        return self._bedrag_zekerheidsstelling

    @bedrag_zekerheidsstelling.setter
    def bedrag_zekerheidsstelling(self, bedrag_zekerheidsstelling):
        """Sets the bedrag_zekerheidsstelling of this Hypotheek.


        :param bedrag_zekerheidsstelling: The bedrag_zekerheidsstelling of this Hypotheek.  # noqa: E501
        :type: Bedrag
        """

        self._bedrag_zekerheidsstelling = bedrag_zekerheidsstelling

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
        if not isinstance(other, Hypotheek):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Hypotheek):
            return True

        return self.to_dict() != other.to_dict()
