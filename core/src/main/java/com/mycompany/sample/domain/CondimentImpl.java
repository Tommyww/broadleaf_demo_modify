package com.mycompany.sample.domain;

import org.broadleafcommerce.common.presentation.AdminPresentation;
import org.broadleafcommerce.core.catalog.domain.ProductImpl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * User: xudong
 * Date: 2/26/15
 * Time: 6:20 PM
 */
@Entity
@Table(name = "CONDIMENT")
public class CondimentImpl extends ProductImpl implements Condiment {

    @Column(name = "CAPACITY_IN_BUNDLE")
    @AdminPresentation
    protected int capacityInBundle;

    @Column(name = "ORIGIN")
    @AdminPresentation
    protected String origin;

    @Column(name = "INGREDIENT")
    @AdminPresentation
    protected String ingredient;

    @Override
    public void setCapacityInBundle(int capacityInBundle) {
        this.capacityInBundle = capacityInBundle;
    }

    @Override
    public int getCapacityInBundle() {
        return capacityInBundle;
    }

    @Override
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String getOrigin() {
        return origin;
    }

    @Override
    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public String getIngredient() {
        return ingredient;
    }
}
