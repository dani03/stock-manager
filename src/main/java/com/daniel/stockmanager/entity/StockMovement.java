package com.daniel.stockmanager.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name="stock_movements")
public class StockMovement {

    @Id
    @GeneratedValue
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;


    private Integer quantity;

    private Integer movementType;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getMovementType() {
        return movementType;
    }

    public void setMovementType(Integer movementType) {
        this.movementType = movementType;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "StockMovement{" +
                "id=" + id +
                ", date=" + date +
                ", quantity=" + quantity +
                ", movementType=" + movementType +
                ", article=" + article +
                '}';
    }
}
