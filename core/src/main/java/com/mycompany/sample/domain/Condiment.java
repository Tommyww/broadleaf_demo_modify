package com.mycompany.sample.domain;

import org.broadleafcommerce.core.catalog.domain.Product;

/**
 * User: xudong
 * Date: 2/26/15
 * Time: 6:16 PM
 */
public interface Condiment extends Product{

    public void setCapacityInBundle(int capacityInBundle);

    public int getCapacityInBundle();

    public void setOrigin(String origin);

    public String getOrigin();

    public void setIngredient(String ingredient);

    public String getIngredient();

}
