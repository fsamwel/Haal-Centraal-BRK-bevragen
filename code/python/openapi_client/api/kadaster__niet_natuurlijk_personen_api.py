"""
    Kadaster - BRK-Bevragen API

    D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie.   # noqa: E501

    The version of the OpenAPI document: 1.2.0
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from openapi_client.api_client import ApiClient, Endpoint as _Endpoint
from openapi_client.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from openapi_client.model.bad_request_foutbericht import BadRequestFoutbericht
from openapi_client.model.foutbericht import Foutbericht
from openapi_client.model.kadaster_natuurlijk_persoon_hal import KadasterNatuurlijkPersoonHal
from openapi_client.model.kadaster_natuurlijk_persoon_hal_collectie import KadasterNatuurlijkPersoonHalCollectie
from openapi_client.model.kadaster_niet_natuurlijk_persoon_hal import KadasterNietNatuurlijkPersoonHal
from openapi_client.model.kadaster_niet_natuurlijk_persoon_hal_collectie import KadasterNietNatuurlijkPersoonHalCollectie


class KadasterNietNatuurlijkPersonenApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        def __get_kadaster_niet_natuurlijk_personen(
            self,
            q,
            **kwargs
        ):
            """get_kadaster_niet_natuurlijk_personen  # noqa: E501

            Het zoeken van bij het kadaster geregistreerde niet natuurlijke personen die al dan niet in het handelsregister (HR) zijn ingeschreven. Kadasternietnatuurlijkpersonen worden niet geactualiseerd.   # noqa: E501
            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.get_kadaster_niet_natuurlijk_personen(q, async_req=True)
            >>> result = thread.get()

            Args:
                q (str): Free query parameter. Dit endpoint evolueert naar free query zoeken. In deze versie kan alleen een combinatie van (het begin van de) de statutaire naam en zetel (vestigingsplaats) worden opgegeven. Let op! Een niet natuurlijk persoon kan meerdere keren, en op meer dan één manier voorkomen in de BRK. 

            Keyword Args:
                fields (str): Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma's gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature). [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (float/tuple): timeout setting for this request. If one
                    number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                KadasterNietNatuurlijkPersoonHalCollectie
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            kwargs['q'] = \
                q
            return self.call_with_http_info(**kwargs)

        self.get_kadaster_niet_natuurlijk_personen = _Endpoint(
            settings={
                'response_type': (KadasterNietNatuurlijkPersoonHalCollectie,),
                'auth': [
                    'apiKeyAuth'
                ],
                'endpoint_path': '/kadasternietnatuurlijkpersonen',
                'operation_id': 'get_kadaster_niet_natuurlijk_personen',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'q',
                    'fields',
                ],
                'required': [
                    'q',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'q':
                        (str,),
                    'fields':
                        (str,),
                },
                'attribute_map': {
                    'q': 'q',
                    'fields': 'fields',
                },
                'location_map': {
                    'q': 'query',
                    'fields': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/hal+json',
                    'application/problem+json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__get_kadaster_niet_natuurlijk_personen
        )

        def __get_kadaster_niet_natuurlijk_persoon(
            self,
            kadasternietnatuurlijkpersoonidentificatie,
            **kwargs
        ):
            """get_kadaster_niet_natuurlijk_persoon  # noqa: E501

            Het raadplegen van een bij het kadaster geregistreerde niet natuurlijke persoon die al dan niet in het handelsregister (HR) is ingeschreven. Kadasternietnatuurlijkpersonen worden niet geactualiseerd.   # noqa: E501
            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.get_kadaster_niet_natuurlijk_persoon(kadasternietnatuurlijkpersoonidentificatie, async_req=True)
            >>> result = thread.get()

            Args:
                kadasternietnatuurlijkpersoonidentificatie (str):

            Keyword Args:
                fields (str): Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma's gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature). [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (float/tuple): timeout setting for this request. If one
                    number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                KadasterNietNatuurlijkPersoonHal
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            kwargs['kadasternietnatuurlijkpersoonidentificatie'] = \
                kadasternietnatuurlijkpersoonidentificatie
            return self.call_with_http_info(**kwargs)

        self.get_kadaster_niet_natuurlijk_persoon = _Endpoint(
            settings={
                'response_type': (KadasterNietNatuurlijkPersoonHal,),
                'auth': [
                    'apiKeyAuth'
                ],
                'endpoint_path': '/kadasternietnatuurlijkpersonen/{kadasternietnatuurlijkpersoonidentificatie}',
                'operation_id': 'get_kadaster_niet_natuurlijk_persoon',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'kadasternietnatuurlijkpersoonidentificatie',
                    'fields',
                ],
                'required': [
                    'kadasternietnatuurlijkpersoonidentificatie',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                    'kadasternietnatuurlijkpersoonidentificatie',
                ]
            },
            root_map={
                'validations': {
                    ('kadasternietnatuurlijkpersoonidentificatie',): {
                        'max_length': 60,
                    },
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'kadasternietnatuurlijkpersoonidentificatie':
                        (str,),
                    'fields':
                        (str,),
                },
                'attribute_map': {
                    'kadasternietnatuurlijkpersoonidentificatie': 'kadasternietnatuurlijkpersoonidentificatie',
                    'fields': 'fields',
                },
                'location_map': {
                    'kadasternietnatuurlijkpersoonidentificatie': 'path',
                    'fields': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/hal+json',
                    'application/problem+json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__get_kadaster_niet_natuurlijk_persoon
        )

        def __get_kadaster_personen(
            self,
            q,
            **kwargs
        ):
            """get_kadaster_personen  # noqa: E501

            Het zoeken van bij het kadaster geregistreerde natuurlijke personen die niet in de basisregistratie personen (BRP) zijn ingeschreven (of wel zijn ingeschreven maar niet zijn _gematched_ bij het inschrijven van de akte). Kadasternatuurlijkpersonen worden niet geactualiseerd.   # noqa: E501
            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.get_kadaster_personen(q, async_req=True)
            >>> result = thread.get()

            Args:
                q (str): Free query parameter. Dit endpoint evolueert naar free query zoeken. In deze versie kan alleen een combinatie van (het begin van) de geslachtsnaam en geboortedatum [YYYY-mm-dd] worden opgegeven. 

            Keyword Args:
                fields (str): Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma's gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature). [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (float/tuple): timeout setting for this request. If one
                    number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                KadasterNatuurlijkPersoonHalCollectie
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            kwargs['q'] = \
                q
            return self.call_with_http_info(**kwargs)

        self.get_kadaster_personen = _Endpoint(
            settings={
                'response_type': (KadasterNatuurlijkPersoonHalCollectie,),
                'auth': [
                    'apiKeyAuth'
                ],
                'endpoint_path': '/kadasternatuurlijkpersonen',
                'operation_id': 'get_kadaster_personen',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'q',
                    'fields',
                ],
                'required': [
                    'q',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'q':
                        (str,),
                    'fields':
                        (str,),
                },
                'attribute_map': {
                    'q': 'q',
                    'fields': 'fields',
                },
                'location_map': {
                    'q': 'query',
                    'fields': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/hal+json',
                    'application/problem+json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__get_kadaster_personen
        )

        def __get_kadaster_persoon(
            self,
            kadasternatuurlijkpersoonidentificatie,
            **kwargs
        ):
            """get_kadaster_persoon  # noqa: E501

            Het raadplegen van een bij het kadaster geregistreerde natuurlijke persoon die niet in de basisregistratie personen (BRP) is ingeschreven (of wel is ingeschreven maar niet is gekoppeld bij het inschrijven van de akte). Kadasternatuurlijkpersonen worden niet geactualiseerd.   # noqa: E501
            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.get_kadaster_persoon(kadasternatuurlijkpersoonidentificatie, async_req=True)
            >>> result = thread.get()

            Args:
                kadasternatuurlijkpersoonidentificatie (str):

            Keyword Args:
                fields (str): Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma's gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature). [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (float/tuple): timeout setting for this request. If one
                    number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                KadasterNatuurlijkPersoonHal
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            kwargs['kadasternatuurlijkpersoonidentificatie'] = \
                kadasternatuurlijkpersoonidentificatie
            return self.call_with_http_info(**kwargs)

        self.get_kadaster_persoon = _Endpoint(
            settings={
                'response_type': (KadasterNatuurlijkPersoonHal,),
                'auth': [
                    'apiKeyAuth'
                ],
                'endpoint_path': '/kadasternatuurlijkpersonen/{kadasternatuurlijkpersoonidentificatie}',
                'operation_id': 'get_kadaster_persoon',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'kadasternatuurlijkpersoonidentificatie',
                    'fields',
                ],
                'required': [
                    'kadasternatuurlijkpersoonidentificatie',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                    'kadasternatuurlijkpersoonidentificatie',
                ]
            },
            root_map={
                'validations': {
                    ('kadasternatuurlijkpersoonidentificatie',): {
                        'max_length': 60,
                    },
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'kadasternatuurlijkpersoonidentificatie':
                        (str,),
                    'fields':
                        (str,),
                },
                'attribute_map': {
                    'kadasternatuurlijkpersoonidentificatie': 'kadasternatuurlijkpersoonidentificatie',
                    'fields': 'fields',
                },
                'location_map': {
                    'kadasternatuurlijkpersoonidentificatie': 'path',
                    'fields': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/hal+json',
                    'application/problem+json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__get_kadaster_persoon
        )
