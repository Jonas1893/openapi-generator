/*
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct FooNullableArray {
    #[serde(rename = "array_nullable", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub array_nullable: Option<Option<Vec<String>>>,
    #[serde(rename = "just_array", skip_serializing_if = "Option::is_none")]
    pub just_array: Option<Vec<String>>,
    #[serde(rename = "nullable_string", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub nullable_string: Option<Option<String>>,
    #[serde(rename = "just_string", skip_serializing_if = "Option::is_none")]
    pub just_string: Option<String>,
}

impl FooNullableArray {
    pub fn new() -> FooNullableArray {
        FooNullableArray {
            array_nullable: None,
            just_array: None,
            nullable_string: None,
            just_string: None,
        }
    }
}

