# #OpenAPI Petstore
#
##This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
#
#The version of the OpenAPI document: 1.0.0
#
#Generated by: https://openapi-generator.tech
#Generator version: 7.15.0-SNAPSHOT
#

require "uri"

module Petstore
  class StoreApi
    property api_client : ApiClient

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Delete purchase order by ID
    # For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors
    # @param order_id [String] ID of the order that needs to be deleted
    # @return [nil]
    def delete_order(order_id : String)
      delete_order_with_http_info(order_id)
      nil
    end

    # Delete purchase order by ID
    # For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
    # @param order_id [String] ID of the order that needs to be deleted
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def delete_order_with_http_info(order_id : String)
      if @api_client.config.debugging
        Log.debug {"Calling API: StoreApi.delete_order ..."}
      end
      # verify the required parameter "order_id" is set
      if @api_client.config.client_side_validation && order_id.nil?
        raise ArgumentError.new("Missing the required parameter 'order_id' when calling StoreApi.delete_order")
      end
      # resource path
      local_var_path = "/store/order/{orderId}".sub("{" + "orderId" + "}", URI.encode_path(order_id.to_s).gsub("%2F", "/"))

      # cookie parameters
      cookie_params = Hash(String, String).new

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = nil

      # return_type
      return_type = nil

      # auth_names
      auth_names = [] of String

      data, status_code, headers = @api_client.call_api(:DELETE,
                                                        local_var_path,
                                                        :"StoreApi.delete_order",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        cookie_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: StoreApi#delete_order\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return nil, status_code, headers
    end

    # Returns pet inventories by status
    # Returns a map of status codes to quantities
    # @return [Hash(String, Int32)]
    def get_inventory()
      data, _status_code, _headers = get_inventory_with_http_info()
      data
    end

    # Returns pet inventories by status
    # Returns a map of status codes to quantities
    # @return [Array<(Hash(String, Int32), Integer, Hash)>] Hash(String, Int32) data, response status code and response headers
    def get_inventory_with_http_info()
      if @api_client.config.debugging
        Log.debug {"Calling API: StoreApi.get_inventory ..."}
      end
      # resource path
      local_var_path = "/store/inventory"

      # cookie parameters
      cookie_params = Hash(String, String).new

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = nil

      # return_type
      return_type = "Hash(String, Int32)"

      # auth_names
      auth_names = ["api_key"]

      data, status_code, headers = @api_client.call_api(:GET,
                                                        local_var_path,
                                                        :"StoreApi.get_inventory",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        cookie_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: StoreApi#get_inventory\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return Hash(String, Int32).from_json(data), status_code, headers
    end

    # Find purchase order by ID
    # For valid response try integer IDs with value <= 5 or > 10. Other values will generate exceptions
    # @param order_id [Int64] ID of pet that needs to be fetched
    # @return [Order]
    def get_order_by_id(order_id : Int64)
      data, _status_code, _headers = get_order_by_id_with_http_info(order_id)
      data
    end

    # Find purchase order by ID
    # For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generate exceptions
    # @param order_id [Int64] ID of pet that needs to be fetched
    # @return [Array<(Order, Integer, Hash)>] Order data, response status code and response headers
    def get_order_by_id_with_http_info(order_id : Int64)
      if @api_client.config.debugging
        Log.debug {"Calling API: StoreApi.get_order_by_id ..."}
      end
      # verify the required parameter "order_id" is set
      if @api_client.config.client_side_validation && order_id.nil?
        raise ArgumentError.new("Missing the required parameter 'order_id' when calling StoreApi.get_order_by_id")
      end
      if @api_client.config.client_side_validation && order_id > 5
        raise ArgumentError.new("invalid value for \"order_id\" when calling StoreApi.get_order_by_id, must be smaller than or equal to 5.")
      end

      if @api_client.config.client_side_validation && order_id < 1
        raise ArgumentError.new("invalid value for \"order_id\" when calling StoreApi.get_order_by_id, must be greater than or equal to 1.")
      end

      # resource path
      local_var_path = "/store/order/{orderId}".sub("{" + "orderId" + "}", URI.encode_path(order_id.to_s).gsub("%2F", "/"))

      # cookie parameters
      cookie_params = Hash(String, String).new

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/xml", "application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = nil

      # return_type
      return_type = "Order"

      # auth_names
      auth_names = [] of String

      data, status_code, headers = @api_client.call_api(:GET,
                                                        local_var_path,
                                                        :"StoreApi.get_order_by_id",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        cookie_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: StoreApi#get_order_by_id\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return Order.from_json(data), status_code, headers
    end

    # Place an order for a pet
    # 
    # @param order [Order] order placed for purchasing the pet
    # @return [Order]
    def place_order(order : Order)
      data, _status_code, _headers = place_order_with_http_info(order)
      data
    end

    # Place an order for a pet
    # 
    # @param order [Order] order placed for purchasing the pet
    # @return [Array<(Order, Integer, Hash)>] Order data, response status code and response headers
    def place_order_with_http_info(order : Order)
      if @api_client.config.debugging
        Log.debug {"Calling API: StoreApi.place_order ..."}
      end
      # verify the required parameter "order" is set
      if @api_client.config.client_side_validation && order.nil?
        raise ArgumentError.new("Missing the required parameter 'order' when calling StoreApi.place_order")
      end
      # resource path
      local_var_path = "/store/order"

      # cookie parameters
      cookie_params = Hash(String, String).new

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/xml", "application/json"])
      # HTTP header "Content-Type"
      header_params["Content-Type"] = @api_client.select_header_content_type(["application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = order.to_json

      # return_type
      return_type = "Order"

      # auth_names
      auth_names = [] of String

      data, status_code, headers = @api_client.call_api(:POST,
                                                        local_var_path,
                                                        :"StoreApi.place_order",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        cookie_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: StoreApi#place_order\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return Order.from_json(data), status_code, headers
    end
  end
end
