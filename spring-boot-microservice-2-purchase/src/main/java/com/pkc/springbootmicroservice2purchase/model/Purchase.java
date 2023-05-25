package com.pkc.springbootmicroservice2purchase.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@Entity
@Table(name = "purchase")
public class Purchase
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "course_id", nullable = false)
    private Long courseId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "purchase_time", nullable = false)
    private LocalDateTime purchaseTime;

    @Override
    public String toString()
    {
        return "Purchase [id=" + id + ", userId=" + userId + ", courseId=" + courseId + ", title=" + title + ", price="
            + price + ", purchaseTime=" + purchaseTime + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
            + ", toString()=" + super.toString() + "]";
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(courseId, id, price, purchaseTime, title, userId);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Purchase other = (Purchase) obj;
        return Objects.equals(courseId, other.courseId) && Objects.equals(id, other.id)
            && Objects.equals(price, other.price) && Objects.equals(purchaseTime, other.purchaseTime)
            && Objects.equals(title, other.title) && Objects.equals(userId, other.userId);
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getUserId()
    {
        return userId;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getCourseId()
    {
        return courseId;
    }

    public void setCourseId(Long courseId)
    {
        this.courseId = courseId;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    public LocalDateTime getPurchaseTime()
    {
        return purchaseTime;
    }

    public void setPurchaseTime(LocalDateTime purchaseTime)
    {
        this.purchaseTime = purchaseTime;
    }
}
