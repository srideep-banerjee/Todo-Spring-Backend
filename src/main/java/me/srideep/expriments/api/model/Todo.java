package me.srideep.expriments.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private Boolean checked;

    public Todo(Integer id, String title, Boolean checked) {
        this.id = id;
        this.title = title;
        this.checked = checked;
    }

    public Todo() {}

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
