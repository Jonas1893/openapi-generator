# NOTE: This file is auto generated by OpenAPI Generator 7.15.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.EnumTest do
  @moduledoc """
  
  """

  @derive JSON.Encoder
  defstruct [
    :enum_string,
    :enum_string_required,
    :enum_integer,
    :enum_number,
    :outerEnum,
    :outerEnumInteger,
    :outerEnumDefaultValue,
    :outerEnumIntegerDefaultValue
  ]

  @type t :: %__MODULE__{
    :enum_string => String.t | nil,
    :enum_string_required => String.t,
    :enum_integer => integer() | nil,
    :enum_number => float() | nil,
    :outerEnum => OpenapiPetstore.Model.OuterEnum.t | nil,
    :outerEnumInteger => OpenapiPetstore.Model.OuterEnumInteger.t | nil,
    :outerEnumDefaultValue => OpenapiPetstore.Model.OuterEnumDefaultValue.t | nil,
    :outerEnumIntegerDefaultValue => OpenapiPetstore.Model.OuterEnumIntegerDefaultValue.t | nil
  }

  alias OpenapiPetstore.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:outerEnum, :struct, OpenapiPetstore.Model.OuterEnum)
     |> Deserializer.deserialize(:outerEnumInteger, :struct, OpenapiPetstore.Model.OuterEnumInteger)
     |> Deserializer.deserialize(:outerEnumDefaultValue, :struct, OpenapiPetstore.Model.OuterEnumDefaultValue)
     |> Deserializer.deserialize(:outerEnumIntegerDefaultValue, :struct, OpenapiPetstore.Model.OuterEnumIntegerDefaultValue)
  end
end

