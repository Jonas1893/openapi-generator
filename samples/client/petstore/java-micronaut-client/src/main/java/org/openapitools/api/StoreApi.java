/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.api;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.core.convert.format.Format;
import reactor.core.publisher.Mono;
import org.openapitools.model.Order;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
@Client("${petstore-micronaut-base-path}")
public interface StoreApi {
    /**
     * Delete purchase order by ID
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     *
     * @param orderId ID of the order that needs to be deleted (required)
     */
    @Delete(uri="/store/order/{order_id}")
    Mono<Void> deleteOrder(
        @PathVariable(name="order_id") @NotNull String orderId
    );

    /**
     * Returns pet inventories by status
     * Returns a map of status codes to quantities
     *
     * @return Map&lt;String, Integer&gt;
     */
    @Get(uri="/store/inventory")
    @Consumes({"application/json"})
    Mono<Map<String, Integer>> getInventory();

    /**
     * Find purchase order by ID
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generate exceptions
     *
     * @param orderId ID of pet that needs to be fetched (required)
     * @return Order
     */
    @Get(uri="/store/order/{order_id}")
    @Consumes({"application/xml", "application/json"})
    Mono<Order> getOrderById(
        @PathVariable(name="order_id") @NotNull @Min(1L) @Max(5L) Long orderId
    );

    /**
     * Place an order for a pet
     *
     * @param _body order placed for purchasing the pet (required)
     * @return Order
     */
    @Post(uri="/store/order")
    @Consumes({"application/xml", "application/json"})
    Mono<Order> placeOrder(
        @Body @NotNull @Valid Order _body
    );

}
