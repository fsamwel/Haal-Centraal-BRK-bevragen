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


class AantekeningBasis(object):
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
        'aard': 'Waardelijst',
        'omschrijving': 'str',
        'betreft_gedeelte_van_perceel': 'bool'
    }

    attribute_map = {
        'aard': 'aard',
        'omschrijving': 'omschrijving',
        'betreft_gedeelte_van_perceel': 'betreftGedeelteVanPerceel'
    }

    def __init__(self, aard=None, omschrijving=None, betreft_gedeelte_van_perceel=None, local_vars_configuration=None):  # noqa: E501
        """AantekeningBasis - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._aard = None
        self._omschrijving = None
        self._betreft_gedeelte_van_perceel = None
        self.discriminator = None

        if aard is not None:
            self.aard = aard
        if omschrijving is not None:
            self.omschrijving = omschrijving
        if betreft_gedeelte_van_perceel is not None:
            self.betreft_gedeelte_van_perceel = betreft_gedeelte_van_perceel

    @property
    def aard(self):
        """Gets the aard of this AantekeningBasis.  # noqa: E501


        :return: The aard of this AantekeningBasis.  # noqa: E501
        :rtype: Waardelijst
        """
        return self._aard

    @aard.setter
    def aard(self, aard):
        """Sets the aard of this AantekeningBasis.


        :param aard: The aard of this AantekeningBasis.  # noqa: E501
        :type: Waardelijst
        """

        self._aard = aard

    @property
    def omschrijving(self):
        """Gets the omschrijving of this AantekeningBasis.  # noqa: E501


        :return: The omschrijving of this AantekeningBasis.  # noqa: E501
        :rtype: str
        """
        return self._omschrijving

    @omschrijving.setter
    def omschrijving(self, omschrijving):
        """Sets the omschrijving of this AantekeningBasis.


        :param omschrijving: The omschrijving of this AantekeningBasis.  # noqa: E501
        :type: str
        """

        self._omschrijving = omschrijving

    @property
    def betreft_gedeelte_van_perceel(self):
        """Gets the betreft_gedeelte_van_perceel of this AantekeningBasis.  # noqa: E501


        :return: The betreft_gedeelte_van_perceel of this AantekeningBasis.  # noqa: E501
        :rtype: bool
        """
        return self._betreft_gedeelte_van_perceel

    @betreft_gedeelte_van_perceel.setter
    def betreft_gedeelte_van_perceel(self, betreft_gedeelte_van_perceel):
        """Sets the betreft_gedeelte_van_perceel of this AantekeningBasis.


        :param betreft_gedeelte_van_perceel: The betreft_gedeelte_van_perceel of this AantekeningBasis.  # noqa: E501
        :type: bool
        """

        self._betreft_gedeelte_van_perceel = betreft_gedeelte_van_perceel

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
        if not isinstance(other, AantekeningBasis):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, AantekeningBasis):
            return True

        return self.to_dict() != other.to_dict()
