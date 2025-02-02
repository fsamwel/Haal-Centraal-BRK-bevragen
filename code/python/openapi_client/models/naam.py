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


class Naam(object):
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
        'geslachtsnaam': 'str',
        'voornamen': 'str',
        'voorvoegsel': 'str'
    }

    attribute_map = {
        'geslachtsnaam': 'geslachtsnaam',
        'voornamen': 'voornamen',
        'voorvoegsel': 'voorvoegsel'
    }

    def __init__(self, geslachtsnaam=None, voornamen=None, voorvoegsel=None, local_vars_configuration=None):  # noqa: E501
        """Naam - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._geslachtsnaam = None
        self._voornamen = None
        self._voorvoegsel = None
        self.discriminator = None

        if geslachtsnaam is not None:
            self.geslachtsnaam = geslachtsnaam
        if voornamen is not None:
            self.voornamen = voornamen
        if voorvoegsel is not None:
            self.voorvoegsel = voorvoegsel

    @property
    def geslachtsnaam(self):
        """Gets the geslachtsnaam of this Naam.  # noqa: E501

        De geslachtsnaam is de (achter)naam waarvan eventuele voorvoegsels en adellijke titel zijn afgesplitst.   # noqa: E501

        :return: The geslachtsnaam of this Naam.  # noqa: E501
        :rtype: str
        """
        return self._geslachtsnaam

    @geslachtsnaam.setter
    def geslachtsnaam(self, geslachtsnaam):
        """Sets the geslachtsnaam of this Naam.

        De geslachtsnaam is de (achter)naam waarvan eventuele voorvoegsels en adellijke titel zijn afgesplitst.   # noqa: E501

        :param geslachtsnaam: The geslachtsnaam of this Naam.  # noqa: E501
        :type: str
        """

        self._geslachtsnaam = geslachtsnaam

    @property
    def voornamen(self):
        """Gets the voornamen of this Naam.  # noqa: E501

        De voornamen zijn de verzameling namen die, gescheiden door spaties, aan de geslachtsnaam voorafgaat. Indien aanwezig, wordt het predikaat afgesplitst.   # noqa: E501

        :return: The voornamen of this Naam.  # noqa: E501
        :rtype: str
        """
        return self._voornamen

    @voornamen.setter
    def voornamen(self, voornamen):
        """Sets the voornamen of this Naam.

        De voornamen zijn de verzameling namen die, gescheiden door spaties, aan de geslachtsnaam voorafgaat. Indien aanwezig, wordt het predikaat afgesplitst.   # noqa: E501

        :param voornamen: The voornamen of this Naam.  # noqa: E501
        :type: str
        """

        self._voornamen = voornamen

    @property
    def voorvoegsel(self):
        """Gets the voorvoegsel of this Naam.  # noqa: E501

        Voorvoegselsgeslachtsnaam is het deel van de geslachtsnaam dat, gescheiden door een spatie, vooraf gaat aan de rest van de geslachtsnaam.   # noqa: E501

        :return: The voorvoegsel of this Naam.  # noqa: E501
        :rtype: str
        """
        return self._voorvoegsel

    @voorvoegsel.setter
    def voorvoegsel(self, voorvoegsel):
        """Sets the voorvoegsel of this Naam.

        Voorvoegselsgeslachtsnaam is het deel van de geslachtsnaam dat, gescheiden door een spatie, vooraf gaat aan de rest van de geslachtsnaam.   # noqa: E501

        :param voorvoegsel: The voorvoegsel of this Naam.  # noqa: E501
        :type: str
        """

        self._voorvoegsel = voorvoegsel

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
        if not isinstance(other, Naam):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Naam):
            return True

        return self.to_dict() != other.to_dict()
