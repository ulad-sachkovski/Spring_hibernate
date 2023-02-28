package com.vsachkovsky.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "section")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String sectionName;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,CascadeType.REFRESH},
            fetch = FetchType.LAZY)
    @JoinTable(
             name = "child_section"
            ,joinColumns = @JoinColumn(name = "section_id")
            ,inverseJoinColumns = @JoinColumn(name = "child_id")
    )
    private List<Child> children;

    public Section(String sectionName) {
        this.sectionName = sectionName;
    }

    public void addChildToSection(Child child){
        if (children == null){
            children = new ArrayList<>();
        }
        children.add(child);
    }


}
