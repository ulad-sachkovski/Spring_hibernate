package com.vsachkovsky.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "children")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "name")
    private String childName;

    @Column(name = "age")
    private int childAge;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,CascadeType.REFRESH},
            fetch = FetchType.LAZY)
    @JoinTable(
             name = "child_section"
            ,joinColumns = @JoinColumn(name = "child_id")
            ,inverseJoinColumns = @JoinColumn (name = "section_id")
    )
    private List<Section> sections;

    public Child(String childName, int childAge) {
        this.childName = childName;
        this.childAge = childAge;
    }

    public void addSectionToChild(Section section){
        if(sections == null){
            sections = new ArrayList<>();
        }
        sections.add(section);
    }

}
