/* 
 * Kadaster - BRK-Bevragen API
 *
 * D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie. 
 *
 * The version of the OpenAPI document: 1.2.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Een aanduiding die aangeeft of de persoon ingeschreven is in het Handelsregister (KvK) met een rsin, dan wel vastgelegd is bij het Kadaster. 
    /// </summary>
    /// <value>Een aanduiding die aangeeft of de persoon ingeschreven is in het Handelsregister (KvK) met een rsin, dan wel vastgelegd is bij het Kadaster. </value>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum NietNatuurlijkPersoonTypeEnum
    {
        /// <summary>
        /// Enum Ingeschrevennietnatuurlijkpersoon for value: ingeschreven_niet_natuurlijk_persoon
        /// </summary>
        [EnumMember(Value = "ingeschreven_niet_natuurlijk_persoon")]
        Ingeschrevennietnatuurlijkpersoon = 1,

        /// <summary>
        /// Enum Kadasternietnatuurlijkpersoon for value: kadaster_niet_natuurlijk_persoon
        /// </summary>
        [EnumMember(Value = "kadaster_niet_natuurlijk_persoon")]
        Kadasternietnatuurlijkpersoon = 2

    }

}
