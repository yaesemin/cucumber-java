package ru.train.cucumber.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class GroupData {

    private int id = Integer.MAX_VALUE;

    private String name;

    private String header;

    private String footer;

    private Set<ContactData> contacts = new HashSet<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupData groupData = (GroupData) o;
        return id == groupData.id &&
                Objects.equals(name, groupData.name) &&
                Objects.equals(header, groupData.header) &&
                Objects.equals(footer, groupData.footer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, header, footer);
    }

    @Override
    public String toString() {

        return "GroupData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", header='" + header + '\'' +
                ", footer='" + footer + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }

    public Contacts getContacts() {
        return new Contacts(contacts);
    }

    public GroupData withId(int id) {
        this.id = id;
        return this;
    }

    public GroupData withName(String name) {
        this.name = name;
        return this;
    }

    public GroupData withHeader(String header) {
        this.header = header;
        return this;
    }

    public GroupData withFooter(String footer) {
        this.footer = footer;
        return this;
    }

    public void withContacts(Set<ContactData> contacts) {
        this.contacts = contacts;
    }
}
