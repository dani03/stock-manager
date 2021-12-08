package com.daniel.stockmanager.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name="articles")
public class Article {

    @Id
    @GeneratedValue
    private Long id;

    private String code;

    private String label;
    private String description;
    private BigDecimal unit_Price_Without_Tax;
    private BigDecimal vat;
    private BigDecimal unit_Price_with_Tax;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Article() {
    }

    public Article(String code, String label, String description, BigDecimal unit_Price_Without_Tax, BigDecimal vat) {
        this.code = code;
        this.label = label;
        this.description = description;
        this.unit_Price_Without_Tax = unit_Price_Without_Tax;
        this.vat = vat;
    }

    public Article(String code, String label, String description, BigDecimal unit_Price_Without_Tax, BigDecimal vat, BigDecimal unit_Price_with_Tax, Category category) {
        this.code = code;
        this.label = label;
        this.description = description;
        this.unit_Price_Without_Tax = unit_Price_Without_Tax;
        this.vat = vat;
        this.unit_Price_with_Tax = unit_Price_with_Tax;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getUnit_Price_Without_Tax() {
        return unit_Price_Without_Tax;
    }

    public void setUnit_Price_Without_Tax(BigDecimal unit_Price_Without_Tax) {
        this.unit_Price_Without_Tax = unit_Price_Without_Tax;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public BigDecimal getUnit_Price_with_Tax() {
        return unit_Price_with_Tax;
    }

    public void setUnit_Price_with_Tax(BigDecimal unit_Price_with_Tax) {
        this.unit_Price_with_Tax = unit_Price_with_Tax;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", label='" + label + '\'' +
                ", description='" + description + '\'' +
                ", unit_Price_Without_Tax=" + unit_Price_Without_Tax +
                ", vat=" + vat +
                ", unit_Price_with_Tax=" + unit_Price_with_Tax +
                ", category=" + category +
                '}';
    }
}
